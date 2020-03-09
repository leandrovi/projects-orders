package domain.enums;

public enum AvailableEntities {
    USER("user"),
    ORDER("order"),
    PRODUCT("product");

    private String description;

    AvailableEntities(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
