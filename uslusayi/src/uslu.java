import java.util.Scanner;
public class uslu {
    public static void main(String[] args) {
//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
// "For Döngüsü" kullanarak yapınız.
        Scanner sc = new Scanner(System.in);
  int a,b;
  int bir,iki;
  int islem=1;
        System.out.println("sayının kaçıncı üssünü alacaksınız giriniz : ");
     bir = sc.nextInt();
        System.out.println("sayıyı giriniz: ");
     iki= sc.nextInt();
        System.out.println(bir);

       for( a=1; a<= bir ; a++) {
             islem *=iki ;
           System.out.println(islem);
        }

    }

}
