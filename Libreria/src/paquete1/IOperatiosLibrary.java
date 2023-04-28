/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package paquete1;

/**
 *
 * @author david
 */
public interface IOperatiosLibrary {
    public void Insert(Object obj);
    public boolean Delete(Object obj);
    public void ModifyBook(Book b, String name, String author, String cat,
            String materia, String editorial, int year, int ncopy);
    public void ModifyStudent(String ID, String name, String surname);
    public Book SearchBook(String ID);
    public Student SearchStudent(String ID);
}
