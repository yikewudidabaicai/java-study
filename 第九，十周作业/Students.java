import java.util.Scanner;
public class Students{
	public static void main(String[] args){
	String[] a=new String[100];
		int c,d,e,l,i=1;
		while(true){
		    System.out.println("1 ����һ��ѧ����Ϣ");
		    System.out.println("2 ɾ��һ��ѧ����Ϣ");
		    System.out.println("3 �޸�һ��ѧ����Ϣ");
		    System.out.println("4 ����һ��ѧ����Ϣ");
		    System.out.println("5 �˳�");
		    System.out.println("��ѡ��");
			Scanner input=new Scanner(System.in);
		    int b=input.nextInt();
		    if(b==1){
		    	System.out.println("��������Ϣ��");
		    	Students t=new Students();
		    	t.zeng(a,i);
		    	System.out.println("����ɹ�ѧ����ϢΪ��"+a[i]);
		    	i++;
		    	System.out.println("��ѡ��������Ĳ���\n\n\n\n\n");
		    }
		    if(b==2){
		    	Students t=new Students();
		    	t.shan(a);
		    	System.out.println("��ѡ��������Ĳ���\n\n\n\n\n");
		    }
		    if(b==3){
		       	Students t=new Students();
		    	t.gai(a);
		    	System.out.println("��ѡ��������Ĳ���\n\n\n\n\n");
		    	
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
	System.out.println("������Ҫɾ����Ϣ��ѧ����ţ�");
	Scanner in=new Scanner(System.in);
    int i=in.nextInt();
   StringBuffer sb=new StringBuffer(a[i]);
    System.out.println("��ѧ����ϢΪ��"+a[i]);
    System.out.println("��ѡ��Ҫɾ������Ϣ��");
	System.out.println("1��ָ����Χɾ��");
	System.out.println("2��ָ��λ��ɾ��");
	System.out.println("3��ȫ��ɾ��");
    int b=in.nextInt();
    if(b==1) {
    	System.out.println("������Ҫɾ���ķ�Χ");
    	int c=in.nextInt();
    	int d=in.nextInt();
    	sb.delete(c, d);
    	System.out.println("ɾ���ɹ�"+sb);
    }
    if(b==2) {
    	System.out.println("������Ҫɾ����λ��");
    	int e=in.nextInt();
    	sb.deleteCharAt(e);
    	System.out.println("ɾ���ɹ�"+sb);
    }
    if(b==3) {
    	sb.delete(0, sb.length());
    	System.out.println("ɾ���ɹ�"+sb);
    }
}

public void gai(String[] a){
	System.out.println("������Ҫ�޸���Ϣ��ѧ����ţ�");
	Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    StringBuffer sb=new StringBuffer(a[i]);
    System.out.println("��ѧ����ϢΪ��"+a[i]);
    System.out.println("��ѡ��Ҫ�޸ĵ���Ϣ��");
	System.out.println("1��ָ��λ���޸�");
	System.out.println("2��ָ����Χ�޸�");
	int b=in.nextInt();
	 if(b==1) {
	    	System.out.println("������Ҫ�޸ĵ�λ��");
	    	int c=in.nextInt();
	    	System.out.println("������Ҫ�޸ĵ�����");
	    	String s = in.next();
	    	char d = s.charAt(0);
	    	sb.setCharAt(c,d);
	    	System.out.println("�޸ĳɹ�"+sb);
	    }
	    if(b==2) {
	    	System.out.println("������Ҫ�޸ĵķ�Χ");
	    	int e=in.nextInt();
	    	int f=in.nextInt();
	    	System.out.println("������Ҫ�޸ĵ�����");
	    	String str=in.nextLine();
	    	sb.replace(e, f, str);
	    	System.out.println("�޸ĳɹ�"+sb);
	    }
	
}
public void cha(String[] a){
	System.out.println("������Ҫ������Ϣ��ѧ����ţ�");
	Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    System.out.println("��ѧ����ϢΪ"+a[i]);
}

}
