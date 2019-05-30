package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.Usuario;

import java.io.Serializable;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario,Serializable>{

        public abstract Usuario findByIdUsuario(String idUsuario);



    }
