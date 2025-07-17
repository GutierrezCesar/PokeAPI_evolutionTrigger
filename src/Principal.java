import app.ConsultaPokemon;
import model.Pokemon;
import util.GenerarArchivos;
import util.JsonPrinter;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultaPokemon consultarPokemon = new ConsultaPokemon();

        System.out.println("Ingrese el idPokemon a consultar:");
        var idPokemon = teclado.nextInt();

        // Imprimir en JSON
        Pokemon buscarPokemon = consultarPokemon.idDelPokemon(idPokemon);
        JsonPrinter.imprimir(buscarPokemon);

        // Guardar informacion en json
        GenerarArchivos generarArchivos = new GenerarArchivos();
        try {
            generarArchivos.guardarJson(buscarPokemon, "ApiPokemon");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
