package com.marsamaroc.gestionengins.service;

import com.marsamaroc.gestionengins.dto.EnginDTO;
import com.marsamaroc.gestionengins.entity.Engin;
import com.marsamaroc.gestionengins.repository.EnginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnginServiceImp implements EnginService{

    @Autowired
    EnginRepository enginRepository;
    @Override
    public Engin getById(String id) {
        return enginRepository.getById(id);
    }

    @Override
    public List<Engin> getEnginsSorties() {
        return enginRepository.findAllEnginSortie();
    }

    @Override
    public List<Engin> getEnginsEntrees() {
        return enginRepository.findAllEnginEntree();

    }

    @Override
    public void save(Engin engin) {
        enginRepository.save(engin);
    }

	@Override
	public List<Engin> getAll() {
		// TODO Auto-generated method stub
		return enginRepository.findAll();
	}

	@Override
	public List<Engin> getEnginsEntreesByFamille(Long famille) {
		// TODO Auto-generated method stub
		
		return enginRepository.findAllEnginEntreeByFamille(famille);
	}
}
