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
class Factory{
    public static Bird getCarInstance(){
        return new Cuckoo();
    }
}

public class Gongchang{
    public static void main (String[] args){
     Bird c=Factory.getCarInstance();
	 c.shout();
	 c.food();
	 c.tx();
    } 

}