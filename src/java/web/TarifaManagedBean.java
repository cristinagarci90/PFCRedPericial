package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import org.hibernate.Session;
import manager.SerieManager;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import manager.TarifaManager;
import models.Tarifa;
import org.primefaces.event.RowEditEvent;


@ManagedBean (name="tarifaManagedBean")
@SessionScoped

public class TarifaManagedBean {
   // gestion del modelo
    
     
     private List<Object> listado;
     private List<Tarifa> listadota;
     private boolean editable;
     Tarifa tarifaSelected;
   
//Modificar en cada reutilización

private TarifaManager ClaseManager = new TarifaManager(); // acceso a los datos de register
  
public Tarifa actual;

    public Tarifa getActual() {
        return actual;
    }

Session session = null;
     

  
   public TarifaManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Tarifa();
    
    }
  
      public void InicializarClase(){
         actual=new Tarifa();
      }
  
       
    public List<Tarifa> getlistadota() {
        this.listadota=ClaseManager.getList();
        return listadota;
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
        Tarifa t = (Tarifa) event.getObject();
        System.out.println("Valor de la tarifa:" + t.getNombre());
        FacesMessage msg = new FacesMessage("Tarifa Editada", ((Tarifa) event.getObject()).getNombre());  
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
        FacesMessage msg = new FacesMessage("Tarifa Cancelada", ((Tarifa) event.getObject()).getNombre());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
     }  

    
     public Tarifa getTarifaSelected() {
        return tarifaSelected;
    }

    public void setTarifaSelected(Tarifa tarifaSelected) {
        this.tarifaSelected = tarifaSelected;
    }
    
   
   
   
}


