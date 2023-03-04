package exc_oop_1_to_7;

public class Point2D {
    private float x, y;

    Point2D() {
        x = y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public Point2D setX(float x) {
        this.x = x;
        return this;
    }

    public float getY() {
        return y;
    }

    public Point2D setY(float y) {
        this.y = y;
        return this;
    }

    public float[] getXY() {
        return new float[] {getX(), getY()};
    }

    public Point2D setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
        return this;
    }

    public Point2D setXY(float[] xy) {
        this.setX(xy[0]).setY(xy[1]);
        return this;
    }
}
