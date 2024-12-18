package mx.upiita.ingweb.web.controllers;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value="holaMundoController") // instancia un objeto llamado holaMundoController que va a ser el controlador de class controller para la vista xhtml
@RequestScoped
public class HolaMundoController {
    private String mensaje;
    private String nombreParam;

    @PostConstruct//una ves que se hace la contruccion, crea el objeto
    public void iniciacion(){
        mensaje = "Hola mundo desde un manageBean (Controller)";
    }
    public void construyeMensaje(){
        mensaje = "Bienvenido al nuevo mundo" + nombreParam;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombreParam() {
        return nombreParam;
    }

    public void setNombreParam(String nombreParam) {
        this.nombreParam = nombreParam;
    }
}
