package Execicios;

import java.util.Scanner;

/* programa recebe notas de 0 a 10, caso se insira valores menores ou maiores o programa exibe uma
mensagem de "Nota inválida ! Digite novamente"
 */

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota <0 | nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();

        }
    }
}

