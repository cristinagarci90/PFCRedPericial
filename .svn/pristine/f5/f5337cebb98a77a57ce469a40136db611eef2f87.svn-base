package comun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import web.FotosInformeManagedBean;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
 
@ManagedBean(name="fileUploadController")
public class FileUploadController {
   private String destination="C:\\RAIXAUTOS\\";
  public FotosInformeManagedBean fotosInforme;
  
    public void upload(FileUploadEvent event) {  
       String nombrefoto;
       
        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);
        // Do what you want with the file        
        try {
              System.out.println("Try de FileUploadController");
            fotosInforme = new FotosInformeManagedBean();
             System.out.println("Try de FileUploadController2");
            nombrefoto=fotosInforme.newRegister();
            //copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
            //event.getFile().getFileName().g//
            copyFile(nombrefoto, event.getFile().getInputstream());
        } catch (IOException e) {
            System.out.println("Catch de FileUploadController___e="+e.getMessage());
            e.printStackTrace();
        }

    }  

    public void copyFile(String fileName, InputStream in) {
           try {
             
             
                // write the inputStream to a FileOutputStream
                OutputStream out = new FileOutputStream(new File(destination + fileName));
             
                int read = 0;
                byte[] bytes = new byte[1024];
             
                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
             
                in.close();
                out.flush();
                out.close();
             
                System.out.println("New file created!");
                } catch (IOException e) {
                System.out.println(e.getMessage());
                }
    }
}