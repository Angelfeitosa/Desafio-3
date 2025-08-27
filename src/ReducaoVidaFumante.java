import java.util.Scanner;

public class ReducaoVidaFumante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Há quantos anos você fuma? ");
        int anosFumando = scanner.nextInt();

        // Cálculo
        int totalCigarros = cigarrosPorDia * 365 * anosFumando;
        int minutosPerdidos = totalCigarros * 10;
        int diasPerdidos = minutosPerdidos / (60 * 24); // 60 min por hora * 24 horas por dia

        // Saída
        System.out.println("Você perdeu aproximadamente " + diasPerdidos + " dias de vida devido ao fumo.");

        scanner.close();
    }
}
