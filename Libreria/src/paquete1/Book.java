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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getYear_edition() {
        return year_edition;
    }

    public void setYear_edition(int year_edition) {
        this.year_edition = year_edition;
    }

    public int getNcopy() {
        return ncopy;
    }

    public void setNcopy(int ncopy) {
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
