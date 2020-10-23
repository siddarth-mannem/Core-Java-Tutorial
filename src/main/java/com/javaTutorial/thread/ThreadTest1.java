package com.javaTutorial.thread;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@FunctionalInterface
interface MyMainThread {
	
	public void exec(int n);
}

class MyThread1 implements Runnable {

	private List<Integer> numbers;
	private Thread t1;
	public MyThread1(int n) {
		System.out.println("In MyThread1() - " + n);
		numbers = IntStream.range(1, n).boxed().collect(Collectors.toList());
		this.t1 = new Thread(this, "MyThread-1");
		this.t1.start();

	}

	public void run() {
		System.out.println("In MyThread1, run()");
		getNumbers().forEach(n -> {
			System.out.println("MyThread1 - " + n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * @return the numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}
}

class MyThread2 implements Runnable {

	private List<Integer> numbers;
	private Thread t2;
	public MyThread2(int n) {
		System.out.println("In MyThread2() - " + n);
		numbers = IntStream.range(1, n).boxed().collect(Collectors.toList());
		this.t2 = new Thread(this, "MyThread2");
		this.t2.start();

	}

	public void run() {
		System.out.println("In MyThread2, run()");
		getNumbers().forEach(n -> {
			System.out.println("MyThread2 - " + n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * @return the numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}

}

public class ThreadTest1 {

	public static void main(String[] args) throws InterruptedException {

		
		MyMainThread m1 = MyThread1::new;
		m1.exec(7);
		Thread.sleep(2000);
		MyMainThread m2 = MyThread2::new;
		m2.exec(7);
		
		
//		Runnable r1 = () -> {
//
//			IntStream.range(1, 6).forEach(num -> {
//				System.out.println("r1 - " + num);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			});
//		};
//
//		Runnable r2 = () -> {
//
//			IntStream.range(1, 6).forEach(num -> {
//				System.out.println("r2 - " + num);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			});
//		};
		
		//Runnable r1 = new MyThread1(5);
		//Thread.sleep(10);
		//Runnable r2 = new MyThread2(5);

		//Thread t1 = new Thread(r1, "Thread-1");
		//Thread t2 = new Thread(r2, "Thread-2");

//		System.out.println(t1.getName());
//		t1.start();
//		System.out.println(t2.getName());
//		Thread.sleep(10);
//		t2.start();

		System.out.println("END of main class");

	}

}
