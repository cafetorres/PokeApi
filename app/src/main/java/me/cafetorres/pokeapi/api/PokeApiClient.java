package me.cafetorres.pokeapi.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Carlos on 28/11/2016.
 */

public class PokeApiClient {
    Retrofit retrofit;
    private final static String BASE_URL="http://pokeapi.co";

    public PokeApiClient() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public PokeApiService getPokeApiService(){
        return this.retrofit.create(PokeApiService.class);
    }
}
