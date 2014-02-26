package web;
//import modelsMaestros.Perito;
//package control;

import java.util.Iterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import models.InfInforme;

//import web.CoberturasManagedBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.faces.bean.ViewScoped;
import java.util.List;
import models.InfDocinformevarios;

import manager.InformeVariosManager;
import org.primefaces.event.SelectEvent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
//import InformeManagedBean;
import javax.faces.bean.ViewScoped;
 //@ManagedBean//(name="AsegMB")
 @ManagedBean(name="informevariosManagedBean")
//@SessionScoped
@ViewScoped
public class InformeVariosManagedBean {
  public  InformeManagedBean InfMB;
 
     private List<InfDocinformevarios> listado;
   //  private List<InfAsegurado> listadoMatriculaModificacion;
    
     private List<InfDocinformevarios> listadoTextos;
     public MarcaManagedBean P;//=new CategoriaManagedBean();
     public InformeManagedBean nuevo;
     //    INICIO  ------   Modificar en cada reutilización
     private InformeVariosManager ClaseManager = new InformeVariosManager(); // acceso a los datos de register
     
     public InfDocinformevarios actual=new InfDocinformevarios();
     // marcaAseg = new MarcaManagedBean();
   
   
     
     public InfDocinformevarios getActual() {
        return actual;
     }

     
   public InformeVariosManagedBean() {
        System.out.println("************************entro en constructor de la clase InformeVariosManagedBean");
              ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         try{
             System.out.println("************************entro en constructor de la clase InformeVariosManagedBean TRY");
       
            InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
            
                  if(InfMB.actual.getInfDocinformevarios()==null)
                    { System.out.println("************************entro en constructor de la clase InformeVariosManagedBean if");
                        InfMB.actual.setInfDocinformevarios(new InfDocinformevarios());                
                    }
                  else
                  {
                       System.out.println("************************entro en constructor de la clase InformeVariosManagedBean else");
                        System.out.println("************************entro en constructor de la clase InformeVariosManagedBean texto="+InfMB.actual.getInfDocinformevarios().getTexto());
                  }
         }
           catch(Throwable ex) {  
               System.out.println("InformeVariosManagedBean.constructor.catch error="+ex.getMessage());
     }
     /* actual=new InfDocinformevarios();
       System.out.println("************************entro en constructor de la clase InformeVariosManagedBean");
              ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         try{
             System.out.println("************************entro en constructor de la clase InformeVariosManagedBean TRY");
       
            InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
                  if(InfMB.actual.getInfDocinformevarios()!=null)
                    {
                        System.out.println("************************entro en constructor de la clase InformeVariosManagedBean IF id del informe="+InfMB.actual.getIdinforme());
                        actual=InfMB.actual.getInfDocinformevarios();
                        System.out.println("************************entro en constructor de la clase InformeVariosManagedBean IF2");
                          contexto.getSessionMap().put("informevariosManagedBean",actual);
                          System.out.println("************************entro en constructor de la clase InformeVariosManagedBean IF3");
                    }
                   
                    
                   
                
       }         catch(Throwable ex) {   
     }*/
     /*  if(this.listado == null){
           this.listado = ClaseManager.getListParametroConsulta("InfContrario","idCInforme",InfMB.actual.getIdinforme());
        }*/
             
    }
    
    public String newRegister(){
        //informeManagedBean.actual.infDocinformevarios.texto
        //eso debería guardar tambien
        
        System.out.println("************************InformeVariosManagedBean.NewRegister");
       // actual.setMarcas(marcaClase);
       // actual.setModelos(modeloClase);
       // actual= ClaseManager.ClaseConUltimoID(actual) ;
   
     boolean resultado=true;
          ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         //AseguradoManagedBean
         try{
             InfMB=(InformeManagedBean)contexto.getSessionMap().get("informeManagedBean");
           // //InfMB.actual.setAsegurado(actual.getIdasegurado());
           ////InfMB.updateRegister();
             actual=InfMB.actual.getInfDocinformevarios();
            // System.out.println("************************InformeVariosManagedBean.NewRegister TEXTOOO="+InfMB.actual.getInfDocinformevarios().getTexto());
          /*    SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yyyy");
        try{
            java.util.Date d3 = sdf3.parse(actual.getFecha());
             actual.setFecha(d3);
        }catch(Exception e)
        {
            System.out.println("Error en modificar informe="+e);
        }*/
             actual.setIdinforme(InfMB.getActual().getIdinforme());
            InfMB.actual.setInfDocinformevarios(actual);
            //InfMB.updateRegister();
               actual.setInfInforme(InfMB.getActual());
          
              System.out.println("antes de CREATEEEEEEE_________InfVMB id del informe="+InfMB.getActual().getIdinforme());
               System.out.println("antes de CREATEEEEEEE_________InfVMB id del informe="+actual.getIdinforme());
             resultado=ClaseManager.create(actual);
             System.out.println("despues de CREATEEEEEEE_________InfVMB");
        
         }         catch(Throwable ex) {   
              System.out.println("Catch NewRegister InformeVariosManagedBean  error="+ex.getMessage());
       
    }
   
        
            return "modificarInforme.xhtml";
    }
  
      
     
        public String Modificar(InfDocinformevarios inf) {
                System.out.println(".........................ENTRO en MODIFICAR de ASEGURADO,,,,,,,,,,,,,,,,,,,,,,,,,,");
     
          actual = inf;     
        return ClaseManager.getXhtmlGestion();
    }
  
   
  //    FIN  ------   Modificar en cada reutilización
       
  
 
 
}