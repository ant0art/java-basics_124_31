package itmo.java.basics.lesson2;

/** Enum-class of materials of frame*/
public enum FrameMaterial {
    WOOD("дерево"),
    STEEL("сталь"),
    PLASTIC("пластик"),
    SILICONE("силикон");

    private String description;

    FrameMaterial(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
