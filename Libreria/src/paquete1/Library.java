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
    private Serializer Json;
    
    public Library() {
//        Book b1 = new Book("Fiction", "E12345", "To Kill a Mockingbird", "Harper Lee", "HarperCollins", "Literature", 1960, 20);
//        Book b2 = new Book("Science", "A67890", "A Brief History of Time", "Stephen Hawking", "Bantam Books", "Physics", 1988, 0);
//        Book b3 = new Book("Biography", "D24680", "Steve Jobs", "Walter Isaacson", "Simon & Schuster", "Business", 2011, 0);
//        Book b4 = new Book("Travel", "13579", "Into Thin Air", "Jon Krakauer", "Villard Books", "Mountaineering", 1997, 0);
//        Book b5 = new Book("History", "86420", "The Rise and Fall of the Third Reich", "William L. Shirer", "Simon & Schuster", "World War II", 1960, 0);
//        Book b6 = new Book("Art", "97531", "The Story of Art", "E.H. Gombrich", "Phaidon Press", "Art History", 1950, 0);
//        Book b7 = new Book("Cooking", "78912", "Mastering the Art of French Cooking", "Julia Child", "Alfred A. Knopf", "French Cuisine", 1961, 0);
//        Book b8 = new Book("Philosophy", "35791", "Beyond Good and Evil", "Friedrich Nietzsche", "Penguin Classics", "Ethics", 1886, 0);
//        Book b9 = new Book("Self-help", "24601", "The 7 Habits of Highly Effective People", "Stephen Covey", "Free Press", "Personal Development", 1989, 0);
//        Book b10 = new Book("Sports", "80246", "Friday Night Lights", "H.G. Bissinger", "Da Capo Press", "Football", 1990, 0);
//
//        Student st1 = new Student("0012345678", "Juan", "Pérez");
//        Student st2 = new Student("0023456789", "María", "García");
//        Student st3 = new Student("0034567890", "Pedro", "Ramírez");
//        Student st4 = new Student("0045678901", "Ana", "Martínez");
//        Student st5 = new Student("0056789012", "Carlos", "Gómez");
//        st1.AddBook(b10);
//        st2.AddBook(b10);
//        st3.AddBook(b10);
//
//        Book[] bookList = new Book[10];
//        bookList[0] = b1;
//        bookList[1] = b2;
//        bookList[2] = b3;
//        bookList[3] = b4;
//        bookList[4] = b5;
//        bookList[5] = b6;
//        bookList[6] = b7;
//        bookList[7] = b10;
//        
//        Student[] studentList = new Student[10];
//        studentList[0] = st1;
//        studentList[1] = st2;
//        studentList[2] = st3;
//        studentList[3] = st4;
//
//        books = new ArrayList<Book>(Arrays.asList(bookList));
//        students = new ArrayList<Student>(Arrays.asList(studentList));
        
        books = new ArrayList<Book>(Arrays.asList());
        students = new ArrayList<Student>(Arrays.asList());
        
        Json = new Serializer();
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
    public void Insert(Object obj) {
        if(obj instanceof Student){
            students.add((Student)obj);
            
        }    
        else{
            books.add((Book)obj);
        }
    }

    @Override
    public boolean Delete(Object obj) {
        
        if(obj instanceof Student){
            Student st = (Student) obj;
            if(st.getBooks_student().isEmpty()){
                this.students.remove(st);
                return true;
            }
        }    
        else{
            Book b = (Book) obj;
            for(int i = 0; i < students.size(); i++){
                if(students.get(i) != null && students.get(i).IsBooking(b))
                    return false;
            }
            this.books.remove(b);
            return true;
        }
        
        return false;
        
    }

   @Override
   public void ModifyBook(Book b, String name, String author, String cat,
            String materia, String editorial, int year, int ncopy){
        b.setName(name);
        b.setAuthor(author);
        b.setEditorial(editorial);
        b.setMateria(materia);
        b.setNcopy(ncopy);
        b.setCategory(cat);
        b.setYear_edition(year);
   }

    @Override
    public void ModifyStudent(String ID, String name, String surname) {
        Student s = SearchStudent(ID);
        s.setName(name);
        s.setSurname(surname);
        
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
    
    
    public boolean ReserveBook(Student s, Book b){
        if(b.getNcopy() > 0){
            s.AddBook(b);
            b.setNcopy(b.getNcopy()-1);
            return true;
        }
        return false;
    }
    public void ReturnBook(Student s, Book b){
        s.getBooks_student().remove(b);
        b.setNcopy(b.getNcopy()+1);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Sorting methods">
    
    /**
     * Sorts the ArrayList of books by a context index:
     * [1.- Code]
     * [2.- Name]
     * [3.- Category]
     * [4.- Author]
     * [5.- Materia]
     * [6.- Editorial]
     * [7.- Year edition]
     * [8.- Number of copies]
     */
    public void SortBooks(int index)
    {
        switch(index)
        {
            case 1 -> SortBookCode(books);
            case 2 -> SortBookName(books);
            case 3 -> SortBookAuthor(books);
            case 4 -> SortBookCategory(books);
            case 5 -> SorBooktMateria(books);
            case 6 -> SortBookEditorial(books);
            case 7 -> SortBookYearEdition(books);
            case 8 -> SortBookNumberCopies(books);
        }
    }
    
    /**
     * Sorts the ArrayList of students by a context index:
     * [1.- Cedula]
     * [2.- Name]
     * [3.- Surname]
     */
    public void SortStudents(int index)
    {
        switch(index)
        {
            case 1 -> SortCedula(students);
            case 2 -> SortStudentName(students);
            case 3 -> SortStudentSurName(students);
            case 4 -> SortNumberOfBooks(students);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Book Methods">
    private void SortBookName(ArrayList<Book> books)
    {
        books.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }
    private void SortBookCategory(ArrayList<Book> books)
    {
        books.sort((o1, o2) -> o1.getCategory().compareTo(o2.getCategory()));
    }
    private void SortBookAuthor(ArrayList<Book> books)
    {
        books.sort((o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
    }
    private void SorBooktMateria(ArrayList<Book> books)
    {
        books.sort((o1, o2) -> o1.getMateria().compareTo(o2.getMateria()));
    }
    private void SortBookCode(ArrayList<Book> books)
    {
        books.sort((o1, o2) -> o1.getCode().compareTo(o2.getCode()));
    }
    private void SortBookEditorial(ArrayList<Book> books)
    {
        books.sort((o1, o2) -> o1.getEditorial().compareTo(o2.getEditorial()));
    }
    private void SortBookYearEdition(ArrayList<Book> books)
    {
        books.sort((o1, o2) -> CompareToInt(o1.getYear_edition(), o2.getYear_edition()));
    }
    private void SortBookNumberCopies(ArrayList<Book> books)
    {
        books.sort((o1, o2) -> CompareToInt(o1.getNcopy(), o2.getNcopy()));
    }
    
    private int CompareToInt(int a, int b)
    {
        if(a == b) return 0;
        else if(a > b) return -1;
        else return 1;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Student Methods">
    private void SortStudentName(ArrayList<Student> students)
    {
        students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }
    private void SortStudentSurName(ArrayList<Student> students)
    {
        students.sort((o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
    }
    private void SortCedula(ArrayList<Student> students)
    {
        students.sort((o1, o2) -> o1.getCedula().compareTo(o2.getCedula()));
    }
    private void SortNumberOfBooks(ArrayList<Student> students)
    {
        students.sort((o1, o2) -> CompareToInt(o1.getBooks_student().size(), o2.getBooks_student().size()));
    }
    // </editor-fold>
    
    // </editor-fold>
    
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
    
    public boolean Serialize(String route)
    {
        return Json.Serialize(this, route);
    }
    
    public boolean Deserialize(String route)
    {
        return Json.Deserialize(this, route);
    }
    
    private void ImprimirLibros(int index)
    {
        String c = "";
        c += "Books: \n";
        for (Book book : books) {
            if (book != null) {
                switch(index)
                {
                    case 1 -> c += book.getCode();
                    case 2 -> c += book.getName();
                    case 3 -> c += book.getCategory();
                    case 4 -> c += book.getAuthor();
                    case 5 -> c += book.getMateria();
                    case 6 -> c += book.getEditorial();
                    case 7 -> c += book.getYear_edition();
                    case 8 -> c += book.getNcopy();
                }
                c+= "\n";
            }
        }
        System.out.println(c);
    }

}
