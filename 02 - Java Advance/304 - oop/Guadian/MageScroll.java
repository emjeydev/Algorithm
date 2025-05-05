import java.util.ArrayList;

public class MageScroll extends GuardianScroll {
    public MageScroll(String scrollName, String secretTechnique, String successorKnowledge, ArrayList<String> alliancePacts) {
        super(scrollName, secretTechnique, successorKnowledge, alliancePacts);
    }

    public void AddAlliancePact(String pact){
        alliancePacts.add(pact);
    }
}
