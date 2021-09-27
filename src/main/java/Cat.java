public class Cat implements Domesticatable, Tradable {

    @Override
    public String sound() {
        return "Meow Meow!";
    }

    @Override
    public int getPrice() {
        return 7;
    }
}
