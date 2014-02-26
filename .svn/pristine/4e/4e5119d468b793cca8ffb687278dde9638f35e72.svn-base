package manager;

import comun.HibernateManager;
import models.InfAvances;
//import models.Tipoinforme;
//import modelsMaestros.Perito;
import java.math.BigDecimal;

public class AvanceManager extends HibernateManager {

    public AvanceManager(){
       TABLE = "inf_Avances";
        myClass = new InfAvances();
       // claseVinculada = new Perito();
         //claseVinculada = new Tipoinforme();
        columnaId= "idInfAvance";
       // maximoID=new BigDecimal(1);
       // xhtmlListado = "listAsegurados";
        xhtmlGestion = "avancesInforme";
        BBDD="GestionPericial";
        
    }
    
  //     Si fuese oracle o no tuviese id autoincrementable
    
     public InfAvances ClaseConUltimoID(InfAvances nueva){
        System.out.println("LLEgo a ultimo id de avance");
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdinfavance(num);
          System.out.println("LLego a ultimo id de avanceInf  antes de return id="+ num.toString());
      
        return nueva;
       
    }
    
}
