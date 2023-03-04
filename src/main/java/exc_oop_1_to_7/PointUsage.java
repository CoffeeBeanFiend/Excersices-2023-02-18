package exc_oop_1_to_7;

import javax.swing.*;
import java.util.ArrayList;

public class PointUsage {

    public static void main(String[] args) {
        final Point2D a = new Point2D((float)Math.random()*1000, (float)Math.random()*1000),
                b = new Point2D((float)Math.random()*1000, (float)Math.random()*1000);

        final float d2x = a.getX() - b.getX(),
                d2y = a.getY() - b.getY();

        final float dist2 = (float)Math.sqrt(d2x*d2x + d2y*d2y);

        System.out.printf(
                "Distance between points (%f, %f) and (%f, %f) is %f\n",
                a.getX(), a.getY(),
                b.getX(), b.getY(),
                dist2
        );

        final Point3D c = new Point3D((float)Math.random()*1000, (float)Math.random()*1000, (float)Math.random()*1000),
        d = new Point3D((float)Math.random()*1000, (float)Math.random()*1000, (float)Math.random()*1000);

        final float dx = c.getX() - d.getX(),
                dy = c.getY() - d.getY(),
                dz = c.getZ() - d.getZ();

        final float dist = (float)Math.sqrt(dx*dx + dy*dy + dz*dz);

        System.out.printf(
                "Distance between points (%f, %f, %f) and (%f, %f, %f) is %f\n",
                c.getX(), c.getY(), c.getZ(),
                d.getX(), d.getY(), d.getZ(),
                dist
        );
    }
}
