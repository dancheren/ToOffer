package Offer_67;

public class movingCount {
	public static void main(String[] args) {
		movingCount m = new movingCount();
		System.out.println(m.moveCount(3, 3, 3));
	}
	public int moveCount(int threshold, int rows, int cols)
    {
        boolean[] visited = new boolean[rows*cols];
        for(int i=0;i<rows*cols;i++){
            visited[i] = false;
        }
        int count = movingCountCore(threshold,rows,cols,0,0,visited);
        return count;
    }
    
    public int movingCountCore(int threshold, int rows, int cols,int i,int j,boolean[] visited){
        int count = 0;
        if(check(threshold,rows,cols,i,j,visited)){
            visited[i * cols +j] = true;
            count = 1+ movingCountCore(threshold,rows,cols,i-1,j,visited)
                    + movingCountCore(threshold,rows,cols,i+1,j,visited)
                    + movingCountCore(threshold,rows,cols,i,j-1,visited)
                    + movingCountCore(threshold,rows,cols,i,j+1,visited);
        }
        return count;
    }
    
    public boolean check(int threshold, int rows, int cols,int i,int j,boolean[] visited){
        if(i>=0 && i<rows && j >= 0 && j<cols && getDigitSum(i)+getDigitSum(j)<=threshold && !visited[i*cols+j])
            return true;
        return false;
    }
    
    public int getDigitSum(int num){
        int count = 0;
        while(num > 0){
            count += num % 10;
            num /= 10;
        }
        return count;
    }
}
