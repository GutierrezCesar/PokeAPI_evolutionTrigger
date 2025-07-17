package app;

import com.google.gson.Gson;
import model.Pokemon;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPokemon {

    public Pokemon idDelPokemon (int idPokemon){

        var busqueda = URI.create("https://pokeapi.co/api/v2/evolution-trigger/"+idPokemon);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(busqueda)
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Pokemon.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontre la consulta");
        }


    }

}


