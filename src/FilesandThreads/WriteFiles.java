package FilesandThreads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriteFiles {


    public WriteFiles() {
        String Data = "My name is matin";

        /**
         * Create a new file
         */

        //Toye paranteze file be khatere in ghermez mishe ke chon address file mikhad ke bayad besh bedi.
        //Note:Dar akhare address file minevisim ---> file.txt
        //Note:Baraye rafe error file.creatnewfile(); onjayi ke ghermez mishe try catch ro miznim.




        File file = new File("F:\\IMDB\\Soundtrack\\13 Reasons Why.file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Write data into file
         */
        //Hala age play ro bznim on file to on poshe dorost shode.

        try {
            FileWriter fileWriter = new FileWriter("F:\\IMDB\\Soundtrack\\13 Reasons Why.file.txt");
            fileWriter.write(Data);
            fileWriter.close();   //Hala age play ro bznim my name is matin ke sakhtim to on file type mishe.
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Note:Dar vaghe on file.txt yani inke ma bash mitonim ye file ro dorost konim va mitonim hata esmesho avaz koinm vali dar nazar dashte bashid ke pasvande txt creat file ro be ma mide.:))
    }
}
