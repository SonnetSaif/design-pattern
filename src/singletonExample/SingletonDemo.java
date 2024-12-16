package singletonExample;

public class SingletonDemo {
    public static void main(String[] args){
        LoggerSingleton loggerSingleton = LoggerSingleton.getInstance();
        System.out.println(loggerSingleton);
        LoggerSingleton loggerSingleton1 = LoggerSingleton.getInstance();
        System.out.println(loggerSingleton1);
    }
}
