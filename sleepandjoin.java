import java.io.*;
import java.util.*;
class SleepJoinDemo extends Thread{
	public void run(){
		try{
			System.out.println(getName()+"running");
			Thread.sleep(1000);
			System.out.println(getName()+"finishedSleeping");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class Demo{
		public static void main(String[] args)throws InterruptedException{
			SleepJoinDemo t1=new SleepJoinDemo();
			SleepJoinDemo t2=new SleepJoinDemo();
			t1.start();
			t1.join();
			t2.start();
		}
}