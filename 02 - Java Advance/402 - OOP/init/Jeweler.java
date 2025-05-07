public class Jeweler extends Craftsman{

    @Override
    public String craftsmanSkill() {
        return "The Jeweler crafts a radiant diamond ring";
    }

    @Override
    public void createItem() {
        System.out.println("createItem Jeweler");
    }

    @Override
    public void displayItem() {
        System.out.println("displayItem Jeweler");
    }

    @Override
    public void sellItem() {
        System.out.println("sellItem Jeweler");
    }
}
