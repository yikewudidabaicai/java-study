public class Example02
{
	public static void main (String[] args){
        MyThread myThread=new MyThread();
		myThread.start();
		while(true){
			System.out.println("main方法正在运行");
		}
	}
}
class MyThread extends Thread
{         public void run(){
	while(true){
			System.out.println("MyThread类的run方法正在运行");
		}
}
        
}