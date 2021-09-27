/*
Class by Eren
 */

public class Rhino implements Drivable, Domesticatable, Tradable {

    private int maxSpeed;
    private double hornLength;

    public Rhino() {
        this.maxSpeed = 10;
        this.hornLength = 3.5;
    }
    public void strechHorn(double i){
        /*
        shortens horn by i dm
         */
        this.hornLength += i;
    }

    public void shortenHorn(double i){
        /*
        streches horn by i dm
         */
        this.hornLength -= i;
    }

    public void cutTheHorn(){
        /*
        returns the horn object
         */
        this.hornLength = 0;
    }

    public double getHornLength(){
        return this.hornLength;
    }

    @Override
    public String sound() {
        return "Uogh!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed+=2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed-=2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }

    private class Horn{

        private double length;

        public Horn(){}
        public Horn(double i){
            this.length = i;
        }

        public void Set_Length(double i){
            this.length = i;
        }


    }
}


