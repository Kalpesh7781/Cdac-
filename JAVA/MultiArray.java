package javatut;

public class MultiArray {
public static void main(String[] args) {
	
	//declaring 2d array
	int arr[][]=new int[4][5];

	//initializing 2d array
	int k=0;
	for(int i=0;i<4;i++)
	{
		
		for(int j=0;j<5;j++)
		{
			
			arr[i][j]=k;
			k++;
		}
	}
	
	
	//display 2d array
	for(int i=0;i<4;i++)
	{
		
		for(int j=0;j<5;j++)
		{
		System.out.print( arr[i][j]+" ");	 
		}
		System.out.println();
	}

}
}
