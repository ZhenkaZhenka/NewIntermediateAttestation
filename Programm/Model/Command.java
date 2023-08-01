package Model;

public class Command {
    public String name;
    public String description;

    public Command(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Command(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        if(description != null) {
            return description;
        }
        else {
            return "Нет описания команды.";
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
