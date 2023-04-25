/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Usuario
 */
public class Serializer {
    
    XMLDecoder decoder;
    XMLEncoder encoder;
    
    public Serializer(String name)
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(name);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            encoder = new XMLEncoder(bufferedOutputStream);
            
            FileInputStream fileInputStream = new FileInputStream(name);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            decoder = new XMLDecoder(bufferedInputStream);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void Serialize(Object object)
    {
        encoder.writeObject(object);
    }
    
    public Object Deserialize()
    {
        return decoder.readObject();
    }
}
