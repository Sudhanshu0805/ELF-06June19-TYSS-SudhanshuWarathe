package com.testyantra.filehandling;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread extends Thread implements Runnable {
	
}

public class TestSonarLint {
	
	private static final Logger LOGGER = Logger.getLogger("TestLogger");

	static int val = 20;
	
	public static void main(String[] args) {
		int val = 10;
		
		System.out.println(val);
		LOGGER.info(Integer.toString(val));
		LOGGER.log(Level.INFO, Integer.toString(val));

	}// End of main()
	
	public void m1() {
		String str = "abc";
		System.out.println(str);
	}
	public void m2() {
		String str = "abc";
		System.out.println(str);
	}
	public void m3() {
		String str = "abc";
		System.out.println(str);
	}

}// End of class: TestSonarLint
