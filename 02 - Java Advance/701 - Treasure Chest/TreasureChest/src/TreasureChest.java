import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreasureChest {
    private final List<String> clues = new ArrayList<>();
    private final Map<String, Integer> locationMap = new HashMap<>();

    public void addClue(String clue, int steps) {
        clues.add(steps, clue);
        locationMap.put(clue, steps);
    }

    public void removeClue(String clue) {
        clues.remove(clue);
        locationMap.remove(clue);
    }

    public List<String> getAllClue() {
        return new ArrayList<>(clues);
    }

    public int totalSteps(String targetClue) {
        int steps = 0;
        for (String clue : clues) {
            if (clue.equals(targetClue))
                return steps + locationMap.get(clue);
            else
                steps += locationMap.get(clue);
        }
        return 0;
    }

    public String decipherMap() {
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (String clue : clues) {
            Integer step = locationMap.get(clue);
            result.append("Index: ")
                    .append(index)
                    .append(" , Clue: ")
                    .append(clue)
                    .append(" , Step: ")
                    .append(step)
                    .append("\n");
            index++;
        }
        return String.valueOf(result).trim();
    }
}