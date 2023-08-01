package Model;

import java.time.LocalDate;

public abstract class Pet extends Animal{
    protected Pet(String name, LocalDate birthDate){
        super(name, birthDate);
    }
}
