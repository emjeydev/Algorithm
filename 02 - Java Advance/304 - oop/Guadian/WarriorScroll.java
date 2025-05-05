import java.util.ArrayList;

public class WarriorScroll extends GuardianScroll {
    public WarriorScroll(String scrollName, String secretTechnique, String successorKnowledge, ArrayList<String> alliancePacts) {
        super(scrollName, secretTechnique, successorKnowledge, alliancePacts);
    }

    public void AddAlliancePact(String pact) {
        alliancePacts.add(pact);
    }
}
