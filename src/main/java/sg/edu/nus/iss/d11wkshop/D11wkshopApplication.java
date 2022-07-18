package sg.edu.nus.iss.d11wkshop;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D11wkshopApplication {

	public static void main(String[] args) {
		//SpringApplication.run(D11wkshopApplication.class, args);
		SpringApplication app = new SpringApplication(D11wkshopApplication.class);

		String port = "8080";

		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
			if (cliOpts.containsOption("port")) {
			 port = cliOpts.getOptionValues("port").get(0);
			}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);
		
	}

}
