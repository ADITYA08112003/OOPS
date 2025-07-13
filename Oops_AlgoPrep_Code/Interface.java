package Oops_AlgoPrep;

import java.util.Arrays;

interface Q{
	void fun1();
	void fun2(int a);
}
class Studen implements Q{
	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("This is Fun1()");	
	}
	@Override
	public void fun2(int a) {
		// TODO Auto-generated method stub
		System.out.println("This is Fun2()");
	}
	
}
class stud implements Comparable<stud>{
	int a;
	int b;
	stud(int v1,int v2){
		a=v1;
		b=v2;
	}
	@Override
	public int compareTo(stud o) {
		// TODO Auto-generated method stub
//		for asceding order
		return this.a-o.a;
//		for descending order
//		return o.a-this.a;
	}
}

public class Interface {
	public static void main(String[] args) {
		Studen s=new Studen();
		s.fun1();
		s.fun2(1);
		
		stud[] arr=new stud[4];
		arr[0]=new stud(29,2);
		arr[1]=new stud(23,4);
		arr[2]=new stud(49,5);
		arr[3]=new stud(34,6);
		Arrays.sort(arr);
		System.out.println(arr[0].a+" "+arr[1].a+" "+arr[2].a+" "+arr[3].a);
		
	}
}
