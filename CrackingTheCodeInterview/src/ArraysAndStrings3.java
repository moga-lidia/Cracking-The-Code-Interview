
public class ArraysAndStrings3 {
	private String str="";
    public ArraysAndStrings3(String str) {
		this.str = str;
    }
    
    public String replace(String s1, int l) {
    	char[] s=s1.toCharArray();
    	int spaceCounter=0;
    	for(int i=0;i<s.length;i++)
    		if(s[i]==' ')
    			spaceCounter++;
    	int index=spaceCounter*2+l;
    	 if(l<s.length)
             s[l]='\0';
    	for(int i=l-1;i>=0;i--) {
    		if(s[i]!=' ') {
    			index--;
    			s[index-1]=s[i];
    		}
    		else {
    			s[index-1]='0';
    			s[index-2]='2';
    			s[index-3]='%';
    			index -= 3;
    		}
    	}
    	return s.toString();
    }

}
