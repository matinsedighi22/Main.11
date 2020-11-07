package Classes;

public class Constructors {

    //Be Tavabe hayi ke formolesh mesle zire migim Constructors:
    //Public Esme Class() {space

    //Vali ghablesh ye nokte:zamani ke mikhaym az Tavabe Constructor estefade konim:
    //1:Mirim to Navigator va on khate 18 hamasho pak mikoinm be joz (new Contructors();). Variables.start ro ham kamel pak mikonim.
    //Mesal:

    public Constructors() {
        System.out.println("Constructors");  //play ke bznim Constructor ejra mishe.

    }

    public Constructors(String name) {
        System.out.println("Constructors" + name);
    }

    public Constructors(String name, int age) {
        System.out.println("Constructors " + name + "is " + age + "years old");

        //Khob hala mirim to Navigator:
        //1:Toye parantez Constructor masalan minevisim "Orange ", 2 ke bnvisim be age hesab mikone va vaghti play ro bznim mige Constructor Orange is 2 years old.
    }

}
