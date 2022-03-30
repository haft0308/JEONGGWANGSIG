
public class baro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("11. 배열 answer에 담긴 데이터를 읽고 숫자의 개수를 세어서 개수만큼 '*'를 찍어내는 프로그램");
		int[][] answer = {
				{5, 5, 5, 5, 5},
				{10, 10, 10},
				{20, 20, 20, 20},
				{30, 30}
		};
		
		for (int i =0; i<answer.length; i++)
		{
			for (int j =0; j<answer[i].length; j++)
			{
				System.out.print("*");				
			}
		System.out.println();
		}
		System.out.println();
		

		System.out.println("12. 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램.");
		System.out.println("12. 원래의 배열.");
		
		char[][] star = {
				{'*', ' ', ' ', ' ', '0'},
				{'*', '*', ' ', ' ', '0'},
				{'*', '*', '*', ' ', '0'},
				{'*', '*', '*', '*', '0'}
		};
		char[][] sun90 = new char[5][4];
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<5; j++)
			{
				sun90[j][i] = star[i][j];
				System.out.print(star[i][j]);   // 원래 배열 프린트
			}
			System.out.println();
		}
		System.out.println("");   // 구분용
		System.out.println("12. 90도 회전한 배열.");
		for (int i=0; i<5; i++)
		{
			for (int j =0; j<4; j++)
			{
				System.out.print(sun90[i][j]);
			}
			System.out.println();
		}
	}

}
