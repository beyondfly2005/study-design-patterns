package v1;

public class AppleFactory extends FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
