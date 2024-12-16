import java.util.*;
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
int a = 10;
int b = 5;
Computer cs = new Computer();
Civil eng = new Civil();
cs.add(a,b);
cs.sub(a,b);
eng.multi(a,b);
}
}
