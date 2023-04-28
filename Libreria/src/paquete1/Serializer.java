/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Serializer {
    
    private ArrayList<Object> aux;
    private Gson gson;
    
    public Serializer()
    {
        aux = new ArrayList<>();
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    public Boolean Serialize(Library library, String route)
    {
        File file = new File(route);
        Object aux;
        String json;
        
        ArrayList<Book> books = library.getBooks();
        ArrayList<Student> students = library.getStudents();
        
        try (var pw = new PrintWriter(file)) {
            
            for (int i = 0; i < books.size(); i++) 
            {
                if(books.get(i) != null)
                {
                    aux = books.get(i);
                    json = TransformarJson(gson, aux);
                    EscribirJson(pw, json);
                }
            }
            EscribirJson(pw, "");
            for (int i = 0; i < students.size(); i++) 
            {
                if(students.get(i) != null)
                {
                    aux = students.get(i);
                    json = TransformarJson(gson, aux);
                    EscribirJson(pw, json);
                }
            }
            EscribirJson(pw, "");
        }catch (Exception e) {
            return false;
        }

        return true;
    }
    
    private String TransformarJson(Gson gson, Object o){
        return gson.toJson(o);
    }
    
    private void EscribirJson(PrintWriter pr,String s){
        pr.write(s+"\n");
    }
    
    public boolean Deserialize(Library library, String route)
    {
        String json = "";
        String line;
        
        ArrayList<Book> books = library.getBooks();
        ArrayList<Student> students = library.getStudents();
        
        books.clear();
        students.clear();
        
        Book book;
        Student student;
        
        try
        {
            FileReader fr = new FileReader(route);
            BufferedReader br = new BufferedReader(fr);
            
            while(!(line = br.readLine()).equals(""))
            {
                json += line;
                if(line.compareTo("}")==0)
                {
                    book = gson.fromJson(json, Book.class);
                    books.add(book);
                    json = "";
                }
            }
            int i = 0;
            while((line = br.readLine()) != null)
            {
                json += line;
                
                if(line.compareTo("{") == 0) i++;
                
                if(line.compareTo("}") == 0)
                {
                    i--;
                }
                if(i == 0)
                {
                    student = gson.fromJson(json, Student.class);
                    students.add(student);
                    System.out.println(json);
                    json = "";
                }
            }
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
