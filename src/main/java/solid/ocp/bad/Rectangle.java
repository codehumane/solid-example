package solid.ocp.bad;

public class Rectangle implements Shape {

    @Override
    public ShapeType getShapeType() {
        return ShapeType.RECTANGLE;
    }

    public void draw() {
        System.out.print("rectangle-draw");
    }
}
