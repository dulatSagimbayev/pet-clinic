package springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VeterinarianController {

    @RequestMapping({"/vets","/veterinarians"})
    public String ListOfVeterinarians(){
        return "veterinarians/index";
    }
}
