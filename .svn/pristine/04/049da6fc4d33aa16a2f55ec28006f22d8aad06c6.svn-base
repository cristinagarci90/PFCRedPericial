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
import manager.FotosManager;
import models.InfFotosinforme;
import org.primefaces.event.SelectEvent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.math.BigDecimal;
//import InformeManagedBean;

 //@ManagedBean//(name="AsegMB")
 @ManagedBean(name="fotosInformeManagedBean")
@SessionScoped

public class FotosInformeManagedBean {
  public  InformeManagedBean InfMB;
 
     private List<InfFotosinforme> listado;
     public MarcaManagedBean P;//=new CategoriaManagedBean();
     public InformeManagedBean nuevo;
     //    INICIO  ------   Modificar en cada reutilización
     private FotosManager ClaseManager = new FotosManager(); // acceso a los datos de register
     
     public InfFotosinforme actual=new InfFotosinforme();
   
   
     
     public InfFotosinforme getActual() {
        return actual;
     }

     
   public FotosInformeManagedBean() {
         ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         try{
            InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
       }         catch(Throwable ex) {   
     }
       if(this.listado == null){
           this.listado = ClaseManager.getListParametroConsulta("InfFotosinforme","idFoto",InfMB.actual.getIdinforme());
        }
       
       // actual=new InfAsegurado();
              
    }
    
    public String newRegister(){//String Informe){
     String nombreFoto;
        
        actual=new InfFotosinforme();
         System.out.println("******fotos informe newregister**********1");
          actual= ClaseManager.ClaseConUltimoID(actual) ;
          boolean resultado=true;
            System.out.println("******fotos informe newregister**********");
            
           // actual.setInfInforme(InfMB.actual);
             System.out.println("******fotos informe newregister****111******");
             actual.setInfInforme(InfMB.actual);
              System.out.println("******fotos informe newregister****222******");
              System.out.println("******fotos informe newregister****222******idinforme="+InfMB.actual.getIdinforme());
              System.out.println("******fotos informe newregister****222******idinforme dentro de foto="+actual.getInfInforme().getIdinforme());
            actual.setRuta("");//poner valor
             System.out.println("******fotos informe newregister****333******");
            actual.setNombreFoto(InfMB.actual.getIdinforme().toString()+actual.getIdfoto().toString()+".jpg");//poner valor
              actual.setRuta("ruta");//poner valor
                actual.setExtensionArchivo("jpg");
             nombreFoto=InfMB.actual.getIdinforme().toString()+actual.getIdfoto().toString()+".jpg";
             System.out.println("******fotos informe newregister****444******");
            resultado=ClaseManager.create(actual);
        System.out.println("******fotos informe newregister****555******");
            
         
      
           return nombreFoto; 
    }
   
    /*
      public List<InfAvances> getListado() { 
         //this.listado = ClaseManager.getList();
          this.listado = ClaseManager.getListParametroConsulta("InfAvances","idInforme",InfMB.actual.getIdinforme());
         return listado;
    }
      
     
        public String Modificar(InfAvances inf) {
          actual = inf;     
        return ClaseManager.getXhtmlGestion();
    }
  
   
  //    FIN  ------   Modificar en cada reutilización
       */
  
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