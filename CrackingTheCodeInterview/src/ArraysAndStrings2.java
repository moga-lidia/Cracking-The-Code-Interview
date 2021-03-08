
public class ArraysAndStrings2 {
	private String s1,s2;

	public ArraysAndStrings2() {}
	
	public ArraysAndStrings2(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	//Varianta 1
	public String sort(String s) {
		char[] c= s.toCharArray();
		java.util.Arrays.sort(c);
		return new String(c);
	}
	public boolean permutation(String s1, String s2) {
		if(sort(s1).equals(sort(s2)))
			return true;
		return false;
	}
	
	//Varianta 2
	public boolean permutation1(String s1, String s2) {
		if(s1.length()!=s2.length()) 
			return false;
		int[] nr=new int[128];
		char[] c=s1.toCharArray();
		
		for(char i:c) {
			nr[i]++;
		}
		for(int i=0;i<s2.length();i++) {
			char p=s2.charAt(i);
			nr[p]--;			//la elemntul acela din s1 scadem
			if(nr[p]<0)			//daca e mai mic ca 0, inseamna ca a fost in s2 de mai multe ori ca in s1
				return false;
		}
		return true;
	}
}
