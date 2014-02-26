package web;

import java.util.LinkedHashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import manager.EjercicioManager;
import modelsMaestros.Ejercicio;
import org.primefaces.event.RowEditEvent;


@ManagedBean (name="ejercicioManagedBean")
@SessionScoped

public class EjercicioManagedBean {
     
     private List<Object> listado;
     private List<Ejercicio> listadoej;
     private boolean editable;
     Ejercicio ejercicioSelected;
   


private EjercicioManager ClaseManager = new EjercicioManager(); 
  
public Ejercicio actual;

    public Ejercicio getActual() {
        return actual;
    }

Session session = null;
   public EjercicioManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Ejercicio();
      
    }
  
      public void InicializarClase(){
         actual=new Ejercicio();
      }
    public List<Ejercicio> getlistadoej() {
        this.listadoej=ClaseManager.getList();
        return listadoej;
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
        Ejercicio s = (Ejercicio) event.getObject();      
        FacesMessage msg = new FacesMessage("Ejercicio Editado", ((Ejercicio) event.getObject()).getEjercicio().toString());  
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
     }  

     public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Ejercicio Cancelado", ((Ejercicio) event.getObject()).getEjercicio().toString());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
     }  

    
     public Ejercicio getEjercicioSelected() {
        return ejercicioSelected;
    }

    public void setEjercicioSelected(Ejercicio ejercicioSelected) {
        this.ejercicioSelected = ejercicioSelected;
    }
    
     private static Map <String,Object> provvalor;
    static {
            provvalor=new LinkedHashMap<String,Object>();
            List <Ejercicio> ejer = new EjercicioManager().getList();
            
            for (int i=0; i < ejer.size(); i++){                              
          
               Ejercicio prov = new Ejercicio();
               prov=(Ejercicio) ejer.get(i);
               provvalor.put(prov.getEjercicio().toString(),prov.getIdejercicio());
                      
     }
    }
   public Map <String,Object> getprovvalor(){
       return provvalor;
   } 
   
   
}


