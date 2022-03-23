
public class arrinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1에서 100까지의 정수를 기억하고 그 합을 구하는 프로그램
		int[] arri;
		int i, sum = 0;
		arri = new int[100];
		for (i=1; i<=100; i++)
		{
			arri[i-1] = i;
			sum += arri[i-1];			
		}
		System.out.println(sum);
		
		// 배열 a에 들어있는 2, 10, 8, 5, 3, 9의 값을의 합을 구하라.
		int[] a = {2, 10, 8, 5, 3, 9};
		sum =0;
		for (i=0; i<6; i++)
		{
			sum += a[i];
		}
		System.out.print("배열 a의 합산 : ");
		System.out.println(sum);
		
		char[] ch = {'a', 'p', 'p', 'I', 'e'};
		for (i =0; i < ch.length; i++)
		{
			System.out.print(ch[i]+" ");
		}
		System.out.println();
	}

}
