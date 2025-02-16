package designpattern.singleton;

public class Singleton {
    private static Singleton instance;

    //made constructor private so no one can instantiate the class
    private Singleton(){};

    public static Singleton getInstance(){
        if(instance ==null){
            instance = new Singleton();
        }
        return instance;
    }
}
