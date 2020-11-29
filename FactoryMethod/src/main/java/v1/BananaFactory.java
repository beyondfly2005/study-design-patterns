package v1;

public class BananaFactory extends FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
