package ma.projet.ecole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.ecole.entities.Specialite;



@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite, Integer> {

}
