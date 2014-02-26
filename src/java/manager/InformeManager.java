package manager;

import comun.HibernateManager;
import models.InfInforme;
import models.Tipoinforme;
import modelsMaestros.Perito;
import models.Infasegurado;
import java.math.BigDecimal;

public class InformeManager extends HibernateManager {

    public InformeManager(){
       TABLE = "inf_informe";
        myClass = new InfInforme();
        claseVinculada = new Perito();
        claseVinculada2 = new Infasegurado();
         //claseVinculada = new Tipoinforme();
        columnaId= "idinforme";
       // maximoID=new BigDecimal(1);
        xhtmlListado = "listInformes";
        xhtmlGestion = "modificarInforme";
        BBDD="GestionPericial";
    }
    
  //     Si fuese oracle o no tuviese id autoincrementable
    
     public InfInforme ClaseConUltimoID(InfInforme nueva){
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdinforme(num);
        return nueva;
       
    }
    
}
