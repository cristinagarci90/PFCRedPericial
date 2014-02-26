package models;


import java.text.*;

import javax.faces.context.FacesContext;
//para las variables en sesion
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
//import org.hibernate.Session;
import models.Usuario;

@ManagedBean(name = "Login")
@SessionScoped

public class Login {

    private String nombreUsu;
    private String password;
    private String email;
    private String usuarioRol;
//Session session = null;

  
    public String getUsuarioRol() {
        
        return usuarioRol;
    }

    public void setUsuarioRol(String usuarioRol) {
        this.usuarioRol = usuarioRol;
    }
    private String mensaje;
    private String borrar;
    public String MiMensaje;
    Usuario UsLogin = new Usuario();
    
    
    public String getBorrar() {
        return borrar;
    }

    public void setBorrar(String borrar) {
        this.borrar = borrar;
    }
    
   
  
public Login()
{
    
  this.mensaje = "";//prueba;  
   
}

    public String submit() {
       
       FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("LoginError", "");
       this.mensaje= "";
       MiMensaje=UsLogin.getUsuario(this.nombreUsu,this.password);//,this.mensaje);
       this.mensaje= FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("LoginError").toString();
      // this.mensaje="message";
       //si todo ha ido bien el resultado de la funcín es el rol del usuario (el código numérico)
       this.usuarioRol=MiMensaje;
       
       return MiMensaje;
        
       
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
     
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public String getPassword() {
        return password;
    }

   
       public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }
/*
public void inicioPerito()//sirve para que si alguien entra directametne en una página si no es de su rol que lo lande al login
{
     try{
   
           if (this.usuarioRol.equals("2")==false)
           {
                   try{
             FacesContext contex = FacesContext.getCurrentInstance();
             contex.getExternalContext().redirect( "login.jsf");
                }catch(  Exception e ){
                      this.mensaje="Error en la redirección";
                }

           }

                 }catch(  Exception e ){
                           try{
             FacesContext contex = FacesContext.getCurrentInstance();
             contex.getExternalContext().redirect( "login.jsf");
        }catch(  Exception ex ){
              this.mensaje="Error en la redirección";
        }
            
 
 
        }  
   //  session.refresh(this);
}
* */
    //si un tipo de usuario pone en la barra de direcciones una páginanoválida para su tipo de usuario le mandamos al login
    
public void inicioUsuario(String tipo)//sirve para que si alguien entra directametne en una página si no es de su rol que lo lande al login
{
     try{
   
           if (this.usuarioRol.equals(tipo)==false)
           {
                   try{
              this.mensaje="No tiene acceso a la página que quiere visitar-consulte con el administrador";
             FacesContext contex = FacesContext.getCurrentInstance();
             contex.getExternalContext().redirect( "../faces/loginError.xhtml");
                }catch(  Exception e ){
                      this.mensaje="Error en la redirección";
                }

           }

                 }catch(  Exception e ){
                           try{
             FacesContext contex = FacesContext.getCurrentInstance();
             contex.getExternalContext().redirect( "../faces/loginError.xhtml");
        }catch(  Exception ex ){
              this.mensaje="Error en la redirección";
        }
            
 
 
        }  
   //  session.refresh(this);
}
/*
public String emailRecordatorio()//sirve para que si alguien entra directametne en una página si no es de su rol que lo lande al login
{
     FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("LoginError", "");
     MiMensaje=UsLogin.getUsuarioCorreo("anadelw@hotmail.com");//this.getEmail());//,this.mensaje);
     this.mensaje= FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("LoginError").toString();
     this.usuarioRol=MiMensaje;
       
     return MiMensaje;
   
}
*/

}
