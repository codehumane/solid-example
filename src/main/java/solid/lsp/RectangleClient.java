package solid.lsp;

public class RectangleClient {

    public void inconsistency(Rectangle rectangle) {
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        double area = rectangle.getHeight() * rectangle.getWidth();
        assert area == 50;
    }

    public void ocpViolation(Rectangle rectangle) {
        rectangle.setHeight(10);
        rectangle.setWidth(5);

        double area = rectangle.getHeight() * rectangle.getWidth();
        if (rectangle instanceof Square) {
            assert area == 100;
        } else {
            assert area == 50;
        }
    }
}