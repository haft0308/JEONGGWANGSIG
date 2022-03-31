
public class ArrayRevolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("12. 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램.");
		System.out.println("12. 원래의 배열.");
		// 배열을 90도 회전하기 위한 함수 제작
		// fNum = 원 배열의 행 크기, sNum = 원 배열의 열 크기
		
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		int fNum = star.length;
		int sNum = star[0].length;
		//System.out.println("인덱스: "+fNum+" "+sNum);
		
		for (int i =0; i<fNum; i++)
		{
			for (int j=0; j<sNum; j++)
			{
				System.out.print(star[i][j]+" ");      // 원래 배열 프린트
				//System.out.print(i+","+j+" : ");       // 원 배열의 인덱스
				//System.out.println(star[0][4]);
			}
			System.out.println();
		}
		//System.out.println("--원래 다음 90도---");
		
		char[][] sun90 = new char[sNum][fNum];    // 90도 회전할 배열명: sun90
		for (int i=0; i<sNum; i++)
		{
			for (int j=(fNum-1); j>=0; j--)
			{
				sun90[i][3-j] = star[j][i];
				//System.out.print(i+","+(3-j)+" : ");  // 90회전 배열 인덱스
				//System.out.print(j+","+i+" : ");      // 90회전용 원 배열 인덱스
			}
			//System.out.println();
		}
		System.out.println("");   // 구분용
		System.out.println("12. 90도 회전한 배열.");
		for (int i=0; i<sNum; i++)
		{
			for (int j=0; j<fNum; j++)
			{
				System.out.print(sun90[i][j]);
			}
			System.out.println();
		}
	}

}
