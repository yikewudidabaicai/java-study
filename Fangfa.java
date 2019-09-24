interface Bird{
	void shout();
	void food();
	void tx();
}

class Hawk implements Bird{
    public void shout(){
		System.out.println("鹰的叫声是“咯咯哒..”");
    }
     public  void food(){
		System.out.println("鹰的食物是肉");
     }
    public  void tx(){
		System.out.println("鹰的体型很大\n");
     }
}
class Sparrow implements Bird{
     public void shout(){
		System.out.println("麻雀的叫声是“叽叽喳..”");
    }
     public  void food(){
		System.out.println("麻雀的食物是谷子");
     }
    public  void tx(){
		System.out.println("麻雀的体型很小\n");
     }
}
class Cuckoo implements Bird{
     public void shout(){
		System.out.println("杜鹃鸟的叫声是“卟咕咕..”");
    }
     public  void food(){
		System.out.println("杜鹃鸟的食物是虫子");
     }
    public  void tx(){
		System.out.println("杜鹃鸟的体型一般大");
     }
}


public class Fangfa{
    public static void main (String[] args){
      Bird b1=new Hawk();
	  Bird b2=new Sparrow();
	  Bird b3=new Cuckoo();
	  System.out.println("下面是对三种鸟类的简单介绍：\n");
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