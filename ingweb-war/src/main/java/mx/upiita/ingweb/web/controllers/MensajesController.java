package mx.upiita.ingweb.web.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@Named(value = "mensajesController")
@RequestScoped

public class MensajesController {
    private String email;
    private String password;

    public String enviar(){
        try{
            //throw new Exception("Excepcion simulada");
            if(password.equals("12345")){
                return "/basic/salida/otraPagina1";
            }else{
                return "/basic/salida/otraPagina2";
            }
        }catch (Exception e){
            FacesMessage fm = new FacesMessage(e.getMessage());
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.addMessage("formEtiquetaMensajes:enviarBtn", fm);//se manda el mensaje a el componente con la etiqueda: "fotmEtiqutaMensajes"
            return null;
        }
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

    public void setPassword(String password) {
        this.password = password;
    }
}

