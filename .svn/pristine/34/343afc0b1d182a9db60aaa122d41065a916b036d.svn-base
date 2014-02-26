package manager;

import comun.HibernateManager;
import models.Provincia;
import java.math.BigDecimal;

public class ProvinciaManager extends HibernateManager {

    public ProvinciaManager(){
        TABLE = "provincia";
        myClass = new Provincia();
        columnaId= "idprovincia";
        maximoID=new BigDecimal(1);
         BBDD="GestionPericial";
        // Consulta="SELECT provincia FROM Provincia Where idprovincia=";
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
