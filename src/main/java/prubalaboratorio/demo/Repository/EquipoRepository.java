package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.Equipo;

import java.io.Serializable;

@Repository("equipoRepository")
public interface EquipoRepository extends JpaRepository<Equipo,Serializable>{

        public abstract Equipo findByIdEquipo(int idEquipo);



    }
