package domain.enums;

public enum RepositoryType {
    TEXT("text"),
    MYSQL("MySQL");

    private String description;

    RepositoryType(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
