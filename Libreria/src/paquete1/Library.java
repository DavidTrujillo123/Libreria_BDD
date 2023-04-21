/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author david
 */
public class Library implements IOperatiosLibrary {

    private Book[] books;
    private Student[] students;

    public Library(Book[] books, Student[] students) {
        this.books = books;
        this.students = students;
    }

    public int getIndex(Object[] A,Object obj) {
        for (int i = 0; i < A.length; i++) {
            if(A[i] == obj)
                return i;
        }
        return -1;
    }

    private void InsertG(Object[] A, Object obj) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = obj;
                i = A.length;
            }
        }
    }

    @Override
    public void Insert(Object obj) {
        if (obj instanceof Book){
            InsertG(books ,obj);
        }
        else{
            InsertG(students, obj);
        }
    }

    private void DeleteG(Object[] A, Object obj){
        int index = getIndex(A, obj);
        if (index != -1){
            if(index == A.length-1){
                A[index] = null;
            }
            else{
                for (int i = index; i < A.length-1; i++) {
                    A[i] = A[i+1];
                    A[i+1] = null;
                }
            }
        }
    }
    @Override
    public void Delete(Object obj) {
        if (obj instanceof Book){
            DeleteG(books, obj);
        }
        else{
            DeleteG(students, obj);
        }
    }

    @Override
    public void Modify(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Search(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        String c = "";
        c+="Students\n";
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null){
                c+=students[i].toString()+"\n\n";
            }
        }
        c+="\nBooks\n";
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null){
                c+=books[i].toString()+"\n\n";
            }
        }
        return c;
    }

    

}
