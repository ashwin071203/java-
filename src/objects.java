class objects_java{
    String name ;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        objects_java ashwin = new objects_java();
        ashwin.name="Ashwin";
        ashwin.rollno=14;
        ashwin.display();
    }
}