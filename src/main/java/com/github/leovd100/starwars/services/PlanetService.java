package com.github.leovd100.starwars.services;

import com.github.leovd100.starwars.dto.PlanetDTO;
import com.github.leovd100.starwars.entity.Planet;
import com.github.leovd100.starwars.exceptions.DataBaseException;
import com.github.leovd100.starwars.exceptions.ResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public interface PlanetService {
    PlanetDTO getPlannetById(Long id);
    @Transactional
    Planet addPlanet(PlanetDTO dto);
    Page<Planet> getAllPlanets(Pageable pageable);
    Planet findByName(String name);
    @Transactional
    void deletePlanet(Long id);
}
