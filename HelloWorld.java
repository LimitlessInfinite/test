package Practice.Base;

public class HelloWorld implements HelloWorldInterface{

    private String hello = "Hello, it's my second commit";
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Override
    public void Hello(String user) {
        System.out.println("World hold on! Hello " + user);
    }

    public String getHello() {
        return hello;
    }
}
