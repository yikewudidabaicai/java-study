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
		System.out.println("���ں���");
    }
    public void run(){
		System.out.println("���ڱ�");
    }
    public void llll(){
		System.out.println("�ɹ��̳нӿ�");
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