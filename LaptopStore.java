// Создать множество ноутбуков.

import java.util.HashSet;
import java.util.Set;

public class LaptopStore {
    
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Apple", "MacBook Pro", 1999.99, 16, 512, "Intel Core i7", 13.3f);
        Laptop laptop2 = new Laptop("Lenovo", "Ideapad", 999.99, 8, 256, "Intel Core i5", 15.6f);
        Laptop laptop3 = new Laptop("Asus", "TUF Gaming", 1299.99, 16, 512, "Intel Core i7", 19.0f);
        Laptop laptop4 = new Laptop("Dell", "Vostro 3510", 1499.99, 32, 512, "Intel Core i9", 13.3f);
        
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        
        System.out.println("Количество ноутбуков в магазине: " + laptops.size());
        
        for (Laptop laptop : laptops) {
            System.out.println(laptop.getBrand() + " " + laptop.getModel() + ", Цена: $" + laptop.getPrice());
        }
        
        Laptop laptop5 = new Laptop("Brand5", "Model4", 1799.99, 32, 1, "Processor5", 17.3f);
        laptops.add(laptop5);
        
        System.out.println("Количество ноутбуков в магазине после добавления нового ноутбука: " + laptops.size());
    }  
}
