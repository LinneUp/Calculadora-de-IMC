import java.util.Scanner;

public class IMC {
    public static void main(String [] args) {

        System.out.println("Bem-vindo a Calculadora de IMC.");
        
        int opcao;
        System.out.println("1 - Vamos Descobrir seu IMC?");
        System.out.println("2 - Sair?");
        System.out.println("O que voce deseja fazer??");
    
        Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt();
        procesar(opcao);
    }
 

    public static void procesar(int opcao) {
        switch(opcao){
            case 1: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Descobrindo seu IMC: ");
                System.out.print("Digite seu Peso: ");
                double peso = scanner.nextDouble();
                System.out.print("Digite sua Altura usando virgula: ");
                double altura = scanner.nextDouble();
                double imc = peso / (altura * altura);

                System.out.println("Seu IMC é de: " + imc);
                System.out.println("");
                System.out.println("Menor que 18,5      Magreza");
                System.out.println("Entre 18,5 e 24,9   Normal");
                System.out.println("Entre 25,0 e 29,9   Sobrepeso");
                System.out.println("Entre 30,0 e 39,9   Obesidade");
                System.out.println("Maior que 40,0      Obesidade Grave");
                System.out.println("Caso seu IMC der como Magreza ou Obesidade, recomendamos que procure um nutricionista.");

                break;
        }
        case 2: {
            System.out.println("Fechando o programa: ");
                break;
        }
            
            }
        
       
        }
    
            

        
}




