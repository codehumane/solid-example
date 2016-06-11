package solid.ocp.bad;

public class Circle implements Shape {

    @Override
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }

    public void draw() {
        System.out.print("circle-draw");
    }
}
