public class MinhaClasse {
    public static void main(String[] args) {//classse principal do projeto 
        System.out.print("Olá mundo.\n"); // Classe Java System -> realizará saida no console

        String myName = "kaio";
        int myAge = 27;
        boolean isTrue = true;
        
        isTrue = false;
        myAge = 28;
        myName = "Kaio";

        String firstName = "Kaio";
        String lastName = "Silva";

        String fullName = fullName(firstName, lastName);

        System.out.println("Nome Completo: "+fullName);

    }

    public static String fullName(String firstName, String lastName){
        //return firstName + " " + lastName;
        return firstName.concat(" ").concat(lastName);
    }

}
