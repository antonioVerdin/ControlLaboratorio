package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.TipoHerramienta;

import java.io.Serializable;

@Repository("tipoHerramientaRepository")
public interface TipoHerramientaRepository extends JpaRepository<TipoHerramienta, Serializable> {

    public abstract TipoHerramienta findByIdTipoHerramienta(int idTipoHerramienta);

}
