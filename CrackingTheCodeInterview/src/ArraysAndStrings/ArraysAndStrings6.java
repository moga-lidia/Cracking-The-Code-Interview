package ArraysAndStrings;

public class ArraysAndStrings6 {
	private String str="";
    public ArraysAndStrings6(String str) {
		this.str = str;
    }
    
    public String compress(String str) {
    	StringBuilder s=new StringBuilder();
    	int consecutive=0;
    	for(int i=0;i<str.length();i++) {
    		consecutive++;
    		if((str.charAt(i)!=str.charAt(i+1)) || (i+1>=str.length())) {
    			s.append(str.charAt(i));
    			s.append(consecutive);
    			consecutive=0;
    		}
    	}
    	return str.length() > s.length() ? s.toString():str;
    }
}
