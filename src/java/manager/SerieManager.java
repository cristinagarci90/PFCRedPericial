package manager;

import comun.HibernateManager;
import modelsMaestros.Series;
import java.math.BigDecimal;

public class SerieManager extends HibernateManager {

    public SerieManager(){
       TABLE = "Series";
        myClass = new Series();
       // claseVinculada = new Perito();
         //claseVinculada = new Tipoinforme();
        columnaId= "idserie";
       // maximoID=new BigDecimal(1);
        xhtmlListado = "listSeries";
        xhtmlGestion = "modificarSerie";
        BBDD="maestros";
    }
    
  //     Si fuese oracle o no tuviese id autoincrementable
    
     public Series ClaseConUltimoID(Series nueva){
        
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdserie(num);
      
      
        return nueva;
       
    }
    
}

