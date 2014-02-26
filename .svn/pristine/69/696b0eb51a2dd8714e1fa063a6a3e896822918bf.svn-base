package manager;

import comun.HibernateManager;
import models.InfContrario;
//import models.Tipoinforme;
//import modelsMaestros.Perito;
import java.math.BigDecimal;

public class ContrarioManager extends HibernateManager {

    public ContrarioManager(){
       TABLE = "inf_Contrarios";
        myClass = new InfContrario();
       // claseVinculada = new Perito();
         //claseVinculada = new Tipoinforme();
        columnaId= "idcontrario";
       // maximoID=new BigDecimal(1);
      //  xhtmlListado = "listAsegurados";
     //   xhtmlGestion = "modificarAsegurado";
    //    BBDD="GestionPericial";
    }
    
  //     Si fuese oracle o no tuviese id autoincrementable
    
     public InfContrario ClaseConUltimoID(InfContrario nueva){
         System.out.println("LLEgo a ultimo id del contrario");
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdcontrario(num);
          System.out.println("LLEgo a ultimo id de contrario  antes de return id="+ num.toString());
      
        return nueva;
       
    }
    
}
