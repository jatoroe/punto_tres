/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_3;
import java.util.*;
/**
 *
 * @author JAVIER
 */
public class Dia 
{
 private String date;
 private String name;
 private Segmento[] segmentos; 
 Scanner tec = new Scanner(System.in);
 
 public Dia(String d, String n)
 {
     this.date = d;
     this.name = n;
 }

    public void numSegmentos(int seg, int hi, int hf)
    {
        this.segmentos = new Segmento[seg];        
        for (int i = 0; i < segmentos.length; i++) {
            this.segmentos[i] = new Segmento("[i+hi]:00","[hf]:00");            
        }
    }
            
    public String getDate()
    {
        return date;
    }

    public String getName() 
    {
        return name;
    }

    public Segmento[] getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(Segmento[] segmentos) {
        this.segmentos = segmentos;
    }
        
    public void setDate(String date)
    {
        this.date = date;
    }

    public void setName(String name)
    {
        this.name = name;
    }
 
 }
