package Practice.Base;

import java.util.Scanner;

public class HelloWorldService {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getHello());
        String username = new Scanner(System.in).nextLine();
        helloWorld.Hello(username);
    }

}
