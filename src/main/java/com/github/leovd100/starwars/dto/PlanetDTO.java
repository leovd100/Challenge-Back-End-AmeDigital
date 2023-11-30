package com.github.leovd100.starwars.dto;

import com.github.leovd100.starwars.entity.Planet;

import java.io.Serializable;

public class PlanetDTO implements Serializable {

    private String name;
    private String climated;
    private String terrain;
    private Integer appearances = 0;

    public PlanetDTO(){}
    public PlanetDTO(String name, String climated, String terrain, Integer appearances) {
        this.name = name;
        this.climated = climated;
        this.terrain = terrain;
        this.appearances = appearances;
    }
    public PlanetDTO(Planet planet){
        this.name = planet.getName();
        this.climated = planet.getClimated();
        this.terrain = planet.getTerrain();
        this.appearances = planet.getAppearances();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimated() {
        return climated;
    }

    public void setClimated(String climated) {
        this.climated = climated;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Integer getAppearances() {
        return appearances;
    }

    public void setAppearances(Integer appearances) {
        this.appearances = appearances;
    }
}
