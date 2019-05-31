import java.util.*;
public class Fibo{
public static void main(String[] args){
int n1=0,n2=1,i,t=0;
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n>0){
t=n1+n2;
n1=n2;
n2=t;
if(t==n)
{
System.out.println("true");
break;
}else if(t>n){
System.out.println("false");
break;
}
}
}
}
