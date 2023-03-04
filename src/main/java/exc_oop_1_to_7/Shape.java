package exc_oop_1_to_7;

public class Shape {
    private String color;
    private boolean isFilled;

    public Shape() {
        color = "unknown";
        isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public Shape setColor(String color) {
        this.color = color;
        return this;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public Shape setFilled(boolean filled) {
        isFilled = filled;
        return this;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}
