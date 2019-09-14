<<<<<<< HEAD
class Single
{
	private static Single INSTANCE=new Single();
	private Single(){}
	public static Single getInstance(){
	return INSTANCE;
	}
}
class Text
{
	public static void main(String[] args){
           Single s1=Single.getInstance();
		   Single s2=Single.getInstance();
		   System.out.println(s1==s2);
	
	}
=======
class Single
{
	private static Single INSTANCE=new Single();
	private Single(){}
	public static Single getInstance(){
	return INSTANCE;
	}
}
class Text
{
	public static void main(String[] args){
           Single s1=Single.getInstance();
		   Single s2=Single.getInstance();
		   System.out.println(s1==s2);
	
	}
>>>>>>> 85ac21718a14f002bcbb1138d88ac695bc3d820b
}