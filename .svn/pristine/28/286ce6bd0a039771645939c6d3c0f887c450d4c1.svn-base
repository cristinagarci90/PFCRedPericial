package web;
//import modelsMaestros.Perito;
//package control;

import java.util.Iterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.UUID;  
import models.InfInforme;

//import web.CoberturasManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.faces.bean.ViewScoped;
import java.util.List;
import manager.AvanceManager;
import models.InfAvances;
import org.primefaces.event.SelectEvent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.math.BigDecimal;
//import InformeManagedBean;

 //@ManagedBean//(name="AsegMB")
 @ManagedBean(name="avanceManagedBean")
@SessionScoped

public class AvanceManagedBean {
  public  InformeManagedBean InfMB;
 
     private List<InfAvances> listado;
     public MarcaManagedBean P;//=new CategoriaManagedBean();
     public InformeManagedBean nuevo;
     //    INICIO  ------   Modificar en cada reutilización
     private AvanceManager ClaseManager = new AvanceManager(); // acceso a los datos de register
     
     public InfAvances actual=new InfAvances();
   
   
     
     public InfAvances getActual() {
        return actual;
     }

     
   public AvanceManagedBean() {
         ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         try{
            InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
       }         catch(Throwable ex) {   
     }
       if(this.listado == null){
           System.out.println("entro en listado = null");
           this.listado = ClaseManager.getListParametroConsulta("InfAvances","idInforme",InfMB.actual.getIdinforme());
         //  System.out.println("entro en listado = null tamaño="+this.listado.size());
        }
       else{
           System.out.println("entro en listado = null ELSE");
       }
     //  }
       
       // actual=new InfAsegurado();
              
    }
    
    public String newRegister(){//String Informe){
      //  System.out.println("AVANCES NEW REGISTER");
         java.util.Date date = new Date(); 
       //  System.out.println("AVANCES NEW REGISTER2");
         java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("MM/dd/yyyy");
      //   System.out.println("AVANCES NEW REGISTER3");
         actual.setFechaavance(sdf.format(date));
      //   System.out.println("AVANCES NEW REGISTER4");
         actual= ClaseManager.ClaseConUltimoID(actual) ;
       //  System.out.println("AVANCES NEW REGISTER5");
       //  System.out.println("En la clase el campo texto="+actual.getTexto());
       //   System.out.println("En la clase el campo texto  textocia="+actual.getTextoCia());
          actual.setTexto(actual.getTexto() + " " + actual.getTextoCia());//  actual.getTextoCia() +  actual.getTexto());
      //    System.out.println("AVANCES NEW REGISTER6");
         boolean resultado=true;
      //   System.out.println("AVANCES NEW REGISTER7");
            actual.setInfInforme(InfMB.actual);
        //    System.out.println("AVANCES NEW REGISTER8");
            resultado=ClaseManager.create(actual);
         //   System.out.println("AVANCES NEW REGISTER9");
        actual.setTexto("");
         actual.setTextoCia("");
     //   actual.setTextoCia("");
            
         
      
           return "avancesInforme.xhtml"; 
    }
   
    
      public List<InfAvances> getListado() { 
         //this.listado = ClaseManager.getList();
           System.out.println("entro en listado ELSE  = null  GETLIST");
          this.listado = ClaseManager.getListParametroConsulta("InfAvances","idInforme",InfMB.actual.getIdinforme());
          System.out.println("entro en listado ELSE  = null  GETLIST TAMÑO = " + this.listado.size());
         return listado;
    }
      
     
        public String Modificar(InfAvances inf) {
          actual = inf;     
        return ClaseManager.getXhtmlGestion();
    }
  
   
  //    FIN  ------   Modificar en cada reutilización
       
  
   public String updateRegister(InformeManagedBean Informe){
      /*      
          ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
        try{
           InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
           InfMB.actual.setAsegurado(actual.getIdinfavance());
           InfMB.updateRegister();
           InfMB.actual = new InfInforme();
         }         catch(Throwable ex) {}
      */
         
       boolean resultado=ClaseManager.update(actual);
         
        // return "listInformes";
         return "";
    }
  
   
}