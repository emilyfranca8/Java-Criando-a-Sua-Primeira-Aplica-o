import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliação = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar")
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliação += nota;
                totalDeNotas++;
            }

        }

        System.out.println("Média de avaliações" + mediaAvaliação / totalDeNotas);

    }
}