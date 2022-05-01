import java.awt.*;
import java.awt.event.*;

public class Sampleb7 extends Frame implements Runnable     // 1. 프레임 클래스를 상속받습니다.
{
	static int num=5;
	
	public static void main(String[] args)    
	{
		System.out.println("main1에서 num1: " + num);
        Sampleb7 sm = new Sampleb7();    // 2. 상속한 클래스에서 객체를 만듭니다.
		System.out.println("main2에서 num1: " + num);
	}
	
	public Sampleb7()
	{
		super("샘플");                 // 3. 윈도우의 제목을 설정합니다.
		System.out.println("생성자에서 num2-1: " + num);
		addWindowListener(new SampleWindowListener());
		
		Thread th;
		th = new Thread(this);    // 새로운 스레드 시작
		th.start();

		setSize(300, 250);           // 4. 윈도우의 크기를 설정합니다.
		System.out.println("생성자에서 num2-2: " + num);
		setVisible(true);            // 5. 윈도우가 표시되도록 만듭니다.
		System.out.println("생성자에서 num2-3: " + num);
	}
	
	public void run()    // 스레드의 처리
	{
				System.out.println("run에서 num3: " + num);
		try{
			for (int i=0; i<10; i++){
				num = i;
				System.out.println("run에서 num3-1: " + num);
				repaint();         // 그림 그리기
				Thread.sleep(1000);    // 1초마다 실행
			}
		}catch(InterruptedException e) {}
	}
	
	public void paint(Graphics g)     // 이미지 2. Window 클래스의 paint() 메소드를 오버라이드. 이 메소드의 호출 위치: setVisible, repaint
	{
		System.out.println("paint에서 num4: " + num);
		g.setColor(Color.red);
		g.setFont(new Font("DialogInput", Font.BOLD, 36));
		//g.fillOval(x, y, 10, 10);        // 도형을 그리는 작업을 수행.
		//g.drawImage(im, 100, 100, this);     // 이미지 3. 그림을 그리는 작업을 수행합니다.
		String str = num + "입니다.";
		g.drawString(str, 100, 100);    // 문자 그릭기
	}
	
	class SampleWindowListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)     // 윈도우를 닫을 수 있도록 만듭니다.
		{
			//System.out.println("종료됩니다.");
			System.exit(0);
		}
	}
}
