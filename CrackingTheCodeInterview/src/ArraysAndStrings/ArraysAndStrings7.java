package ArraysAndStrings;

public class ArraysAndStrings7 {
	private int[][] m;
	public ArraysAndStrings7() {}
    public ArraysAndStrings7(int[][] m) {
		this.m = m;
    }
    
    public void rotate(int[][] m) {
    	if(m.length==0 || m[0].length!=m.length) return;
    	int n=m.length;
    	for(int i=0;i<n/2;i++) {
    		int layer=i;
    		int last=n-1-layer;
    		for( int j=i;j<last;j++) {
    			int offset=j-i;
    			int a=m[i][j];
    			//right->bottom
    			m[last][last-offset]=m[i][last];
    			//bottom->left
    			m[last-offset][i]=m[last][last-offset];
    			//left->top
    			m[i][offset]=m[last-offset][i];
    			//top->right
    			m[i][last]=a;
    		}
    	}
    }
}
