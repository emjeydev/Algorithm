import java.util.ArrayList;

public class GuardianScroll {
    public String scrollName;
    private String secretTechnique;
    protected String successorKnowledge;
    ArrayList<String> alliancePacts;

    public GuardianScroll(String scrollName, String secretTechnique, String successorKnowledge, ArrayList<String> alliancePacts) {
        this.scrollName = scrollName;
        this.secretTechnique = secretTechnique;
        this.successorKnowledge = successorKnowledge;
        this.alliancePacts = alliancePacts;
    }

    public String getSecretTechnique() {
        return secretTechnique;
    }

    public void setSecretTechnique(String secretTechnique) {
        this.secretTechnique = secretTechnique;
    }
}
