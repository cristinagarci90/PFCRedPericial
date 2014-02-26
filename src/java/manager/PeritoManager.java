package manager;

import comun.HibernateManager;
import modelsMaestros.Perito;
import java.math.BigDecimal;

public class PeritoManager extends HibernateManager {

    public PeritoManager(){
        TABLE = "perito";
        myClass = new Perito();
        columnaId= "idperito";
        maximoID=new BigDecimal(1);
        xhtmlGestion = "modificarPerito";
        BBDD="Maestros";
     
    }
    
    public String getNombrePerito(BigDecimal id){
        String nombre=getCampoString(TABLE,columnaId,"PERITO",id);
        return nombre;
       
    } 
    
    
    public Perito ClaseConUltimoID(Perito nueva){
        System.out.println("LLEgo a ultimo id de perito");
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdperito(num);
        System.out.println("LLego a ultimo id de perito  antes de return id="+ num.toString());      
        return nueva;
       
    } 
}
