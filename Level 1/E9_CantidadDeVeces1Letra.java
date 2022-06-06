import java.util.Scanner;

public class E9_CantidadDeVeces1Letra {

    public static void main(String[] args) {
        
        System.out.println("Ingrese frase, texto, etc.: ");
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        System.out.print("Ingrese carácter a buscar: ");        
        char caracter = scan.next().charAt(0);
        int canti = numeroDeCaracteres(texto, caracter);        
        System.out.println("El texto o frase: '" + texto + "' contiene: " + canti + " letras " + caracter);
        scan.close();


    }
    
    public static int numeroDeCaracteres(String texto, char caracter) {
        int posicion = 0;
        int contador = 0;
        posicion = texto.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = texto.indexOf(caracter, posicion + 1);
        }
        return contador;

    }
    


}