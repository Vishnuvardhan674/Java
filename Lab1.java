class Hello{
byte b1;
int a;
short s;
long b;
boolean b2;
float f;
double d;
String str;
Hello h;
void show(){
System.out.println(b1);
System.out.println(b2);
System.out.println(b);
System.out.println(s);
System.out.println(a);
System.out.println(f);
System.out.println(d);
System.out.println(str);
System.out.println(h);
}
}
class Lab1{
public static void main(String args[]){
Hello h = new Hello();
h.show();
}
}