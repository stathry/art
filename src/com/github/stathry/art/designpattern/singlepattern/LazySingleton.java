package com.github.stathry.art.designpattern.singlepattern;

/**
 * 双重校验锁（DCL，即 double-checked locking）
 * Created by dongdaiming on 2018-08-03 12:52
 */
public class LazySingleton {

    private LazySingleton() {}

    private static volatile LazySingleton instance;

    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
