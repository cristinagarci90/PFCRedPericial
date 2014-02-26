package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import models.Taller;
import org.hibernate.Session;
import manager.TallerManager;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


//@ManagedBean
 @ManagedBean(name="tallerManagedBean")
@SessionScoped

public class TallerManagedBean {
   // gestion del modelo
    private TallerManager ClaseManager = new TallerManager(); // acceso a los datos de register
    
private List<Taller> listado;
private List<Taller> listadoF;
   //   private List<Taller> listadocli;
//Modificar en cada reutilización
//public String provinciaParametro; 


  
public Taller actual=new Taller();
public Taller actualNuevo = new Taller();

    public Taller getActualNuevo() {
        return actualNuevo;
    }

    public Taller getActual() {
        if(actual==null)
            actual=new Taller();
        
        return actual;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public TallerManagedBean() {
      /*  if(this.listado == null){
            System.out.println("ENTROOOOOOOOOOOOOOOOOOOOOOOOOOOOoo  en null");
           this.listado = ClaseManager.getList();
        }*/
       // actual=new Taller();
                //this.listado = ClaseManager.getList();
              //  listadoCompleto();
        
       this.listado = ClaseManager.getList();
        
    //   this.listado=new ArrayList();
               // actual=new Taller();

    }
  
      public void InicializarClase(){
         actual=new Taller();
      }
     
     public List<Taller> getListado() { 
         this.listado = ClaseManager.getList();
         return listado;
    }
 public String newRegister(){
     
          
         actual= ClaseManager.ClaseConUltimoID(actual) ;
         boolean resultado=true;
         System.out.println("Valor de baja en taller**************" + actual.getBaja());
         resultado=ClaseManager.create(actual);      
         
   
         
        
           return "talleres.xhtml"; 
    }
 
public String Nuevo() {
              
      actualNuevo=new Taller();
      
          
      return "ATaller.xhtml";
    }
  
 
   public void updateRegister(){//InformeManagedBean Informe){
        
        InformeManagedBean InfMB=new InformeManagedBean();
     
        boolean resultado=ClaseManager.updateConcu(actual,"Taller","idtaller",actual.getIdtaller());
        
        ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         try{
            InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
            InfMB.actual.setTaller(actual.getIdtaller());
            InfMB.updateRegister();
       }         catch(Throwable ex) {   
     }
         
    }
  
 
 
 
  public String updateRegisterTaller(){
       try{
         
         boolean resultado=ClaseManager.update(actual);
        }
       
        catch(Exception e)
        {
            System.out.println("Error en modificar taller="+ e);
        }
         return "MTalleres.xhtml";
         
 
        
       
    }
 
 public void listPorPobProv(){
          System.out.println("Entro a listar talleres por provncia");
          String hql = " WHERE idprovincia='"+actual.getIdprovincia()+"' and idpoblacion='"+actual.getIdpoblacion()+"'";
          this.listado = ClaseManager.getListParametroConsultaConWhere("Taller",hql);
            
    }
 /* public void listTodos(){
     this.listado =  new ArrayList();       
   this.listado = ClaseManager.getList();
    
    }*/
  public void listadoCompleto(){
   this.listado = ClaseManager.getList();
    
    }
     public String Modificar(Taller tall) {
                   
      actual = tall;     
      return ClaseManager.getXhtmlGestion();
    }

    public String modificar(Taller tall) {
                          System.out.println(".........................ENTRO en MODIFICAR de TALLER,,,,,,,,,,,,,,,,,,,,,,,,,, nombre="+tall.getNombre());
    actual = tall; 
    
    System.out.println(".........................ENTRO en MODIFICAR de TALLER,,,,,,,,,,,,,,,,,,,,,,,,,, nombre="+tall.getNombre());
      return ClaseManager.getXhtmlGestion();
    }
      
  
}


