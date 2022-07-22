package CoreBasic;

public class StringDemo {
	public static void main(String[] args) {
		char c[]= {'r','i','d','d','i','s','h'};
		System.out.println(c);
		String name1="Pranav";
		String name2="PRANAV";
		System.out.println(name1);
		System.out.println(name1.charAt(4));
		System.out.println(name1.compareTo(name2));//0
		System.out.println(name1.compareToIgnoreCase(name2));
		System.out.println(name1.concat(name2));
		System.out.println(name1);
		System.out.println(name1.equals(name2));//true false
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.length());
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		System.out.println(name1);
		String name3 ="		hello riddish 			";
		System.out.println(name3);
		System.out.println(name3.trim());
	}
}
