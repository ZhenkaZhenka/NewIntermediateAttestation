package Model.KindOfAnimals;

import Model.Pet;

import java.time.LocalDate;

import static Model.AnimalKind.DOG;

public class Dog extends Pet {
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
        setKind(DOG);
    }
}
