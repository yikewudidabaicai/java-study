interface Bird{
	void shout();
	void food();
	void tx();
}

class Hawk implements Bird{
    public void shout(){
		System.out.println("ӥ�Ľ����ǡ�������..��");
    }
     public  void food(){
		System.out.println("ӥ��ʳ������");
     }
    public  void tx(){
		System.out.println("ӥ�����ͺܴ�\n");
     }
}
class Sparrow implements Bird{
     public void shout(){
		System.out.println("��ȸ�Ľ����ǡ�ߴߴ��..��");
    }
     public  void food(){
		System.out.println("��ȸ��ʳ���ǹ���");
     }
    public  void tx(){
		System.out.println("��ȸ�����ͺ�С\n");
     }
}
class Cuckoo implements Bird{
     public void shout(){
		System.out.println("�ž���Ľ����ǡ�߲����..��");
    }
     public  void food(){
		System.out.println("�ž����ʳ���ǳ���");
     }
    public  void tx(){
		System.out.println("�ž��������һ���");
     }
}


public class Fangfa{
    public static void main (String[] args){
      Bird b1=new Hawk();
	  Bird b2=new Sparrow();
	  Bird b3=new Cuckoo();
	  System.out.println("�����Ƕ���������ļ򵥽��ܣ�\n");
	  introduce(b1);
	  introduce(b2);
	  introduce(b3);
      
    } 
	public static void introduce(Bird b){
		b.shout();
	    b.food();
	    b.tx();
      }
}