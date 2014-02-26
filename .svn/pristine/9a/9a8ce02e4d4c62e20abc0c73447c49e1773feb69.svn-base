package manager;

import comun.HibernateManager;
import models.Marcas;
import java.math.BigDecimal;

public class MarcaManager extends HibernateManager {

    public MarcaManager(){
        TABLE = "marcas";
        myClass = new Marcas();
        columnaId= "idmarca";
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
