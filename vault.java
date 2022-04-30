import java.util.*;
public class Main{
    static int ans=0;
    static int []ar;
    static int []choosen;
    static int n;
    static int dfs(int cur,int s){
        //complete code here
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        choosen=new int[n];
        
        if(n==1){
            System.out.println(ar[0]);
        }
        else if(n<=7){
            Arrays.sort(ar);
            System.out.println(ar[n-1]+ar[n-2]);
        }
        else{
            dfs(0,0);
            System.out.println(ans);
        }
    }
}
