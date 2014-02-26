package manager;

import comun.HibernateManager;
import models.Taller;
import models.Provincia;
import java.math.BigDecimal;

public class TallerManager extends HibernateManager {

    public TallerManager(){
        TABLE = "Taller";
        myClass = new Taller();
        columnaId= "idtaller";
        maximoID=new BigDecimal(1);
        claseVinculada = new Provincia();
        xhtmlGestion = "modificarTaller";
      
     
    }
   public Taller ClaseConUltimoID(Taller nueva){
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdtaller(num);
        return nueva;
       
    }
    
}