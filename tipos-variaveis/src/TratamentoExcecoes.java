import java.text.NumberFormat;
import java.text.ParseException;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        //Tratamento de exceção
        //https://www.w3schools.com/java/java_try_catch.asp

        //try {
            //  Block of code to try
          //}
         // catch(Exception e) {
            //  Block of code to handle errors
         // }

         //Exemplo:
         
        //Tratar imediatamente a exceção
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println(valor);
       
    }
}