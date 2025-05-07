public class Potter extends Craftsman {

    @Override
    public String craftsmanSkill() {
        return "The Potter shapes a beautiful vase";
    }

    @Override
    public void createItem() {
        System.out.println("createItem Potter");
    }

    @Override
    public void displayItem() {
        System.out.println("displayItem Potter");
    }

    @Override
    public void sellItem() {
        System.out.println("sellItem Blacksmith");
    }
}
