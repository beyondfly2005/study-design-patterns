package com.beyondsoft.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时，不会加载内部类，这样可以实现懒加载
 * 完美方法之一
 */
public class Mgr07 {
    private Mgr07() {
    }

    private static class Mgr07Holder {
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr07.getInstance().hashCode()); //不同对象的hash码是不同的  hash码相同也可能不是同一个对象  同一个类的不同对象 它的hash码是不同的
            }).start();
        }
    }
}
