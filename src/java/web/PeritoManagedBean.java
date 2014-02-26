package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelsMaestros.Perito;
import org.hibernate.Session;
import manager.PeritoManager;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;


@ManagedBean(name="peritoManagedBean") 
@SessionScoped

public class PeritoManagedBean {
   // gestion del modelo
    private PeritoManager ClaseManager = new PeritoManager(); // acceso a los datos de register
  
private List<Object> listado;
private List<Perito> listadoper;

private boolean editable;
Perito  peritoSelected;
//private List<Cliente> listadoC;
//Modificar en cada reutilización


 
public Perito actual = new Perito();
public Perito actualNuevo = new Perito();

    public Perito getActual() {
        return actual;
    }

    public Perito getActualNuevo() {
        return actualNuevo;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public PeritoManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Perito();
      // InicializarClase();
     
    }
  
      public void InicializarClase(){
         actual=new Perito();
      }
  
       public String Modificar(Perito per) {
        actual = per;
        return ClaseManager.getXhtmlGestion();
    }
        
     public String updateRegister(){
       
       
        try{
         
         boolean resultado=ClaseManager.update(actual);
        }catch(Exception e)
        {
            System.out.println("Error en modificar Perito="+ e);
        }
         return "MPeritos.xhtml";
         
 
        
       
    }
      
         private static Map <String,Object> provvalor;
    static {
            provvalor=new LinkedHashMap<String,Object>();
            List <Perito> provincias = new PeritoManager().getList();
       
            for (int i=0; i < provincias.size(); i++){
               Perito prov = new Perito();
               prov=(Perito) provincias.get(i);
               provvalor.put(prov.getPerito(),prov.getIdperito());
                      //.getProvincia(),prov.getIdprovincia());
     }
    }
   public Map <String,Object> getprovvalor(){
       return provvalor;
   } 
   
    public String Nuevo() {
        
         
     actualNuevo=new Perito();
           
         
      return "APerito.xhtml";
    }
  //    FIN  ------   Modificar en cada reutilización
       
       
/*       public Object getActual() {
        return Actual;
    }*/
     public List<Object> getProvs() {
        return listado;
    }
   

    public void setProvs(List<Object> prov) {
        this.listado = prov;
    }
    
    
      public String newRegister(){
       actual=actualNuevo;
       actual= ClaseManager.ClaseConUltimoID(actual) ;
       boolean resultado=true;       
       System.out.println("baja perito" + actual.getBaja());
       resultado=ClaseManager.create(actual);              
       return "MPeritos.xhtml"; 
}
     /*
    public String newRegister(){
       actual= ClaseManager.ClaseConUltimoID(actual) ;
       ClaseManager.create(actual);
      return gotoIndex();
    }

    public String updateRegister(){
       ClaseManager.update(actual);
        return  ClaseManager.getXhtmlListado();
    }

    public String deleteRegister(){
        ClaseManager.delete(actual);
        return gotoIndex();
    }

    public String gotoIndex(){
        refreshListRegister();
        // limpiar informacion
        InicializarClase();
        return  ClaseManager.getXhtmlListado();
    }

    public String Alta(){
        InicializarClase();
        return  ClaseManager.getXhtmlGestion();
    }
    
 */

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
        Perito per = (Perito) event.getObject();
        FacesMessage msg = new FacesMessage("Perito Editado", ((Perito) event.getObject()).getPerito());  
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
        FacesMessage msg = new FacesMessage("Perito Cancelado", ((Perito) event.getObject()).getPerito());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
     }  

    
     public Perito getPeritoSelected() {
        return peritoSelected;
    }

    public void setPeritoSelected(Perito peritoSelected) {
        this.peritoSelected = peritoSelected;
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
    
  
   public String nombrePerito(BigDecimal id){
      /* claseVinculada=ClaseManager.getStringDesdeId(id);
       peritoActual=(Perito) claseVinculada;
       return peritoActual.getPerito();*/
       return ClaseManager.getNombrePerito(id);
    }
   
   public List<Perito> getlistadoper() {
        this.listadoper=ClaseManager.getList();
        return listadoper;
    }
   
}


