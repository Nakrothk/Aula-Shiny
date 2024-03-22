
public class Programa {

    public static void main(String[] args) {

        String texto1 = "100";
        String texto2 = "50";
        // Concatenação
        String txtFinal = texto1 + texto2;
        System.out.println("texto: " + txtFinal);

        // Parsear (converter)
        int numero1 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(texto2);
        int resultado = Calculadora.somar(numero1, numero2);
        System.out.println("Resultado" + resultado);

        // Doubles
        double variavel = 10.60;
        Double objeto = 10.50;
        int inteiro = objeto.intValue();

        // Objetos do tipo bike
        Bike objetoMinhaBike = new Bike();
        objetoMinhaBike.marca = "Caloi";
        objetoMinhaBike.alterarMarcha(3);

        Bike objetoSuaBike = new Bike();
        objetoSuaBike.marca = "Oggi";
        objetoSuaBike.alterarMarcha(3);

        System.out.println("Minha bike marca " + objetoMinhaBike.marca);
        System.out.println("Minha bike marca " + objetoMinhaBike.marchaAtual);

        System.out.println();

        System.out.println("Minha bike marca " + objetoSuaBike.marca);
        System.out.println("Minha bike marca " + objetoSuaBike.marchaAtual);

        // Bike.marca = "Caloi";
        // Bike.marchaAtual = 3;

    }
}