package Porteghal.Class;

import Classes.Constructors;
import FilesandThreads.Files;
import FilesandThreads.ReadFiles;
import FilesandThreads.Threads;
import FilesandThreads.WriteFiles;

/**
 *  this class navigate us to the target classes
 */
public class Navigator {


    /**
     * Let's go
     * @param args
     */
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Navigator");
        //new Constructors("Orange " , 2);

        //Ya masalan 3 ta mokhtalef bznim:
        new ReadFiles();
        //new Constructors("Orange ");
        //new Constructors("Orange " , 2);
        //Hale ke play bzni mokhtalef mokhtelf neshon mide onaro.


    }
}
