class OddThread extends Thread{
	public void run(){
		for(int i=1;i<=20;i+=2){
			System.out.println("Odd:"+i);
		}
	}
}