package Operators;

import java.sql.SQLOutput;

public class LogicalOperators {


    public void Start() {

        /*
        Poorkarbord tarin ha:
         * && (and and) ye adame avazie :)
         * || (more)    ye poilce mehrabone :)
         * !  (not) in halat faghat zamani ejra mishe ke hamishe hamishe poshte parantez miyad.masalan !(a>b) va javabo hamishe barax mikone chon mokhalef amal mikone.

         * Kamkarbord tarin ha:
         * |  (or)
         * &  (and)
         * ^  (x or)
         *
         */

        //This type of Operators just Stick Operators against each one and mostly works with Relational Operators


        int a = 25;
        short b = 12;
        boolean c = true;

        System.out.println(
                //(a>b)
                //&&
                 //(a>10)     // The result both with (a>b) and && with (a>10) is true.

                (a>b)
                ||
                (a<10)       // The result both with (a>b) and && with (a>10) is true.
                ||
                        c



        );

    }

}

