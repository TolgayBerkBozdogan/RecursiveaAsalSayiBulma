import java.util.Scanner;

public class RecursiveaAsalSayiBulma {

    static void isasal() {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Sayiyi giriniz: ");
        number = input.nextInt();
        int i = number-1, a=0;
        while (i>=2){
            if(number%i==0){
                a=0;
            }else{
                a=1;
            }
            i--;

        }if(a==0){
            System.out.println(number +" sayisi asal bir sayi degildir.");
        }else{
            System.out.println(number +" sayisi asal bir sayidir.");
        }


    }


    public static void main(String[] args) {
        isasal();
    }
}
