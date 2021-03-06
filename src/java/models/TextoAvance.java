package models;
// Generated 20-may-2013 12:56:30 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TextoAvance generated by hbm2java
 */
public class TextoAvance  implements java.io.Serializable {


     private BigDecimal idtextoavance;
     private String texto;
     private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public TextoAvance() {
    }

	
    public TextoAvance(BigDecimal idtextoavance, String texto) {
        this.idtextoavance = idtextoavance;
        this.texto = texto;
    }
    public TextoAvance(BigDecimal idtextoavance, String texto, Set<Cliente> clientes) {
       this.idtextoavance = idtextoavance;
       this.texto = texto;
       this.clientes = clientes;
    }
   
    public BigDecimal getIdtextoavance() {
        return this.idtextoavance;
    }
    
    public void setIdtextoavance(BigDecimal idtextoavance) {
        this.idtextoavance = idtextoavance;
    }
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Set<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }




}


