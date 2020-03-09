package domain.vos;
import domain.commons.Entity;

public class Product extends Entity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
