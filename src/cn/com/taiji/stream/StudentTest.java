package cn.com.taiji.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import cn.com.taiji.bean.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> slist = new ArrayList<Student>();
		StudentTest.sudentBean(slist);

		Map<Integer, Long> result1 = slist.stream()
				.collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()));
		System.out.println(result1);
		Map<Integer, List<Student>> result2 = slist.stream()
				.collect(Collectors.groupingBy(Student::getGrade, Collectors.toList()));
		System.out.println(result2);

	}

	public static List<Student> sudentBean(List<Student> slist) {
		int[] arr = { 100, 95, 90, 85, 80, 75, 70, 60 };
		for (int i = 1; i < 51; i++) {
			Student s = new Student(i, "学号为:" + i, arr[(int) (Math.random() * arr.length)]);
//			System.out.println(s);
			slist.add(s);
		}
		return slist;
	}
}
