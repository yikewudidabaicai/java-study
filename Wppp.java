public class Wppp {
      public static void main(String[] args){
         Me wo1=Me.getInstance();
         Me wo2=Me.getInstance();
         wo1.name="�Ŵ��";        //����wo1���ݣ�
         wo1.age=20;
         wo1.sex=1;
        PP.duibi(wo1.name, wo1.age, wo1.sex, wo2.name, wo2.age, wo2.sex);  //���þ�̬�������wo2������wo1���Ա�
       
         
         wo2.name="������"; //�޸�wo2����
         wo2.age=18;
         wo2.sex=2;
         PP.duibi(wo1.name, wo1.age, wo1.sex, wo2.name, wo2.age, wo2.sex);  //���þ�̬�������wo2������wo1���Ա�
       
      
        
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
class PP{ //����static���쾲̬����

    public static void duibi(String q, int w, int e, String q1, int w1, int e1){
         System.out.println("wo1���֣�"+q); //���wo1����
         System.out.println("wo1���䣺"+w);
         if (e==1){
             System.out.println("wo1�Ա���");
         } else{
             System.out.println("wo1�Ա�Ů");
         }

         System.out.println("wo2���֣�"+q1);  //���wo2������wo1���Ա�
         System.out.println("wo2���䣺"+w1);
         if (e1==1){
             System.out.println("wo2�Ա���");
         } else{
             System.out.println("wo2�Ա�Ů");
         }

}
}