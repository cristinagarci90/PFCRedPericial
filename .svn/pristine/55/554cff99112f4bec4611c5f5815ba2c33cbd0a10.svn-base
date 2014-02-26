package manager;

import comun.HibernateManager;
import java.math.BigDecimal;
import modelsMaestros.Estados;

public class EstadoManager30012014 extends HibernateManager implements java.io.Serializable {

    public EstadoManager30012014(){
       
        TABLE = "estados";
        myClass = new Estados();
        columnaId= "idestado";
        maximoID=new BigDecimal(1);   
        xhtmlGestion = "modificarEstado";
        BBDD="Maestros";   
     
    }
   public Estados ClaseConUltimoID(Estados  nueva){
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        System.out.println("valor de num" + num);
        nueva.setIdestado(num);
        return nueva;
       
    }
    
}
