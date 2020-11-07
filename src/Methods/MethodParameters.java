package Methods;

import javax.naming.Name;

public class MethodParameters {


    public void Start() {
        int x = 2;
        int y = 10;
        int c =Home(x,y);

        System.out.println(c);  //Age play ro bznim mire to sakhtare public int Home va javabe 12 ro be ma mide.
        System.out.println(Minus(2,10));
        System.out.println(Multiple(2,10));
        System.out.println(Div(2,10));

        //Nokte: Mitonestim hamon aval ham poshte paranteze(x,y) dar int c ro esme Home ro bezarim masalan Multiple,Dive,Minus va......
        //Ke daghighn hamon kare sout hayi ro ke zadim baramon mikonn.

        //Hala ye Nokte Mohem:
        //Age be jaye masalan public int Home(Har esmi az tabe), Benevism public void Home(Har esmi az tabe):
        //Onvaght dige niyazi be return nist. vali return baraye public int(ya har array dige) niyaz be return dare.






    }

    public int Home(int a, int b) {
        return a+b;
        }

        public int Minus(int a , int b) {
        return a-b;
        }

        public int Multiple(int a , int b) {
        return a*b;
        }

        public int Div(int a , int b) {
        return a/b;
        }


    }

