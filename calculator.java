import java.util.Scanner;
class Biotech{
void add(int a ,int b)
{
System.out.println("sum:"+(a+b));
}
}
class Computer extends Biotech
{
void sub(int a,int b)
{
System.out.println("sub:"+(a-b));
}
}
class Civil extends Biotech
{
void multi(int a,int b)
{
System.out.println("multi:"+(a*b));
}
}
class calculator{
public static void main (String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("enter numm1:");
int a = scan.nextInt();
System.out.println("enter nummm2:");
int b = scan.nextInt();
Computer cs = new Computer();
Civil eng = new Civil();
cs.add(a,b);
cs.sub(a,b);
eng.multi(a,b);
}
}
