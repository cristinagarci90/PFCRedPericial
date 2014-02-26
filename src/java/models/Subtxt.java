package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA



/**
 * Subtxt generated by hbm2java
 */
public class Subtxt  implements java.io.Serializable {


     private SubtxtId id;
     private Txt txt;
     private String descripcion;

    public Subtxt() {
    }

	
    public Subtxt(SubtxtId id, Txt txt) {
        this.id = id;
        this.txt = txt;
    }
    public Subtxt(SubtxtId id, Txt txt, String descripcion) {
       this.id = id;
       this.txt = txt;
       this.descripcion = descripcion;
    }
   
    public SubtxtId getId() {
        return this.id;
    }
    
    public void setId(SubtxtId id) {
        this.id = id;
    }
    public Txt getTxt() {
        return this.txt;
    }
    
    public void setTxt(Txt txt) {
        this.txt = txt;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}

