package solid.ocp.bad;

import java.util.List;

public class Drawer {

    public void draw(List<Shape> shapes) {
        shapes.forEach(shape -> {
            switch (shape.getShapeType()) {
                case CIRCLE:
                    Circle circle = (Circle) shape;
                    circle.draw();
                    break;
                case RECTANGLE:
                    Rectangle rectangle = (Rectangle) shape;
                    rectangle.draw();
                    break;
            }
        });
    }
}
