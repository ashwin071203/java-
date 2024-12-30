public class methods {
    public static void main(String[] args) {
         add(1,2);
        System.out.println(multiply(5,2));
    }
    public static void add(int a,int b){//void parametric method
        int c=a+b;
        System.out.println(c);
    }
    public static int multiply(int c ,int d){//non void parametric method
        int multiply = c*d;
        return multiply;
    }
}
