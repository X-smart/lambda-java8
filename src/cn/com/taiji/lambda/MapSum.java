package cn.com.taiji.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import cn.com.taiji.bean.Car;
import cn.com.taiji.bean.Person;

public class MapSum {
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
		int mapSum = mapSum(plist,Person::getSalary);
//		int mapSum = mapSum(plist,p->p.getSalary());
		System.out.println(mapSum);
		
		Car c1=new Car(20200.0,"red","max");
		Car c2=new Car(20100.0,"black","min");
		Car c3=new Car(20040.0,"yellow","mid");
		Car c4=new Car(20005.0,"blue","small");
		List<Car> clist=new ArrayList<Car>();
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		clist.add(c4);
		int mapSumCar = mapSum(clist,Car::getPrice);
		System.out.println(mapSumCar);
}

	public static <T> int mapSum(List<T> entries, Function<T, Double> f) {

		int sum = 0;
		for (T entry : entries) {
			sum += f.apply(entry);
		}
		return sum;
	}
}
