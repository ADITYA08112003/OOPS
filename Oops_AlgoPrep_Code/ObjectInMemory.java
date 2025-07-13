package Oops_AlgoPrep;

class P{
	int x;
	int y;
	P(int v1,int v2){
		x=v1;
		y=v2;
	}
}
public class ObjectInMemory {
	
	public static void main(String[] args) {
		int x=10;
		int y=200;
		System.out.println(x+" "+y);
//		Pass by Value
		swap(x,y);
		System.out.println(x+" "+y);
		
		P a1=new P(100,200);
		System.out.println(a1.x+" "+a1.y);
		Swap1(a1);
		System.out.println(a1.x+" "+a1.y);
		
		
		
	}

	private static void Swap1(P a1) {
		// TODO Auto-generated method stub
		int temp=a1.x;
		a1.x=a1.y;
		a1.y=temp;
		
	}

	private static void swap(int x, int y) {
		// TODO Auto-generated method stub
		int temp=x;
		x=y;
		y=temp;
		
	}
}
