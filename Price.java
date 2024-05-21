import java.util.Scanner;
public class Price {
    public static void main(String[] args) {
        double pearPrice=2.14,applePrice=3.67,tomatoPrice=1.11,bananaPrice=0.95,auberginePrice=5,total;
        double pearKg,appleKg,tomatoKg,bananaKg,aubergineKg;
        Scanner input=new Scanner(System.in);
        System.out.println("Hom many kilos of pears? : ");
        pearKg=input.nextDouble();
        System.out.println("How many kilos of apple?: ");
        appleKg=input.nextDouble();
        System.out.println("How many kilos of tomatoes?: ");
        tomatoKg=input.nextDouble();
        System.out.println("How many kilos of bananas?: ");
        bananaKg=input.nextDouble();
        System.out.println("How many kilos of aubergine?: ");
        aubergineKg=input.nextDouble();

      total=pearPrice*pearKg + applePrice*appleKg + tomatoPrice*tomatoKg + bananaPrice*bananaKg +
              auberginePrice*aubergineKg;
        System.out.println("Total Amount: " + total);

    }
}
