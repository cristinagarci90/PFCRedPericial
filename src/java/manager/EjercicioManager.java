package manager;

import comun.HibernateManager;
import java.math.BigDecimal;
import modelsMaestros.Ejercicio;

public class EjercicioManager extends HibernateManager {

    public EjercicioManager(){
       TABLE = "Ejercicio";
       myClass = new Ejercicio();
       columnaId= "idejercicio";       
       xhtmlListado = "listEjercicios";
       xhtmlGestion = "modificarEjercicio";
       BBDD="Maestros";
    }
    
     
     public Ejercicio ClaseConUltimoID(Ejercicio nueva){       
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdejercicio(num);             
        return nueva;
       
    }
    
}

