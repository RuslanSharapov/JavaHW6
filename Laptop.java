// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

public class Laptop {
    private String brand;
    private String model;
    private double price;
    private int ram;
    private int storageCapacity;
    private String processor;
    private float screen;
    
    public Laptop(String brand, String model, double price, int ram, int storageCapacity, 
                  String processor, float screen) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.processor = processor;
        this.screen = screen;
    }
    
    // Getters and setters for all fields
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }
}
