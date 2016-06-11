package solid.ocp.more;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements SortableShape {

    @Override
    public void draw() {
        log.info("rectangle-draw");
    }

    @Override
    public Priority getPriority() {
        return Priority.HIGH;
    }
}