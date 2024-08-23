package practice;

import java.io.Console;

public class MultiThread extends Thread {
	public void run() {
		System.out.println("run called");
	}
	public void sleep() {
		System.out.println("sleep called");
	}
	public static void main(String[] args) throws InterruptedException {
		int i=0;
		int[] arr = new int[i];
		System.out.println("length : "+arr.length);
		i=5;
		System.out.println("length : "+arr.length);
	}
}
