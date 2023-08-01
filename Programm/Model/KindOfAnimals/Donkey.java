package Model.KindOfAnimals;

import Model.PackAnimal;

import java.time.LocalDate;

import static Model.AnimalKind.DONKEY;

public class Donkey extends PackAnimal {
    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        setKind(DONKEY);
    }
}
