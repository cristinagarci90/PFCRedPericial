package manager;

import comun.HibernateManager;
import models.Tarifa;
import java.math.BigDecimal;

public class TarifaManager extends HibernateManager {

    public TarifaManager(){
        TABLE = "tarifa";
        myClass = new Tarifa();
        columnaId= "idtarifa";
        maximoID=new BigDecimal(1);
        BBDD="GestionPericial";
     
    }
    
     public Tarifa ClaseConUltimoID(Tarifa nueva){
        System.out.println("LLEgo a ultimo id de tarifa");
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdtarifa(num);
        System.out.println("LLego a ultimo id de tarifa  antes de return id="+ num.toString());      
        return nueva;
       
    } 
}
