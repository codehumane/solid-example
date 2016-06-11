package solid.ocp.good;

import java.util.List;

public class Drawer {

    public void draw(List<Shape> shapes) {
        shapes.forEach(shape -> {
            shape.draw();
        });
    }
}
