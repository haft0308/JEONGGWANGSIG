import java.util.Scanner;

public class numCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, count =0;
		while (true)
		{

			System.out.println("1~10������ ���ڸ� �Է��ϼ���: ");
			num = sc.nextInt();
			if (num == 0)
			{
				break;

			}
			count += 1;
			//System.out.println("�Է� ����: "+num+", "+count+"�� �Է��߽��ϴ�.");
		}
		System.out.println(count+"�� �Է��߽��ϴ�. �����մϴ�.");		
	}

}