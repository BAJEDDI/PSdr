package ma.projet.ecole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.ecole.dao.IDao;
import ma.projet.ecole.entities.Professeur;
import ma.projet.ecole.repositories.ProfesseurRepository;



@Service
public class ProfesseurService implements IDao<Professeur> {

	@Autowired
	private ProfesseurRepository repository;

	@Override
	public Professeur create(Professeur o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Professeur o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Professeur update(Professeur o) {
		return repository.save(o);
	}

	@Override
	public Professeur findById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Professeur> findAll() {
		return repository.findAll();
	}
	
	

}

