package basic;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		Calculator c=new Calculator();
		System.out.println(c.add(20, 10));
		System.out.println(c.subtract(20, 10));
		System.out.println(c.multiply(20, 10));
		System.out.println(c.divide(20, 10));
		
		NumberUtil nu=new NumberUtil();
		System.out.println(nu.isPositive(2));
		System.out.println(nu.isEven(2));
		System.out.println(nu.isPrime(6));
		
		List<String> students=new ArrayList<>();
		
		students.add("Ravi");
		students.add("Ramesh");
		students.add("Bob");
		students.add("Alice");students.add("Raj");students.add("Anil");students.add("Vinod");students.add("Adam");students.add("Eve");
		System.out.println(students);
		System.out.println(students.size());
		System.out.println(students.contains("Ravi"));
		students.remove("Ravi");
		System.out.println(students);
		System.out.println(students.stream().collect(Collectors.groupingBy(name->name.charAt(0))));
		
		
		List<Integer> numbers=new ArrayList<>();
		numbers.add(20);numbers.add(30);numbers.add(40);numbers.add(50);numbers.add(60);numbers.add(70);numbers.add(80);
		System.out.println(numbers);
		List<Integer>res=numbers.stream().filter(n->n%2==0).toList();
		System.out.println(res);
		System.out.println(numbers.stream().map(n->n*2).toList());
		
		List<Integer> numList=List.of(25,15,15,2,4,35,2,20,30,35,40,20,30,10,45,50);
		System.out.println(numList.stream().sorted().toList());
		System.out.println(numList.stream().distinct().toList());
		System.out.println(numList.stream().limit(3).toList());
		System.out.println(numList.stream().skip(3).toList());
		System.out.println(numList.stream().filter(n->n%2==0).map(n->n*2).toList());
		System.out.println(numList.stream().count());
		System.out.println(numList.stream().findFirst());
		System.out.println(numList.stream().anyMatch(n->n>30));
		System.out.println(numList.stream().allMatch(n->n>5));
		System.out.println(numList.stream().noneMatch(n->n<0));
		System.out.println(numList.stream().min(Integer::compareTo));
		System.out.println(numList.stream().max(Integer::compareTo));
		System.out.println(numList.stream().reduce(0, Integer::sum));
		System.out.println(numList.stream().reduce(1, (a,b)->a*b));
		
		System.out.println(numList.stream().collect(Collectors.partitioningBy(n->n%2==0)));
		System.out.println(numList.stream().mapToInt(n->n).sum());
		
		
		//forEach(n->{System.out.println(n);});
		System.out.println(numbers.size());
		System.out.println(numbers.contains(50));
		numbers.remove(Integer.valueOf(50));
		System.out.println(numbers);
		System.out.println(numbers.get(2));
		System.out.println(numbers.set(3, 100));
		System.out.println(numbers);
		
		for(String  i: students){
			System.out.println(i);			
		}
		
		
		Map<Integer,String> st=new HashMap<>();
		st.put(101, "Bob");st.put(20, "Bob");st.put(103, "Alice");st.put(104, "John");st.put(50, "Scott");
		System.out.println(st);System.out.println(st.get(103));
		System.out.println(st.containsKey(102));System.out.println(st.containsValue("Bob"));
		st.put(104, "Robert");st.remove(101);System.out.println(st);
		for(Map.Entry<Integer, String> entry: st.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		st.forEach((k,v)->{System.out.println(k+":"+v);});

		students.forEach((name)->{System.out.println(name);});
		
		System.out.println(students.stream().collect(Collectors.toMap(name->name,name->name.length())));
		System.out.println(students.stream().collect(Collectors.groupingBy(name->name.charAt(0),Collectors.counting())));
		System.out.println(students.stream().collect(Collectors.groupingBy(name->name.charAt(0),Collectors.
				maxBy(Comparator.comparingInt(String::length)))));
		System.out.println(students.stream().collect(Collectors.joining(",")));
		
		
		List<List<Integer>> lst=List.of(List.of(1, 2,3),List.of(4,5,6),List.of(7,8,9));
		
		System.out.println(lst.stream().flatMap(list->list.stream()).toList());
		List<List<String>> ls=List.of(  List.of("Ravi", "Raj"),
			    List.of("Alice", "Anil"),
			    List.of("Bob"));
		System.out.println(ls.stream().flatMap(list->list.stream()).toList());
		
		
		
	
		
	}

}
