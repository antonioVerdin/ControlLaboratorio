package prubalaboratorio.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import prubalaboratorio.demo.Component.EquipoConverter;
import prubalaboratorio.demo.Entity.Equipo;
import prubalaboratorio.demo.Model.EquipoModel;
import prubalaboratorio.demo.Repository.EquipoRepository;
import prubalaboratorio.demo.Service.EquipoService;

import java.util.ArrayList;
import java.util.List;

@Service("equipoServiceImpl")
public class EquipoServiceImpl implements EquipoService {
    @Autowired
    @Qualifier("equipoRepository")
    EquipoRepository equipoRepository;

    @Autowired
    @Qualifier("equipoConverter")
    EquipoConverter equipoConverter;



    @Override
    public EquipoModel addEquipo(EquipoModel equipoModel) {

        Equipo temp = equipoConverter.convertirEquipoModelaEquipo(equipoModel);
        Equipo equipo = equipoRepository.save(temp);
        return equipoConverter.convertirEquipoaEquipoModel(equipo);
    }

    @Override
    public List<EquipoModel> listAllEquipos() {
        List <Equipo> equipos= equipoRepository.findAll();

        List<EquipoModel> equipoModels = new ArrayList();
        for (Equipo equipo : equipos)
            equipoModels.add(equipoConverter.convertirEquipoaEquipoModel(equipo));
        return equipoModels;

    }

    @Override
    public Equipo findEquipoByIdEquipo(int idEquipo) {



        return equipoRepository.findByIdEquipo(idEquipo);
    }

    @Override
    public void removerEquipo(int idEquipo) {
        Equipo equipo = findEquipoByIdEquipo(idEquipo);
        if(equipo != null)
            equipoRepository.delete(findEquipoByIdEquipo(idEquipo));
    }

    @Override
    public EquipoModel findEquipoByIdEquipoModel(int idEquipo) {

        return equipoConverter.convertirEquipoaEquipoModel(findEquipoByIdEquipo(idEquipo));
    }
}
