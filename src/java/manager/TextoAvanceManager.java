package manager;

import comun.HibernateManager;
import models.Poblacion;
import java.math.BigDecimal;

public class TextoAvanceManager extends HibernateManager {

    public TextoAvanceManager(){
        TABLE = "Textoavance";
        myClass = new Poblacion();
        columnaId= "idtextoavance";
        maximoID=new BigDecimal(1);
        Consulta="Select T.idtextoavance,T.texto from TextoAvance T,ClienteTextoAvance Cli where Cli.textoAvance.idtextoavance=T.idtextoavance and idCliente=";    }
    
    
}
