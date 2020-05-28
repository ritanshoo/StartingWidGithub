interface J{}
interface Interface1 extends J{
int a=111;
public int b=222;

//private int c=333;
//protected int d=444;
//int e;

void m1();

//void m2(){}
/static abstract void m3();
//private abstract void m4();
//protected abstract void m5();
//final abstract void m6();
//static{}
//{}
//I(){}
//Interface1 obj = Interface1 I();
}
class A{
public static void main(String [] s){
System.out.println("interface updated");
Interface1 obj;
}
}