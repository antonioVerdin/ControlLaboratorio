package prubalaboratorio.demo.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import prubalaboratorio.demo.Constant.ViewConstants;
import prubalaboratorio.demo.Model.UsuarioModel;
import prubalaboratorio.demo.Service.UsuarioService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("usuarioServiceImpl")
    private UsuarioService usuarioService;

    private static final Log log = LogFactory.getLog(UserController.class);


    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/users/showUsers";
    }

    @GetMapping("/index")
    public ModelAndView mostrarUsuarios(){

        ModelAndView mav = new ModelAndView(ViewConstants.USERS);
        mav.addObject("users",usuarioService.listAllUsers());


         return mav;
    }

    @GetMapping("/form")
    public String redirectUserForm(Model model, @RequestParam(name = "idUsuario", required = false) String idUsuario) {

        UsuarioModel usuarioModel = new UsuarioModel();
        if(!idUsuario.equals("none")) {
            usuarioModel = usuarioService.findUserByIdUsuarioModel(idUsuario);
            System.out.println("MODELO : "+usuarioModel);
        }

        model.addAttribute("usuarioModel",usuarioModel);
        return ViewConstants.USERS_FORM;
    }


    @PostMapping("/adduser")
    public String addUser(@ModelAttribute(name = "usuarioModel") UsuarioModel usuarioModel, Model model) {
        log.info("Method: addUser() -- Params: " + usuarioModel.toString());
        if (usuarioService.addUser(usuarioModel) != null)
            model.addAttribute("result", 1);
        else
            model.addAttribute("result", 0);
        return "redirect:/user/index";
    }




    @GetMapping("/remove")
    public ModelAndView removeUser(@RequestParam(name = "idUsuario", required = true) String idUsuario) {
       usuarioService.removerUsuario(idUsuario);
        return mostrarUsuarios();
    }





}
