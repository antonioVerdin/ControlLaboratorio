package prubalaboratorio.demo.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import prubalaboratorio.demo.Entity.EstadoPrestamoEquipo;
import prubalaboratorio.demo.Entity.PrestamoEquipo;
import prubalaboratorio.demo.Model.PrestamoEquipoModel;
import prubalaboratorio.demo.Repository.EstadoPrestamoEquipoRepository;

@Component("prestamoEquipoConverter")
public class PrestamoEquipoConverter {

    @Autowired
    @Qualifier("estadoPrestamoEquipoRepository")
    EstadoPrestamoEquipoRepository estadoPrestamoEquipoRepository;


public PrestamoEquipo convertirPrestamoEquipoModelaPrestamoEquipo(PrestamoEquipoModel prestamoEquipoModel){
    PrestamoEquipo prestamoEquipo= new PrestamoEquipo();

    prestamoEquipo.setIdEquipo(prestamoEquipoModel.getIdEquipo());
    prestamoEquipo.setIdSolicitante(prestamoEquipoModel.getIdSolicitante());
    prestamoEquipo.setFecha(prestamoEquipo.getFecha());
    EstadoPrestamoEquipo estadoPrestamoEquipo= estadoPrestamoEquipoRepository.findByIdEstado(prestamoEquipoModel.getIdEstado());
    prestamoEquipo.setIdEstado(estadoPrestamoEquipo);


    return prestamoEquipo;
}

}
