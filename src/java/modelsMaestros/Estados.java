package modelsMaestros;
// Generated 30-sep-2013 14:08:20 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import models.InfInforme;



/**
 * Estados generated by hbm2java
 */

public class Estados  implements java.io.Serializable {


     private BigDecimal idestado;
     private String tipo;
     private String codigo;
     private String descripcion;
     private String baja;
     private int v;
   
  

    public Estados() {
    }

	
    public Estados(BigDecimal idestado) {
        this.idestado = idestado;
    }
    public Estados(BigDecimal idestado,int v, String tipo, String codigo, String descripcion, String baja) {
       this.idestado = idestado;
       this.v=v;
       this.tipo = tipo;
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.baja = baja;
    }
   
    public BigDecimal getIdestado() {
        return this.idestado;
    }
    
    public void setIdestado(BigDecimal idestado) {
        this.idestado = idestado;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public String getBaja() {
        return this.baja;
    }
    
    public void setBaja(String baja) {
        this.baja = baja;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    
    
   @Override
    public final String toString ()
    {   
        return descripcion;
    }
    }


