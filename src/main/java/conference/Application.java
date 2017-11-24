package conference;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import conference.repository.UserRepository;
import conference.model.User;

@SpringBootApplication
public class Application {

	@Value("${server.port}")
	String port;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//    	User c = new User();
//    	c.userId = 23;
//    	c.userName = "NewNew2";
//    	userrepo.save(c);
//    	Conference d = new Conference();
//    	d.programId = 23L;
//    	d.conferName = "OOO00==1";
//    	confrepo.save(d);
    	System.out.println("saved");
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:" + port);

        };
    }
}