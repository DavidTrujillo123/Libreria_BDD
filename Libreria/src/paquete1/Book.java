/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author david
 */
public class Book {
    private String category;
    private String code;
    private String name;
    private String author;
    private String editorial;
    private String materia;
    private int year_edition;
    private int ncopy;

    public Book(String category, String code, String name, String author, String editorial, String materia, int year_edition, int ncopy) {
        this.category = category;
        this.code = code;
        this.name = name;
        this.author = author;
        this.editorial = editorial;
        this.materia = materia;
        this.year_edition = year_edition;
        this.ncopy = ncopy;
    }

    
    @Override
    public String toString() {
        return "Category: "+this.category+"\nCode: "+this.code+"\nName: "+this.name
                +"\nAuthor: "+this.author+"\nEditorial: "+this.editorial
                +"\nMateria: "+this.materia+"\nYear Edition:"+this.year_edition
                +"\nNumber copies:"+this.ncopy; 
    }
    
    
}
