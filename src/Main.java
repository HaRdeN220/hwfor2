import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int nakoplenia=0;
int i=0;
while (nakoplenia<2459000){
    nakoplenia=nakoplenia+15000;
    i=i+1;
    System.out.println("Месяц " + i + ", сумма накоплений равна " + nakoplenia + "рублей");
}
//hw1
        int k =1;
while (k <= 10){
    System.out.print(k + " ");
    k=k+1;
}
        System.out.println();
for (k=1;k<=10;k++){
    System.out.print(k + " ");
}
        System.out.println();
//hw2
        int nacelenie = 12000000;
        for (i=1;i<=10;i++){
nacelenie=(nacelenie + ((nacelenie/1000)*(17-8)));
            System.out.println("Год "+ i + ", численность населения составялет " + nacelenie);
        }
        //hw3
        double vklad=15000;
        int l=0;
        while (vklad < 12000000){
            vklad = vklad * 1.07;
            l=l+1;
            System.out.println("Месяц " + l + " накопительный счет = " + vklad);
        }
        //hw4
        vklad=15000;
        l=0;
        while (vklad < 12000000){
            vklad = vklad * 1.07;
            l=l+1;
            if (l % 6 == 0 ){
            System.out.println("Месяц " + l + " накопительный счет = " + vklad);
        }
        }
        //hw5
        vklad=15000;
        l=0;
        while (l < (9*12)){
            vklad = vklad * 1.07;
            l=l+1;
            if (l % 6 == 0 ){
                System.out.println("Месяц " + l + " накопительный счет = " + vklad);
            }
        }
        //hw6
        int q= 2;
        do {
            System.out.println("Сегодня пятница, " + q +"-е число. Необходимо подготовить отчет");
            q=q+7;
        }
        while (q<=31);
        // hw 7
        int today = 2025;
        for (int start=0;start<2200;start=start+79){
            if ((today - start <= 200) & (today-start >=0)){
                System.out.println(start);
            }
            else if (today - start < 0){
                System.out.println(start);
                break;
            }
        }
        //hw8
    }
}