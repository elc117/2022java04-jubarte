public class LivingBeing {
    protected final String scientificName;
    protected final String dnaSequence;

    /* É posível adicionar classes como Animal, Bacteria, etc. */
    public LivingBeing(String scientificName, String dnaSequence) {
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