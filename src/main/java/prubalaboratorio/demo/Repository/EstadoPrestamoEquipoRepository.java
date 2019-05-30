package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.EstadoPrestamoEquipo;

import javax.persistence.Entity;
import java.io.Serializable;

@Repository("estadoPrestamoEquipoRepository")
public interface EstadoPrestamoEquipoRepository extends JpaRepository<EstadoPrestamoEquipo, Serializable> {

    public abstract EstadoPrestamoEquipo findByIdEstado(int idEstado);


}
