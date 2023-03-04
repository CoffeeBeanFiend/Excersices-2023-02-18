package exc_oop_1_to_7;

public class Point3D extends Point2D {
    private float z;

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public Point3D setX(float x) {
        super.setX(x);
        return this;
    }

    public Point3D setY(float y) {
        super.setY(y);
        return this;
    }

    public Point3D setZ(float z) {
        this.z = z;
        return this;
    }

    public float[] getXYZ() {
        return new float[] {this.getX(), this.getY(), this.getZ()};
    }

    public Point3D setXYZ(float x, float y, float z) {
        this.setX(x).setY(y).setZ(z);
        return this;
    }

    public Point3D setXYZ(float[] xyz) {
        this.setX(xyz[0]).setY(xyz[1]).setZ(xyz[2]);
        return this;
    }
}
