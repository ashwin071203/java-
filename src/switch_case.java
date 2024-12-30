public class switch_case {
    public static void main(String[] args) {
        char sex = 'm';
        switch (sex){
            case 'm':
                System.out.println("Eligible");
                break;
            case 'f':
                System.out.println("not eligible");
                break;
            case 'o':
                System.out.println("not eligible");
                break;
            default:
                System.out.println("error");

        }
    }
}
