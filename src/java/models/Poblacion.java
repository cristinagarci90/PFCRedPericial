package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA



/**
 * Poblacion generated by hbm2java
 */
public class Poblacion  implements java.io.Serializable {


     private String idpoblacion;
     private Provincia provincia;
     private String poblacion;

    public Poblacion() {
    }

    public String getIdpoblacion() {
        return idpoblacion;
    }

    public void setIdpoblacion(String idpoblacion) {
        this.idpoblacion = idpoblacion;
    }

	/*
    public Poblacion(PoblacionId id, Provincia provincia) {
        this.id = id;
        this.provincia = provincia;
    }
    public Poblacion(PoblacionId id, Provincia provincia, String poblacion) {
       this.id = id;
       this.provincia = provincia;
       this.poblacion = poblacion;
    }*/
   /*
    public PoblacionId getId() {
        return this.id;
    }
    
    public void setId(PoblacionId id) {
        this.id = id;
    }*/
    
    public Provincia getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }




}

