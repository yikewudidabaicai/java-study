import java.util.Scanner;
public class Students{
	public static void main(String[] args){
	String[] a=new String[100];
		int c,d,e,l,i=1;
		while(true){
		    System.out.println("1 增加一个学生信息");
		    System.out.println("2 删除一个学生信息");
		    System.out.println("3 修改一个学生信息");
		    System.out.println("4 查找一个学生信息");
		    System.out.println("5 退出");
		    System.out.println("请选择：");
			Scanner input=new Scanner(System.in);
		    int b=input.nextInt();
		    if(b==1){
		    	System.out.println("请输入信息：");
		    	Students t=new Students();
		    	t.zeng(a,i);
		    	System.out.println("输入成功学生信息为："+a[i]);
		    	i++;
		    	System.out.println("请选择接下来的操作\n\n\n\n\n");
		    }
		    if(b==2){
		    	Students t=new Students();
		    	t.shan(a);
		    	System.out.println("请选择接下来的操作\n\n\n\n\n");
		    }
		    if(b==3){
		       	Students t=new Students();
		    	t.gai(a);
		    	System.out.println("请选择接下来的操作\n\n\n\n\n");
		    	
		    }
		    if(b==4){
		    	Students t=new Students();
		    	t.cha(a);
		    }
		    if(b==5){
		    	break;
		    }
		    
		}	
	}
public void zeng(String[] a,int i){
		Scanner in=new Scanner(System.in);
	    String s=in.nextLine();
	    a[i]=s;
	 	System.out.println();
	}
public void shan(String[] a){
	System.out.println("请输入要删除信息的学生序号：");
	Scanner in=new Scanner(System.in);
    int i=in.nextInt();
   StringBuffer sb=new StringBuffer(a[i]);
    System.out.println("此学生信息为："+a[i]);
    System.out.println("请选择要删除的信息：");
	System.out.println("1，指定范围删除");
	System.out.println("2，指定位置删除");
	System.out.println("3，全部删除");
    int b=in.nextInt();
    if(b==1) {
    	System.out.println("请输入要删除的范围");
    	int c=in.nextInt();
    	int d=in.nextInt();
    	sb.delete(c, d);
    	System.out.println("删除成功"+sb);
    }
    if(b==2) {
    	System.out.println("请输入要删除的位置");
    	int e=in.nextInt();
    	sb.deleteCharAt(e);
    	System.out.println("删除成功"+sb);
    }
    if(b==3) {
    	sb.delete(0, sb.length());
    	System.out.println("删除成功"+sb);
    }
}

public void gai(String[] a){
	System.out.println("请输入要修改信息的学生序号：");
	Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    StringBuffer sb=new StringBuffer(a[i]);
    System.out.println("此学生信息为："+a[i]);
    System.out.println("请选择要修改的信息：");
	System.out.println("1，指定位置修改");
	System.out.println("2，指定范围修改");
	int b=in.nextInt();
	 if(b==1) {
	    	System.out.println("请输入要修改的位置");
	    	int c=in.nextInt();
	    	System.out.println("请输入要修改的内容");
	    	String s = in.next();
	    	char d = s.charAt(0);
	    	sb.setCharAt(c,d);
	    	System.out.println("修改成功"+sb);
	    }
	    if(b==2) {
	    	System.out.println("请输入要修改的范围");
	    	int e=in.nextInt();
	    	int f=in.nextInt();
	    	System.out.println("请输入要修改的内容");
	    	String str=in.nextLine();
	    	sb.replace(e, f, str);
	    	System.out.println("修改成功"+sb);
	    }
	
}
public void cha(String[] a){
	System.out.println("请输入要查找信息的学生序号：");
	Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    System.out.println("该学生信息为"+a[i]);
}

}
