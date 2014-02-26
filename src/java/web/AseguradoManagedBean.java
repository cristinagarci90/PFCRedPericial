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
import models.Infasegurado;
import models.TextoAvance;
import models.Marcas;
import models.Modelos;
import web.MarcaManagedBean;
import manager.AseguradoManager;
import org.primefaces.event.SelectEvent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
//import InformeManagedBean;

 //@ManagedBean//(name="AsegMB")
 @ManagedBean(name="aseguradoManagedBean")
@SessionScoped

public class AseguradoManagedBean {
  public  InformeManagedBean InfMB;
 
     private List<Infasegurado> listado;
   //  private List<InfAsegurado> listadoMatriculaModificacion;
    
     private List<Infasegurado> listadoTextos;
     public MarcaManagedBean P;//=new CategoriaManagedBean();
     public InformeManagedBean nuevo;
     //    INICIO  ------   Modificar en cada reutilización
     private AseguradoManager ClaseManager = new AseguradoManager(); // acceso a los datos de register
     
     public Infasegurado actual=new Infasegurado();
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

   
     
     public Infasegurado getActual() {
        return actual;
     }

     
   public AseguradoManagedBean() {
       System.out.println("AseguradoManagedBean-----constructor");
       if(this.listado == null){
           this.listado = ClaseManager.getList();
        }
       
      // actual=new InfAsegurado();
       System.out.println("************************entro en constructor de la clase");
             
    }
    
    public String newRegister(InformeManagedBean Informe){
       // actual.setMarcas(marcaClase);
       // actual.setModelos(modeloClase);
         actual= ClaseManager.ClaseConUltimoID(actual) ;
         System.out.println("------------------Nuevo registro del asegurado AseguradoMAnagedBean-------------1trye id="+actual.getIdasegurado());
   
     boolean resultado=true;
      System.out.println("------------------Nuevo registro del asegurado AseguradoMAnagedBean-------------1trye id="+actual.getIdasegurado()+ "antes de create");
         resultado=ClaseManager.create(actual);
            System.out.println("------------------Nuevo registro del asegurado AseguradoMAnagedBean-------------1trye id="+actual.getIdasegurado()+ "despues de create");
   
             ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         //AseguradoManagedBean
         try{
           //   System.out.println("------------------Nuevo registro del asegurado AseguradoMAnagedBean-------------1trye id="+actual.getIdasegurado());
            InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
           // InfMB.actual = new InfInforme();
           InfMB.actual.setAsegurado(actual.getIdasegurado());
         //   System.out.println("------------------Nuevo registro del asegurado AseguradoMAnagedBean-------------2trye");
           InfMB.updateRegister();
        //   System.out.println("------------------Nuevo registro del asegurado AseguradoMAnagedBean-------------3trye");
         }         catch(Throwable ex) {   
       //      System.out.println("------------------Nuevo registro del asegurado AseguradoMAnagedBean-------------3catch");
    }
   
         /*
           nuevo=Informe;
           nuevo.actual.setAsegurado(actual.getIdasegurado());
           nuevo.updateRegister();
           */
            
    //     actual.setMarcas(this.getMarcaClase());
           actual.setMarcas(this.getMarcaClase());
             actual.setModelos(this.getModeloClase());
      
           return "listAsegurados.xhtml"; 
    }
   
    
      public List<Infasegurado> getListado() { 
         this.listado = ClaseManager.getList();
         return listado;
    }
      
     
        public String Modificar(Infasegurado inf) {
                System.out.println(".........................ENTRO en MODIFICAR de ASEGURADO,,,,,,,,,,,,,,,,,,,,,,,,,,");
     
          actual = inf;     
           this.setMarcaClase(inf.getMarcas());
           this.setModeloClase(inf.getModelos());
           
        return ClaseManager.getXhtmlGestion();
    }
  
   
  //    FIN  ------   Modificar en cada reutilización
       
  
   public String updateRegister(InformeManagedBean Informe){
    //System.out.println("Aseguradoooooooooooooooooooooooooooo   updateRegister idasegurado="+actual.getIdasegurado());
   /* nuevo=Informe;
           nuevo.actual.setAsegurado(actual.getIdasegurado());
           nuevo.updateRegister();*/
           
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
   public String quitarAsegurado(InformeManagedBean Informe){
              
          ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
          try{
           InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
           InfMB.actual.setAsegurado(null);
           InfMB.updateRegister();
           InfMB.actual = new InfInforme();
         }         catch(Throwable ex) {}
      
         boolean resultado=ClaseManager.update(actual);
         actual=new Infasegurado();
         return "modificarInforme";
    }
  
   public void onDialogReturn(SelectEvent event) {  
           /* Car car = (Car) event.getObject();  
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Model:" + car.getModel());  
  
            FacesContext.getCurrentInstance().addMessage(null, message);  */
        }  
   
     public String viewCars() {  
        return "modalDialog:listAsegurados";  
    }  
     
     
      public void listadoCompleto(){
          this.listado = ClaseManager.getList();
        //  System.out.println("Aseguradoooooooooooooooooooooooooooo");
          
   //this.listado = ClaseManager.getListParametroString("nombre","aseg12");
    
    }
      /*
    public List<InfAsegurado> getListadoMatriculaModificacion() {
         if (actual.getMatricula()==null || actual.getMatricula().length()==0)
              listadoMatriculaModificacion=new ArrayList<InfAsegurado>();
           else
              listadoMatriculaModificacion = ClaseManager.getListParametroString("matricula",actual.getMatricula()); 
           
        return listadoMatriculaModificacion;
    }*/
    
   /*  public String Asignar(InfAsegurado inf) {
        
        actual=inf;
        return "modificarInforme";
    }*/
}