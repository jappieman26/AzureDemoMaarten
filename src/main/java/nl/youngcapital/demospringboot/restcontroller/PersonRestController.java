package nl.youngcapital.demospringboot.restcontroller;

import nl.youngcapital.demospringboot.entity.Persoon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

    @GetMapping("endpoint")
    public Persoon endpoint() {
        Persoon persoon = new Persoon("Piet", "Klein");
        return persoon;
    }
}
