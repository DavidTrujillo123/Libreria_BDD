/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author david
 */
public class Student {
    private String cedula;
    private String name;
    private String surname;
    private Book[] books_student;

    public Student(String cedula, String name, String surname) {
        this.cedula = cedula;
        this.name = name;
        this.surname = surname;
        this.books_student = new Book[10];
    }
    
    public void AddBook(Book book){
        for (int i = 0; i < books_student.length; i++) {
            if(books_student[i] == null){
                books_student[i] = book;
                i = books_student.length;
            }
        }
    }

    @Override
    public String toString() {
        String c="";
        c+="Cedula"+this.cedula+"\nName: "+this.name+"\nSurname: "
                +this.surname+"\nBooks: \n[\n";
        for (int i = 0; i < books_student.length; i++) {
            if(books_student[i] != null)
                c+="[\n"+books_student[i].toString()+"\n]\n";
        }
        c+= "]";
        return c;
    }
    
    
}
