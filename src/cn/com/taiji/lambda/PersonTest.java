package cn.com.taiji.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import cn.com.taiji.bean.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1=new Person(1,"Bingo",2000.0);
		Person p2=new Person(2,"xiaoming",100.0);
		Person p3=new Person(3,"zahngsan",10080.0);
		Person p4=new Person(10,"Bingo2",10000.0);
		List<Person> plist=new ArrayList<Person>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		List<Person> findMatchPerson = findMatchPerson(plist,p->p.getId()==10);
		System.out.println(findMatchPerson);
		List<Person> findMatchPerson1 = findMatchPerson(plist,p->p.getName().equals("Bingo"));
		System.out.println(findMatchPerson1);
		List<Person> findMatchPerson2 = findMatchPerson(plist,p->p.getSalary()>10000.0);
		System.out.println(findMatchPerson2);
	}
	
	public static List<Person> findMatchPerson(List<Person> people,Predicate<Person> func) {
		
		List<Person> plist1=new ArrayList<Person>();
		for (Person person : people) {
			boolean test = func.test(person);
			if(test) plist1.add(person);
		}
	 
		return plist1;
	}
}
