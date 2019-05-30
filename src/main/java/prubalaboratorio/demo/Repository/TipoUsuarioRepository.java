package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.TipoUsuario;

import java.io.Serializable;

@Repository("tipoUsuarioRepository")
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Serializable> {

    public abstract TipoUsuario findByIdTipoUsuario(int idTipoUsuario);

}
