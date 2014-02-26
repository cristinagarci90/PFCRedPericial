package web;
//package control;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelsMaestros.Estados;
import org.hibernate.Session;
import manager.EstadoManager30012014;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;


@ManagedBean (name="estadosManagedBean")
@SessionScoped

public class EstadosManagedBean30012014 implements Serializable{
   // gestion del modelo
    
     
     private List<Object> listado;
     private List<Estados> listadoes;
     private boolean editable;
     Estados estadoSelected;
   
//Modificar en cada reutilización

private EstadoManager30012014 ClaseManager = new EstadoManager30012014(); // acceso a los datos de register
  
public Estados actual = new Estados();

public Estados actualNuevo=new Estados();

    public Estados getActual() {
        return actual;
    }

    public Estados getActualNuevo() {
        return actualNuevo;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public EstadosManagedBean30012014() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Estados();
     
    }
  
      public void InicializarClase(){
         actual=new Estados();
      }
  
      
       public String Modificar(Estados es) {
          
        actual = es;       
        return ClaseManager.getXhtmlGestion();
    }
      
       public String newRegister(){
         actual=actualNuevo;         
         actual= ClaseManager.ClaseConUltimoID(actual) ;         
         boolean resultado=true;       
         resultado=ClaseManager.create(actual);      
         return "MEstados.xhtml"; 
    }
   
  public String Nuevo() {
        
     actualNuevo=new Estados();
           
        
      return "AEstado.xhtml";
    }
    
   
    public List<Estados> getlistadoes() {
        System.out.println("Llego a entrar a listadoes");
        this.listadoes=ClaseManager.getList();
        System.out.println("Salgo a entrar a listadoes" + this.listadoes.size());
        return listadoes;
    }
   
    
   
      
         
   
   
   public String updateRegister(){
       
       
        try{
         System.out.println("Entro a modif");
           boolean resultado=ClaseManager.updateConcu(actual,"Estados","idestado",actual.getIdestado());
        }catch(Exception e)
        {
            System.out.println("Error en modificar estado="+ e);
        }
         return "MEstados.xhtml";
         
 
        
       
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
    
    
     public void onCellEdit(CellEditEvent event) { 
       Object oldValue = event.getOldValue();   
       Object newValue = event.getNewValue();   

         try{
             
          System.out.println("Valor de Cell Edit nuevo" + newValue.toString() );
          System.out.println("Valor de Cell Edit antes" + oldValue.toString() );
          FacesMessage msg = new FacesMessage("Estado Edited", ((Estados) event.getNewValue()).getDescripcion());   
 
        FacesContext.getCurrentInstance().addMessage(null, msg);   

        }catch(Exception e)
        {
            System.out.println("Error en modificar estado="+ e);
        }

     }
     
     
     
  
   
      
   /* public void onEdit(RowEditEvent event) { 
       
         try{
          FacesMessage msg = new FacesMessage("Estado Edited", ((Estados) event.getObject()).getDescripcion());   
 
        FacesContext.getCurrentInstance().addMessage(null, msg);   

        }catch(Exception e)
        {
            System.out.println("Error en modificar estado="+ e);
        }
        
        //modifico el cliente
        //org.hibernate.Transaction tx =session.beginTransaction();
        //System.out.println("comienza transaccion");
        //session.update(cli);   
        //System.out.println("actualizo");
        //tx.commit();
        
        
       
     }  */

     public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Estados Cancelado", ((Estados) event.getObject()).getDescripcion());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
     }  

    
     public Estados getEstadoSelected() {
        return estadoSelected;
    }

    public void setEstadoSelected(Estados estadoSelected) {
        this.estadoSelected = estadoSelected;
    }
    
  

   
   
   
}


