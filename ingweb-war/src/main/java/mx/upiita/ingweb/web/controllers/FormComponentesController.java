package mx.upiita.ingweb.web.controllers;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named(value = "formComponentesController")
@RequestScoped
public class FormComponentesController {
    private static final Logger logger = Logger.getLogger(FormComponentesController.class.getName());

    private String texto;
    private String password;
    private String mensaje;
    private String hidden;

    private boolean check;
    private String oneMenu;
    private String oneMenuDiferente;
    private String oneMapDiferente;
    private String oneRadio;
    private String oneMap;
    private List<String> manyLista;
    private List<String> checkLista;
    private List<String> listaOpciones;
    private Map<String, String> mapaOpciones;

    @PostConstruct
    public void inicia(){
        listaOpciones = Arrays.asList("uno", "dos", "tres", "cuatro");
        mapaOpciones = new LinkedHashMap<>();
        mapaOpciones.put("A", "Opcion A");
        mapaOpciones.put("B", "Opcion B");
        mapaOpciones.put("C", "Opcion C");
        mapaOpciones.put("D", "Opcion D");
    }

    public void submit(){
        logger.log(Level.INFO, "Datos enviados del formulario");
        logger.log(Level.INFO, "texto : {0}", texto);
        logger.log(Level.INFO, "password : {0}", password);
        logger.log(Level.INFO, "mensaje : {0}", mensaje);
        logger.log(Level.INFO, "hidden : {0}", hidden);
        logger.log(Level.INFO, "checkbox : {0}", check);
        logger.log(Level.INFO, "oneMenu : {0}", oneMenu);
        logger.log(Level.INFO, "oneRadio : {0}", oneRadio);
        logger.log(Level.INFO, "ManyLista : {0}", manyLista);
        logger.log(Level.INFO, "checkLista : {0}", checkLista);
        logger.log(Level.INFO, "oneMenuDiferente : {0}", oneMenuDiferente);
        logger.log(Level.INFO, "oneMap : {0}", oneMap);

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getOneMenu() {
        return oneMenu;
    }

    public void setOneMenu(String oneMenu) {
        this.oneMenu = oneMenu;
    }

    public String getOneMenuDiferente() {
        return oneMenuDiferente;
    }

    public void setOneMenuDiferente(String oneMenuDiferente) {
        this.oneMenuDiferente = oneMenuDiferente;
    }

    public String getOneMapDiferente() {
        return oneMapDiferente;
    }

    public void setOneMapDiferente(String oneMapDiferente) {
        this.oneMapDiferente = oneMapDiferente;
    }

    public String getOneRadio() {
        return oneRadio;
    }

    public void setOneRadio(String oneRadio) {
        this.oneRadio = oneRadio;
    }

    public List<String> getManyLista() {
        return manyLista;
    }

    public void setManyLista(List<String> manyLista) {
        this.manyLista = manyLista;
    }

    public List<String> getCheckLista() {
        return checkLista;
    }

    public void setCheckLista(List<String> checkLista) {
        this.checkLista = checkLista;
    }

    public List<String> getListaOpciones() {
        return listaOpciones;
    }

    public void setListaOpciones(List<String> listaOpciones) {
        this.listaOpciones = listaOpciones;
    }

    public Map<String, String> getMapaOpciones() {
        return mapaOpciones;
    }

    public void setMapaOpciones(Map<String, String> mapaOpciones) {
        this.mapaOpciones = mapaOpciones;
    }

    public String getOneMap() {
        return oneMap;
    }

    public void setOneMap(String oneMap) {
        this.oneMap = oneMap;
    }
}
