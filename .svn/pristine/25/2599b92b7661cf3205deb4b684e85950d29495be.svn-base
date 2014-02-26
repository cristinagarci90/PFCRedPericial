package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import models.Grupotaller;
import org.hibernate.Session;
import manager.GrupotallerManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.component.accordionpanel.AccordionPanel;
import org.primefaces.event.RowEditEvent;


@ManagedBean (name="grupotallerManagedBean")
@SessionScoped

public class GrupotallerManagedBean {
   // gestion del modelo
    
     
     private List<Object> listado;
     private List<Grupotaller> listadogru;
     private boolean editable;
     Grupotaller grupoSelected;
     Boolean tieneMensajes;
     private AccordionPanel panel;


       
    public Boolean isTieneMensajes() {
        return FacesContext.getCurrentInstance().getMessages().hasNext();
        
    }

    public String addError() {  
        String cad=null;
        if (isTieneMensajes()){
            cad="ERROR";
        }
        return cad;
    }   

    
     public void addError2(ActionEvent actionEvent) {   
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Sample error message", "PrimeFaces makes no mistakes"));   
   } 
      
    public void setTieneMensajes(Boolean tieneMensajes) {
        this.tieneMensajes = tieneMensajes;
    }

    
    
   
   
//Modificar en cada reutilización

private GrupotallerManager ClaseManager = new GrupotallerManager(); // acceso a los datos de register
  
public Grupotaller actual = new Grupotaller();
public Grupotaller actualNuevo = new Grupotaller();

    public Grupotaller getActual() {
        return actual;
    }
public Grupotaller getActualNuevo() {
        return actualNuevo;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public GrupotallerManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Grupotaller();
      // InicializarClase();
     
    }
  
      public void InicializarClase(){
         actual=new Grupotaller();
      }
  
   /*     public String Modificar(Provincia prov) {
        actual = prov;
        return ClaseManager.getXhtmlGestion();
    }*/
        
       public String newRegister(){           
        
       actual=actualNuevo;
       actual= ClaseManager.ClaseConUltimoID(actual) ;
       boolean resultado=true;             
       resultado=ClaseManager.create(actual);        
       
       System.out.println("Entro a dar de alta 1 grupo" + actual.getDenominacion());
       return "ATaller?faces-redirect=true"; 
}  
       
       
      
         private static Map <String,Object> provvalor;
    static {
            provvalor=new LinkedHashMap<String,Object>();
            List <Grupotaller> grupos = new GrupotallerManager().getList();           
            
          
            for (int i=0; i < grupos.size(); i++){
             
               Grupotaller prov = new Grupotaller();
               prov=(Grupotaller) grupos.get(i);
               
               System.out.println("Valores de grupo taller" + prov.getDenominacion());
               provvalor.put(prov.getDenominacion(),prov.getIdgrupotaller());
           
     }
    }
   public Map <String,Object> getprovvalor(){
       return provvalor;
   } 
   
   
     public List<Object> getProvs() {
        return listado;
    }
   

    public void setProvs(List<Object> prov) {
        this.listado = prov;
    }
    
    
    public List<Grupotaller> getlistadogru() {
        this.listadogru=ClaseManager.getList();
        return listadogru;
    }
   

    
     
    private void refreshListRegister(){
        this.listado = ClaseManager.getList();
      
    }

    
     public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
    
     public void onEdit(RowEditEvent  event) { 
        Grupotaller cli = (Grupotaller) event.getObject();
        
        FacesMessage msg = new FacesMessage("Grupo Editado", ((Grupotaller) event.getObject()).getDenominacion());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        //modifico el cliente
        //org.hibernate.Transaction tx =session.beginTransaction();
        //System.out.println("comienza transaccion");
        //session.update(cli);   
        //System.out.println("actualizo");
        //tx.commit();
        
        /*System.out.println("Valor del cliente:" + cli.getNombre());*/
        //return modificar(cli);
        //return null;
       
     }  

     public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Grupo Cancelado", ((Grupotaller) event.getObject()).getDenominacion());
        FacesContext.getCurrentInstance().addMessage(null, msg);  
     }  

    
     public Grupotaller getGrupotallerSelected() {
        return grupoSelected;
    }

    public void setClienteSelected(Grupotaller grupoSelected) {
        this.grupoSelected = grupoSelected;
    }
    
    
   
   
}


