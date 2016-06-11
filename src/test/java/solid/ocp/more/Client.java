package solid.ocp.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Client {

    @Test
    public void execute() throws Exception {
        List<SortableShape> list = new ArrayList<>();
        list.add(new Circle());
        list.add(new Rectangle());

        Sorter sorter = new Sorter();
        sorter.sort(list);

        Drawer drawer = new Drawer();
        drawer.draw(list);
    }
}