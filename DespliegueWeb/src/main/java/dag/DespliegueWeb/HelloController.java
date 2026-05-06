package dag.DespliegueWeb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Hola, la app SpringBoot está funcionando en Render";
    }
    
    @GetMapping("/mensaje")
    public String mensaje() {
        return "Este es mi primer endpoint desplegado";
    }
    
}
