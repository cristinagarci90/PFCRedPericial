package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * InfInformeasegcont generated by hbm2java
 */
public class InfInformeasegurado  implements java.io.Serializable {


     private BigDecimal id;
     private InfInforme infInforme;
     private Infasegurado infasegurado;
    

    public InfInformeasegurado() {
    }

    public InfInformeasegurado(BigDecimal id, InfInforme infInforme, Infasegurado infAsegurado) {
       this.id = id;
       this.infInforme = infInforme;
       this.infasegurado = infAsegurado;
       
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public InfInforme getInfInforme() {
        return this.infInforme;
    }
    
    public void setInfInforme(InfInforme infInforme) {
        this.infInforme = infInforme;
    }
    public Infasegurado getInfasegurado() {
        return this.infasegurado;
    }
    
    public void setInfasegurado(Infasegurado infAsegurado) {
        this.infasegurado = infAsegurado;
    }
    




}


