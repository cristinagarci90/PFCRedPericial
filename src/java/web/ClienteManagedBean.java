package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelsMaestros.Cliente;
import org.hibernate.Session;
import manager.ClienteManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.component.accordionpanel.AccordionPanel;
import org.primefaces.event.RowEditEvent;
import comun.Comun;
import java.util.ArrayList;
import java.util.Iterator;
import javax.faces.model.SelectItem;


@ManagedBean (name="clienteManagedBean")
@SessionScoped

public class ClienteManagedBean {
   // gestion del modelo
    
     
     private List<Object> listado;
     private List<Cliente> listadocli;
     private boolean editable;
     Cliente clienteSelected;
     Boolean tieneMensajes;
     private AccordionPanel panel;
     public Comun comun;
     

       
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

private ClienteManager ClaseManager = new ClienteManager(); // acceso a los datos de register
  
public Cliente actual = new Cliente();

public Cliente actualNuevo = new Cliente();

    public Cliente getActual() {
        return actual;
    }

    
    public Cliente getActualNuevo() {
        return actualNuevo;
    }
Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public ClienteManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Cliente();
      // InicializarClase();
     
    }
  
      public void InicializarClase(){
         actual=new Cliente();
      }
  
        public String Modificar(Cliente cli) {
        actual = cli;
        return ClaseManager.getXhtmlGestion();
    }
        
     
      public String newRegister(){
            
       actual=actualNuevo;
       
       
       actual= ClaseManager.ClaseConUltimoID(actual) ;
       boolean resultado=true;      
       
      
       
       resultado=ClaseManager.create(actual);        
       
       
       return "MClientes.xhtml"; 
}  
         private Map <String,Object> provvalor;
          {
            provvalor=new LinkedHashMap<String,Object>();
            List <Cliente> clientes;
            clientes = ClaseManager.getList();
            System.out.println("Valor de provvalor" + clientes.size());
           /* for (int i=0; i < clientes.size(); i++){
             
               Cliente prov = new Cliente();
               prov=(Cliente) clientes.get(i);
               provvalor.put(prov.getNombre(),prov.getIdcliente());
                    
     }*/
           Iterator iter = clientes.iterator();
           Cliente c;
           int i=0;
            while (iter.hasNext()){
            c = (Cliente) iter.next(); 
            System.out.println("IIIIIIII" + i++);
            provvalor.put(c.getNombre(),c.getIdcliente());
            }
            
    }
           public Map <String,Object> getprovvalor(){
            return provvalor;
            } 
   
   
    public String Nuevo() {
              
      actualNuevo=new Cliente();
      
          
      return "ACliente.xhtml";
    }
   
  
     public List<Object> getProvs() {
        return listado;
    }
   

    public void setProvs(List<Object> prov) {
        this.listado = prov;
    }
    
    
   public List<Cliente> getlistadocli() {
        
        this.listadocli=ClaseManager.getList();
       
        return listadocli;
   }
  
  /*public List<Cliente> getlistadocli() {  
    List<SelectItem> items = new ArrayList<SelectItem>();
this.listadocli=ClaseManager.getList();
for (Cliente cliente : this.listadocli) {
items.add(new SelectItem(cliente.getIdcliente(),cliente.getNombre()));
}
return listadocli;
}
*/
    
     public String updateRegister(){
       try{
         
         boolean resultado=ClaseManager.update(actual);
        }
       
        catch(Exception e)
        {
            System.out.println("Error en modificar cliente="+ e);
        }
         return "MClientes.xhtml";
         
 
        
       
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
        Cliente cli = (Cliente) event.getObject();
        System.out.println("Valor del cliente:" + cli.getNombre());
        FacesMessage msg = new FacesMessage("Cliente Editado", ((Cliente) event.getObject()).getNombre());  
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
        FacesMessage msg = new FacesMessage("Cliente Cancelado", ((Cliente) event.getObject()).getNombre());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
     }  

    
     public Cliente getClienteSelected() {
        return clienteSelected;
    }

    public void setClienteSelected(Cliente clienteSelected) {
        this.clienteSelected = clienteSelected;
    }
    
    /*
    
    public List getProvincias() {
    List<Provincia> provList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Provincia order by provincia ASC");
        provList = (List<Provincia>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    
    return provList;
}
   */ 
    
  

   
   
   
}


