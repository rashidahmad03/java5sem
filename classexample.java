class employee
{

String name;
int salary;
String cname;
void input(String n,int s, String c)
{
name=n;
salary=s;
cname=c;

}
void show(){
System.out.println(name+" "+salary+"  "+cname);

}
}
class Classexample{
public static void main(String s[]){
employee e1=new employee();
employee e2=new employee();
e1.name="ram";
e1.salary=121000;
e1.cname="incapp";
e2.input("tina","32100,"incapp");
System;out.println(e1.name+"  "+e1.salary+"  "+e1.cname);
e2.show();
}
}