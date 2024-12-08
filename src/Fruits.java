public class Fruits {
    private String name;
    private String color;
    private int count;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Fruits(String name, String color, int count) {
        this.name = name;
        this.color = color;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", count=" + count +
                '}';
    }
}
