package web;
//package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import models.Cobertura;
import org.hibernate.Session;
import manager.CoberturaManager;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


@ManagedBean
@SessionScoped

public class CoberturasManagedBean {
   // gestion del modelo
    private CoberturaManager ClaseManager = new CoberturaManager(); // acceso a los datos de register
  
private List<Object> listado;
private List<Cobertura> listadoP;
//Modificar en cada reutilización


  
public Cobertura actual;

    public Cobertura getActual() {
        return actual;
    }

Session session = null;
     

  //    INICIO  ------   Modificar en cada reutilización
   public CoberturasManagedBean() {
        if(this.listado == null){
            refreshListRegister();
        }
        actual=new Cobertura();
      // InicializarClase();
     
    }
  
      public void InicializarClase(){
         actual=new Cobertura();
      }
  
   /*     public String Modificar(Provincia prov) {
        actual = prov;
        return ClaseManager.getXhtmlGestion();
    }*/
        
        
         private static Map <String,Object> provvalor;
    static {
            provvalor=new LinkedHashMap<String,Object>();
            List <Cobertura> provincias = new CoberturaManager().getList();
            for (int i=0; i < provincias.size(); i++){
               Cobertura prov = new Cobertura();
               prov=(Cobertura) provincias.get(i);
               provvalor.put(prov.getDescripcion(),prov.getIdcobertura());
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


