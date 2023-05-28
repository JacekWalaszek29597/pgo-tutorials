abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String getType();

    public String getName() {
        return name;
    }
}
