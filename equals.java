import java.util.Scanner;

public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="홍길동";
		if (name.equals("홍길동"))
		{
			System.out.println("이름은 홍길동이 맞대요.");
		}
		else
		{
			System.out.println("이름은 홍길동이 아니래요.");
		}
		System.out.println("------");
		
		// 문자열 검색 판단
		String[] arr = {"aaa", "bbb", "ccc", "ddd", "eee"};
		boolean flag = false;
		String str = "ccc";
		int i;
		
		for (i = 0; i < arr.length; i++)
		{
			if (arr[i].equals(str))
			{
				System.out.println((i+1) + "번째 요소: " + arr[i]);
				flag = true;
			}
		}
		if (flag == false)
		{
			System.out.println("검색값이 없다.");
		}
		
		// 
		Scanner sc = new Scanner(System.in);
		int maxnum = 0;
		int[] num = new int[10];
		for (i=0; i < 10; i++)
		{
			System.out.println("숫자 10개를 입력하데요:");
			num[i] = sc.nextInt();
			if (num[i]> maxnum) { maxnum = num[i]; } 
		}
		//int maxnum = max(num);
		System.out.println("큰 수: "+maxnum);
		
	}

}
