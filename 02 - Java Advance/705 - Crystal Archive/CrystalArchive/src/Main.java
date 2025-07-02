public class Main {
    public static void main(String[] args) {
        Crystal c1 = new Crystal("Athena", 950.5, "Blue", 1405);
        Crystal c2 = new Crystal("Athena", 950.5, "Blue", 1405);

        System.out.println(c1.equals(c2));
        System.out.println(c1);

        CrystalArchive archive = new CrystalArchive();
        archive.addCrystal(c1);
        archive.addCrystal(c2);
        archive.addCrystal(new Crystal("Poseidon", 1200.0, "Green", 1399)); // energy adjusted to 1000, expired warning printed

        System.out.println(archive.findByColor("Blue"));
        System.out.println("Total Energy: " + archive.calculateTotalEnergy());
        System.out.println("Most Powerful: " + archive.getMostPowerful());
    }
}