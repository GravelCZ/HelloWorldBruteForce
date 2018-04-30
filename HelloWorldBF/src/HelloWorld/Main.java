package HelloWorld;

import java.util.Random;

public class Main {
	
	public static char[] targetArray = new String("Hello, World.").toCharArray();
	public static char[]   charArray = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz.,/*-+?<>_/() ").toCharArray();
	public static char[] currentArray = new char[targetArray.length];
	
	public void brurteForce() {
		Random r = new Random();
		int i = 0;
		while (i < targetArray.length) {
			currentArray[i] = charArray[r.nextInt(charArray.length)];
			
			System.out.println(new String(currentArray));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (currentArray[i] == targetArray[i]) {
				i++;
			}
		}
	}
	
	public static void main(String[] a) {
		new Main().brurteForce();
	}
}
