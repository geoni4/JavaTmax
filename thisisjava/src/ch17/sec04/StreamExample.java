package ch17.sec04;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	static int sum=0;
	public static void main(String[] args) throws Exception {
		//배열로부터
		String[] strArray = {"홍길동", "신용권", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(t -> System.out.println(t));
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(value -> System.out.println(value));
		
		IntStream iStream = IntStream.rangeClosed(1,  100);
		iStream.forEach( value -> sum += value);
		System.out.println(sum);
		
		//파일 입출력
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		
		stream.forEach(t -> System.out.println(t));
		stream.close();	//c와 비슷하게 파일을 읽었으면 stream을 닫아줘야한다. (AutoClosable이기 때문에 안 닫아줘도 됨)
		
		
	}
}
