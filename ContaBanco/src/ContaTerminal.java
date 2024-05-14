import java.util.Locale; //Importando o métopo Scanner.
import java.util.Scanner; //Importando o método Locale, para padronizar como visto na aula de sintaxe.

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Usuário, por favor, digite o número da sua Agência!");
        String numeroAgencia = scanner.next(); //Recebendo o número da agência do usuário.

        System.out.println("Usuário, por favor, digite o número da sua Conta!"); 
        int numeroConta = scanner.nextInt(); //Recebendo o número da conta do usuário.

        scanner.nextLine(); //Limpando o buffer.

        System.out.println("Usuário, por favor, informe o seu nome!");
        String nomeUsuario = scanner.nextLine(); //Recebendo o nome do usuário.
        //nextLine para receber dados até depois do espaço.

        System.out.println("Usuário " + nomeUsuario + ", por favor, informe o saldo da sua conta:");
        double saldoConta = scanner.nextDouble(); //Recebendo o saldo da conta do usuário.

        scanner.close(); //Recebendo o saldo da conta do usuário.

        //Imprimindo os dados recebidos
        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta +" já está disponível para saque.");
        //Quebrando o código no meio para facilitar o entendimento e manipulação.
    
    }
}
