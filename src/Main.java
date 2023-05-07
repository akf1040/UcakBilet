import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double mesafe;
    int yas;
    int yolculukTipi;
    double normalTutar;
    double toplamTutar;
    double yasIndirimi;
    double gidisDonusBiletIndirimi;



        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen gideceğiniz mesafeyi giriniz ");
        mesafe= scanner.nextDouble();

        System.out.println("Lütfen yasınızı giriniz ");
        yas= scanner.nextInt();

        System.out.println("1- tekyön\n2-gidiş dönüş\n ");
        System.out.println("Seçiminiz");
        yolculukTipi= scanner.nextInt();

        normalTutar=mesafe*0.10;
        if(yolculukTipi==1){
            if(yas<12){
                yasIndirimi=normalTutar*0.50;
            }else if(yas>=12 && yas<=24){
                yasIndirimi=normalTutar*0.10;
            }else if(yas>=65){
                yasIndirimi=normalTutar*0.30;
            }else{
                System.out.println(normalTutar);
            }
        }

        if(yolculukTipi==2){
            gidisDonusBiletIndirimi=normalTutar*0.20;
             toplamTutar = normalTutar - gidisDonusBiletIndirimi;
            if(yas<12){
              yasIndirimi=gidisDonusBiletIndirimi*0.50;
              toplamTutar=normalTutar-yasIndirimi;
              System.out.println(toplamTutar);
            }else if(yas>=12 && yas<=24){
                yasIndirimi=gidisDonusBiletIndirimi*0.10;
                toplamTutar=normalTutar-yasIndirimi;
                System.out.println(toplamTutar);
            }else if(yas>=65){
                yasIndirimi=gidisDonusBiletIndirimi*0.30;
                toplamTutar=normalTutar-yasIndirimi;
                System.out.println(toplamTutar);
            }else{
                System.out.println(toplamTutar);
            }
        }
    }
}