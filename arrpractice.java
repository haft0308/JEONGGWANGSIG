
public class arrpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����/�ѱ۷�
		final int Month =12;
		String[] arrString = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] arrStringKor = new String[Month];
		int i;
		System.out.println("�����:");
		for (i = 0; i<arrString.length; i++)
		{
			System.out.print(arrString[i]+"\t");
		}
		System.out.println();
		
		for (i=0; i<arrString.length; i++)
		{
			arrStringKor[i]= (i+1)+"��";
		}
		System.out.println("�ѱ۷�:");
		for (i=0; i<arrStringKor.length; i++)
		{
			System.out.print(arrStringKor[i]+"\t");
		}
		System.out.println(Month);
		
		// �迭���� ����
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		//int i;
		for (i =0; i <arr2.length; i++)
		{
			System.out.println("�迭 arr1�� �ּ�(������): "+arr1);
			System.out.println("�迭 arr2�� �ּ�(������): "+arr2);
		}
		// �迭 ����
		int[] src = {1, 2, 3, 4, 5};
		int [] dest = new int[3];
		//int i;
		System.arraycopy(src,  1,  dest,  0,  3);;
		
		System.out.println("�����迭:");
		for (i=0; i <src.length; i++)
		{
			System.out.print(src[i]+"\t");
		}
		System.out.println("\n���� �迭");
		for (i = 0; i < dest.length; i++)
		{
			System.out.print(dest[i]+"\t");
		}
	}

}
