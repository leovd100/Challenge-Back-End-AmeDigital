package com.github.leovd100.starwars.dto;

import com.github.leovd100.starwars.models.PlanetResponse;

import java.util.List;

public class ResponseAllPlanets {
    private Integer count;
    private String next;
    private String previous;
    private List<PlanetResponse> results;

    public ResponseAllPlanets(){}

    public ResponseAllPlanets(Integer count, String next, String previous, List<PlanetResponse> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<PlanetResponse> getResults() {
        return results;
    }

    public void setResults(List<PlanetResponse> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "ResponseAllPlanets{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }
}
