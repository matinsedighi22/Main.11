package Porteghal.Class;

import Classes.Constructors;

/**
 *  this class navigate us to the target classes
 */
public class Navigator {


    /**
     * Let's go
     * @param args
     */
    public static void main(String args[]) {
        System.out.println("Navigator");
        new Constructors("Orange " , 2);

        //Ya masalan 3 ta mokhtalef bznim:
        new Constructors();
        new Constructors("Orange ");
        new Constructors("Orange " , 2);
        //Hale ke play bzni mokhtalef mokhtelf neshon mide onaro.


    }
}
