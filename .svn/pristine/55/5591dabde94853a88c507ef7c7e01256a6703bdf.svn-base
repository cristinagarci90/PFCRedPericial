package web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import manager.SerieManager;
import modelsMaestros.Series;
import org.primefaces.event.RowEditEvent;


@ManagedBean (name="seriesManagedBean")
@SessionScoped

public class SeriesManagedBean {
   // gestion del modelo
    
     
     private List<Object> listado;
     private List<Series> listadose;
     private boolean editable;
     Series serieSelected;
   
//Modificar en cada reutilización

private SerieManager ClaseManager = new SerieManager(); // acceso a los datos de register
  
public Series actual;
public Series actualNuevo=new Series();
Session session = null;
 
public Series getActual() {
        return actual;
    }
public Series getActualNuevo() {
        return actualNuevo;
  }

  
   public SeriesManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Series();
     
    }
  
      public void InicializarClase(){
         actual=new Series();
      }
  
       
    public List<Series> getlistadose() {
        this.listadose=ClaseManager.getList();
        return listadose;
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
        Series s = (Series) event.getObject();
        System.out.println("Valor de la serie:" + s.getDescripcion());
        FacesMessage msg = new FacesMessage("Serie Editado", ((Series) event.getObject()).getDescripcion());  
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
     }  

     public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Serie Cancelado", ((Series) event.getObject()).getDescripcion());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
     }  

    
     public Series getSerieSelected() {
        return serieSelected;
    }

    public void setSerieSelected(Series serieSelected) {
        this.serieSelected = serieSelected;
    }
    
   
     public String newRegister(){
         System.out.println("Entro a crear un nuevo registro de serie");
         actual=actualNuevo;
    
         
       actual= ClaseManager.ClaseConUltimoID(actual) ;
         System.out.println("Nuevo ID");
       actual.setIdserie(actual.getIdserie());
       actual.setCodigo(actual.getCodigo());
       actual.setDescripcion(actual.getDescripcion());      
       boolean resultado=true;      
       resultado=ClaseManager.create(actual);
       return "menu2.xhtml";
         
        
    }
   
}


