package nl.youngcapital.demospringboot.restcontroller;

import nl.youngcapital.demospringboot.entity.Persoon;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

    @GetMapping("endpoint2")
    public String endpoint2() {
        return "hoi";
    }

    @CrossOrigin(origins = "https://calm-water-079651203.azurestaticapps.net/")
    @GetMapping("endpoint")
    public Persoon endpoint() {
        Persoon persoon = new Persoon("Piet", "Klein");
        return persoon;
    }
}
