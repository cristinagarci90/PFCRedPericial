package web;
import java.util.ArrayList;  
import javax.faces.model.SelectItem;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.faces.bean.
//import javax.faces.bean.ViewScoped;
import java.util.List;
import models.InfInforme;
import models.Taller;
import models.InfContrario;
import models.Infasegurado;
//import database.manager.ProvinciaManager;
import manager.InformeManager;
import manager.AseguradoManager;
import manager.TallerManager;
import manager.PeritoManager;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name="informeManagedBean")
@SessionScoped

public class InformeManagedBean {
  //  public String nuevo;
  InfInforme informeSelected;
  public String asignado="N";//utilizado para que al asignar datos de un informe desde la poliza o siniestro no se cree nuevo
    public  AseguradoManagedBean AsegMB;
    public  TallerManagedBean TallerMB;
  
     private List<InfInforme> listado;
     private List<InfInforme> listadoPoliza;
     private List<InfInforme> listadoPolizaModificacion;//cuando se realiza busqueda de poliza en el informe ya creado=modificacion
     private List<InfInforme> listadoF;
     public ProvinciasManagedBean P;//=new CategoriaManagedBean();
     public String imprimirPerito;
     public String asegCont;
     
     //    INICIO  ------   Modificar en cada reutilización
     private InformeManager ClaseManager = new InformeManager(); // acceso a los datos de register
     private AseguradoManager ClaseManagerAseg = new AseguradoManager(); // acceso a los datos de register
     private TallerManager ClaseManagerTaller = new TallerManager();
     private PeritoManager ClaseManagerPerito = new PeritoManager(); // acceso a los datos de register
/*
    public List<InfInforme> getListaInformes() {
        return listaInformes;
    }

    public void setListaInformes(List<InfInforme> listaInformes) {
        this.listaInformes = listaInformes;
    }
   */
     private SelectItem[] compromisoInforme = new SelectItem[]{
        new SelectItem("N", "No"),
        new SelectItem("S", "Si")        
    };

      public String viewCars() {  
        return "dialog:index2";  
    }  
      
    public String viewCarsCustomized() {  
        return "dialog:index2?modal=true";  
    }  
    
     public SelectItem[] getCompromisoInforme() {
        return compromisoInforme;
    }
     
       public InfInforme actual=new InfInforme();
       public InfInforme actualNuevo=new InfInforme();

    public InfInforme getActualNuevo() {
        return actualNuevo;
    }
/*
    public void setActualNuevo(InfInforme actualNuevo) {
        this.actualNuevo = actualNuevo;
    }*/
       
     public InfInforme getActual() {
        return actual;
    }

     
   public InformeManagedBean() {
         
       imprimirPerito="N";
      // if(this.listado == null){
   
           this.listado = ClaseManager.getList();
      //  }
        actual=new InfInforme();
      //  actual.setTipoinforme(new models.Tipoinforme());
        
     //   actual.getInfDocinformevarios(new InfDocinformevarios());
      //  nuevo="si";
    
   }
    
    public String newRegister(){
  //  nuevo="si";
    actual=actualNuevo;
    
    /*    java.util.Date date = actual.getFechaperitacionformulario(); 
        java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("MM/dd/yyyy");
        actual.setFechaperitacion(sdf.format(date));
     */
            /*SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yyyy");
        try{
            java.util.Date d3 = sdf3.parse(actual.getFechaperitacion());
             actual.setFechaperitacionformulario(d3);
        }catch(Exception e)
        {
            System.out.println("Error en modificar informe="+e);
        }*/

       actual.setTipoinforme(actual.getTipoinforme());
       actual= ClaseManager.ClaseConUltimoID(actual) ;
       actual.setNumeroinforme("A"+actual.getIdinforme().toString());
       boolean resultado=true;
       asegCont=actual.getPeritara();
       resultado=ClaseManager.create(actual);
      // AsegMB.actual=n
      // AseguradoManagedBean clase;
       
     //  AseguradoManagedBean.actual=new InfAsegurado();
         ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();
         //AseguradoManagedBean
         try{
         AsegMB=(AseguradoManagedBean)contexto.getSessionMap().get("aseguradoManagedBean");
         AsegMB.actual = new Infasegurado();
         }         catch(Throwable ex) {}
         
     // actual = new InfInforme();
      return "modificarInforme.xhtml";//"gotoIndex();
         
         
        
    }
   
    
        public List<InfInforme> getListado() {
         this.listado = ClaseManager.getList();
         return listado;
    }
    
  /*    public List<InfInforme> getListado() {
          listadoF= new ArrayList<InfInforme>();
          
         Object perito;
         Perito peritoActual;
         // Object informeFunc;
         InfInforme informeFuncF;
    
         //if(this.listado==null)  
        // {   this.listado = ClaseManager.getList();}
         
            InfInforme paraLista=new InfInforme();
        
        
           //recorro el listado poniendo añadiendo el objeto perito
         Iterator iter = this.listado.iterator();
         this.listado= new ArrayList<InfInforme>();
             while (iter.hasNext()){
                 informeFuncF=(InfInforme) iter.next();
                 perito=ClaseManager.getElementByIdVinculada(informeFuncF.getPerito(),"idperito");
                     peritoActual=(Perito) perito;
                     informeFuncF.setObjPerito(peritoActual);
             this.listado.add(informeFuncF);
            }
                
        // this.listado = listado.;
        return this.listado;
    }*/
        public void listPorPerito(){//String campo,BigDecimal parametro) {
         //   System.out.println("InformeManaged.Bean.listPorPerito========"+actual.getPerito());
           
          this.listado = ClaseManager.getListParametro("perito",actual.getPerito());
        //    System.out.println("InformeManaged.Bean.listPorPerito  tamaño de la lista" + this.listado.size());
         //  this.listado =ClaseManager.getList();
         //  System.out.println("InformeManaged.Bean.listPorPerito  tamaño de la listaCompleta" + this.listado.size());
           
        
    }
   

     
        public String Modificar(InfInforme inf) {
            System.out.println("InfomeManagedBean.Modificar tipoinfome=" + inf.getTipoinforme().getIdtipoinforme());
          //  nuevo="no";
            
                /*  if(inf.getInfDocinformevarios()==null)//para que no de error al guardarlo si aun no existe
                    { 
                             inf.setInfDocinformevarios(new InfDocinformevarios());
        
                    }*/
              ExternalContext contexto= FacesContext.getCurrentInstance().getExternalContext();            
                 
              try{
                        //ver si tiene asegurado, si lo tiene recuperarlo, si no borrar por si habia uno en session
                    AsegMB=(AseguradoManagedBean)contexto.getSessionMap().get("aseguradoManagedBean");
              
              
                   if(inf.getAsegurado()==null)//si el informe tiene asignado un asegurado se busca en la bbdd y se asigna
                    { //no tiene asegurado asignado, se quita si hay uno en session de anteriores operaciones
                             AsegMB.actual = new Infasegurado();
                               System.out.println("************************entro en modificar Informe AsegMB  if");
        
                    }
                    else{
                             System.out.println("************************entro en modificar Informe AsegMB  else");
                             AsegMB=new AseguradoManagedBean();
                             System.out.println("************************entro en modificar Informe AsegMB  else2");
                             Object aseg;
                             System.out.println("************************entro en modificar Informe AsegMB  else3");
                             aseg=ClaseManagerAseg.getElementById(inf.getAsegurado());
                             System.out.println("************************entro en modificar Informe AsegMB  else4");
                             AsegMB.actual=(Infasegurado)aseg;
                            System.out.println("************************entro en modificar asegurado Informe   else  AsegMB.actual.nombre="+ AsegMB.actual.getNombre());
                    }
                         contexto.getSessionMap().put("aseguradoManagedBean",AsegMB);
                    } catch (Throwable ex) {} 
              
            //*********TALLER
               try{
                         //ver si tiene asegurado, si lo tiene recuperarlo, si no borrar por si habia uno en session
                    TallerMB=(TallerManagedBean)contexto.getSessionMap().get("tallerManagedBean");
              
              
                   if(inf.getTaller()==null)//si el informe tiene asignado un asegurado se busca en la bbdd y se asigna
                    { //no tiene asegurado asignado, se quita si hay uno en session de anteriores operaciones
                             TallerMB.actual = new Taller();
                               System.out.println("************************entro en modificar TALLER Informe   if");
        
                    }
                    else{
                             TallerMB=new TallerManagedBean();
                             Object tall;
                             tall=ClaseManagerTaller.getElementById(inf.getTaller());
                               System.out.println("************************entro en modificar TALLER Informe   else inf.taller="+inf.getTaller());
                             TallerMB.actual=(Taller)tall;
                              
                               System.out.println("************************entro en modificar TALLER Informe   else  TallerMB.actual.nombre="+ TallerMB.actual.getNombre());
                      System.out.println("************************entro en modificar TALLER Informe   else");
        
                    }
            //       System.out.println("************************entro en modificar Informe   asegurado="+AsegMB.actual.getIdasegurado());
                         contexto.getSessionMap().put("tallerManagedBean",TallerMB);
                    } catch (Throwable ex) {   System.out.println("InformeMAnagedBean.Modificartaller catch"+ ex.getMessage());} 
              
            
            //*******FIN TALLER
           
         
         actual = inf;
               System.out.println("InfomeManagedBean.Modificar actual.tipoinfome=" + actual.getTipoinforme().getIdtipoinforme());
     
     /*    
        SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yyyy");
        try{
            java.util.Date d3 = sdf3.parse(actual.getFechaperitacion());
             actual.setFechaperitacionformulario(d3);
        }catch(Exception e)
        {
            System.out.println("Error en modificar informe="+e);
        }*/
 asegCont=actual.getPeritara();

       
        return ClaseManager.getXhtmlGestion();
    }
  
   
      
     
  //    FIN  ------   Modificar en cada reutilización
       
 

   public String updateRegister(){
        System.out.println("InformeManagedBean.updateRegister entro");
  /*       java.util.Date date = actual.getFechaperitacionformulario(); 
         java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("MM/dd/yyyy");
         actual.setFechaperitacion(sdf.format(date));
         */
        System.out.println(actual.getTipoinforme().getIdtipoinforme());
        //SimpleDateFormat sdf3 = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("InformeManagedBean.updateRegister entro2");
        /*try{
            System.out.println("InformeManagedBean.updateRegister entro try");
            java.util.Date d3 = sdf3.parse(actual.getFechaperitacion());
             actual.setFechaperitacionformulario(d3);
        }catch(Exception e)
        {
            System.out.println("Error en modificar informe="+e);
        }*/
        System.out.println("InformeManagedBean.updateRegister entro antes update");
        // añadido 14-01-2014
        boolean resultado=ClaseManager.updateConcu(actual,"Inf_Informe","idinforme",actual.getIdinforme());
        System.out.println("InformeManagedBean.updateRegister entro despues update");
       
         return "listInformes";
       
    }

     public String getImprimirPerito() {
       //  System.out.println("__________------------____________ENTRO en getImprimirPErito__________------------____________");
         this.imprimirPerito=this.imprimoOrden();
         return imprimirPerito;
    }
public String tieneContrario()
{
    List<InfContrario> listadoContrarios;
    
    listadoContrarios = ClaseManager.getListParametroConsulta("InfContrario","idInforme",actual.getIdinforme());
    if(listadoContrarios.size()>0)
         return "S";
    else 
        return "N";
}
    public void setImprimirPerito(String imprimirPerito) {
        this.imprimirPerito = imprimirPerito;
    }
        
    public String imprimoOrden()
    { 
     
        //fin de sacar el de sesion
        
        
        
 ////       System.out.println("__________------------____________INICIo getImprimirPErito__________------------____________");
 //   System.out.println("Informe="+actual.getIdinforme());
 //    System.out.println("Taller="+actual.getTaller());
 //    System.out.println("peritara="+actual.getPeritara());
 //    System.out.println("tienecontrario="+tieneContrario());
  //    System.out.println("this.imprimirPeritoo="+this.imprimirPerito);
        if (actual.getIdinforme()!=null && actual.getTaller()!=null )//el informe ya se guardó y tiene taller
         {//no hace falta comprobar si peritara tiene valor xq si se guardo el informe es que si
           //  if(actual.getPeritara()!=null)//el campo de asegurado o contrario tiene algún valor
                  System.out.println("__________------------____________ENTRO en getImprimirPErito  Con taller e informe");
    
             if(asegCont.equals("1"))//se perita el asegurado
                 if (actual.getAsegurado()!=null)//tiene un asegurado asignado
                       this.imprimirPerito="S";
                 else//no tiene asegurado asignado
                       this.imprimirPerito="N";
             else//se perita el contrario
                 if(tieneContrario().equals("S"))  //ver si tiene contrario
                     this.imprimirPerito="S";
                 else
                     this.imprimirPerito="N";
         }
         else//no tiene idinforme o taller
             this.imprimirPerito="N";
        
 //     System.out.println("Informe="+actual.getIdinforme());
  //   System.out.println("Taller="+actual.getTaller());
  //   System.out.println("peritara="+ asegCont);//actual.getPeritara());
  //   System.out.println("tienecontrario="+tieneContrario());
   //   System.out.println("this.imprimirPeritoo="+this.imprimirPerito);
   //  System.out.println("__________------------____________FIN getImprimirPErito__________------------____________");     
        return this.imprimirPerito;
    }
    
    
    
      public String Nuevo() {
        //  nuevo="si";
          if(asignado.equals("N"))
          {
            actualNuevo=new InfInforme();
           
          }
          else
          {   //actual=new InfInforme();
              asignado="N";
          }
      return "altaInforme.xhtml";
    }
  
      
        public InfInforme getInformeSelected() {
        return informeSelected;
    }

    public void setInformeSelected(InfInforme informeSelected) {
        this.informeSelected = informeSelected;
    }
    
    public String Asignar(InfInforme inf, String destino) {
        
      // actualNuevo.setClientecabecerafac(inf.getClientecabecerafac());
        asignado="S";
        actualNuevo=inf;
        actual=inf;
       //return "altaInforme";
        return destino;
    }
    
       public List<InfInforme> getListadoPoliza() {
           if (actualNuevo.getPoliza()==null || actualNuevo.getPoliza().length()==0)
              listadoPoliza=new ArrayList<InfInforme>();
           else
              listadoPoliza = ClaseManager.getListParametroString("poliza",actualNuevo.getPoliza()); 
           
         //  listadoPoliza = ClaseManager.getListParametroString("poliza", actualNuevo.getPoliza()); 
      /*     String polizaParametro="";
          
         if (actual.getIdinforme()==null)  //es nuevo
          { System.out.println("-------------en if del actual");
             polizaParametro=actualNuevo.getPoliza();
          
           }
         else//es mofificado
            {System.out.println("-------------en ELSE del actual");
                polizaParametro=actual.getPoliza();
            }  
         
        if ( polizaParametro.length()==0)
              listadoPoliza=new ArrayList<InfInforme>();
         else
              listadoPoliza = ClaseManager.getListParametroString("poliza", polizaParametro); 
           
     */
   //informeManagedBean.actual.poliza  
              //INICIO de original----va bien
       //    System.out.println("-----------------Poliza InformeMAnagedBean.getListadoPoliza valor=" + actualNuevo.getPoliza());
    /*    if (actualNuevo.getPoliza()==null || actualNuevo.getPoliza().length()==0)
              listadoPoliza=new ArrayList<InfInforme>();
         else
              System.out.println("-----------ELSE-----------");
              listadoPoliza = ClaseManager.getListParametroString("poliza",actualNuevo.getPoliza()); 
         */       
         //FIN de original----va bien
        return listadoPoliza;
    }
    public List<InfInforme> getListadoPolizaModificacion() {
         if (actual.getPoliza()==null || actual.getPoliza().length()==0)
              listadoPolizaModificacion=new ArrayList<InfInforme>();
           else
              listadoPolizaModificacion = ClaseManager.getListParametroString("poliza",actual.getPoliza()); 
           
        return listadoPolizaModificacion;
    }
       
  
          
       
    /*     public List<InfInforme> Prueba() {
             
        return listadoPoliza;
    }*/ 
         /*
        public List<InfInforme> PolizaPorParametro(String Poliza) {
     //               System.out.println("-----------------Poliza InformeMAnagedBean.getListadoPoliza con parametro valor=" + Poliza );
   
          if (Poliza==null || Poliza.length()==0)
              listadoPoliza=new ArrayList<InfInforme>();
         else
               listadoPoliza = ClaseManager.getListParametroString("poliza",Poliza); 
                
        
        return listadoPoliza;
    } */
    
}
