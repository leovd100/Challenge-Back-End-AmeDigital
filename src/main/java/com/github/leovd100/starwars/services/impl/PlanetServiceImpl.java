package com.github.leovd100.starwars.services.impl;

import com.github.leovd100.starwars.dto.PlanetDTO;
import com.github.leovd100.starwars.entity.Planet;
import com.github.leovd100.starwars.exceptions.DataBaseException;
import com.github.leovd100.starwars.exceptions.ResourceNotFoundException;
import com.github.leovd100.starwars.repository.PlanetRepository;
import com.github.leovd100.starwars.services.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PlanetServiceImpl implements PlanetService {

    private String url = "https://swapi.dev/api/planets/?page=";

    @Autowired
    private PlanetRepository repository;

    @Override
    public PlanetDTO getPlannetById(Long id) {
     Planet planet =  repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
     return new PlanetDTO(planet);
    }
    @Override
    @Transactional
    public Planet addPlanet(PlanetDTO dto) {
        return repository.save(dtoToEntity(dto));
    }

    private Planet dtoToEntity( PlanetDTO dto){
            return new Planet(dto.getName(), dto.getClimated(), dto.getTerrain(), dto.getAppearances());
    }
    @Override
    public Page<Planet> getAllPlanets(Pageable pageable) {
        return repository.findAll(pageable);
    }
    @Override
    public Planet findByName(String name) {
        return repository.findByName(name).orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
    }
    @Override
    @Transactional
    public void deletePlanet(Long id) {
        Planet planet = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
        try {
            repository.delete(planet);
        }catch(DataIntegrityViolationException e) {
            throw new DataBaseException("Integrity Violation");
        }
    }
}
