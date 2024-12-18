package mx.upiita.ingweb.ejb.servicio;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.upiita.ingweb.ejb.modelo.EntProducto;

import java.util.List;

@Stateless //para que sepa que es un ejb
public class ProductoServiceImpl extends AbstractServiceFacade<EntProducto>
        implements ProductoServiceLocal{

    //definicion entity manager
    @PersistenceContext(name = "ingewebDS")
    private EntityManager em;

    public ProductoServiceImpl() {
        super(EntProducto.class);
    }


    @Override
    public List<EntProducto> listar (){
        return em.createQuery("select p from EntProducto p",
                EntProducto.class).getResultList();
    }

    @Override
    public void eliminar(EntProducto entity) {

    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
