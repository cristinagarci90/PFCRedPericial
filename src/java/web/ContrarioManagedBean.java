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
import models.InfContrario;
import models.Marcas;
import models.Modelos;
import web.MarcaManagedBean;
import manager.ContrarioManager;
import org.primefaces.event.SelectEvent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
//import InformeManagedBean;

 //@ManagedBean//(name="AsegMB")
 @ManagedBean(name="contrarioManagedBean")
@SessionScoped

public class ContrarioManagedBean {
  public  InformeManagedBean InfMB;
 
     private List<InfContrario> listado;
    // private List<InfAsegurado> listadoTextos;
     public MarcaManagedBean P;//=new CategoriaManagedBean();
     public InformeManagedBean nuevo;
     //    INICIO  ------   Modificar en cada reutilización
     private ContrarioManager ClaseManager = new ContrarioManager(); // acceso a los datos de register
     
     public InfContrario actual=new InfContrario();
     // marcaAseg = new MarcaManagedBean();
     Marcas marcaClase= new Marcas();
     Modelos modeloClase=new Modelos();

    public Modelos getModeloClase() {
        return modeloClase;
    }

    public void setModeloClase(Modelos modeloClase) {
        this.modeloClase = modeloClase;
    }

    public Marcas getMarcaClase() {
        return marcaClase;
    }

    public void setMarcaClase(Marcas marcaClase) {
        this.marcaClase = marcaClase;
    }
  /*   
    public MarcaManagedBean getMarcaAseg() {
        return marcaAseg;
    }
 
    
    public void setMarcaAseg(MarcaManagedBean marcaAseg) {
        this.marcaAseg = marcaAseg;
    }
  
  */

   
     
     public InfContrario getActual() {
        return actual;
     }

     
   public ContrarioManagedBean() {
    //   System.out.println("ContrarioManagedBean-----constructor");
    //   if(this.listado == null){
   //        this.listado = ClaseManager.getList();
   //     }
       
        actual=new InfContrario();
       System.out.println("************************entro en constructor de la clase");
              ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         try{
            InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
       }         catch(Throwable ex) {   
     }
       if(this.listado == null){
           this.listado = ClaseManager.getListParametroConsulta("InfContrario","idCInforme",InfMB.actual.getIdinforme());
        }
    }
    
    public void newRegister(){//InformeManagedBean Informe){
       // actual.setMarcas(marcaClase);
       // actual.setModelos(modeloClase);
         actual= ClaseManager.ClaseConUltimoID(actual) ;
   
        boolean resultado=true;
         ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         //AseguradoManagedBean
         try{
            InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
           // InfMB.actual = new InfInforme();
       //    InfMB.actual.setAsegurado(actual..getIdasegurado());
       //    InfMB.updateRegister();
           System.out.println("------------------Nuevo registro del contrarioMAnagedBean-------------3trye");
         }         catch(Throwable ex) {   
             System.out.println("------------------Nuevo registro del contrarioMAnagedBean-------------3catch");
  //actual.set
         }
             actual.setInfInforme(InfMB.actual);
             actual.setMarcas(this.getMarcaClase());
             actual.setModelos(this.getModeloClase());
             
            resultado=ClaseManager.create(actual);
         
         
         
   
     
            
         
      
           //return "listAsegurados.xhtml"; 
    }
   
    
   /*
      public List<InfContrario> getListado() { 
         this.listado = ClaseManager.getList();
         return listado;
    }
      
     
        public String Modificar(InfContrario inf) {
                System.out.println(".........................ENTRO en MODIFICAR de ASEGURADO,,,,,,,,,,,,,,,,,,,,,,,,,,");
     
          actual = inf;     
        return ClaseManager.getXhtmlGestion();
    }
  
   
  //    FIN  ------   Modificar en cada reutilización
       
  
   public String updateRegister(InformeManagedBean Informe){
           
          ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         //AseguradoManagedBean
         try{
           InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
           InfMB.actual.setAsegurado(actual.getIdasegurado());
           InfMB.updateRegister();
           InfMB.actual = new InfInforme();
         }         catch(Throwable ex) {}
      
         boolean resultado=ClaseManager.update(actual);
        // return "listInformes";
         return "";
    }
  */
  
     /*
     
      public void listadoCompleto(){
   this.listado = ClaseManager.getList();
    
    }*/
    
    
      public List<InfContrario> getListado() { 
         //this.listado = ClaseManager.getList();
         this.listado = ClaseManager.getListParametroConsulta("InfContrario","idInforme",InfMB.actual.getIdinforme());
         return listado;
    }
      
      
  public String modificar(InfContrario Cont) {
     //                     System.out.println(".........................ENTRO en MODIFICAR de contrario,,,,,,,,,,,,,,,,,,,,,,,,,, nombre="+Cont.getNombre());
   // System.out.println(".........................ENTRO en MODIFICAR");
   //   System.out.println(".........................ENTRO en MODIFICAR marca="+Cont.getMarcas().getMarca());
   actual = Cont; 
   this.setMarcaClase(Cont.getMarcas());
 this.setModeloClase(Cont.getModelos());
      
    
   // System.out.println(".........................ENTRO en MODIFICAR de  Modificar,,,,,,,,,,,,,,,,,,,,,,,,,, nombre="+Cont.getNombre());
     return "";
    }
  
  
  
  
   public void updateRegister(){//InformeManagedBean Informe){
        
      
        boolean resultado=ClaseManager.updateConcu(actual,"InfContrario","idcontrario",actual.getIdcontrario());
        
      
         
    }
}