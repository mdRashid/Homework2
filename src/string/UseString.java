package string;

public class UseString {

	public static void main(String[] args) {
		
		String st = "I am learning java";
		
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st.charAt(3));
		System.out.println(st.indexOf('a'));
		System.out.println(st.lastIndexOf('n'));
		
		System.out.println(st.indexOf(st));
		System.out.println(st.lastIndexOf('l'));
		System.out.println(st.codePointAt(7));
		System.out.println(st.codePointBefore(7));
		System.out.println(st.codePointCount(5, 8));
		
		
		String st2 = "I am also learning java";
		
		System.out.println(st.intern());
		System.out.println(st.concat(" " + st));
		System.out.println(st.compareTo(st2));
		System.out.println(st.compareToIgnoreCase(st2));
		System.out.println(st.hashCode());
		
		System.out.println(st.replace('j', 'J'));
		System.out.println(st.replaceFirst(st, st2));
		System.out.println(st.substring(1));
		System.out.println(st.matches(st2));
		System.out.println(st.contains(st));
		
		System.out.println(st.isEmpty());
		System.out.println(st.contentEquals(st));
		System.out.println(st.equalsIgnoreCase(st2));
		System.out.println(st.indexOf('a', 3));
		System.out.println(st.toString());
		
		System.out.println(st.split(st2));
		System.out.println(st.contentEquals(st));
		System.out.println(st.lastIndexOf(st));
		System.out.println(st.getBytes());
		System.out.println(st.replace(st, st2));
		

	}

}
