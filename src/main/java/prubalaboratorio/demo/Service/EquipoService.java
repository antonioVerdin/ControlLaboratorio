package prubalaboratorio.demo.Service;

import prubalaboratorio.demo.Entity.Equipo;
import prubalaboratorio.demo.Model.EquipoModel;

import java.util.List;

public interface EquipoService {

    public abstract EquipoModel addEquipo(EquipoModel equipoModel);

    public abstract List<EquipoModel> listAllEquipos();

    public abstract Equipo findEquipoByIdEquipo(int idEquipo);

    public abstract void removerEquipo(int idEquipo);

    public abstract EquipoModel findEquipoByIdEquipoModel(int idEquipo);
}
