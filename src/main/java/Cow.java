/*
The cow class that can be traded and domesticated.
 */
public class Cow implements Tradable, Domesticatable{
    private int maxSpeed;
    public Cow(){this.maxSpeed = 10000000;}

    @Override
    public String sound(){ return "Moo!"; }

    @Override
    public int getPrice() {
        return 10000;
    }
    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }
}



