import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;
       

        System.out.println("Por favor digite o nuero da conta!");
        
        numero = sc.nextInt();
        

        System.out.println("Por favor digite o numero da agência!");
        
        sc.nextLine();
        agencia = sc.nextLine();
        
        
        System.out.println("Por favor digite o seu nome!");
        
        nomeCliente = sc.nextLine();


        System.out.println("Por favor digite o seu saldo!");
        
        saldo = sc.nextDouble();

       
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + String.format("%.2f", saldo) + " já está disponível para saque");



    }
}
