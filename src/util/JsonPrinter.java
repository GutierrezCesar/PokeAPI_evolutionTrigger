package util;

import model.NameEntry;
import model.Pokemon;

public class JsonPrinter {
    public static void imprimir(Pokemon pokemon) {
        System.out.println("{");
        System.out.println("  \"id\": " + pokemon.id() + ",");
        System.out.println("  \"name\": \"" + pokemon.name() + "\",");
        System.out.println("  \"names\": [");

        for (int i = 0; i < pokemon.names().size(); i++) {
            NameEntry entry = pokemon.names().get(i);
            System.out.println("    {");
            System.out.println("      \"language\": {");
            System.out.println("        \"name\": \"" + entry.language().name() + "\",");
            System.out.println("        \"url\": \"" + entry.language().url() + "\"");
            System.out.println("      },");
            System.out.println("      \"name\": \"" + entry.name() + "\"");
            System.out.println(i == pokemon.names().size() - 1 ? "    }" : "    },");
        }

        System.out.println("  ]");
        System.out.println("}");
    }
}
