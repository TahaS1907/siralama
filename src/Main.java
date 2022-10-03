import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        a= scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        b= scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz:");
        c= scanner.nextInt();
        if(a<b && a<c && b<c){
            System.out.println("c>b>a");
        }else if(a<b && a<c && b>c){
            System.out.println("b>c>a");
        } else if (a>b && b>c) {
            System.out.println("a>b>c");
        } else if (a>c && c>b) {
            System.out.println("a>c>b");
        } else if (c>a && a>b) {
            System.out.println("c>a>b");
        } else if (b>a && a>b) {
            System.out.println("b>a>c");
        }

    }
}