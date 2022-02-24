package com.marsamaroc.gestionengins.service;

import com.marsamaroc.gestionengins.entity.Famille;
import com.marsamaroc.gestionengins.repository.FamilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilleServiceImp implements FamilleService {

    @Autowired
    FamilleRepository familleRepository;

    @Override
    public Famille getById(Long id) {
        return familleRepository.getById(id);
    }
}