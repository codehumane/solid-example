package solid.dip;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WritePrinter {
    public void write(String input) {
        log.info("Printer write: {}", input);
    }
}
