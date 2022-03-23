import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int dansu=0;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("which gugudan will you calculate?");
		//dansu = sc.nextInt();
		//System.out.printf("Gugudan's %d dan: ", dansu);
		//System.out.println();
		System.out.println("Gugudan Horizontal:");
		for (int j= 1; j<=9; j++)
		{	
		for (int i=1; i<=9; i++)
		{
			System.out.printf("%d X %d = %d\t", j, i, (j*i));
			if (i==9) { System.out.println(); }
		}
		//System.out.println("Yes, sir");
		}
		// gugudan, Vertical
		System.out.println();
		System.out.println("Gugudan vertical:");
		for (int j= 1; j<=9; j++)
		{	
		for (int i=1; i<=9; i++)
		{
			//System.out.printf("%d X %d = %d\t", j, i, (j*i));
			System.out.printf("%d X %d = %d\t", i, j, (i*j));
			if (i==9) { System.out.println(); }
		}
		//System.out.println("Yes, sir");
		}
	}

}
