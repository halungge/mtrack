package ch.mlz.mtrack;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("state/health")
    public String healthCheck(){
        return "TODO";
    }

    @GetMapping("/ping")
        public String ping(){
            return "OK..."
        }
    }
}
