package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import models.Poblacion;
import org.hibernate.Session;
import manager.PoblacionManager;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
import org.hibernate.Query;
import java.util.ArrayList;
//import modelsMaestros.Cliente;
import models.Poblacion;
import models.Provincia;
import comun.HibernateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ManagedBean 
@SessionScoped

public class PoblacionesManagedBean {
   // gestion del modelo
    private PoblacionManager ClaseManager = new PoblacionManager(); // acceso a los datos de register
    
private List<Object> listado;
private List<Poblacion> listadoP;
    
//Modificar en cada reutilización
//public String provinciaParametro; 


  
public Poblacion actual;

    public Poblacion getActual() {
        return actual;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public PoblacionesManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Poblacion();
     
    }
  
      public void InicializarClase(){
         actual=new Poblacion();
      }
      
     private static Map <String,Object> pobvalor;
   
     public Map <String,Object> getPoblaciones(String idProvincia){
         System.out.println("Provincia........gerPoblaciones= " + idProvincia);
            pobvalor=new LinkedHashMap<String,Object>();
            List<Poblacion> provincias = (List<Poblacion>) new PoblacionManager().getListConsulta("from Poblacion where idprovincia='"+idProvincia+"'");
  
            for (int i=0; i < provincias.size(); i++){
             Poblacion pob = new Poblacion();
            pob=(Poblacion) provincias.get(i);
               pobvalor.put(pob.getPoblacion(),pob.getIdpoblacion());
     }
            return pobvalor;
    }
      
   
  //    FIN  ------   Modificar en cada reutilización
       


    private void refreshListRegister(){
        this.listado = ClaseManager.getList();
      
    }

    
            
      
     
}


