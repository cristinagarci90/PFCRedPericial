/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comun;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author cristina
 */

 @ManagedBean(name="comun")
@SessionScoped
public class Comun {
    
    
     public String getConvBaja(String baja){
          if (baja.equals("true"))
                  return "S";
          else 
              return "N";
          
          
      }
}
