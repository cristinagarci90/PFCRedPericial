package manager;

import comun.HibernateManager;
import models.Cobertura;
import java.math.BigDecimal;

public class CoberturaManager extends HibernateManager {

    public CoberturaManager(){
        TABLE = "cobertura";
        myClass = new Cobertura();
        columnaId= "idcobertura";
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
