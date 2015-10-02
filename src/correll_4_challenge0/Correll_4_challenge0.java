/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correll_4_challenge0;

/**
 *
 * @author acorrell5106
 */
public class Correll_4_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 501; i++) {
            if (isDivisibleby11(i) & isDivisibleby5(i)) {
                System.out.println(i + " = Animate This!");
            } else if (isDivisibleby11(i) & isDivisibleby3(i)) {
                System.out.println(i + " = Herr Direktor");
            } else if (isDivisibleby11(i) & isDivisibleby2(i)) {
                System.out.println(i + " = ninja");
            } else if (isDivisibleby2(i) & isDivisibleby3(i) & isDivisibleby5(i)) {
                System.out.println(i + " = Team Building");
            } else if (isDivisibleby3(i) & isDivisibleby5(i)) {
                System.out.println(i + " = Old School");
            } else if (isDivisibleby2(i) & isDivisibleby3(i)) {
                System.out.println(i + " = chisme");
            } else if (isDivisibleby5(i)) {
                System.out.println(i + " = Vidal");
            } else if (isDivisibleby3(i)) {
                System.out.println(i + " = Claughton");
            } else if (isDivisibleby2(i)) {
                System.out.println(i + " = Davis");
            } else {
                System.out.println(i + " = is not divisible");
            }
        }
    }

    static boolean isDivisibleby2(int twonumber) {
        return (twonumber % 2 == 0);
    }

    static boolean isDivisibleby3(int threenumber) {
        return (threenumber % 3 == 0);
    }

    static boolean isDivisibleby5(int fivenumber) {
        return (fivenumber % 5 == 0);
    }

    static boolean isDivisibleby11(int elevennumber) {
        return (elevennumber % 11 == 0);
    }
}
