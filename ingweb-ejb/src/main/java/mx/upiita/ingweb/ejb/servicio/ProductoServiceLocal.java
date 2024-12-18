package mx.upiita.ingweb.ejb.servicio;

import jakarta.ejb.Local;
import mx.upiita.ingweb.ejb.modelo.EntProducto;

import java.util.List;

@Local
public interface ProductoServiceLocal {

    List<EntProducto> listar();
    public EntProducto crear (EntProducto entity);
    public EntProducto actualizar (EntProducto entity);
    public void eliminar (EntProducto entity);


}
