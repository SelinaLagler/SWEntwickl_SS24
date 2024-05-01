package exceptions;

public class Versuch1 {
    public static void main(String[] args) {

        try {
            String string = "Ich bin ein String, kann ich Integer werden?";
            Integer.parseInt(string);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("kommt IMMER zum Schluss!");
        }




    }

    public void doSometh() throws Exception{
        int counter = 5;
        while (counter >= 0){
   //             counter-1;

        }
        throw new Exception("Counter kleiner 0");
    }
}
