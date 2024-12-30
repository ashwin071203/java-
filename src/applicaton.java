import java.util.Enumeration;

class application{
    String name ;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void values(String str,int num){
        name = str;
        rollno = num;
    }

    public static void main(String[] args) {
        application ashwin = new application();
        ashwin.values("Ashwin" ,32);
        ashwin.display();

        application user = new application();
        user.values("mama", 8);
        user.display();
        }
    }

