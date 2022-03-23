
public class arrpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 월별 엉어/한글로
		final int Month =12;
		String[] arrString = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] arrStringKor = new String[Month];
		int i;
		System.out.println("영어로:");
		for (i = 0; i<arrString.length; i++)
		{
			System.out.print(arrString[i]+"\t");
		}
		System.out.println();
		
		for (i=0; i<arrString.length; i++)
		{
			arrStringKor[i]= (i+1)+"월";
		}
		System.out.println("한글로:");
		for (i=0; i<arrStringKor.length; i++)
		{
			System.out.print(arrStringKor[i]+"\t");
		}
		System.out.println(Month);
		
		// 배열복사 연습
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		//int i;
		for (i =0; i <arr2.length; i++)
		{
			System.out.println("배열 arr1의 주소(참조값): "+arr1);
			System.out.println("배열 arr2의 주소(참조값): "+arr2);
		}
		// 배열 복사
		int[] src = {1, 2, 3, 4, 5};
		int [] dest = new int[3];
		//int i;
		System.arraycopy(src,  1,  dest,  0,  3);;
		
		System.out.println("원본배열:");
		for (i=0; i <src.length; i++)
		{
			System.out.print(src[i]+"\t");
		}
		System.out.println("\n복사 배열");
		for (i = 0; i < dest.length; i++)
		{
			System.out.print(dest[i]+"\t");
		}
	}

}
