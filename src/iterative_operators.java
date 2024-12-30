public class iterative_operators {
    public static void main(String[] args) {
        int n = 5;//for
        int fact = 1;
        for (int i = 2; i <= n; i++){
            fact = fact*i;
    }
        System.out.println("Factorial using for loop is "+fact);
        int a = 6;
        int fact2 = 1;
        int j =1;
        while(j <=a){
          fact2= fact2*j;
          j++;
        }
        System.out.println("the factorial using while loop is "+fact2);
        int b = 7;
        int fact3 = 1;
        int k = 1;
        do{
            fact3=fact3*k;
            k++;
        }while(k<= b);
        System.out.println("the factorial using do while loop is "+fact3);

    }
}
