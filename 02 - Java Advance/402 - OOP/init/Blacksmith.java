public class Blacksmith extends Craftsman{

    @Override
    public String craftsmanSkill() {
        return "The Blacksmith forges a mighty sword";
    }

    @Override
    public void createItem() {
        System.out.println("createItem Blacksmith");
    }

    @Override
    public void displayItem() {
        System.out.println("displayItem Blacksmith");
    }

    @Override
    public void sellItem() {
        System.out.println("sellItem Blacksmith");
    }
}
