package modelsMaestros;
// Generated 30-sep-2013 14:08:20 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Series generated by hbm2java
 */
public class Series  implements java.io.Serializable {


     private BigDecimal idserie;
     private String codigo;
     private String descripcion;
     private Set<Contador> contadors = new HashSet<Contador>(0);

    public Series() {
    }

	
    public Series(BigDecimal idserie) {
        this.idserie = idserie;
    }
    public Series(BigDecimal idserie, String codigo, String descripcion, Set<Contador> contadors) {
       this.idserie = idserie;
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.contadors = contadors;
    }
   
    public BigDecimal getIdserie() {
        return this.idserie;
    }
    
    public void setIdserie(BigDecimal idserie) {
        this.idserie = idserie;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Contador> getContadors() {
        return this.contadors;
    }
    
    public void setContadors(Set<Contador> contadors) {
        this.contadors = contadors;
    }




}


