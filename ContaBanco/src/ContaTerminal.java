import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        double saldo;
        String agencia, cliente;
        int numero;

        Scanner sc = new Scanner(System.in);
     
        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();
        System.out.println("Por favor, insira seu nome !");
        cliente = sc.nextLine();
        System.out.println("Por favor, insira seu Numero!");
        numero = sc.nextInt();
        System.out.println("Insira seu saldo");
        saldo = sc.nextDouble();
        
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n", 
                          cliente, agencia, numero, saldo);

    sc.close();
    }
}
