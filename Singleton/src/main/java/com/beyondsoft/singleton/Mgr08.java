package com.beyondsoft.singleton;

/**
 * 枚举单例
 * 不仅解决了线程同步，还可以防止反序列化
 * 枚举类 不能被反序列化的原因是
 * 枚举类没有构造方法 不能从Class文件构造对象
 */
public enum Mgr08 {

    INSTANCE;

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr08.INSTANCE.hashCode()); //不同对象的hash码是不同的  hash码相同也可能不是同一个对象  同一个类的不同对象 它的hash码是不同的
            }).start();
        }
    }
}
