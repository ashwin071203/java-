public class recursion_function {
    public static void main(String[] args) {
        descending(10);

    }
    public static void descending(int n){
        if(n==1) {
            System.out.println(1);
        }
            else{
                System.out.println(n);
                descending(n-1);
            }
    }
}
