package Model.KindOfAnimals;

import Model.Pet;

import java.time.LocalDate;

import static Model.AnimalKind.CAT;

public class Cat extends Pet {
    public Cat(String name, LocalDate birthdate){
        super(name, birthdate);
        setKind(CAT);
    }
}
