package classes.characters;

import classes.CharacterClass;

public class Warrior extends CharacterClass {
    public Warrior(String name) {
        this.setLevel(1);
        this.setHealthPoints(100);
        this.setManaPoints(50);
        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(50);
        this.setName(name);
    }
}
