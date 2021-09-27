public class Helicopter implements Drivable, Domesticatable, Tradable{
    /*
    Unit for maxSpeed in Miles
    Unit for maxAltitude in Feet
    Unit for maxDistance in Miles
     */
    private int maxSpeed;
    private int maxAltitude;
    private int maxDistance;

    public Helicopter() {
        this.maxSpeed = 160;
        this.maxAltitude =  25000;
        this.maxDistance = 250;
    }

    @Override
    public String sound() {
        return "bbbbbbbb!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getMaxAltitude(){
        return this.maxAltitude;
    }


    public int getMaxDistance(){
        return this.maxDistance;
    }

    @Override
    public int getPrice() {
        return 700000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
