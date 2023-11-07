package ma.projet.ecole.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.ecole.entities.Professeur;



@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Integer> {

}
