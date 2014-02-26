package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Cobertura generated by hbm2java
 */
public class Cobertura  implements java.io.Serializable {


     private BigDecimal idcobertura;
     private String descripcion;
     private Set<InfInforme> infInformes = new HashSet<InfInforme>(0);

    public Cobertura() {
    }

	
    public Cobertura(BigDecimal idcobertura) {
        this.idcobertura = idcobertura;
    }
    public Cobertura(BigDecimal idcobertura, String descripcion, Set<InfInforme> infInformes) {
       this.idcobertura = idcobertura;
       this.descripcion = descripcion;
       this.infInformes = infInformes;
    }
   
    public BigDecimal getIdcobertura() {
        return this.idcobertura;
    }
    
    public void setIdcobertura(BigDecimal idcobertura) {
        this.idcobertura = idcobertura;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<InfInforme> getInfInformes() {
        return this.infInformes;
    }
    
    public void setInfInformes(Set<InfInforme> infInformes) {
        this.infInformes = infInformes;
    }




}

