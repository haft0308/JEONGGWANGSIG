
public class maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] {15, 8, 26};
		int max = num[0], min = num[0];
		
		for (int i =0; i<3; i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		for (int i =0; i<3; i++)
		{
			if (num[i] < min)
			{
				min = num[i];
			}
		}
		System.out.println("큰값: "+max);
		System.out.println("작은값: "+min);
	}

}