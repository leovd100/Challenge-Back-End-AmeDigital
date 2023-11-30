package com.github.leovd100.starwars.controller;

import com.github.leovd100.starwars.dto.PlanetDTO;
import com.github.leovd100.starwars.entity.Planet;
import com.github.leovd100.starwars.services.PlanetService;
import com.github.leovd100.starwars.services.impl.PlanetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/planet")
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @GetMapping
    public Page<Planet> getAllPlanets(@PageableDefault(size = 5, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return planetService.getAllPlanets(pageable);
    }

    @GetMapping("{id}")
    public ResponseEntity<PlanetDTO> populate(@PathVariable("id") Long id){
        return ResponseEntity.ok(planetService.getPlannetById(id));
    }


    @GetMapping("/find")
    public ResponseEntity<Planet> findPlanetByName(@RequestParam("name") String name){
        return ResponseEntity.ok(planetService.findByName(name));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletePlanet(@PathVariable("id") Long id){
        planetService.deletePlanet(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Planet> insertPlanets(@RequestBody PlanetDTO dto){
        return ResponseEntity.ok(planetService.addPlanet(dto));
    }


}
