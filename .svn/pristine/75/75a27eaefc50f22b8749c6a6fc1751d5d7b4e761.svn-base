package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import models.Provincia;
import org.hibernate.Session;
import manager.ProvinciaManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@ManagedBean 
@SessionScoped


public class ProvinciasManagedBean {
   // gestion del modelo
    private ProvinciaManager ClaseManager = new ProvinciaManager(); // acceso a los datos de register
  
private List<Object> listado;
private List<Provincia> listadoP;
//Modificar en cada reutilización


  
public Provincia actual;

    public Provincia getActual() {
        return actual;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public ProvinciasManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Provincia();
      // InicializarClase();
     
    }
  
      public void InicializarClase(){
         actual=new Provincia();
      }
  
   /*     public String Modificar(Provincia prov) {
        actual = prov;
        return ClaseManager.getXhtmlGestion();
    }*/
        
        
         private static Map <String,Object> provvalor;
    static {
            provvalor=new LinkedHashMap<String,Object>();
            List <Provincia> provincias = new ProvinciaManager().getList();
            for (int i=0; i < provincias.size(); i++){
               Provincia prov = new Provincia();
               prov=(Provincia) provincias.get(i);
               provvalor.put(prov.getProvincia(),prov.getIdprovincia());
     }
    }
   public Map <String,Object> getprovvalor(){
       return provvalor;
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


