package com.workers;

public class WorkerMain {

	public static void main(String[] args) {
		DailyWorker daily=new DailyWorker("Ashu",75,45);
		SalariedWorker salaired=new SalariedWorker("Anni",100,40);
		daily.compay();
		salaired.compay();
	}
}
