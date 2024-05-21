package org.example;

public class PokemonTrainer {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 15);
        FirePokemon charmander = new FirePokemon("Charmander", 10);

        pikachu.attack();
        charmander.attack(); // Inherited from Pokemon
        charmander.flamethrower();

        charmander.takeDamage(3);
        System.out.println(charmander.name + "'s level is now " + charmander.level);
    }
}
