package models;
// Generated 01-feb-2013 22:02:51 by Hibernate Tools 3.2.1.GA



/**
 * PoblacionId generated by hbm2java
 */
public class PoblacionId_BORRAR  implements java.io.Serializable {


     private String idpoblacion;
     private String idprovincia;

    public PoblacionId_BORRAR() {
    }

    public PoblacionId_BORRAR(String idpoblacion, String idprovincia) {
       this.idpoblacion = idpoblacion;
       this.idprovincia = idprovincia;
    }
   
    public String getIdpoblacion() {
        return this.idpoblacion;
    }
    
    public void setIdpoblacion(String idpoblacion) {
        this.idpoblacion = idpoblacion;
    }
    public String getIdprovincia() {
        return this.idprovincia;
    }
    
    public void setIdprovincia(String idprovincia) {
        this.idprovincia = idprovincia;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PoblacionId_BORRAR) ) return false;
		 PoblacionId_BORRAR castOther = ( PoblacionId_BORRAR ) other; 
         
		 return ( (this.getIdpoblacion()==castOther.getIdpoblacion()) || ( this.getIdpoblacion()!=null && castOther.getIdpoblacion()!=null && this.getIdpoblacion().equals(castOther.getIdpoblacion()) ) )
 && ( (this.getIdprovincia()==castOther.getIdprovincia()) || ( this.getIdprovincia()!=null && castOther.getIdprovincia()!=null && this.getIdprovincia().equals(castOther.getIdprovincia()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdpoblacion() == null ? 0 : this.getIdpoblacion().hashCode() );
         result = 37 * result + ( getIdprovincia() == null ? 0 : this.getIdprovincia().hashCode() );
         return result;
   }   


}

