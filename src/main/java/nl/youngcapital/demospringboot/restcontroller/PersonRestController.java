package nl.youngcapital.demospringboot.restcontroller;

import nl.youngcapital.demospringboot.entity.Persoon;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 3600)
public class PersonRestController {

    @GetMapping("endpoint2")
    public String endpoint2() {
        return "hoi";
    }

    @GetMapping("endpoint")
    public Persoon endpoint() {
        Persoon persoon = new Persoon("Piet", "Klein");
        return persoon;
    }

    @PostMapping("endpoint")
    public Persoon postPersoon(@RequestBody Persoon persoon) {
        System.out.println(persoon.getFirstName() + " " + persoon.getLastName());
        return persoon;
    }
}
