package springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("vets")
@Controller
public class VeterinarianController {

    @RequestMapping({"/",""})
    public String ListOfVeterinarians(){
        return "veterinarians/index";
    }
}
