package prubalaboratorio.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import prubalaboratorio.demo.Entity.PrestamoEquipo;
import prubalaboratorio.demo.Repository.PrestamoEquipoRepository;
import prubalaboratorio.demo.Service.PrestamoEquipoService;

import java.util.List;

@Service("prestamoServiceImpl")
public class PrestamoEquipoServiceImpl implements PrestamoEquipoService {

    @Autowired
    @Qualifier("prestamoEquipoRepository")
    PrestamoEquipoRepository prestamoEquipoRepository;




    @Override
    public List<PrestamoEquipo> EnlistarPrestamosDeUsuario(String id) {

        List <PrestamoEquipo> listaPrestamosUsuario;


        return null;
    }
}
