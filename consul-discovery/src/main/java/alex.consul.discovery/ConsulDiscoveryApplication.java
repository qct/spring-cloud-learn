package alex.consul.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@SpringBootApplication
public class ConsulDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulDiscoveryApplication.class, args);
    }
}


@RestController
class HelloController {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

}