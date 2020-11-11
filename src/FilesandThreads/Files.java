package FilesandThreads;

import java.io.File;

public class Files {
    //1:Aval ye constructor Files misazim.
    //2: File file ro type mikonim.Badesh error miyad.baraye halesh---> alt + enter mizanim
    //3:alt va enter ro ke zdim on bala import java type mishe.
    //4:Hala edamash ---> File file = new File("Ye ebarati);


    public Files() {
        File file = new File("F:\\IMDB\\Soundtrack\\Breaking Bad\\Breaking Bad");

        System.out.println(file.getName());  //Play ro ke bznim esme file miyad.
        System.out.println(file.getPath());  //Play ro ke bznim address file ro behemon mide.
        System.out.println(file.exists());   //Play ro ke bznim mige file vojod dare ya na.


        //Baraye Info bishtar mitonid to google java files ro type konid va info kamle ro ke ma to sout mizadim ro bishtar bbinid.
    }
}
