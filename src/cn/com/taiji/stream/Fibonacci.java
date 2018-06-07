package cn.com.taiji.stream;

import java.util.List;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		

		//Stream.generate(new MySupplier()).limit(10).forEach(System.out::println);
		Stream.iterate(new int[]{0, 1,2}, t -> new int[]{t[1], t[0] + t[1], t[0] + t[1]+t[2]})
        .limit(10)
        .map(t -> t[1])
        .forEach(System.out::println);
		Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0]+ t[1]})
        .limit(10).forEach(t -> System.out.print(t[1]+ " "));
	}
	

}
