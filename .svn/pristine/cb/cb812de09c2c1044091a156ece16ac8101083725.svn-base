package manager;

import comun.HibernateManager;
import models.InfDocinformevarios;
//import models.Tipoinforme;
//import modelsMaestros.Perito;
import java.math.BigDecimal;

public class InformeVariosManager extends HibernateManager {

    public InformeVariosManager(){
       TABLE = "inf_Docinformevarios";
        myClass = new InfDocinformevarios();
       // claseVinculada = new Perito();
         //claseVinculada = new Tipoinforme();
        columnaId= "idinforme";
       // maximoID=new BigDecimal(1);
        xhtmlListado = "";
        xhtmlGestion = "";
        BBDD="GestionPericial";
    }
    
  //     Si fuese oracle o no tuviese id autoincrementable
    /*
     public InfDocinformevarios ClaseConUltimoID(InfDocinformevarios nueva){
         System.out.println("LLEgo a ultimo id de asegurado");
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdasegurado(num);
          System.out.println("LLEgo a ultimo id de asegurado  antes de return id="+ num.toString());
      
        return nueva;
       
    }
    */
}
