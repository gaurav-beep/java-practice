package practice.java_8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0; // Lambda expression
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false
        List<String> list = new ArrayList<String>();
        list.add("gaurav");
        list.add("shailesh");
        Consumer<String> consumer = name -> System.out.println(name);
        list.forEach(consumer);
        Function<String,Integer> func = name -> name.length();
        System.out.println(func.apply("Gaurav"));
        Supplier<String> sup = () -> "Gaurav";
        System.out.println(sup.get());
        
    }
}
