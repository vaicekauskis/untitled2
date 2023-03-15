import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
////        Įvedami skaičiai -a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int) (naudokite Math.random()
////     funkcija nuo 1 iki 10). Parašykite Java programą, kuri nustatytų, ar galima sudaryti
////        trikampį ir atsakymą atspausdintų.
//
//
//        int num41 = 1 + (int) (Math.random() * 10);
//        int num42 = 1 + (int) (Math.random() * 10);
//        int num43 = 1 + (int) (Math.random() * 10);
//
//        System.out.println("num41:" + num41 + " num42:" + num42 + " num43:" +num43);
//        // a+b>c  a+c>b  b+c>a
//        if (num41 + num42 > num43 && num41 +num43 > num42 && num42 + num43 > num41) {
//            System.out.println("ok");
//        }else{
//            System.out.println("Nesigauna");
//        }












//        Sukurkite keturis kintamuosius ir Math.random() funkcija sugeneruokite jiems
//        reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų.
//        (sprendimui masyvo nenaudoti).



//        int zeros = 0;
//        int ones = 0;
//        int tews = 0;
//
//
//        int num51 = (int) (Math.random() * 2);
//        int num52 = (int) (Math.random() * 2);
//        int num53 = (int) (Math.random() * 2);
//        int num54 = (int) (Math.random() * 2);
//        System.out.println("num51:" + num51 + " num52:" + num52 + " num53:" + num53 + " num54:" + num54);
//        System.out.println(num51);
//        System.out.println(num52);
//        System.out.println(num53);
//        System.out.println(num54);
//        System.out.println("----------------");
//
//        if(num51 == 0){zeros++;}
//        if(num52 == 0){zeros++;}
//        if(num53 == 0){zeros++;}
//        if(num54 == 0){zeros++;}
//        if(num51 == 1){ones++;}
//        if(num52 == 1){ones++;}
//        if(num53 == 1){ones++;}
//        if(num54 == 1){ones++;}
//        if(num51 == 2){tews++;}
//        if(num52 == 2){tews++;}
//        if(num53 == 2){tews++;}
//        if(num54 == 2){tews++;}
//
//        System.out.println("Nuliu yra: " + zeros);
//        System.out.println("Vieneteu yra: " + ones);
//        System.out.println("dvejetu yra; " + tews);



//        Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
//        Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.


//         int max = 10;
//         int min = -10;
//
//        int num61 = min + (int) Math.round(Math.random() * (max - min));
//        int num62 = min + (int) Math.round(Math.random() * (max - min));
//        int num63 = min + (int) Math.round(Math.random() * (max - min));
//
//
//        if (num61 < 0){
//            System.out.println("[" + num61 + "]" );
//        } else  if (num61 == 0)
//        {System.out.println("(" + num61 + ")");
//        } else  if (num61 > 0)
//        { System.out.println("{" + num61 + "}");
//        }
//        if (num62 < 0){
//            System.out.println("[" + num62 + "]" );
//        } else  if (num62 == 0)
//        {System.out.println("(" + num61 + ")");
//        } else  if (num62 > 0)
//        { System.out.println("{" + num62 + "}");
//        }
//        if (num63 < 0){
//            System.out.println("[" + num63 + "]" );
//        } else  if (num63 == 0)
//        {System.out.println("(" + num63 + ")");
//        } else  if (num63 > 0)
//        { System.out.println("{" + num63 + "}");
//        }


//        Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip 1000 vienetų taikoma 3 % nuolaida,
//                daugiau kaip 2000 vienetų- 4 % nuolaida. Parašykite programą,
//            kuri skaičiuos žvakių kainą ir atspausdintų atsakymą kiek žvakių ir kokia kaina perkama.
//        Žvakių kiekį generuokite Math.random() funkcija nuo 5 iki 3000.

//
//        int min = 5;
//        int max = 3000;
//
//        int zvake = min + (int) Math.round(Math.random() * (max - min));
//        System.out.println(zvake);
//
//
//        if (zvake <= 1000){
//            System.out.println(zvake);
//        }
//        else if(zvake > 1000 && zvake <= 2000){
//            System.out.println(zvake * 0.97 + "e");
//        }else if (zvake > 2000) {
//            System.out.println(zvake * 0.96 + "e");
//
//        }


//        Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su atsitiktinėm reikšmėm nuo 0 iki 100.
//        Paskaičiuokite jų aritmetinį vidurkį. Ir aritmetinį vidurkį atmetus tas reikšmes,
//        kurios yra mažesnės nei 10 arba didesnės nei 90. Abu vidurkius atspausdinkite.
//                Rezultatus apvalinkite iki sveiko skaičiaus.

        int max = 100;
        int min = 0;

        int num81 = min + (int) Math.round(Math.random() * (max - min));
        int num82 = min + (int) Math.round(Math.random() * (max - min));
        int num83 = min + (int) Math.round(Math.random() * (max - min));
        //num81 = 0;

        System.out.println(num81);
        System.out.println(num82);
        System.out.println(num83);


        System.out.println("avg "+Math.round(num81+num82+num83) /3);

         int count = 0;
         int sum = 0;



        if(num81 >= 10 && num81 <+ 90  ){
             sum += num81;
             count++;
             System.out.println("suma " + sum + " kiekis " + count);}

        if (num82 >= 10 && num82 <= 90){
            sum += num82;
            count++;
            System.out.println("suma " + sum + " kiekis " + count);}

        if (num83 >= 10 && num83 <= 90){
            sum += num83;
            count++;
            System.out.println("suma " + sum + " kiekis " + count);}

        if(count != 0 ) {
            System.out.println (Math.round((double) sum / count));
        }else{
            System.out.println(0);
        }

//  Padarykite skaitmeninį laikrodį, rodantį valandas, minutes ir sekundes. Valandom,
//  minutėm ir sekundėm sugeneruoti panaudokite funkciją Math.random().
//  Sugeneruokite skaičių nuo 0 iki 300. Tai papildomos sekundės.
//  Skaičių pridėkite prie jau sugeneruoto laiko.
//  Atspausdinkite laikrodį prieš ir po sekundžių pridėjimo ir pridedamų sekundžių skaičių.


//        int num91 =  (int) Math.round(Math.random() * (24));
//        int num92 =  (int) Math.round(Math.random() * (60));
//        int num93 =  (int) Math.round(Math.random() * (60));
//        System.out.println( num91 +":" + num92 + ":" + num93 );
//
//
//
//        int sekundes =  (int) Math.round(Math.random() * (300));
//        System.out.println(sekundes + "s");

        git config --global user.name "vaicekauskis"
        git config --global user.email "spookylt2@gmail.com"















































    }
}