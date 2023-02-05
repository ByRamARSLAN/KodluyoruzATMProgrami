import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        int balance = 1500, right = 3, select;

        Scanner input = new Scanner(System.in);

        while(right > 0){
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            if(userName.equals("ByThon") && password.equals("PatikaDev")){
                System.out.println("Hoşgeldiniz");

                do{
                    System.out.print("1-Para Yatırma \n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n"  +
                            "4-Çıkış\n");
                    System.out.print("Yapmak istediğiniz işlemi seciniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            int plus = input.nextInt();
                            balance += plus;
                            System.out.println("Yeni bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int minus = input.nextInt();
                            if(minus > balance){
                                System.out.println("Bakiye yetersiz!");
                            }else{
                                balance -= minus;
                                System.out.println("Yeni bakiyeniz : " + balance);
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar bekleriz.");
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız :");
                            break;
                    }
                }while(select!=4);
                System.out.println("Tekrar görümek dileğiyle, iyi günler dileriz.");
                break;
            }else{
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
                System.out.println("Kalan hakkınız : " + --right);
            }
        }
    }
}