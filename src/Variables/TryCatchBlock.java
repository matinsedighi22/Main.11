package Variables;

public class TryCatchBlock {


    public void Start() {

        String Sib = "ali";




        try {
            //int a = Integer.parseInt(Sib);
            float b = Float.parseFloat(Sib);
            System.out.println(b);
        }
        catch (NumberFormatException e) {
            System.out.println(e);


        }
        finally {
            System.out.println("finally");

            System.out.println(Sib);
        }


    }
}
