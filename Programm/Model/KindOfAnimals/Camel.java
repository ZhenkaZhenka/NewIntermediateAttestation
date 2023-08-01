package Model.KindOfAnimals;

import Model.PackAnimal;

import java.time.LocalDate;

import static Model.AnimalKind.CAMEL;

public class Camel extends PackAnimal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        setKind(CAMEL);
    }
}
