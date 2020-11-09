package com.beyondsoft.singleton;

/**
 * lazy loading
 * 也成懒汉式
 * 虽然达到了按需初始化的目的，但是多线程线程环境下会有问题：造Mgr03成多个实例
 * 可以通过synchronized解决，但也带来了效率下降
 * Mgr06的写法被认为是最完美的写法
 */
public class Mgr06 {
    //    private static final Mgr03 INSTANCE;  final 必须初始化
    private static volatile Mgr06 INSTANCE; //语句/指令重排 JIT

    private Mgr06() {
    }

    public static Mgr06 getInstance() {
        if (INSTANCE == null) {
            //双重检查
            synchronized (Mgr06.class) {
                if(INSTANCE==null) {
                    // 模拟线程
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr06.getInstance().hashCode()); //不同对象的hash码是不同的  hash码相同也可能不是同一个对象  同一个类的不同对象 它的hash码是不同的
            }).start();
        }
    }

    //lmda  是对匿名内部类中只有一个方法的接口的简化
}
