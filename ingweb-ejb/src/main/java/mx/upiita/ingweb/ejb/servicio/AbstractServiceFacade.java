package mx.upiita.ingweb.ejb.servicio;

import jakarta.persistence.EntityManager;

public abstract class AbstractServiceFacade <T> {
    private Class<T> claseEntidad;

    public AbstractServiceFacade(Class<T> claseEntidad) {
        this.claseEntidad = claseEntidad;
    }

    abstract protected EntityManager getEntityManager();

    public T crear(T entidad) {
        getEntityManager().persist(entidad);
        return entidad;
    }

    public T actualizar(T entidad) {
        T entidadCopia;
        if(entidad != null) {
            entidadCopia = getEntityManager().merge(entidad);
            return entidadCopia;
        }
        return null;
    }

    public void borrar(T entidad) {
        getEntityManager().remove(this.actualizar(entidad));
    }

}
