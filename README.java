import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
    
     int n,k,i;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    k=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++){
        a[i]=s.nextInt();
        
    }
    for(i=k;i<n;i++){
        System.out.println(a[i]+" ");
    }
    for(i=0;i<k;i++){
        System.out.println(a[i]+" ");
    }
    
     }
}
