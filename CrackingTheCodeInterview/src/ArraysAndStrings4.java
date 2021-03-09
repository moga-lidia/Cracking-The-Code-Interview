
public class ArraysAndStrings4 {
	private String str="";
    public ArraysAndStrings4(String str) {
		this.str = str;
    }

    //Varianta 1
    public boolean isPermutationOfPalindrome(String str) {
    	int odd=0;
		int even=0;
    	int[] s=new int[128];
    	for(int i=0;i<str.length();i++)
    		s[str.charAt(i)]++;
    	for(int i=0;i<s.length;i++) {
    		if(s[i]%2==0)
    			even++;
    		else {
    			odd++;
    			if(odd>1)
    				return false;
    		}
    	}
    	return true;
    }
//    
//    //Varianta 2
//    public boolean isPermutationOfPalindrome1(String str) {
//    	int mask=0;
//    	int bit=0;
//    	for(char c:str.toCharArray()) {
//    		mask <<= Character.getNumericValue(c);
//    		if((bit&mask)==0)
//    			bit |= mask;
//    		else
//    			bit &= ~mask;
//    	}
//    	return ((bit&(bit-1))==0);
//    }
}


