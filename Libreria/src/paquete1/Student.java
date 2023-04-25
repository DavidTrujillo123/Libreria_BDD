/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Student {
    private String cedula;
    private String name;
    private String surname;
    private ArrayList<Book> books_student;

    public Student(String cedula, String name, String surname) {
        this.cedula = cedula;
        this.name = name;
        this.surname = surname;
        this.books_student = new ArrayList<Book>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Book> getBooks_student() {
        return books_student;
    }

    public void setBooks_student(ArrayList<Book> books_student) {
        this.books_student = books_student;
    }
    
    public void AddBook(Book book){
        this.books_student.add(book);
    }
    public String stringData(){        
        return  "Cedula: "+this.cedula+"\nName: "+this.name+"\nSurname: "
                +this.surname+"\n\n";
    }
    
    public boolean ReturnBook(Book b){
        if (books_student.contains(b)){
            books_student.remove(b);
            b.setNcopy(b.getNcopy()+1);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String c="";
//        Object[] booksArray = books_student.toArray();
        c+="Cedula"+this.cedula+"\nName: "+this.name+"\nSurname: "
                +this.surname+"\nBooks: \n[\n";
        for (int i = 0; i < books_student.size(); i++) {
            if(books_student.get(i) != null)
                c+="[\n"+books_student.get(i).toString()+"\n]\n";
        }
        c+= "]\n";
        return c;
    }
    
    
}
