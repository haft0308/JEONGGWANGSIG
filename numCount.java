import java.util.Scanner;

public class numCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, count =0;
		while (true)
		{

			System.out.println("1~10까지의 숫자를 입력하세요: ");
			num = sc.nextInt();
			if (num == 0)
			{
				break;

			}
			count += 1;
			//System.out.println("입력 숫자: "+num+", "+count+"번 입력했습니다.");
		}
		System.out.println(count+"번 입력했습니다. 종료합니다.");		
	}

}