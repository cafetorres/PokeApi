package me.cafetorres.pokeapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import me.cafetorres.pokeapi.api.PokeApiService;
import me.cafetorres.pokeapi.api.PokeApiClient;
import me.cafetorres.pokeapi.api.Pokemons;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    PokeApiClient pokeApiClient=new PokeApiClient();
    PokeApiService pokeApiService;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokeApiService=pokeApiClient.getPokeApiService();

        Call<Pokemons> call=pokeApiService.listPokemons("pokemon");
        call.enqueue(new Callback<Pokemons>() {
            @Override
            public void onResponse(Call<Pokemons> call, Response<Pokemons> response) {
                Pokemons pokemonResponse=response.body();
                Log.v("COUNT",Integer.toString(pokemonResponse.getCount()));
                for(int i=0;i<pokemonResponse.getResults().size();i++){
                    Log.v("URL", pokemonResponse.getResults().get(i).getUrl());
                    Log.v("NAME",pokemonResponse.getResults().get(i).getName());
                }
            }

            @Override
            public void onFailure(Call<Pokemons> call, Throwable t) {
                    Log.e("Error","Something went wrong: " + t.getMessage());
            }
        });
    }
}
