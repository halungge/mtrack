package ch.mlz.mtrack;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("mtrack")
public class HealthCheck {

    @GetMapping("health")
    public String healthCheck(){
        return "All fine";
    }

}
