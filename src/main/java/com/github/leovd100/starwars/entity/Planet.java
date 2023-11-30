package com.github.leovd100.starwars.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_planet")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String climated;
    private String terrain;
    private Integer appearances;
    public Planet() {
    }

    public Planet(Long id, String name, String climated, String terrain, Integer appearances) {
        this.id = id;
        this.name = name;
        this.climated = climated;
        this.terrain = terrain;
        this.appearances = appearances;
    }

    public Planet(String name, String climated, String terrain, Integer appearances) {

        this.name = name;
        this.climated = climated;
        this.terrain = terrain;
        this.appearances = appearances;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", climated='" + climated + '\'' +
                ", terrain='" + terrain + '\'' +
                ", appearances=" + appearances +
                '}';
    }
}
