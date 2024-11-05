/**
 * Recursion
 */
public class Recursion {

    public int fibLoop(int n){
        int[] spots = new int[n+1];
        spots[0] = 0;
        spots[1] = 1;
        for(int i = 2; i <= n; i++){
            spots[i] = spots[i-1] + spots[i-2];
        }
        return spots[n];
    }

    public int fibRec(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibRec(n-1) + fibRec(n-2);
        }
    }

    public int triangle(int num){
        if(num == 1){
            return 1;
        }else{
            return num + triangle(num - 1);
        }
    }


    public static void main(String[] args) {
        Recursion test = new Recursion();
        System.out.println(test.fibRec(44));
    }
}