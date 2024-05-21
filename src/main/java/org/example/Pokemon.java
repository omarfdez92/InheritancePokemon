package org.example;

// Superclass (Parent Class)
class Pokemon {
    String name;
    int level;

    Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    void attack() {
        System.out.println(name + " attacks!");
    }

    void takeDamage(int damage) {
        level -= damage;
        System.out.println(name + " takes " + damage + " damage!");
    }
}
