import java.util.Scanner;
public class Test0 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Hey buddy how old are you ?");
int age = sc.nextInt();
sc.close();
System.out.println("Woha! You have really grown up! you are "+age+" years old");
}
}