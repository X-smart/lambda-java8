package cn.com.taiji.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		IntStream.of(5,10);
		Stream.of("1","3","5").mapToInt(Integer::parseInt).forEach(System.out::println);
		IntStream.builder().add(1).add(2).add(3).build();
		IntStream.concat(IntStream.builder().add(1).build(), IntStream.builder().add(1).build());
		IntStream emptyStream =IntStream.empty();
		IntStream.generate(() ->1).limit(30);
		
		List<Integer> collect = IntStream.iterate(0, n -> n+3).limit(3).boxed().collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = IntStream.range(30, 50).boxed().collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = IntStream.rangeClosed(30, 50).boxed().collect(Collectors.toList());
		System.out.println(collect3);
	}
}
