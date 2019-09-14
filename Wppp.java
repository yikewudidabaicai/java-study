public class Wppp {
      public static void main(String[] args){
         Me wo1=Me.getInstance();
         Me wo2=Me.getInstance();
         wo1.name="张大彪";        //输入wo1数据；
         wo1.age=20;
         wo1.sex=1;
        PP.duibi(wo1.name, wo1.age, wo1.sex, wo2.name, wo2.age, wo2.sex);  //采用静态方法输出wo2数据与wo1作对比
       
         
         wo2.name="刘苗条"; //修改wo2数据
         wo2.age=18;
         wo2.sex=2;
         PP.duibi(wo1.name, wo1.age, wo1.sex, wo2.name, wo2.age, wo2.sex);  //采用静态方法输出wo2数据与wo1作对比
       
      
        
}
}

class Me{
    String name;
    int age,sex; 
    private static Me INSTANCE=new Me();
    private Me(){}
    public static Me getInstance(){
        return INSTANCE;
    }
}
class PP{ //利用static构造静态方法

    public static void duibi(String q, int w, int e, String q1, int w1, int e1){
         System.out.println("wo1名字："+q); //输出wo1数据
         System.out.println("wo1年龄："+w);
         if (e==1){
             System.out.println("wo1性别：男");
         } else{
             System.out.println("wo1性别：女");
         }

         System.out.println("wo2名字："+q1);  //输出wo2数据与wo1作对比
         System.out.println("wo2年龄："+w1);
         if (e1==1){
             System.out.println("wo2性别：男");
         } else{
             System.out.println("wo2性别：女");
         }

}
}