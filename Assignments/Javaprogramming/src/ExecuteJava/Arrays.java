package ExecuteJava;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a[][]= new int [2][2];
		
		a[0][0] = 100;
		
		a[0][1] = 200;
		
		a[1][0] = 300;
		
		a[1][1] = 300;
		
		for (int[] row :a) {
			{
				for (int value : row)
				{
					System.out.print(value+ " ");
				}
				System.out.println();
			}
		}
		
		
		//System.out.println(Arrays.deepToString(a));
		

	}

}
