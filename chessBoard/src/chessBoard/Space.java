package chessBoard;

public class Space {
	static int X=10;
	static int Y=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char [][]a=new char[X+1][Y+1];                    //��X+1,Y+1��λ�ð�һ��һ�пճ����������
      for(int i=1;i<=X;i++) 
      {
    	  for(int j=1;j<=Y;j++)
    	  {
    		  a[i][j]='*';
    	  }
      }
      
      
      //�������
	for(int i=1;i<=X;i++) 
    {
  	  for(int j=1;j<=Y;j++)
  	  {
  		System.out.print(a[i][j]);
  	  }
  	    System.out.println();
    }
}

}