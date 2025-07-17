# Consulta Pokémon desde la API de PokeAPI

Este proyecto es una aplicación Java que permite consultar información de métodos de evolución de Pokémon desde la [PokeAPI](https://pokeapi.co) mediante su ID y guardar el resultado en formato JSON.

## 📦 Estructura del Proyecto
```
📂 src/
├── app/
│ └── ConsultaPokemon.java
├── model/
│ ├── Language.java
│ ├── NameEntry.java
│ └── Pokemon.java
├── util/
│ ├── Principal.java
│ └── GenerarArchivos.java
├── .gitignore
├── README.md
## 🚀 ¿Qué hace esta aplicación?
```

- Pide al usuario que ingrese un ID de método de evolución.
- Realiza una consulta a `https://pokeapi.co/api/v2/evolution-trigger/{id}`.
- Muestra la respuesta en formato JSON.
- Guarda el resultado en un archivo `.json` con un nombre personalizado.

## 💡 Ejemplo de uso

```bash
Ingrese el idPokemon a consultar:
1

Ingrese el nombre del archivo a guardar:
ApiPokemon
