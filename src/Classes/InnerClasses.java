package Classes;

public class InnerClasses {


    public InnerClasses() {
        System.out.println("InnerClasses");


    }

    public class InnerClass {
        public class InnerClaasesLevel2 {
            public void print(String message) {
                System.out.println("InnerClass -> InnerClaasesLevel2 ->" + message);

            }

            }
        }



        }



