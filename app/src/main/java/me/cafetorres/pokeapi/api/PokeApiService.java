package me.cafetorres.pokeapi.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Carlos on 28/11/2016.
 */

public interface PokeApiService {
    @GET("{api/v2/{endpoints}/")
    Call<Pokemons> listPokemons(@Path("endpoint") String endPoint);
}
