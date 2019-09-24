interface Animal{
	int ID=1;
	void breathe();
	void run();
}
interface AAnimal extends Animal{
	void llll();
}
class Dog implements AAnimal{
    public void breathe(){
		System.out.println("狗在呼吸");
    }
    public void run(){
		System.out.println("狗在奔");
    }
    public void llll(){
		System.out.println("成功继承接口");
     }
}
public class Example12{
    public static void main (String[] args){
      Dog dog=new Dog();
	  dog.breathe();
	  dog.run();
	  dog.llll();
    }     
}