package java8.Q2;

@FunctionalInterface
interface Function<T,R>{
    R apply(T t);
}
public class FunctionEx {
    public static void main(String[] args) {
        //apply function will take a param of type T and return Type R
        Function<String,Integer> strLength = str -> str.length();
        String name = "Satyam Jha";
        System.out.println(strLength.apply(name));
    }
}
