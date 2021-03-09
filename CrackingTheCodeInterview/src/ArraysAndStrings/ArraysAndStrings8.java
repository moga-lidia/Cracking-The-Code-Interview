package ArraysAndStrings;

public class ArraysAndStrings8 {
	private int[][] m;
	public ArraysAndStrings8() {}
    public ArraysAndStrings8(int[][] m) {
		this.m = m;
    }
    
    public void delete(int[][] m) {
    	boolean[] row=new boolean[m[0].length];
    	boolean[] column=new boolean[m.length];
    	for(int i=0;i<m[0].length;i++)
    		for(int j=0;j<m.length;j++)
    			if(m[i][j]==0) {
    				row[i]=true;
    				column[j]=true;
    			}
    	for(int i=0;i<row.length;i++)
    		if(row[i]==true)
    			for(int j=i;j<m[0].length;j++)
    				m[i][j]=0;
    	for(int i=0;i<column.length;i++)
    		if(column[i]==true)
    			for(int j=i;j<m.length;j++)
    				m[i][j]=0;
    }
}
