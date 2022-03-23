
public class arrayfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score;
		score = new int[5];
		for (int i=0; i<5; i++)
		{
			score[i] = i;
		}
		for (int j=0; j<5; j++)
		{
			//System.out.println(j);
		}
		
		byte[] arrbyte;
		arrbyte = new byte[] {1, 2, 3, 4, 5};
		System.out.println(arrbyte[0]);
		System.out.println(arrbyte[1]);
		System.out.println(arrbyte[2]);
		System.out.println(arrbyte[3]);
		System.out.println(arrbyte[4]);
		System.out.println("-------");
		
		//char[] arrchar;
		//arrchar = new char[5];
		char[]arrchar = {'A', 'B', 'C', 'D', 'E'};
		System.out.println(arrchar[0]);
		System.out.println(arrchar[1]);
		System.out.println(arrchar[2]);
		System.out.println(arrchar[3]);
		System.out.println(arrchar[4]);
		System.out.println("-------");
		
		boolean[] arrbool;
		arrbool =new boolean[5];
		arrbool[0] = false;
		arrbool[1] = true;
		arrbool[2] = false;
		arrbool[3] = true;
		arrbool[4] = false;
		System.out.println(arrbool[0]);
		System.out.println(arrbool[1]);
		System.out.println(arrbool[2]);
		System.out.println(arrbool[3]);
		System.out.println(arrbool[4]);
		System.out.println("-------");
		
		short[] arrshort;
		arrshort = new short[5];
		arrshort[0] = 100;
		arrshort[1] = 200;
		arrshort[2] = 300;
		arrshort[3] = 400;
		arrshort[4] = 500;
		System.out.println(arrshort[0]);
		System.out.println(arrshort[1]);
		System.out.println(arrshort[2]);
		System.out.println(arrshort[3]);
		System.out.println(arrshort[4]);
		System.out.println("-------");
		
		long[] arrlong;
		arrlong = new long[] {90, 135, 180, 225, 270};
		System.out.println(arrlong[0]);
		System.out.println(arrlong[1]);
		System.out.println(arrlong[2]);
		System.out.println(arrlong[3]);
		System.out.println(arrlong[4]);
		System.out.println("-------");
		
		float[] arrfloat;
		arrfloat = new float[5];
		arrfloat[0] = 3.14f;
		arrfloat[1] = 6.28f;
		arrfloat[2] = 9.42f;
		arrfloat[3] = 12.56f;
		arrfloat[4] = 15.700001f;
		System.out.println(arrfloat[0]);
		System.out.println(arrfloat[1]);
		System.out.println(arrfloat[2]);
		System.out.println(arrfloat[3]);
		System.out.println(arrfloat[4]);
		System.out.println("-------");
		
		double[] arrdouble;
		arrdouble = new double[] {3.141592d, 3.141593d, 3.141594d, 3.141595d, 3.141596d};
		System.out.println(arrdouble[0]);
		System.out.println(arrdouble[1]);
		System.out.println(arrdouble[2]);
		System.out.println(arrdouble[3]);
		System.out.println(arrdouble[4]);
		System.out.println("-------");
	}

}
