package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Pokemon;

import java.io.FileWriter;
import java.io.IOException;

public class GenerarArchivos {
    public void guardarJson(Pokemon pokemon, String nombreArchivo) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Agregamos ".json" si el usuario no lo pone
        if(!nombreArchivo.endsWith(".json")){
            nombreArchivo += ".json";
        }

        try(FileWriter escritura = new FileWriter(nombreArchivo)){
            escritura.write(gson.toJson(pokemon));
            System.out.println("Archivo guardado como: " + nombreArchivo);
        }


    }
}
