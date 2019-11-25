// If else in Java code
import java.util.Scanner;
import java.util.Random;
import java.util.stream.StreamSupport;

class IfElse {

    public static void main(String[] args) {

        /* /
         * Here I made the introduction
         *
         * */

        System.out.println("Welcome to lottery ");
        try {
            Thread.sleep(2000); // 10000ms = 10s
        } catch(InterruptedException ex) {

        }






        System.out.println("LOTERIA 6/50" +
                "" +
                "" +
                "" +
                "");
        try {
            Thread.sleep(2000); // 10000ms = 10s
        } catch(InterruptedException ex) {

        }



        System.out.println("Scrie 6 numere de la 1 la 50, dupa fiecare numar apesi enter si astepti rezultat") ;
        try {
            Thread.sleep(2000); // 10000ms = 10s
        } catch(InterruptedException ex) {

        }





        // Here I made Dani to get me numbers


        Random randomObject = new Random();

        Scanner iadeladani1 = new Scanner(System.in);
        int test1 = iadeladani1.nextInt();
        System.out.println(test1);

        int RandomNumber1= randomObject.nextInt();
        Random rand1 = new Random();



        int n1 = rand1.nextInt(50);







        int numar1, numar2, numar3, numar4, numar5, numar6;




        numar1 = test1;



        if (numar1 == n1) {
            System.out.println("FELICITARI, AI  UNUL DIN NUMERE");

        }
        else {
            System.out.println("Inca nu ai nimerit niciun numar, mai continua");
            System.out.println("Numarul pe care trebuia sa il ghicesti a fost" +n1);

        }
        try {
            Thread.sleep(800); // 10000ms = 10s
        } catch(InterruptedException ex) {

        }

        Scanner iadeladani2 = new Scanner(System.in);
        int test2 = iadeladani2.nextInt();
        System.out.println(test2);

        int RandomNumber2 = randomObject.nextInt();
        Random rand2 = new Random();
        numar2 = test2;
        var n2 = rand1.nextInt(50);


         if(numar2 == n2) {
             System.out.println("FELICITARI, AI NIMERIT   UNUL DIN NUMERE");
         }

         else {
             System.out.println("Inca nu ai nimerit niciun numar, mai continua");
             System.out.println("Numarul pe care trebuia sa il ghicesti a fost" +n2);
             try {
                 Thread.sleep(800); // 10000ms = 10s
             } catch(InterruptedException ex) {

             }
         }
        Scanner iadeladani3 = new Scanner(System.in);
        int test3 = iadeladani3.nextInt();
        System.out.println(test3);

        int RandomNumber3 = randomObject.nextInt();
        Random rand3 = new Random();
        numar3 = test3;
        int n3 = rand1.nextInt(50);
       if(numar3 == 3) {
           System.out.println("FELICITARI, AI NIMERIT  UNUL DIN NUMERE");
       }
       else {System.out.println("Inca nu ai nimerit niciun numar, mai continua");
           System.out.println("Numarul pe care trebuia sa il ghicesti a fost" +n3);
           try {
               Thread.sleep(800); // 10000ms = 10s
           } catch(InterruptedException ex) {

           }


       }

        Scanner iadeladani4 = new Scanner(System.in);
        int test4 = iadeladani4.nextInt();
        System.out.println(test4);

        int RandomNumber4= randomObject.nextInt();
        Random rand4 = new Random();
        numar4 = test4;
        int n4 = rand1.nextInt(50);


        if(numar4 == n4) {
            System.out.println("FELICITARI, AI NIMERIT   UNUL DIN NUMERE");
        }

        else {
            System.out.println("Inca nu ai nimerit niciun numar, mai continua");
            System.out.println("Numarul pe care trebuia sa il ghicesti a fost" +n4);
            try {
                Thread.sleep(800); // 10000ms = 10s
            } catch(InterruptedException ex) {

            }
        }

        Scanner iadeladani5 = new Scanner(System.in);
        int test5 = iadeladani2.nextInt();
        System.out.println(test5);

        int RandomNumber5 = randomObject.nextInt();
        Random rand5 = new Random();
        numar5 = test5;
        int n5 = rand5.nextInt(50);


        if(numar5 == n5) {
            System.out.println("FELICITARI, AI NIMERIT  UNUL DIN NUMERE");
        }

        else {
            System.out.println("Inca nu ai nimerit niciun numar, mai continua");
            System.out.println("Numarul pe care trebuia sa il ghicesti a fost" +n5);
            try {
                Thread.sleep(800); // 10000ms = 10s
            } catch(InterruptedException ex) {

            }
        }
        Scanner iadeladani6= new Scanner(System.in);
        int test6= iadeladani6.nextInt();
        System.out.println(test6);

        int RandomNumber6= randomObject.nextInt();
        Random rand6 = new Random();
        numar6 = test6;
        int n6 = rand1.nextInt(5);


        if(numar6 == n6) {
            System.out.println("FELICITARI, AI NIMERIT   UNUL DIN NUMERE");
        }

        else {
            System.out.println("Inca nu ai nimerit niciun numar, mai continua");
            System.out.println("Numarul pe care trebuia sa il ghicesti a fost" +n6);
            try {
                // 10000ms = 10s
                Thread.sleep(800);
            } catch(InterruptedException ex) {

            }
        }

       System.out.println("Numerele pe care trebuia sa le ghicesti au fost" +"    "+n1 +"    "+n2+"    "+n3+"    "+n4+"    "+n5+"    "+n6);
        System.out.println("Numerele pe care le-ai intridus tu sunt"+ "    "+test1+"    "+test2+"    "+test3+"    "+test4 +"    " +test5 + "    "+ test6);
    }
}


