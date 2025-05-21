import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: test the functionality of the Examiner class

        Examiner ex = new Examiner();
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, 80, 1200, 240));
        products.add(new Product(2, 70, 900, 239));
        products.add(new Product(3, 70, 1000, 210));
        products.add(new Product(4, 70, 1200, 238));

        List<String> output = ex.checkProductList(products);
        for (String p : output) {
            System.out.println(p);
        }

        /*
        1-1
        2-2
        3-3
        */
    }
}
