import java.util.Scanner;


public class Main {

    //Patika.dev egitim kampi proje odevidir.


    /*Palindrom Sayı Nedir ?

     Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
     Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

     */




    static boolean isPolindrom(int sayi){

        int temp = sayi, tersSayi = 0, sonSayi;

        while(temp !=0){
            sonSayi = temp % 10;
            tersSayi = (tersSayi * 10 )+ sonSayi;
            temp/=10;
        }

        if(sayi==tersSayi){
            return true;
        }else{
            return false;
        }


    }


    public static void main(String[] args) {

        int sayi;

        Scanner inp = new Scanner(System.in);

        System.out.println("Polindrom oldugunu kontrol etmek istediginiz sayiyi giriniz = ");

        sayi = inp.nextInt();

        System.out.println(isPolindrom(sayi));

    }
}
