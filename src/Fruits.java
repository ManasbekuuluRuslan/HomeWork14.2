public class Fruits {
    private String name;
    private int vitamins;
    private String color;

    public Fruits(String name, String color, int vitamins) {
        this.name = name;
        this.color = color;
        this.vitamins = vitamins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVitamins() {
        return vitamins;
    }

    public void setVitamins(int vitamins) {
        this.vitamins = vitamins;
    }

    @Override
    public String toString() {
        return "Fruit: " + name + "тусу: "+color + "витамини: " + vitamins;
    }

}
