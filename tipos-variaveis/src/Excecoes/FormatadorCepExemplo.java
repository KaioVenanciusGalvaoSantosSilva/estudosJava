package Excecoes;

public class FormatadorCepExemplo {
    public static void main(String[] args) {

        String cep ="23765064";//correto
        String cep2 ="2376506";//incorreto que causará exceção
        

        try {
            String cepFormatado = formatarCep(cep);//substitua o cep por cep ou cep2
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //e.printStackTrace();
            System.out.println("O cep não corresponde com as regras de negócio");
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
