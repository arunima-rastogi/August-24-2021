package java_programs;

public class abc implements Runnable{
	static int a=1;
public static void main(String[] args) {
	abc obj=new abc();
	obj.run();
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("hello");
}
}
