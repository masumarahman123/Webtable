package Practice.Practice;

public class child implements inpp{

//The type child must implement the inherited abstract method inpp.m2()
	
	
	public void c() {
		System.out.println("I am childmethod");
	};
	
	
	
	public void m() {
		System.out.println("I am child");
	};
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		child c=new child();
		c.m();
		c.m2();
		c.c();

		inpp cc=new child();
		cc.m();
		cc.m2();
		
		//child c2=(child)new inpp();
		
	}









	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
