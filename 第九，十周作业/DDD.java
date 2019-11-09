import java.util.Random;
class Storag{
	private int[] cells=new int[1000];
	private int inPos,outPos,pp=0;
	private int a;
	public synchronized void put(int num) {
		try {
			while(a==cells.length) {
				this.wait();
			}
			cells[inPos]=num;
			pp++;
			System.out.println("用户"+cells[inPos]+"已登录,当前在线人数"+pp);
			inPos++;
			if(inPos==cells.length)
				inPos=0;
			a++;
			
			this.notify();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public synchronized void get() {
		try {
			while(a==0) {
				this.wait();
			}
			int data=cells[outPos];
			pp--;
			System.out.println("用户"+data+"已注销,当前在线人数"+pp);
			cells[outPos]=0;
			outPos++;
			if(outPos==cells.length)
				outPos=0;
			a--;
			this.notify();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
class Input implements Runnable{
	private Storag st;
	private int num;
	Input(Storag st){
		this.st=st;
	}
	Random r=new Random();

    public void run() {
    	while(true) {
    		Random r=new Random();
    		if(r.nextInt(10)>5) {
    			try{
    				Thread.sleep(2000);
    			}catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
    		num=r.nextInt(1000);
    		st.put(num);
    	}
    }
}

class Output implements Runnable  {
	private Storag st;
	Output(Storag st){
		this.st=st;
	}
    public void run() {
    	while(true) {
    		Random r=new Random();
    		if(r.nextInt(10)>5) {
    			try{
    				Thread.sleep(2000);
    			}catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    			
    		}
    		st.get();
    	}
    }
}
public class DDD{
	public static void main(String[] args) {
		Storag st = new Storag();

		Input input=new Input (st);
		Output output=new Output(st);
		new Thread(input).start();
		new Thread(output).start();
	}
}
