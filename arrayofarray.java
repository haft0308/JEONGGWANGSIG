
public class arrayofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student1 = new int[3];
		int[] student2= new int[3];
		int[][] student = new int[2][3];
		int i, j;
		
		// arr1 배열 출력
		int[][] arr1 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		//System.out.println(arr1);
		for (i =0; i<2; i++)
		{
			for (j=0; j<3; j++)
			{
				System.out.print("arr1[" + i + "][" + j + "]=" + arr1[i][j] + "\t");
			}
		}
		System.out.println();
		System.out.println("----------------");

		int[][] arr =new int[2][3];
		for (i=0; i<2 ; i++)
		{
			for (j=0; j<3; j++)
			{
				arr[i][j] = i*3 + j + 1;
			}
		}
		for (i =0; i<2; i++)
		{
			for (j=0; j<3; j++)
			{
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "\t");
			}
		}
		System.out.println();

		// 배열의 배열 실험
		int A[][] = {{10, 20, 30}, {40, 50, 60}};
		System.out.println("배열의 배열: ");
		for (i =0; i<A.length; i++)
		{
			for(j=0; j<A[i].length; j++)
			{
				System.out.print(A[i][j]+"\t");
			}
		}
		System.out.println();
	}

}
