public class Example01
{
	public static void main (String[] args){
        MyThread myThread=new MyThread();
		myThread.run();
		while(true){
			System.out.println("main方法正在运行");
		}
	}
}
class MyThread
{         public void run(){
	while(true){
			System.out.println("MyThread类的run方法正在运行");
		}
}
        
}