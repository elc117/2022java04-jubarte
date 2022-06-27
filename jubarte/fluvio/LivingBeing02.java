package fluvio;

public class LivingBeing02 {
    protected final String scientificName;
    protected final String dnaSequence;

    /* É posível adicionar classes como Animal, Bacteria, etc. */
    public LivingBeing02(String scientificName, String dnaSequence) {
        this.scientificName = scientificName;
        this.dnaSequence = dnaSequence;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getDnaSequence() {
        return dnaSequence;
    }
}