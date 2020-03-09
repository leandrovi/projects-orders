package domain.vos;
import domain.commons.Entity;

public class Client extends Entity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
