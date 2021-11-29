package tn.esprit.MicroService.resto.platperso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatPersoService {
	@Autowired
	private PlatPersoRepo repositoryPlat;

	public PlatPerso addPlatPerso(PlatPerso p) {
		return repositoryPlat.save(p);
	}
	
	public List<PlatPerso> getAllPlat (){
		return (List<PlatPerso>) repositoryPlat.findAll();
	}
	
	public PlatPerso getPlatById (long id){
		return repositoryPlat.findById(id).get();
	}
}
