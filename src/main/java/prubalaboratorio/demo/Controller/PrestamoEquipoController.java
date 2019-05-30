package prubalaboratorio.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(name="prestamo")
public class PrestamoEquipoController {

@GetMapping("/consulta/usuario")
    public String ConsultarPrestamos(Model model ,@RequestParam(name = "idSolicitante", required = false) String idSolicitante){



    return "prestamo";// se borra vista se agrega prestamo
}





}
