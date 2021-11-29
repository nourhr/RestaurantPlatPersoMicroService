package tn.esprit.MicroService.resto.platperso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/platperso")
public class PlatPersoRestAPI {

	private String titre="Micro Service de la class Plat Personnaliser";
	
	@Autowired
	PlatPersoService platservice;
	
	@RequestMapping ("/hello")
	public String sayHello()
	{
		System.out.println(titre);
		return titre;
	}
	
	@GetMapping
	public List<PlatPerso> getAllPat(){
		return (List<PlatPerso>) platservice.getAllPlat();
	}
	
}
