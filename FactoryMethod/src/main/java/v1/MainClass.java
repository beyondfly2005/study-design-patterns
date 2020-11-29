package v1;

public class MainClass {

    public static void main(String[] args) {
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.get();

        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.get();

        //如果需加入一个新的水果梨子
        FruitFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.getFruit();
        pear.get();
    }
}
