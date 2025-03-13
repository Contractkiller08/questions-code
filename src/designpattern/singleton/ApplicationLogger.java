package designpattern.singleton;

public class ApplicationLogger {
    private static ApplicationLogger instance;

    private ApplicationLogger(){};

    public ApplicationLogger getInstance(){
        if(instance == null) return new ApplicationLogger();
        return instance;
    }

    public void log(String message){
        System.out.println("LOG: " + message);
    }
}
