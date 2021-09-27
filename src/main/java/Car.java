public class Car implements Drivable, Tradable{
    private int max_speed;
    private int price;

    public Car(int speed, int price) {
        this.max_speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "This car's max speed is" + max_speed +
                ", and costs $" + price + '.';
    }

    /**
     * Increase the maximum speed of this Vehicle.
     **/
    @Override
    public void upgradeSpeed() {
        this.max_speed += 10;
    }

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    @Override
    public void downgradeSpeed() {
        this.max_speed -= 10;

        if (max_speed < 0) {
            max_speed = 0;
        }
    }

    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return The current maximum speed of this Vehicle.
     **/
    @Override
    public int getMaxSpeed() {
        return max_speed;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
