package manager;

import comun.HibernateManager;
import models.Grupotaller;
import java.math.BigDecimal;

public class GrupotallerManager extends HibernateManager {

    public GrupotallerManager(){
        TABLE = "grupotaller";
        myClass = new Grupotaller();
        columnaId= "idgrupotaller";
        maximoID=new BigDecimal(1);
        BBDD="gestionPericial";
     
    }
    
     public Grupotaller ClaseConUltimoID(Grupotaller nueva){
        
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdgrupotaller(num);
        return nueva;
       
    } 
}
