package Classes;

import Classes.Classes_01;

public class StaticUsage {

    //Khob hala biyaym karborde public static ro bbinim:
    //1:Mirim dar class(Classes_01) Yek public Dorost mikonim:
    //2:Public static String Myname() {space
    //3:Dar khate payin minevisim: Return "MyNameisMatin"
    //4:Miyaym to Class(StaticUsage):
    //1:Classes_01 object = new Classes_01();
    //2:object.print();
    //3:String name = Classes_01.Myname();
    //4:Hala sout ro miznim dakhele parantez name va play ro ke bnzim baraye ma "MyNameisMatin" ro ejra mikone.



    public void Start() {
        Classes_01 object = new Classes_01();
        object.Print();
        String name = Classes_01.Myname();
        System.out.println(name);


    }
}
