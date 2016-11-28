package me.cafetorres.pokeapi.api;

import java.util.List;

import me.cafetorres.pokeapi.entity.Pokemon;

/**
 * Created by Carlos on 28/11/2016.
 */
public class Pokemons {
    private int count;
    private List<Pokemon> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
    //@SerializedName()
}
