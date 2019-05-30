package prubalaboratorio.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import prubalaboratorio.demo.Constant.ViewConstants;


@Controller
public class HomeController {

    @GetMapping("index")
    public String mostrarPrincipal(){

        return ViewConstants.INDEX;
    }
}
