import java.util.Scanner;

public class Main3
{
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];
        for (int i = 0; i < 4; i++) {
            n[i] = sc.nextInt();
        }
        if(n[1]-n[0]<n[2]-n[0]&&n[1]-n[0]<n[3]-n[0]){
            System.out.println(n[1]-n[0]);
        }
        else if(n[2]-n[0]<n[1]-n[0]){
            sum += Math.abs(n[2]-n[0]);
        }
        else{
            sum += Math.abs(n[3]-n[0]);
        }


    }
}