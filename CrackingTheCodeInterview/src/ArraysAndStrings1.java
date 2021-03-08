
public class ArraysAndStrings1 {
    private String str="";
    public ArraysAndStrings1(String str) {
		this.str = str;
    }

    //Varianta 1
    public boolean isUnique(String s) {
        boolean[] str=new boolean[128];
        for(int i=0;i<s.length();i++) {
        	int c=s.charAt(i);
            if(str[c])
            	return false;
            str[c]=true;
        }
        return true;
    }
    
    //Varianta 2
    public boolean isUnique1(String s) {
    	int a=0;
    	for(int i=0;i<s.length();i++) {
    		int check=s.charAt(i)-'a';
    		if((a&(1<<check))>0)
    			return false;
    		a |= 1<<check;
    	}
    	return true;
    }
}