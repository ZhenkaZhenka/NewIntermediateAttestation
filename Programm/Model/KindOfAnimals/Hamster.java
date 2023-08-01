package Model.KindOfAnimals;

import Model.Pet;

import java.time.LocalDate;

import static Model.AnimalKind.HAMSTER;

public class Hamster extends Pet {
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        setKind(HAMSTER);
    }
}
