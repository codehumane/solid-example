package solid.dip;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WriteFile {
    public void write(String input) {
        log.info("File write: {}", input);
    }
}
