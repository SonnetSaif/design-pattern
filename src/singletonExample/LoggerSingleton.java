package singletonExample;

public class LoggerSingleton {

//    not thread safe
//    private static LoggerSingleton instance = new LoggerSingleton();
    private static volatile LoggerSingleton instance = null;

//    private LoggerSingleton(){}

    private LoggerSingleton(){
        if(instance != null){
            throw new RuntimeException("Instance is not null");
        }
    }

//    not thread safe
//    public static LoggerSingleton getInstance(){
//        return instance;
//    }

    public static LoggerSingleton getInstance(){
        if(instance == null){
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}
