package tn.esprit.MicroService.resto.platperso;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class RestaurantPlatPersoMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantPlatPersoMicroServiceApplication.class, args);
	}
@Bean
ApplicationRunner init(PlatPersoRepo repository){
	return args -> {
		Stream.of("plat1","plat2","plat3").forEach(nomPlatPerso ->{
			repository.save(new PlatPerso(nomPlatPerso));
		
		});
	};
}
}
