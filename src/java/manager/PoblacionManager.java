package manager;

import comun.HibernateManager;
import models.Poblacion;
import java.math.BigDecimal;

public class PoblacionManager extends HibernateManager {

    public PoblacionManager(){
        TABLE = "poblacion";
        myClass = new Poblacion();
        columnaId= "idpoblacion";
        maximoID=new BigDecimal(1);
     Consulta="";
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
