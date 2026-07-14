import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        if(n==0) System.out.print(0);
        else System.out.print(sum(n,0));
    }
    public static int sum(int n,int x){
        if(n==0) return x;
        x+=n;
        return sum(n-1,x);
    }
}