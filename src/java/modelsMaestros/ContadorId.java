package modelsMaestros;
// Generated 30-sep-2013 14:08:20 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

/**
 * ContadorId generated by hbm2java
 */
public class ContadorId  implements java.io.Serializable {


     private BigDecimal idserie;
     private BigDecimal idejercicio;

    public ContadorId() {
    }

    public ContadorId(BigDecimal idserie, BigDecimal idejercicio) {
       this.idserie = idserie;
       this.idejercicio = idejercicio;
    }
   
    public BigDecimal getIdserie() {
        return this.idserie;
    }
    
    public void setIdserie(BigDecimal idserie) {
        this.idserie = idserie;
    }
    public BigDecimal getIdejercicio() {
        return this.idejercicio;
    }
    
    public void setIdejercicio(BigDecimal idejercicio) {
        this.idejercicio = idejercicio;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ContadorId) ) return false;
		 ContadorId castOther = ( ContadorId ) other; 
         
		 return ( (this.getIdserie()==castOther.getIdserie()) || ( this.getIdserie()!=null && castOther.getIdserie()!=null && this.getIdserie().equals(castOther.getIdserie()) ) )
 && ( (this.getIdejercicio()==castOther.getIdejercicio()) || ( this.getIdejercicio()!=null && castOther.getIdejercicio()!=null && this.getIdejercicio().equals(castOther.getIdejercicio()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdserie() == null ? 0 : this.getIdserie().hashCode() );
         result = 37 * result + ( getIdejercicio() == null ? 0 : this.getIdejercicio().hashCode() );
         return result;
   }   


}

