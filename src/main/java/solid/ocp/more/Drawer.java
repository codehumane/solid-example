package solid.ocp.more;

import java.util.List;

public class Drawer {

    public <T extends Shape> void draw(List<T> shapes) {
        shapes.forEach(shape -> shape.draw());
    }
}
