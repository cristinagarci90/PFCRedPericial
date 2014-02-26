package manager;

import comun.HibernateManager;
import models.Tipoinforme;
import java.math.BigDecimal;

public class TipoInformeManager extends HibernateManager {

    public TipoInformeManager(){
        TABLE = "Tipoinforme";
        myClass = new Tipoinforme();
        columnaId= "idtipoinforme";
        maximoID=new BigDecimal(1);
        BBDD="GestionPericial";
      //  xhtmlListado = "index";
      //  xhtmlGestion = "altaProvincia";
    }
    
     /*public Provincia ClaseConUltimoID(Provincia nueva){
       // if(!provinciasManager.checkRepeated("name", register.getName())){
       //     register.setEnabled(value);
           //poner el id correspondiente
        BigDecimal num; 
        //int num;
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdprovincia(num.toString());
        return nueva;
       
    }*/
}
