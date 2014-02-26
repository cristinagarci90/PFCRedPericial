package web;

import java.util.LinkedHashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelsMaestros.Contador;
import manager.ContadorManager;
import org.primefaces.event.RowEditEvent;


@ManagedBean (name="contadorManagedBean")
@SessionScoped

public class ContadorManagedBean {
     
     private List<Object> listado;
     private List<Contador> listadocon;
     private boolean editable;
     Contador contadorSelected;
   


private ContadorManager ClaseManager = new ContadorManager(); 
  
public Contador actual;

    public Contador getActual() {
        return actual;
    }

Session session = null;
   public ContadorManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Contador();
      
    }
  
      public void InicializarClase(){
         actual=new Contador();
      }
    public List<Contador> getlistadocon() {
        this.listadocon=ClaseManager.getList();
        return listadocon;
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
        Contador c = (Contador) event.getObject();      
        FacesMessage msg = new FacesMessage("Contador Editado", ((Contador) event.getObject()).getContador().toString());  
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
     }  

     public void onCancel(RowEditEvent event) {  
        FacesMessage msg = new FacesMessage("Contador Cancelado", ((Contador) event.getObject()).getContador().toString());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
     }  

    
     public Contador getContadorSelected() {
        return contadorSelected;
    }

    public void setEjercicioSelected(Contador contadorSelected) {
        this.contadorSelected = contadorSelected;
    }
    
     private static Map <String,Object> provvalor;
    static {
            provvalor=new LinkedHashMap<String,Object>();
            List <Contador> con = new ContadorManager().getList();
            
            for (int i=0; i < con.size(); i++){                              
          
               Contador prov = new Contador();
               prov=(Contador) con.get(i);
               provvalor.put(prov.getContador().toString(),prov.getId().getIdejercicio());
                      
     }
    }
   public Map <String,Object> getprovvalor(){
       return provvalor;
   } 
   
   
}


