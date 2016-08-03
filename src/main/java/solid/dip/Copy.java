package solid.dip;

public class Copy {

    private ReadKeyboard keyboard;
    private WritePrinter printer;
    private WriteFile file;

    public void copy(boolean isPrinterWrite) {
        if (isPrinterWrite) {
            printer.write(keyboard.read());
        } else {
            file.write(keyboard.read());
        }
    }
}
