package mx.upiita.ingweb.web.controllers;

import jakarta.enterprise.context.RequestScoped;
import jdk.jfr.Name;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@Name(value="echoController")
@RequestScoped
public class EchoController implements Serializable {
    private static final Logger logger = Logger.getLogger(EchoController.class.getName());
    private String texto;

    public String envio(){
        logger.log(Level.INFO, "Enviando petición");
        return null;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
