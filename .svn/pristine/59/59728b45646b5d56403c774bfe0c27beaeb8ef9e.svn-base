package manager;

import comun.HibernateManager;
import modelsMaestros.Cliente;
import java.math.BigDecimal;

public class ClienteManager extends HibernateManager {

    public ClienteManager(){
        TABLE = "cliente";
        myClass = new Cliente();
        columnaId= "idcliente";
        maximoID=new BigDecimal(1);
        xhtmlGestion = "modificarCliente";
        BBDD="Maestros";
     
    }
    
     public Cliente ClaseConUltimoID(Cliente nueva){
        System.out.println("LLEgo a ultimo id de cliente");
        BigDecimal num; 
        int maximo=getMaximo(TABLE,columnaId);
        num= new BigDecimal(maximo);
        nueva.setIdcliente(num);
        System.out.println("LLego a ultimo id de cliente  antes de return id="+ num.toString());      
        return nueva;
       
    } 
}
