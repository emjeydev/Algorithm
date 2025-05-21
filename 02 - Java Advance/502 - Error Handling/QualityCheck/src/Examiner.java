import exception.ColorTransparencyException;
import exception.PressureToleranceException;
import exception.SizeException;

import java.util.ArrayList;
import java.util.List;

public class Examiner {
    public List<String> checkProductList(List<Product> products) {
        List<String> problematicProducts = new ArrayList<>();

        for (Product product : products) {
            try {
                checkProduct(product);
            } catch (SizeException e) {
                problematicProducts.add(product.getId() + "-1");
            } catch (PressureToleranceException e) {
                problematicProducts.add(product.getId() + "-2");
            } catch (ColorTransparencyException e) {
                problematicProducts.add(product.getId() + "-3");
            }
        }

        return problematicProducts;
    }

    private void checkProduct(Product p) throws SizeException, PressureToleranceException, ColorTransparencyException {
        if (p.getSize() != 70)
            throw new SizeException();
        if (p.getPressureTolerance() < 1000)
            throw new PressureToleranceException();
        if (!(p.getColorTransparency() >= 235 && p.getColorTransparency() <= 245))
            throw new ColorTransparencyException();
    }
}
