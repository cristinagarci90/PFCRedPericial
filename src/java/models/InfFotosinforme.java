package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * InfFotosinforme generated by hbm2java
 */
public class InfFotosinforme  implements java.io.Serializable {


     private BigDecimal idfoto;
    // private BigDecimal idInforme;
     private InfInforme infInforme;
     private String nombrefoto;
     private String extensionarchivo;
     private String ruta;
     private String tipo;
    
     
    public InfFotosinforme() {
    }

	
    //public InfFotosinforme(BigDecimal idFoto, BigDecimal idInforme, String nombreFoto, String ruta,InfInforme infInforme) {
    public InfFotosinforme(BigDecimal idFoto, String nombreFoto, String ruta,InfInforme infInforme) {
        this.idfoto = idFoto;
       // this.idInforme = idInforme;
        this.nombrefoto = nombreFoto;
        this.ruta = ruta;
         this.infInforme = infInforme;
    }
//    public InfFotosinforme(BigDecimal idFoto, BigDecimal idInforme, String nombreFoto, String extensionArchivo, String ruta, String tipo,InfInforme infInforme) {
    public InfFotosinforme(BigDecimal idFoto, String nombreFoto, String extensionArchivo, String ruta, String tipo,InfInforme infInforme) {
    
       this.idfoto = idFoto;
     //  this.idInforme = idInforme;
       this.nombrefoto = nombreFoto;
       this.extensionarchivo = extensionArchivo;
       this.ruta = ruta;
       this.tipo = tipo;
       this.infInforme = infInforme;
    }
    public InfInforme getInfInforme() {
        return this.infInforme;
    }
    
    public void setInfInforme(InfInforme infInforme) {
        this.infInforme = infInforme;
    }
    public BigDecimal getIdfoto() {
        return this.idfoto;
    }
    
    public void setIdfoto(BigDecimal idFoto) {
        this.idfoto = idFoto;
    }
    /*public BigDecimal getIdInforme() {
        return this.idInforme;
    }
    
    public void setIdInforme(BigDecimal idInforme) {
        this.idInforme = idInforme;
    }*/
    public String getNombreFoto() {
        return this.nombrefoto;
    }
    
    public void setNombreFoto(String nombreFoto) {
        this.nombrefoto = nombreFoto;
    }
    public String getExtensionArchivo() {
        return this.extensionarchivo;
    }
    
    public void setExtensionArchivo(String extensionArchivo) {
        this.extensionarchivo = extensionArchivo;
    }
    public String getRuta() {
        return this.ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}

