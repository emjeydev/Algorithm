public class Product {
    private int id;
    private int size;
    private int pressureTolerance;
    private int colorTransparency;

    public Product(int id, int size, int pressureTolerance, int colorTransparency) {
        this.id = id;
        this.size = size;
        this.pressureTolerance = pressureTolerance;
        this.colorTransparency = colorTransparency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPressureTolerance() {
        return pressureTolerance;
    }

    public void setPressureTolerance(int pressureTolerance) {
        this.pressureTolerance = pressureTolerance;
    }

    public int getColorTransparency() {
        return colorTransparency;
    }

    public void setColorTransparency(int colorTransparency) {
        this.colorTransparency = colorTransparency;
    }
}
