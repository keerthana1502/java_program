import java.util.*;
class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int[n];
    int i;
    int s = 0;
    for(i=0;i<n;i++){
      a[i] = sc.nextInt();
      s+=a[i];
    }   
    int [][] dp = new int[n+1][s+1];
    for(i=0;i<n+1;i++)
      dp[i][0] = 1;
    for(i=1;i<s+1;i++)
      dp[0][i] = 0;
    for(i=1;i<n+1;i++){
      for(j=1;j<s+1;j++){
        dp[i][j] = dp[i-1][j];
        dp[i][j] = dp[i][j] | dp[i-1][j-a[i-1]];
      }
    }
    
    int ans = s;
    for(i=sum/2 ; i>=0 ; --i)
        if(dp[n][i])
        {
            ans = sum - i;
            break;
        }
    System.out.println(ans);
  }
}
