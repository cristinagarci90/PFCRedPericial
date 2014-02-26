package manager;

import comun.HibernateManager;
import models.Modelos;
import java.math.BigDecimal;

public class ModeloManager extends HibernateManager {

    public ModeloManager(){
        TABLE = "modelos";
        myClass = new Modelos();
        columnaId= "idmodelo";
        maximoID=new BigDecimal(1);
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
