package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Marcas generated by hbm2java
 */
public class Marcas  implements java.io.Serializable {


     private BigDecimal idmarca;
     private String marca;
     private String baja;
     private Set<Modelos> modeloses = new HashSet<Modelos>(0);
     private Set<Infasegurado> infAsegurado = new HashSet<Infasegurado>(0);
     private Set<InfContrario> infContrario = new HashSet<InfContrario>(0);
    public Marcas() {
    }

	
    public Marcas(BigDecimal idmarca, String marca) {
        this.idmarca = idmarca;
        this.marca = marca;
    }
    public Marcas(BigDecimal idmarca, String marca, String baja, Set<Modelos> modeloses, Set<Infasegurado> infAsegurado, Set<InfContrario> infContrario) {
       this.idmarca = idmarca;
       this.marca = marca;
       this.baja = baja;
       this.modeloses = modeloses;
       this.infAsegurado = infAsegurado;
       this.infContrario = infContrario;
    }
   
    public BigDecimal getIdmarca() {
        return this.idmarca;
    }
    
    public void setIdmarca(BigDecimal idmarca) {
        this.idmarca = idmarca;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getBaja() {
        return this.baja;
    }
    
    public void setBaja(String baja) {
        this.baja = baja;
    }
    public Set<Modelos> getModeloses() {
        return this.modeloses;
    }
    
    public void setModeloses(Set<Modelos> modeloses) {
        this.modeloses = modeloses;
    }
    public Set<Infasegurado> getInfasegurado() {
        return this.infAsegurado;
    }
    
    public void setInfasegurado(Set<Infasegurado> infAsegurado) {
        this.infAsegurado = infAsegurado;
    }
public Set<InfContrario> getInfContrario() {
        return this.infContrario;
    }
    
    public void setInfContrario(Set<InfContrario> infContrario) {
        this.infContrario = infContrario;
    }



}


