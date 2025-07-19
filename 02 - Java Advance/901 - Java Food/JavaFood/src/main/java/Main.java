import JavaFood.AdminPanel;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AdminPanel adminPanel = new AdminPanel();
        adminPanel.loadFromJSONFile("./data2.json");
    }
}
