package tn.esprit.MicroService.resto.platperso;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

public interface PlatPersoRepo extends JpaRepository<PlatPerso, Long> {
	/*@Query("select P from PlatPerso p where p.nomPlatPerso like :nom")
	public Page<PlatPerso> platByName (@Param("nom") String n, Pageable pageable);*/
}
