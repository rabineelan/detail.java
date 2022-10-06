public class salary{
int sasisalary(int m,int x){
return m+x;
}
double manisalary(double y, double x)
{
return y+x;
}

public static void main(String[]args){
salary money=new salary();
System.out.println(money.sasisalary(3,7));
System.out.println(money.manisalary(3.6,7.5));
}
}

