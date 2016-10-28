import java.util.Arrays;

import java.lang.Number;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Liked_Tester {

	public static void main(String[] args) throws Exception{

		LinkedBag<String> b1 = new LinkedBag<String>();
		LinkedBag<String> b2 = new LinkedBag<String>();
		LinkedBag<String> b3 = new LinkedBag<String>();
		LinkedBag<Integer> b4 = new LinkedBag<Integer>();
		LinkedBag<Integer> b5 = new LinkedBag<Integer>();
		ArrayBag<Integer> b6 = new ArrayBag<Integer>();
		ArrayBag<Integer> b7 = new ArrayBag<Integer>();

		b6.add(1);
		b6.add(2);
		b6.add(3);
		b6.add(4);
		
		b7.add(1);
		b7.add(2);
		b7.add(3);
		b7.add(4);
		
		
		b4.add(1);
		b4.add(2);
		b4.add(3);
		b4.add(4);
		
		b5.add(1);
		b5.add(2);
		b5.add(3);
		b5.add(4);
		
		b1.add("hello");
		b1.add("hello");
		b1.add("yellow");
		b1.add("green");
		b1.add("green");
		
		b2.add("glow");
		b2.add("hair");
		b2.add("hair");
		b2.add("green");
		
		b3.add("hello");
		b3.add("hello");
		b3.add("yellow");
		b3.add("green");
		b3.add("green");
		
		System.out.println("Bag 4 " + Arrays.toString(b4.toArray()));
		System.out.println("Bag 5 " + Arrays.toString(b5.toArray()));
		System.out.println("--------- The equal method prints true -----------");
		System.out.println(b4.equals(b5));
		
		
		System.out.println("--------- The entries in b1 -----------");
		System.out.println(Arrays.toString(b1.toArray()));
		
		
		System.out.println("-----------The isEmpty method prints false -------------");
		System.out.println(b1.isEmpty());
		
		
		System.out.println("------------The getCurrentSize method prints 5 -----------------");
		System.out.println(b1.getCurrentSize());
		
		
		System.out.println("------------The getFrequencyOf method prints 2 -----------------");
		System.out.println(b1.getFrequencyOf("hello"));
		
		
		System.out.println("------------The contains method prints false -----------------");
		System.out.println(b1.contains("you" ));
		
		System.out.println("------------The clear method it prints null -----------------");
		b1.clear();
		System.out.println(b1);
		
		System.out.println("------------The remove method it prints greeen -----------------");
		System.out.println(b2.remove());
		
		System.out.println("-----------The add method it prints true -----------------");
		System.out.println(b2.add("woow"));
		
		System.out.println("------------The contains method it prints true -----------------");
		System.out.println(b2.contains("hair"));
		
		
		System.out.println("------------The replace method Replaces hair with yooow -----------------");
		System.out.println(b2.replace("hair","yooow"));
		
		System.out.println(Arrays.toString(b2.toArray()));
		
		
		System.out.println(Arrays.toString(b3.toArray()));
		
		System.out.println("------------The removeEvery method Removes all the greens -----------------");
		
		System.out.println(b3.removeEvery("green"));
		
		System.out.println(Arrays.toString(b3.toArray()));
		
		
		OrderedList o1= new OrderedList();
		o1.add("HI");
		o1.add("Nikaylah");
		o1.add("mo");
		
		System.out.println("Add method " + Arrays.toString(o1.toArray()));
				
		

	}

}




