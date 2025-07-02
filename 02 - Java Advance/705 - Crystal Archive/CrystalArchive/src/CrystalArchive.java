import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CrystalArchive {
    List<Crystal> crystalArchive = new ArrayList<>();

    public void addCrystal(Crystal crystal) {
        List<String> isExisted = crystalArchive.stream().map(Crystal::name).filter(f -> f.equals(crystal.name())).toList();
        if (isExisted.isEmpty())
            crystalArchive.add(crystal);
    }

    public List<Crystal> findByColor(String color) {
        return crystalArchive.stream().filter(f -> f.color().equals(color)).collect(Collectors.toList());
    }

    public double calculateTotalEnergy() {
        return crystalArchive.stream()
                .filter(f -> f.expirationYear() >= 1403)
                .map(Crystal::energyLevel)
                .mapToDouble(Double::doubleValue).sum();

    }

    public Crystal getMostPowerful() {
        return crystalArchive.stream().max(Comparator.comparingDouble(Crystal::energyLevel)).orElse(null);
    }
}
