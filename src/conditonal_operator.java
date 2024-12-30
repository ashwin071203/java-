public class conditonal_operator {
    public static void main(String[] args) {
        int total =60;
        char attendance = 'o';
        if(attendance == 'A'){
            System.out.println("Present");
        }
        else if(attendance =='o'){
            if(total > 50){
                System.out.println("On duty");
            }
        }
        else{
            System.out.println("Absent");
        }
    }
}
