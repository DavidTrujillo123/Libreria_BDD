/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.ArrayList;
import java.util.Arrays;

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
        
        Book[] bookList = new Book[10];
        bookList[0] = b1;
        bookList[1] = b2;
        bookList[2] = b3;
        bookList[3] = b4;
        bookList[4] = b5;
        bookList[5] = b6;
        bookList[6] = b7;
        
        Student[] studentList = new Student[10];
        studentList[0] = st1;
        studentList[1] = st2;
        studentList[2] = st3;
        studentList[3] = st4;
        
        
        
        books = new ArrayList<Book>(Arrays.asList(bookList));
        students = new ArrayList<Student>(Arrays.asList(studentList));
        
    }

    public int getIndex(Object[] A,Object obj) {
        for (int i = 0; i < A.length; i++) {
            if(A[i].equals(obj))
                return i;
        }
        return -1;
    }
   
    @Override
    public void Insert(Book obj) {
        books.add(obj);
    }

    @Override
    public void Delete(String ID) {
        int index = getIndex(books.toArray(), ID);
        if(index!=-1){
            books.remove(index);
        }
    }

    @Override
    public void ModifyBook(String ID, Book new_book) {
        int index = getIndex(books.toArray(), ID);
        if (index != -1){
            books.add(index, new_book);
        }
    }

    @Override
    public void ModifyStudent(String ID, String IDreturn_book) {
        int indexID = getIndex(students.toArray(), ID);
        int indexIDBook = getIndex(books.toArray(), ID);
        if(indexID != -1 && indexIDBook != -1){
            Student st = students.get(indexID);
            ArrayList<Book> studentBooks = st.getBooks_student();
            for (int i = 0; i < studentBooks.size(); i++) {
                if((studentBooks.get(i).getCode()).equals(IDreturn_book))
                    studentBooks.remove(i);
            }
        }
    }
    
    private Object Search(ArrayList A ,String ID){
        int index = getIndex(A.toArray(), ID);
        if(index!=-1){
            return A.get(index);
        }
        return null;
    }
    @Override
    public Book SearchBook(String ID) {
        return (Book)Search(books, ID);
    }

    @Override
    public Student SearchStudent(String ID) {
        return (Student)Search(students ,ID);
    }

    

}
