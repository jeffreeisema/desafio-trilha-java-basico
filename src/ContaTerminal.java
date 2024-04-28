import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        this.innerLine(3);
        // Exibe saudações e mensagens de boas vindas
        System.out.println("Olá, sejá bem vindo(a)!");

        // Mensagem de orientação ao usuário
        System.out.println("Para criarmos sua conta, segue os passos a seguir!");

        // INSERE ALGUMAS LINHAS PARA FORMATAÇÃO DE EXIBIÇÃO
        this.innerLine(1);

        // Chama o metodo que obtém os dados de criação de conta
        this.obterDadosCliente();
    }

    public void innerLine(int lines) {
        // Este métod serve para deixar as mensagens no terminal mais legíveis
        for (int line = 1; line <= lines; line++) {
            System.out.println("------------------------------------");
        }
    }

    public void obterDadosCliente() {
        // Usa try_catch para capturar possíveis excessões
        try {
            // Obtém o nome do cliente
            System.out.println("Primero, digite seu nome completo");
            this.nomeCliente = scanner.next();

            this.innerLine(1);

            // Obtém o número da conta
            System.out.println("Agora ".concat(this.nomeCliente).concat(", digite o número da conta"));
            this.numero = scanner.nextInt();

            this.innerLine(1);

            // Obtém o número da agência
            System.out.println("Digite o número da agência. Exemplo: 123-4");
            this.agencia = scanner.next();

            this.innerLine(1);

            // Obtém o saldo de depósito
            System.out.println("Digite o valor que deseja depositar. Aviso, usar ponto(.) ao invés de vírgula(,) em caso de numéros decimais");
            this.saldo = scanner.nextDouble();

            this.innerLine(3);

            // Chama o método que irá exibir as informações finais
            this.criarConta();

        } catch (Exception e) {
            System.out.println("Ops, parece que houve um erro. Erro: ".concat(e.getMessage()));
        }
    }

    public void criarConta() {
        System.out.println("Olá ".concat(this.nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(this.agencia)
                .concat(", conta ").concat(Integer.toString(this.numero)).concat(" e seu saldo ")
                .concat(Double.toString(this.saldo)).concat(" já está disponível para saque."));
    }

    public static void main(String[] args) throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();
        contaTerminal.iniciar();
    }

}
