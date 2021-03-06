package xframe.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.RestController;


//@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = { "xframe.springboot" })
public class WebMain {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebMain.class, args);
	}
}
