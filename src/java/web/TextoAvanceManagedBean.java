package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import models.TextoAvance;
import org.hibernate.Session;
import manager.TextoAvanceManager;
import java.util.HashSet;
import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
import org.hibernate.Query;
import java.util.ArrayList;
//import modelsMaestros.Cliente;

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

public class TextoAvanceManagedBean {
   // gestion del modelo
    private TextoAvanceManager ClaseManager = new TextoAvanceManager(); // acceso a los datos de register
    
private List<Object> listado;
private List<TextoAvance> listadoP;
    
//Modificar en cada reutilización
//public String provinciaParametro; 


  
public TextoAvance actual;

    public TextoAvance getActual() {
        return actual;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public TextoAvanceManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new TextoAvance();
     
    }
  
      public void InicializarClase(){
         actual=new TextoAvance();
      }
      
     private static Map <String,Object> pobvalor;
   
     public Map <String,Object> getTextos(String idta){
         pobvalor=new LinkedHashMap<String,Object>();
              List<Object[]>  provincias =new TextoAvanceManager().getConsultaList(ClaseManager.getConsulta()+idta);
 
              for (Object[] row : provincias) { 
                TextoAvance user = new TextoAvance(); 
                pobvalor.put((String) row[1],row[0]);
           
            }
              return pobvalor;
    }
      
        


    private void refreshListRegister(){
        this.listado = ClaseManager.getList();
      
    }

    
   
}


