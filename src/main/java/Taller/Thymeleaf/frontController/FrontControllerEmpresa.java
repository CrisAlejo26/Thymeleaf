package Taller.Thymeleaf.frontController;

import Taller.Thymeleaf.models.Empresa;
import Taller.Thymeleaf.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FrontControllerEmpresa {

    @Autowired
    EmpresaService controladorEmpresa;

    @GetMapping("/index")
    public String mostrarIndex(){
        return "index";
    }

    @GetMapping("/listaEmpresas")
    public String lista(Model model){
        List<Empresa> empresas = controladorEmpresa.mostrarem();
        model.addAttribute("empresas", empresas);
        return "listaEmpresas";
    }

    @GetMapping("/agregarEmpresa")
    public String agregarEmpresa(@ModelAttribute Empresa empresa, Model model){
        model.addAttribute("empresa", new Empresa());
        return "agregar";
    }

    @PostMapping("/agregarEmpresa")
    public String agregar(@ModelAttribute Empresa empresa, Model model) {
        controladorEmpresa.agregarEmpresas(empresa);
        return "redirect:/listaEmpresas";
        }
    
}   
