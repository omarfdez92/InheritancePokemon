package org.example;

// Subclass (Child Class)
class FirePokemon extends Pokemon {
    FirePokemon(String name, int level) { // Constructor calling super
        super(name, level); // Calls the parent class constructor
    }

    void flamethrower() {
        System.out.println(name + " uses Flamethrower!");
    }
}
