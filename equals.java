
public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="ȫ�浿";
		if (name.equals("ȫ�浿"))
		{
			System.out.println("�̸��� ȫ�浿�� �´��.");
		}
		else
		{
			System.out.println("�̸��� ȫ�浿�� �ƴϷ���.");
		}
		System.out.println("------");
		
		// ���ڿ� �˻� �Ǵ�
		String[] arr = {"aaa", "bbb", "ccc", "ddd", "eee"};
		boolean flag = false;
		String str = "ccc";
		int i;
		
		for (i = 0; i < arr.length; i++)
		{
			if (arr[i].equals(str))
			{
				System.out.println((i+1) + "��° ���: " + arr[i]);
				flag = true;
			}
		}
		if (flag == false)
		{
			System.out.println("�˻����� ����.");
		}
	}

}
