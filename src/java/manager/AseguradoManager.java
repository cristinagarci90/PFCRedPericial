package manager;

import comun.HibernateManager;
import models.Infasegurado;
//import models.Tipoinforme;
//import modelsMaestros.Perito;
import java.math.BigDecimal;

public class AseguradoManager extends HibernateManager {

    public AseguradoManager(){
       //TABLE = "inf_Asegurados";
       TABLE = "infasegurado";
        myClass = new Infasegurado();
       // claseVinculada = new Perito();
         //claseVinculada = new Tipoinforme();
        columnaId= "idasegurado";
       // maximoID=new BigDecimal(1);
        xhtmlListado = "listAsegurados";
        xhtmlGestion = "modificarAsegurado";
        BBDD="GestionPericial";
    }
    
  //     Si fuese oracle o no tuviese id autoincrementable
    
     public Infasegurado ClaseConUltimoID(Infasegurado nueva){
         System.out.println("LLEgo a ultimo id de asegurado");
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdasegurado(num);
          System.out.println("LLEgo a ultimo id de asegurado  antes de return id="+ num.toString());
      
        return nueva;
       
    }
    
}
