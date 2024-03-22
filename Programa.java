public class Programa {

    public static void main(String[] args) {

        int numero = 100;
        String numTexto = String.valueOf(numero);
        char primeiraLetra = numTexto.charAt(0);
        // System.out.println("Letra: " + primeiraLetra);

        char[] texto1 = { 'P', 'r', 'o', 'g', 'r', 'a', 'm', 'a' };
        for (int i = 0; i < texto1.length; i++) {
            char letra = texto1[i];
            // System.out.println(letra);
        }
        String texto2 = "Programa Java";

        // System.out.println(texto2); // Normal
        // System.out.println(texto2.toUpperCase()); // Maiúsculas
        // System.out.println(texto2.substring(0, 10)); // Recorte
        // System.out.println(texto2.charAt(10)); // Apenas uma letra

        String[] palavras = texto2.split(" ");
        String palavra1 = palavras[0];
        String palavra2 = palavras[1];

        // System.out.println(palavra1); // Programação
        // System.out.println(palavra2); // Java

        //Dados de conta bancárias
        //Nome;CPF;Saldo
        String[] registros = {"Fog;666;0,5", "Annwe;6969;20"};

        for(int i = 0; i < registros.length; i++){
            String linha = registros[i];
            String[] dados = linha.split(";"); 
            String nome = dados[0];
            String cpf = dados[1];
            double saldo = Double.parseDouble(dados[2]);
            double total += saldo;
            System.out.println("Nome:" + nome + " Saldo: " + saldo);

        }
        System.out.println("total " + total);

    }

}
