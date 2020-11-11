package FilesandThreads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {


    public ReadFiles() {
        File file = new File("F:\\IMDB\\Soundtrack\\file.txt");

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine() ); {
                System.out.println(scanner.nextLine());
                //Vaghti play ro bznim on chizi ke to file ma neveshte shode ro type mikone.
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
