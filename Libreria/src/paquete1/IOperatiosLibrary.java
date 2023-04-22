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
    public void Insert(Book obj);
    public void Delete(String ID);
    public void ModifyBook(String ID_after, Book new_book);
    public void ModifyStudent(String ID, String IDreturn_book);
    public Book SearchBook(String ID);
    public Student SearchStudent(String ID);
}
