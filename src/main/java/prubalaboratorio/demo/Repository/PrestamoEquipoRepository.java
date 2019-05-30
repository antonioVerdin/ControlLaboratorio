package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.PrestamoEquipo;

import java.io.Serializable;

@Repository("prestamoEquipoRepository")
public interface PrestamoEquipoRepository extends JpaRepository<PrestamoEquipo, Serializable> {

    abstract PrestamoEquipo findAllByIdSolicitante(String idSolicitante);


}
