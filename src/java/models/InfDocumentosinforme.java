package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * InfDocumentosinforme generated by hbm2java
 */
public class InfDocumentosinforme  implements java.io.Serializable {


     private BigDecimal idDocumento;
     private BigDecimal idInforme;
     private String nombreDocumento;
     private String extensionArchivo;
     private String ruta;
     private String tipo;

    public InfDocumentosinforme() {
    }

	
    public InfDocumentosinforme(BigDecimal idDocumento, BigDecimal idInforme, String nombreDocumento, String ruta) {
        this.idDocumento = idDocumento;
        this.idInforme = idInforme;
        this.nombreDocumento = nombreDocumento;
        this.ruta = ruta;
    }
    public InfDocumentosinforme(BigDecimal idDocumento, BigDecimal idInforme, String nombreDocumento, String extensionArchivo, String ruta, String tipo) {
       this.idDocumento = idDocumento;
       this.idInforme = idInforme;
       this.nombreDocumento = nombreDocumento;
       this.extensionArchivo = extensionArchivo;
       this.ruta = ruta;
       this.tipo = tipo;
    }
   
    public BigDecimal getIdDocumento() {
        return this.idDocumento;
    }
    
    public void setIdDocumento(BigDecimal idDocumento) {
        this.idDocumento = idDocumento;
    }
    public BigDecimal getIdInforme() {
        return this.idInforme;
    }
    
    public void setIdInforme(BigDecimal idInforme) {
        this.idInforme = idInforme;
    }
    public String getNombreDocumento() {
        return this.nombreDocumento;
    }
    
    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }
    public String getExtensionArchivo() {
        return this.extensionArchivo;
    }
    
    public void setExtensionArchivo(String extensionArchivo) {
        this.extensionArchivo = extensionArchivo;
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


