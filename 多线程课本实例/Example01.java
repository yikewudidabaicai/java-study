public class Example01
{
	public static void main (String[] args){
        MyThread myThread=new MyThread();
		myThread.run();
		while(true){
			System.out.println("main������������");
		}
	}
}
class MyThread
{         public void run(){
	while(true){
			System.out.println("MyThread���run������������");
		}
}
        
}