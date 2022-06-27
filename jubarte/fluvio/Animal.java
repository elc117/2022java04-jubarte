package matheus;

public class Animal extends LivingBeing {
    private int weight;
    private boolean isSleeping;
    
    public Animal(String sp, String dna, Integer p){
        super(sp, dna);
        weight = p;
    }

    public void setWeight(int p){
        weight = p;
    }

    public int getWeight(){
        return weight;
    }

    public void eat(int w){
        weight += w;
    }

    public void sleep(){
        isSleeping = true;
    }

    public void wakeUp(){
        isSleeping = false;
    }

    public boolean isAsleep(){
        return isSleeping;
    }
}
