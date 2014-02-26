package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import models.Modelos;
import org.hibernate.Session;
import manager.ModeloManager;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashMap;
//import javax.faces.event.ValueChangeListener;
import javax.faces.event.ValueChangeEvent;
//import javax.faces.event.ValueChangeListener;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
import org.hibernate.Query;
import java.util.ArrayList;
//import modelsMaestros.Cliente;
//import models.Modelos;
import models.Marcas;
import comun.HibernateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.math.BigDecimal;

@ManagedBean 
@SessionScoped

public class ModelosManagedBean {
   // gestion del modelo
    private ModeloManager ClaseManager = new ModeloManager(); // acceso a los datos de register
    
private List<Object> listado;
private List<Modelos> listadoP;
    
//Modificar en cada reutilización
//public String provinciaParametro; 


  
public Modelos actual;

    public Modelos getActual() {
        return actual;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public ModelosManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Modelos();
     
    }
  
      public void InicializarClase(){
         actual=new Modelos();
      }
      
     private static Map <String,Object> pobvalor;
   
     public Map <String,Object> getModelos(String idProvincia){
         // System.out.println("*************get Modelos  Marca=");
          System.out.println("*************get Modelos  Marca="+idProvincia);
     //       System.out.println("1--------------ENTRO EN MODELOSMANAGEDBEAN.GETMODELOS--------------------------MODELO="+idProvincia);
            pobvalor=new LinkedHashMap<String,Object>();
     //        System.out.println("2--------------ENTRO EN MODELOSMANAGEDBEAN.GETMODELOS--------------------------MODELO="+idProvincia);
           
        //    System.out.println("MODELOS.....= " + idProvincia);
            List<Modelos> provincias = (List<Modelos>) new ModeloManager().getListConsulta("from Modelos where idmarca="+idProvincia);
  // System.out.println("3--------------ENTRO EN MODELOSMANAGEDBEAN.GETMODELOS--------------------------MODELO="+idProvincia);
           
            for (int i=0; i < provincias.size(); i++){
             Modelos pob = new Modelos();
            pob=(Modelos) provincias.get(i);
               pobvalor.put(pob.getModelo(),pob.getIdmodelo());
     }
        //     System.out.println("4--------------ENTRO EN MODELOSMANAGEDBEAN.GETMODELOS--------------------------MODELO="+idProvincia);
            System.out.println("*************get Modelos  tamaño listado="+provincias.size());
            return pobvalor;
    }
     /* 
 public void validarSelect(ValueChangeEvent valueChangeEvent) {
    // Add event code here...
    System.out.println("Entro a validarSelect..." + valueChangeEvent.getClass().getFields().length);
}*/
  //    FIN  ------   Modificar en cada reutilización
       


    private void refreshListRegister(){
        this.listado = ClaseManager.getList();
      
    }

    
            
      
     
}


