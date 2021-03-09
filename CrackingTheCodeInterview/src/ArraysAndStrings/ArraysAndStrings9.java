package ArraysAndStrings;

public class ArraysAndStrings9 {
	private String s1,s2;

	public ArraysAndStrings9() {}
	
	public ArraysAndStrings9(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public boolean rotate(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		return isSubstring(s1+s1,s2);
	}
}
