package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * SubtxtId generated by hbm2java
 */
public class SubtxtId  implements java.io.Serializable {


     private BigDecimal subcodigo;
     private BigDecimal codigo;

    public SubtxtId() {
    }

    public SubtxtId(BigDecimal subcodigo, BigDecimal codigo) {
       this.subcodigo = subcodigo;
       this.codigo = codigo;
    }
   
    public BigDecimal getSubcodigo() {
        return this.subcodigo;
    }
    
    public void setSubcodigo(BigDecimal subcodigo) {
        this.subcodigo = subcodigo;
    }
    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SubtxtId) ) return false;
		 SubtxtId castOther = ( SubtxtId ) other; 
         
		 return ( (this.getSubcodigo()==castOther.getSubcodigo()) || ( this.getSubcodigo()!=null && castOther.getSubcodigo()!=null && this.getSubcodigo().equals(castOther.getSubcodigo()) ) )
 && ( (this.getCodigo()==castOther.getCodigo()) || ( this.getCodigo()!=null && castOther.getCodigo()!=null && this.getCodigo().equals(castOther.getCodigo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSubcodigo() == null ? 0 : this.getSubcodigo().hashCode() );
         result = 37 * result + ( getCodigo() == null ? 0 : this.getCodigo().hashCode() );
         return result;
   }   


}

