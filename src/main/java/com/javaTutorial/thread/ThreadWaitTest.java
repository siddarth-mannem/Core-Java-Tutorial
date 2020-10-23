package com.javaTutorial.thread;


class Balance {

	private int amount = 0;
	boolean amountSet = false;

	public synchronized void addAmount(int amount) {

		while(!amountSet) {
			System.out.println("ADD : " + amount);
			this.amount = amount;
			amountSet = true;
			notify();
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized int getAmount() {

		while(amountSet) {
			System.out.println("GET : " + this.amount);
			amountSet = false;
			notify();
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.amount;
	}

}

class Sender implements Runnable {

	private Balance balance;
	private Thread t1;

	public Sender(Balance balance) {
		System.out.println("In Sender() Const");
		this.balance = balance;
		this.t1 = new Thread(this, "Sender");
		this.t1.start();

	}

	public void run() {
		System.out.println("In Sender, run()");
		int i = 0;
		while(i<10) {
			getBalance().addAmount(i++);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public Balance getBalance() {
		return this.balance;
	}
}

class Receiver implements Runnable {

	private Balance balance;
	private Thread t2;

	public Receiver(Balance balance) {
		System.out.println("In Receiver() Cons ");
		this.balance = balance;
		this.t2 = new Thread(this, "Receiver");
		this.t2.start();

	}

	public void run() {
		System.out.println("In Receiver, run()");
		while(true) {
			getBalance().getAmount();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public Balance getBalance() {
		return this.balance;
	}
}

public class ThreadWaitTest {

	public static void main(String[] args) throws InterruptedException {

		Balance b = new Balance();
		new Sender(b);
		new Receiver(b);
		Thread.currentThread().join();
		System.out.println("END of main class");

	}

}
