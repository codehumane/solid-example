package solid.ocp.more;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements SortableShape {

    @Override
    public void draw() {
        log.info("circle-draw");
    }

    @Override
    public Priority getPriority() {
        return Priority.LOW;
    }
}
