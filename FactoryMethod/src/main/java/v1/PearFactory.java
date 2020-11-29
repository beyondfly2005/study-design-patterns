package v1;

public class PearFactory extends FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
