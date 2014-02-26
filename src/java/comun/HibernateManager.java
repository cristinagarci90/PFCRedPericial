

package comun;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Query;
import java.math.BigDecimal;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hibernate.Criteria;
import org.hibernate.cfg.Configuration;
//import javax.faces.context.FacesContext;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;

public abstract class HibernateManager {

    protected Object myClass = new Object(); // tipo de objeto
    protected Object claseVinculada = new Object(); // tipo de objeto
   protected Object claseVinculada2 = new Object(); // tipo de objeto
    protected String TABLE = ""; // nombre de la tabla
    protected String columnaId = ""; // nombre de la columna del identificador, para aumentarlo en el insert
    protected BigDecimal maximoID; 
    protected String xhtmlListado = "";
    protected String xhtmlGestion = "";
    protected String xhtmlAlta = "";
    protected String BBDD="";
    protected String Consulta="";

    public String getConsulta() {
        return Consulta;
    }

    public void setConsulta(String Consulta) {
        this.Consulta = Consulta;
    }

    /**
     * Obtener un elemento a partir de su identificador
     * Se supone que en todas las entidades existe el atributo id que las identifica
     * @param id
     * @return
     */
   public Object getElementById(BigDecimal id){
         Object obj = new Object();
        // obtener la sesion actual
        Session session =  getSession();
        try {
            // comenzar la transaccion
            session.beginTransaction();
            // cargar objeto por clave
            obj = session.createCriteria(myClass.getClass()).add(Restrictions.eq(columnaId, id)).uniqueResult();
            // confirmar transaccion
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en getElementById: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return obj;
    }
/**
     * Obtener un elemento a partir de su identificador--de una clase que no sea la actual si no la vinculada a ella
     * Se supone que en todas las entidades existe el atributo id que las identifica
     * @param id
     * @return
     */
   
     public Object getElementByIdVinculada(BigDecimal id,String campoId){
        Object obj = new Object();
        Session session = getSessionMaestros();
        try {
            session.beginTransaction();
            obj = session.createCriteria(claseVinculada.getClass()).add(Restrictions.eq(campoId, id)).uniqueResult();
            modelsMaestros.Perito peritoActual=new modelsMaestros.Perito();
                   peritoActual=(modelsMaestros.Perito) obj;
              session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en getElementByIdVinculada: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return obj;
    }
        public Object getElementByIdVinculadaString(String id,String campoId){
        Object obj = new Object();
        Session session = getSession();
        try {
            session.beginTransaction();
            obj = session.createCriteria(claseVinculada.getClass()).add(Restrictions.eq(campoId, id)).uniqueResult();
          //  modelsMaestros.Perito peritoActual=new modelsMaestros.Perito();
          //         peritoActual=(modelsMaestros.Perito) obj;
              session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en getElementByIdVinculada: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return obj;
    }
  
    /**
     * Guardar un objeto en la base de datos
     * @param o
     */
/*    public boolean create(Object o) {
      // System.out.println("entrooooooooooooooooo");
        // obtener la sesion actual
        Session session = getSession();
        try {
            // comenzar la transaccion
            session.beginTransaction();
            // almacenarlo
            session.save(o);
            // confirmar transaccion
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en create: " + e);
            // deshacer transaccion
            this.rollback();
            return false;
        }
        return true;
    }
*/
    /**
     * Actualizar un objeto en la base de datos
     * @param o
     */
   /* public boolean update(Object o){
        // obtener la sesion actual
      //Session session2 = HibernateUtil.getSessionFactory().openSession();
        System.out.println("--HibernateManager.update    entro");
       //Session session = HibernateUtil.getSessionFactory().openSession();
      
        try {
            // comenzar la transaccion
              Session sessionNUEVA = HibernateUtil.getSessionFactory().openSession();
            System.out.println("--HibernateManager.update    try");
            sessionNUEVA.beginTransaction();
            System.out.println("--HibernateManager.update    try2");
           
      System.out.println("--HibernateManager.update    try2b");
           
            // actualizarlo
            sessionNUEVA.merge(o);//saveOrUpdate(o);
            System.out.println("--HibernateManager.update    try3");
            
            //session.update(o);
            // confirmar transaccion
            sessionNUEVA.getTransaction().commit();
            System.out.println("--HibernateManager.update    try4");
            
        } catch (Exception e) {
            System.out.println("Error en update: " + e);
            // deshacer transaccion
            //this.rollback();
            return false;
        }
        return true;
    }
*/
      public boolean update(Object o){
        // obtener la sesion actual
        Session session = getSession();
        try {
          //  session.flush(); 
            // comenzar la transaccion
            session.beginTransaction();
            // actualizarlo
            session.merge(o);
            // confirmar transaccion
            session.getTransaction().commit();
           // session.flush();
            //session.refresh(o);
            
                //   this.session.flush();           
             //   this.session.refresh(provinciaActual);
        } catch (Exception e) {
            System.out.println("Error en update: " + e);
            // deshacer transaccion
            this.rollback();
            return false;
        }
        return true;
    }
      
      
    public int getVersionBD (String tabla,String primary, BigDecimal iden) {
    int num=0;
    Session session = getSession();
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        System.out.println("SELECT v FROM "+tabla+" WHERE " + primary + "= " + iden);
        Query q = session.createSQLQuery("SELECT v FROM "+tabla+" WHERE " + primary + "= " + iden);
        Object valor = q.uniqueResult();
        num = Integer.parseInt(valor.toString());       
    } catch (Exception e) {
        e.printStackTrace();
    }
 return num;
}  
      public boolean updateConcu(Object o,String tabla, String primary, BigDecimal ident) throws StaleObjectStateException{
        // obtener la sesion actual         
        
          Session session = getSession();
          Method metodo;  
         
        try {  
            session.beginTransaction();
            session.flush();
            int oldVersion=getVersionBD(tabla,primary,ident);
            System.out.println("Entro a updateConcu");
            //cargamos el objeto
            metodo = o.getClass().getMethod("getV");   
            Object result=metodo.invoke(o);           
            int versionactual = Integer.parseInt(result.toString());

           if (oldVersion != versionactual){ 
               System.out.println("Old Version" + oldVersion + "Version actual" + versionactual);
               
               FacesMessage msg = new FacesMessage("Otro usuario está actualizando este registro", null);    
               FacesContext.getCurrentInstance().addMessage(null, msg);   
               //session.lock(o, LockMode.UPGRADE);
               throw new StaleObjectStateException(tabla,ident);
           }
              session.saveOrUpdate(o);
              session.getTransaction().commit();            
        } catch (Exception e) {
                 System.out.println("Error en update: " + e);
                 
            return false;
        }
        return true;
    } 
      
      
    /**
     * Borrar un objeto de la base de datos
     * @param o
     */
    /*
    public boolean delete(Object o) {
        if(o == null){
            return false;
        }
        // obtener la sesion actual
        Session session = getSession();
        try {
            // comenzar la transaccion
            session.beginTransaction();
            // borrarlo
            session.delete(o);
            // confirmar transaccion
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en delete: " + e);
            // deshacer transaccion
            this.rollback();
            return false;
        }
        return true;
    }
*/
   
     /**
     * Obtener la lista de registros para una entidad--pasandole el nombre del campo y el valor de este para hacer la consulta
     * @return
     */
       //obtiene el listado actualizado
       public List getListParametro(String nombreCampo,BigDecimal parametro){
                // obtener la sesion actual
        Session session = getSession();
        List result = new ArrayList();
        try {
            // comenzar la transaccion
            session.beginTransaction();
            // obtener la lista de eventos
           Criteria criteria = session.createCriteria(myClass.getClass());
	

  	//buscar que hace el signum ese, creo que retorna-1 0 o 1 dependiendo si el bigdecimal es positivo neg o cero

          //poner los parametros
              if(parametro!=null & parametro.toString().length()>0 & parametro.signum()>0){// & parametro.length()>0){ 
                   criteria.add(Restrictions.eq(nombreCampo, parametro));
                  
                  //parametro tiene que ser del mismo tipo del que sea el campo en la tabla, si no habria que convertirlo
           }
           
                result=criteria.list();
         
            session.getTransaction().commit();
            /*
             * 
             *  session.beginTransaction();
            Criteria criteria = session.createCriteria(Provincias.class);
	
           
           if(parametro!=null & parametro.length()>0){    
                BigDecimal num = new BigDecimal(id);
                criteria.add(Restrictions.eq("perito", num));
           }
           listaTiposusuario=criteria.list();
           session.getTransaction().commit();
	
             */
        } catch (Exception e) {
            System.out.println("Error en getListParametro: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return result;
    }
       public List getListConsulta(String consulta){
       System.out.println("GETLISTACONSULTA");
        Session session = getSession();
        List result = new ArrayList();
        try {
         System.out.println("GETLISTACONSULTA try");
          session.beginTransaction();
        Query q = session.createQuery (consulta);
        result =  q.list();
        } catch (Exception e) {
            System.out.println("Error en getListConsulta: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return result;
    }
       /*
 public List getListConsulta(String consulta){
       System.out.println("GETLISTACONSULTA");
        Session session = getSession();
        List result = new ArrayList();
        try {
         System.out.println("GETLISTACONSULTA try");
         //session.beginTransaction();
        Query q = session.createQuery (consulta);
        result =  q.list();
        } catch (Exception e) {
            System.out.println("Error en getList: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return result;
    }
       */
  /*
 public List getListConsultaObjeto(String consulta){
       System.out.println("GETLISTACONSULTA");
        Session session = getSession();
        List result = new ArrayList();
        try {
         System.out.println("GETLISTACONSULTA try");
        Object = session.createQuery (consulta).uniqueResult();
        result =  q.list();
        } catch (Exception e) {
            System.out.println("Error en getList: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return result;
    }     
     */ 
    /*
  public List getListConCondidiones(String idCondicion){
      
        // obtener la sesion actual
        Session session = getSession();
        List result = new ArrayList();
        try {
            // comenzar la transaccion
            session.beginTransaction();
            // obtener la lista de eventos
            result = session.createCriteria(myClass.getClass()).list();
         //   createCriteria()
             // confirmar transaccion
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en getList: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return result;
    }
  
  */
    /*
  public List getListJoinHQL(String consulta){
      Session session = getSession();
      List result = new ArrayList();
      
        try {
           // String hql = "select distinct c from Campaign c join fetch c.subcampaigns s join fetch s.budgets";
            //Query query = session.createQuery(hql);
             consulta="select distinct c from Categoria where "; 
             Query query = session.createQuery(consulta);
    //List<Object> lisadoJoin 
            result= query.list();
        
        } catch (Exception e) {
            System.out.println("Error en getListJoinHQL condicion: " + consulta);
            // deshacer transaccion
            this.rollback();
        }
        return result;
    //prettyPrinter(campaigns);
  }
    */
    /**
     * Comprobar si esta repetido un objeto a partir de un valor de un atributo
     * @param attr
     * @param value
     * @return
     */
   /*
    public boolean checkRepeated(String attr, String value){
        Object obj = new Object();
        // obtener la sesion actual
        Session session = getSession();
        try {
            // comenzar la transaccion
            session.beginTransaction();
            // cargar objeto por clave
            obj = session.createCriteria(myClass.getClass()).add(Restrictions.eq(attr, value)).uniqueResult();
            // confirmar transaccion
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en checkRepeated: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return obj != null ? true : false;
    }

    
    
    */
    
 //esto no para Oracle cuando no permite ids autoincrementables   
    
 public int getMaximo (String tabla, String columna) {
  int num=0;
 // obtener el id a asignar, el último mas uno
        Session session = getSession();
        List result = new ArrayList();
        try {
            // comenzar la transaccion
           org.hibernate.Transaction tx = session.beginTransaction();
           Query q = session.createSQLQuery("SELECT NVL(MAX("+columna+"),0) +1  AS MAXIMO FROM "+tabla+"");
               
           Object valor = q.uniqueResult();
          
           num = Integer.parseInt(valor.toString());     
        
        } catch (Exception e) {
            System.out.println("Error en maximo: " + e);
           
            // deshacer transaccion
            this.rollback();
        }
        
    
 return num;
}  
    
//Se obtiene el valor de un campo de tipo String, a partir del nombre de tabla, colmunaid, columna a buscar, valor del id del registro
public String getCampoString (String tabla, String columnaId,String columnaBuscar,BigDecimal valorId) {
  String campo="";
 // obtener el id a asignar, el último mas uno
        Session session = getSession();
        List result = new ArrayList();
        try {
            // comenzar la transaccion
           org.hibernate.Transaction tx = session.beginTransaction();
           Query q = session.createSQLQuery("SELECT "+columnaBuscar+" FROM "+tabla+" Where "+columnaId+"="+valorId);
               
           Object valor = q.uniqueResult();
          
           campo = valor.toString();     
        
        } catch (Exception e) {
            System.out.println("Error en maximo: " + e);
            // deshacer transaccion
            this.rollback();
        }
        
    
 return campo;
}  
  /**
 public String getCampoStringIdString (String tabla, String columnaId,String columnaBuscar,String valorId) {
  String campo="";
 // obtener el id a asignar, el último mas uno
        Session session = getSession();
        List result = new ArrayList();
        try {
            // comenzar la transaccion
           org.hibernate.Transaction tx = session.beginTransaction();
           Query q = session.createSQLQuery("SELECT "+columnaBuscar+" FROM "+tabla+" Where "+columnaId+"="+valorId);
               
           Object valor = q.uniqueResult();
          
           campo = valor.toString();     
        
        } catch (Exception e) {
            System.out.println("Error en maximo: " + e);
            // deshacer transaccion
            this.rollback();
        }
        
    
 return campo;
}     
    
    
    */
    
    
    
   

    
    
    public void rollback(){
        Session session = getSession();
        try {
            // deshacer transaccion
            session.getTransaction().rollback();
        } catch (Exception e) {
            System.out.println("Error en rollback: " + e);
        }
    }
    
    
     public boolean create(Object o) {
        System.out.println("entro en CREATEEEEEEE");
        // obtener la sesion actual
        Session sessionC = null;
       sessionC = getSession();
        try {
            // comenzar la transaccion
           System.out.println("entro en CREATEEEEEEE___despues de tomar la session   2");
            sessionC.beginTransaction();
             System.out.println("entro en CREATEEEEEEE___despues de tomar la session   3");
            // almacenarlo
          //  o.getClass()
            //sessionC.merge(o);
            sessionC.save(o);
           System.out.println("entro en CREATEEEEEEE___despues de tomar la session   4");
            // confirmar transaccion
            sessionC.getTransaction().commit();
            sessionC.flush();
        } catch (Exception e) {
            System.out.println("Error en create: " + e);
            // deshacer transaccion
            this.rollback();
            return false;
        }
        return true;
    }
     
 

    public String getXhtmlGestion() {
        return xhtmlGestion;
    }

    public void setXhtmlGestion(String xhtmlGestion) {
        this.xhtmlGestion = xhtmlGestion;
    }

    
     
     
     
     
       public List getListParametroConsulta(String nombreTabla,String nombreCampo,BigDecimal parametro){
           Session session = getSession();
            List result = new ArrayList();
       try {
            String hql = " FROM "+nombreTabla+" WHERE "+nombreCampo+"="+parametro.toString();
 session.beginTransaction();
            Query query = session.createQuery(hql);
 
            result = query.list();
            session.getTransaction().commit();
             } catch (Exception e) {
      //System.out.println("Error en getListParametroConsulta: " + e);
                 System.out.println("catch HibernateManager.getListParametroConsulta error= " + e.getMessage());
            // deshacer transaccion
            this.rollback();
        }
       //System.out.println("-----------ENTRO en getListParametroConsulta tamaño de la lista="+result.size());
            return result;
  
    }
       public List getListParametroConsultaConWhere(String nombreTabla,String clausulaWhere){
           Session session = getSession();
            List result = new ArrayList();
       try {
            session.beginTransaction();
            String hql = " FROM "+nombreTabla+" "+clausulaWhere;

            Query query = session.createQuery(hql);
            System.out.println("Sale lista de talleres" + query.list());
            result = query.list();
             } catch (Exception e) {
      //System.out.println("Error en getListParametroConsulta: " + e);
            // deshacer transaccion
            session.getTransaction().rollback();
        }
       //System.out.println("-----------ENTRO en getListParametroConsulta tamaño de la lista="+result.size());
            return result;
  
    }
 /*
 public List getListParametroConsultaCompleta(String consulta){//String nombreTabla,String nombreCampo,BigDecimal parametro){
           Session session = getSession();
            List result = new ArrayList();
       try {
            String hql = consulta;
            Query query = session.createQuery(hql);

            result = query.list();
             } catch (Exception e) {
           this.rollback();
        }
            return result;
  
    }       
       
   */ 
   public List getConsultaList(String consulta) {
       List result = new ArrayList();
       
       Session session = getSession();
       
       try {
        
			SessionFactory fact = new Configuration().configure().buildSessionFactory();
			session = fact.openSession();
			String SQL_QUERY = consulta;
		        Query query = session.createQuery(SQL_QUERY);
                
                        List<Object[]> ls = (List<Object[]>) query.list();
                    result=ls;
                   	}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
    
    
 return result;
      
   }
public String getConsultaString (String consulta) {
  String campo="";
 // obtener el id a asignar, el último mas uno
        Session session = getSession();
        List result = new ArrayList();
        try {
            // comenzar la transaccion
           org.hibernate.Transaction tx = session.beginTransaction();
           Query q = session.createSQLQuery(consulta);//"SELECT "+columnaBuscar+" FROM "+tabla+" Where "+columnaId+"="+valorId);
           //Query q = session.createQuery(consulta);
               
           Object valor = q.uniqueResult();
          
           campo = valor.toString();     
        
        } catch (Exception e) {
            System.out.println("Error en getConsultaString: " + e);
            // deshacer transaccion
            this.rollback();
        }
        
    
 return campo;
}     
    
  public List getListParametroString(String nombreCampo,String parametro){
      
      
   //   System.out.println("HibernateManager----getListParametroString------campo=" + nombreCampo);
  //    System.out.println("HibernateManager----getListParametroString------parametro="+parametro);
      
//   System.out.println("HibernateManager----getListParametroString-----MAXIMO"+ this.getMaximo("infasegurado", columnaId));
    
    
                // obtener la sesion actual
        Session session = getSession();
        List result = new ArrayList();
        try {
             //System.out.println("HibernateManager----getListParametroString------TRY");
            // comenzar la transaccion
            session.beginTransaction();
            // obtener la lista de eventos
           Criteria criteria = session.createCriteria(myClass.getClass());
	

  	//buscar que hace el signum ese, creo que retorna-1 0 o 1 dependiendo si el bigdecimal es positivo neg o cero

          //poner los parametros
              if(parametro!=null ){// & parametro.length()>0){ 
                //   System.out.println("HibernateManager----getListParametroString------TRY if"); 
                  criteria.add(Restrictions.eq(nombreCampo, parametro));
                  
                  //parametro tiene que ser del mismo tipo del que sea el campo en la tabla, si no habria que convertirlo
               //     System.out.println("HibernateManager----getListParametroString------TRY if2");
           }
           
            //   System.out.println("HibernateManager----getListParametroString------TRY tras if");
                result=criteria.list();
        //  System.out.println("HibernateManager----getListParametroString-----tamaño de la lista"+result.size());
            session.getTransaction().commit();
            /*
             * 
             *  session.beginTransaction();
            Criteria criteria = session.createCriteria(Provincias.class);
	
           
           if(parametro!=null & parametro.length()>0){    
                BigDecimal num = new BigDecimal(id);
                criteria.add(Restrictions.eq("perito", num));
           }
           listaTiposusuario=criteria.list();
           session.getTransaction().commit();
	
             */
        } catch (Exception e) {
            System.out.println("Error en getListParametroString: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return result;
    }

  
   /**
     * Obtener la lista de registros para una entidad
     * @return
     */
       //obtiene el listado actualizado
       public List getList(){
               // obtener la sesion actual
        Session session = getSession();
        List result = new ArrayList();
        try {
          //  System.out.println("Entro en getLIst");
           // System.out.println("Entro en getLIst myclsss"+ myClass.getClass());
           
            // comenzar la transaccion
         //  session.flush();
        //   session.r
            session.beginTransaction();
            session.flush();
      //        System.out.println("Entro en getLIst myclsss"+ myClass.getClass()+"222222");
            // obtener la lista de eventos
           Criteria cr = session.createCriteria(myClass.getClass());
            
      //     System.out.println("Entro en getLIst myclsss"+ myClass.getClass()+"222222b");
      //       System.out.println("Entro en getLIst myclsss"+ myClass.getClass()+"222222bb"+cr.toString());
           
           result=cr.list();
    //       System.out.println("Entro en getLIst myclsss"+ myClass.getClass()+"222222c");
           //   result = session.createCriteria(myClass.getClass()).list();
            
   //          System.out.println("Entro en getLIst myclsss"+ myClass.getClass()+"333333");
            // confirmar transaccion
            session.getTransaction().commit();
   //           System.out.println("Entro en getLIst myclsss"+ myClass.getClass()+"444444");
        
        } catch (Exception e) {
            System.out.println("Error en getList: " + e);
            // deshacer transaccion
            this.rollback();
        }
        return result;
    }
       
        /**
     * Obtener la sesion de hibernate para el acceso a la base de datos
     * @return
     */
    
    protected Session getSession(){
        System.out.println("HibernateManager.GetSession");
        Session session = null;
        Session sessionGestionPericial = null;
        if (BBDD.equals("Maestros")){// == "Maestros"){
       
                session=getSessionMaestros();
                System.out.println("HibernateManager.GetSession if");
        }
        else
        {
            /*
            
                try {
                sessionGestionPericial = HibernateUtil.getSessionFactory().getCurrentSession();
                if(!sessionGestionPericial.isOpen()){
                   sessionGestionPericial = HibernateUtil.getSessionFactory().openSession();
                    }
                 } catch(Exception e){
                  sessionGestionPericial = HibernateUtil.getSessionFactory().openSession();
                }
                session=sessionGestionPericial;
            */
          System.out.println("HibernateManager.GetSession else");
                session=getSessionGPericial();
       }
                
            return session;
    }
  
    
 /*   
     protected Session getSessionMaestros(){//para cuando queremos consultar la clase vinculada desde la principal
        Session sessionMaestros = null;            //por defecto tomaria la bbdd principal, lo forzamos para que tome la maestra
           
                try {
              System.out.println("SESSIONNNNNNNNNNNNNNNNNNN HibernateManager.getSessionMaestros getcurrentsesion");
                sessionMaestros = HibernateUtilMaestros.getSessionFactory().getCurrentSession();
                    if(!sessionMaestros.isOpen()){
                        System.out.println("SESSIONNNNNNNNNNNNNNNNNNN HibernateManager.getSessionMaestros sesion no abierta");
                        sessionMaestros = HibernateUtilMaestros.getSessionFactory().openSession();
                    }
                   
                } catch(Exception e){
                      System.out.println("SESSIONNNNNNNNNNNNNNNNNNN HibernateManager.getSessionMaestros catch");
                             sessionMaestros = HibernateUtilMaestros.getSessionFactory().openSession();
                }
        
        return sessionMaestros;
    }*/
    
    protected Session getSessionMaestros(){//para cuando queremos consultar la clase vinculada desde la principal
        Session sessionMaestros = null;            //por defecto tomaria la bbdd principal, lo forzamos para que tome la maestra
           
                try {
                sessionMaestros = HibernateUtilMaestros.getSessionFactory().getCurrentSession();
                    if(!sessionMaestros.isOpen()){
                        sessionMaestros = HibernateUtilMaestros.getSessionFactory().openSession();
                    }
                   
                } catch(Exception e){
                              sessionMaestros = HibernateUtilMaestros.getSessionFactory().openSession();
                }
        
        return sessionMaestros;
    }
       protected Session getSessionGPericial(){//para cuando queremos consultar la clase vinculada desde la principal
        Session sessionGP = null;            //por defecto tomaria la bbdd principal, lo forzamos para que tome la maestra
        
                try {
                sessionGP = HibernateUtil.getSessionFactory().getCurrentSession();
                    if(!sessionGP.isOpen()){
                        sessionGP = HibernateUtil.getSessionFactory().openSession();
                    }
                   
                } catch(Exception e){
                             sessionGP = HibernateUtil.getSessionFactory().openSession();
                }
        
        return sessionGP;
    }
    
}