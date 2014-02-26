package manager;

import comun.HibernateManager;
import models.InfFotosinforme;
//import models.Tipoinforme;
//import modelsMaestros.Perito;
import java.math.BigDecimal;

public class FotosManager extends HibernateManager {

    public FotosManager(){
       TABLE = "inf_Fotosinforme";
        myClass = new InfFotosinforme();
       // claseVinculada = new Perito();
         //claseVinculada = new Tipoinforme();
        columnaId= "idFoto";
       // maximoID=new BigDecimal(1);
       // xhtmlListado = "listAsegurados";
      //  xhtmlGestion = "fotosInforme";
       // BBDD="GestionPericial";
        
    }
    
  //     Si fuese oracle o no tuviese id autoincrementable
    
     public InfFotosinforme ClaseConUltimoID(InfFotosinforme nueva){
        System.out.println("LLEgo a ultimo id de fotosinforme");
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdfoto(num);
          System.out.println("LLego a ultimo id de fotosavances  antes de return id="+ num.toString());
      
        return nueva;
       
    }
    
}
