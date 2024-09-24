package practice.java_8_features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
public static void main(String[] args) {
	List<String> list = Arrays.asList("gaurav","omkar");
	Optional.ofNullable(list).ifPresent(element->System.out.println(element));
}
}
