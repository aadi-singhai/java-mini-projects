import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Product implements Comparable<Product>{
    private String id;
    private String name;
    private double price;
    private double rating;
    private int totalReviews;
    
    public Product(String id, String name, double price, double rating, int totalReviews) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.totalReviews = totalReviews;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }
    public int getTotalReviews() {
        return totalReviews;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + ", totalReviews="
                + totalReviews + "]";
    }

    @Override
    public int compareTo(Product that) {

        return Double.compare(this.price, that.price);
        
    }
    
}

class ServiceEngine{
    private ArrayList<Product> inventory;

    public ServiceEngine(ArrayList<Product> inventory) {
        this.inventory = inventory;
    }
    
    public void addProduct(Product p){
        inventory.add(p);
    }

    public void sortByDefault(){
        Collections.sort(inventory);
    }
    public void sortByRatingDesc() {
        Comparator<Product> byRatingDesc = (p1, p2) -> Double.compare(p2.getRating(), p1.getRating());
        inventory.sort(byRatingDesc);
    }
    public void sortByPopularityDesc(){
        Comparator<Product> byPopularityDesc = (p1, p2) -> Integer.compare(p2.getTotalReviews(), p1.getTotalReviews());
        inventory.sort(byPopularityDesc);
    }

    public void displayResults(String sortType){
        System.out.println(sortType);
        for(Product p : inventory){
            System.out.println(p);
        }
    }
}
public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("P1", "Laptop", 999.99, 4.5, 200));
        list.add(new Product("P2", "Phone", 499.99, 4.8, 350));
        list.add(new Product("P3", "Tablet", 299.99, 4.2, 150));
        list.add(new Product("P4", "Watch", 199.99, 4.6, 100));

        ServiceEngine engine = new ServiceEngine(list);

        engine.sortByDefault();
        engine.displayResults("--- Default View (Price: Low to High) ---");
        
        engine.sortByRatingDesc();
        engine.displayResults("\n--- User Selected: Top Rated ---");
        
        engine.sortByRatingDesc();
        engine.displayResults("\n--- User Selected: Most Popular ---");
    }
}
