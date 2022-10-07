package ch17.ex.exam08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", "개발자"),
			new Member("김나리", "디자이너"),
			new Member("신용권", "개발자")
		);
		
		Map<String, List<Member>> groupingMap = list.stream()
													.collect(Collectors.groupingBy(m -> m.getJob()));
		
		System.out.println("[개발자]");
		List<Member> developerList = groupingMap.get("개발자");
		developerList.stream().forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("[디자이너]");
		List<Member> designerList = groupingMap.get("디자이너");
		designerList.stream().forEach(s -> System.out.println(s));
	}
}


class Member {
	private String name;
	private String job;
	
	public Member(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return "{name: " + name + ", job: " + job + "}";
	}
}