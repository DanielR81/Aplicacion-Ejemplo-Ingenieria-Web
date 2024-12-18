package mx.upiita.ingweb.web.controllers.jpa;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import mx.upiita.ingweb.ejb.modelo.EntProducto;
import mx.upiita.ingweb.ejb.servicio.ProductoServiceLocal;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named(value = "listaProductosController")
@RequestScoped
public class ListaProductosController implements Serializable {

    private final Logger logger = Logger.getLogger(ListaProductosController.class.getName());

    private List<EntProducto> productosLista;
    @Inject
    private ProductoServiceLocal ps;

    @PostConstruct
    public void init() {
        productosLista = ps.listar();
        for (EntProducto producto : productosLista) {
            logger.log(Level.INFO,"Prodcuto: {0}", producto.getNombre());
        }
    }

    public List<EntProducto> getProductosLista() {
        return productosLista;
    }


}
