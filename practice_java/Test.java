
public class Test{
    public static void main(String[] args){
        int sum = 0;
        for (int a = 1; a <= 5; a++){
            int sumb = 1;
            for(int b = a; b > 0; b--){
                sumb *= b;
            }
            sum += sumb;
        }
        System.out.println("sum = " + sum);
    }
}