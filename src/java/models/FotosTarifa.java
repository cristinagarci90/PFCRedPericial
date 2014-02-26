package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * FotosTarifa generated by hbm2java
 */
public class FotosTarifa  implements java.io.Serializable {


     private BigDecimal idtramofoto;
     private Tarifa tarifa;
     private BigDecimal importetramo;
     private BigDecimal numfotos;

    public FotosTarifa() {
    }

	
    public FotosTarifa(BigDecimal idtramofoto, Tarifa tarifa) {
        this.idtramofoto = idtramofoto;
        this.tarifa = tarifa;
    }
    public FotosTarifa(BigDecimal idtramofoto, Tarifa tarifa, BigDecimal importetramo, BigDecimal numfotos) {
       this.idtramofoto = idtramofoto;
       this.tarifa = tarifa;
       this.importetramo = importetramo;
       this.numfotos = numfotos;
    }
   
    public BigDecimal getIdtramofoto() {
        return this.idtramofoto;
    }
    
    public void setIdtramofoto(BigDecimal idtramofoto) {
        this.idtramofoto = idtramofoto;
    }
    public Tarifa getTarifa() {
        return this.tarifa;
    }
    
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    public BigDecimal getImportetramo() {
        return this.importetramo;
    }
    
    public void setImportetramo(BigDecimal importetramo) {
        this.importetramo = importetramo;
    }
    public BigDecimal getNumfotos() {
        return this.numfotos;
    }
    
    public void setNumfotos(BigDecimal numfotos) {
        this.numfotos = numfotos;
    }




}

