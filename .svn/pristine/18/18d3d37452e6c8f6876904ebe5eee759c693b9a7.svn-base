package manager;

import comun.HibernateManager;
import modelsMaestros.Estados;
import java.math.BigDecimal;

public class EstadoManager extends HibernateManager {

    public EstadoManager(){
        TABLE = "estados";
        myClass = new Estados();
        columnaId= "idestado";
        maximoID=new BigDecimal(1);
        xhtmlGestion = "modificarEstado";
        BBDD="Maestros";
     
    }
    
     public Estados ClaseConUltimoID(Estados nueva){
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdestado(num);
        return nueva;
       
    } 
}
