/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author david
 */
public class Library implements IOperatiosLibrary {

    private ArrayList<Book> books;
    private ArrayList<Student> students;

    public Library() {
        Book b1 = new Book("Fiction", "E12345", "To Kill a Mockingbird", "Harper Lee", "HarperCollins", "Literature", 1960, 20);
        Book b2 = new Book("Science", "A67890", "A Brief History of Time", "Stephen Hawking", "Bantam Books", "Physics", 1988, 0);
        Book b3 = new Book("Biography", "D24680", "Steve Jobs", "Walter Isaacson", "Simon & Schuster", "Business", 2011, 0);
        Book b4 = new Book("Travel", "13579", "Into Thin Air", "Jon Krakauer", "Villard Books", "Mountaineering", 1997, 0);
        Book b5 = new Book("History", "86420", "The Rise and Fall of the Third Reich", "William L. Shirer", "Simon & Schuster", "World War II", 1960, 0);
        Book b6 = new Book("Art", "97531", "The Story of Art", "E.H. Gombrich", "Phaidon Press", "Art History", 1950, 0);
        Book b7 = new Book("Cooking", "78912", "Mastering the Art of French Cooking", "Julia Child", "Alfred A. Knopf", "French Cuisine", 1961, 0);
        Book b8 = new Book("Philosophy", "35791", "Beyond Good and Evil", "Friedrich Nietzsche", "Penguin Classics", "Ethics", 1886, 0);
        Book b9 = new Book("Self-help", "24601", "The 7 Habits of Highly Effective People", "Stephen Covey", "Free Press", "Personal Development", 1989, 0);
        Book b10 = new Book("Sports", "80246", "Friday Night Lights", "H.G. Bissinger", "Da Capo Press", "Football", 1990, 0);

        Student st1 = new Student("0012345678", "Juan", "Pérez");
        Student st2 = new Student("0023456789", "María", "García");
        Student st3 = new Student("0034567890", "Pedro", "Ramírez");
        Student st4 = new Student("0045678901", "Ana", "Martínez");
        Student st5 = new Student("0056789012", "Carlos", "Gómez");
        st1.AddBook(b10);
        st2.AddBook(b10);
        st3.AddBook(b10);

        Book[] bookList = new Book[10];
        bookList[0] = b1;
        bookList[1] = b2;
        bookList[2] = b3;
        bookList[3] = b4;
        bookList[4] = b5;
        bookList[5] = b6;
        bookList[6] = b7;
        bookList[7] = b10;
        
        Student[] studentList = new Student[10];
        studentList[0] = st1;
        studentList[1] = st2;
        studentList[2] = st3;
        studentList[3] = st4;

        books = new ArrayList<Book>(Arrays.asList(bookList));
        students = new ArrayList<Student>(Arrays.asList(studentList));

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getIndexBook(String ID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) != null) {
                if ((books.get(i).getCode()).equals(ID)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getIndexStudent(String ID) {
        for (int i = 0; i < students.size(); i++) {
            if ( students.get(i)!= null && (students.get(i).getCedula()).equals(ID)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void Insert(Book obj) {
        int index = getIndexBook(obj.getCode());
        //if(index==-1)
            books.add(obj);
    }

    @Override
    public void Delete(String ID) {
        int index = getIndexBook(ID);
        if (index != -1) {
            books.remove(index);
        }
    }

    @Override
    public void ModifyBook(String ID, Book new_book) {
        int index = getIndexBook(ID);
        if (index != -1) {
            books.remove(index);
            books.add(index, new_book);
        }
    }

    @Override
    public void ModifyStudent(String ID, String IDreturn_book) {
        int indexID = getIndexStudent(ID);
        int indexIDBook = getIndexBook(ID);
        if (indexID != -1 && indexIDBook != -1) {
            Student st = students.get(indexID);
            ArrayList<Book> studentBooks = st.getBooks_student();
            for (int i = 0; i < studentBooks.size(); i++) {
                if ((studentBooks.get(i).getCode()).equals(IDreturn_book)) {
                    studentBooks.remove(i);
                }
            }
        }
    }

    @Override
    public Book SearchBook(String ID) {
        int index = getIndexBook(ID);
        if (index != -1) {
            return books.get(index);
        }
        return null;
    }

    @Override
    public Student SearchStudent(String ID) {
        int index = getIndexStudent(ID);
        if (index != -1) {
            return students.get(index);
        }
        return null;
    }

    public boolean VerifyContent(String code) {
        Book searchBook = SearchBook(code);
        if (searchBook != null) {
            if (searchBook.getNcopy() > 0) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Student> SearchStudentsByBooks(String ID) {
        ArrayList<Student> res = new ArrayList<Student>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null) {
                ArrayList<Book> studentBooks = students.get(i).getBooks_student();
                for (int j = 0; j < studentBooks.size(); j++) {
                    if (studentBooks.get(j).getCode().equals(ID)) {
                        res.add(students.get(i));
                    }
                }
            }
        }
        
        return ((!res.isEmpty()) ? res : null);
    }
    
    
    public boolean Reserve(Student s, Book b){
        if(b.getNcopy() > 0){
            s.AddBook(b);
            b.setNcopy(b.getNcopy()-1);
            return true;
        }
        return false;
    }
    
    
    @Override
    public String toString() {
        String c = "";
        c += "Books: \n";
        for (Book book : books) {
            if (book != null) {
                c += book.toString() + "\n";
            }
        }
        c += "Students: \n\n";
        for (Student student : students) {
            if (student != null) {
                c += student.toString() + "\n";
            }
        }
        return c;
    }

}
