import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner ler = new Scanner (System.in)){
            Conta.set_code(0);
            Agencia.set_code(0);
            Cliente.set_code(0);
            Conta Primeira_conta = new Conta_corrente();
            Conta Segunda_conta = new Conta_poupança();
            Cliente cliente_1 = new Pessoa_física();
            Cliente cliente_2 = new Pessoa_legal();
            Agencia agencia1 = new Agencia();
            agencia1.set_numero(Agencia.get_code());
            Agencia agencia2 = new Agencia();
            agencia2.set_numero(Agencia.get_code());
            cliente_1.set_nome("Dona Cotinha");
            cliente_2.set_nome("Seu Patinhas");
            Primeira_conta.set_cliente(cliente_1);
            Segunda_conta.set_cliente(cliente_2);
            Primeira_conta.set_agencia(agencia1);
            Segunda_conta.set_agencia(agencia2);
            int opção1 = 0;
            int opção2 = 0;
            int opção3 = 0;
            int opção4 = 0;
            while (opção1 != 1) {
                System.out.println("Menu\n[1] Primeira conta\n[2] Segunda conta\n[3] Exit");
                opção2 = ler.nextInt();
                if (opção2 == 3) {
                    System.out.println("Obrigado por ultilizar nossos serviços");
                    break;
                }
                System.out.println("Menu\n[1] Saldo\n[2] Verificar Saldo\n[3] Recarga\n[4] Transferir");
                opção3 = ler.nextInt();
                switch (opção3) {
                    
                    case 1:
                        if (opção2 == 1) {
                            System.out.println("Digite o valor de saque: ");
                            Primeira_conta.to_withdraw(ler.nextDouble());
                        }
                        else if (opção2 ==1){
                            System.out.println("Digite o valor de saque: ");
                            Segunda_conta.to_withdraw(ler.nextDouble());
                        }
                        break;

                    case 2:
                        if (opção2 == 1) {
                            Primeira_conta.check_balance();
                            System.out.println("O nome do cliente é: "+Primeira_conta.get_cliente().get_nome());
                            System.out.println("O numero da agencia é: "+Primeira_conta.get_agencia().get_numero());
                            Primeira_conta.type();
                        }
                        else if (opção2 == 2){
                            Segunda_conta.check_balance();
                            System.out.println("O nome do cliente é: "+Segunda_conta.get_cliente().get_nome());
                            System.out.println("o numero da agencia é: "+Segunda_conta.get_agencia().get_numero());
                            Segunda_conta.type();
                        }
                        break;
                    case 3:
                        System.out.println("[1] Recarga de 20R$\n [2] recarga de outros valores");
                        opção4 = ler.nextInt();
                        if (opção2 == 1) {
                            if (opção4 == 1) {
                                Primeira_conta.recharge();
                            }
                            else if (opção4 == 2) {
                                System.out.println("Digite o valor de recarga: ");
                                Primeira_conta.recharge(ler.nextDouble());
                            }
                        }
                        else if (opção2 == 2) {
                            if (opção4 == 1) {
                                Segunda_conta.recharge();
                            }
                            else if (opção4 == 2){
                                System.out.println("Digite o valor de recarga: ");
                                Segunda_conta.recharge(ler.nextDouble());
                            }
                        }
                        break;
                    case 4:
                        if (opção2==1) {
                            System.out.println("Digite o valor que deseja transferir: ");
                            Primeira_conta.transfer(ler.nextDouble(), Primeira_conta, Segunda_conta);
                        }
                        else if (opção2 == 2){
                            System.out.println("Digite o valor que deseja transferir: ");
                            Segunda_conta.transfer(ler.nextDouble(), Segunda_conta, Primeira_conta);
                        }
                        break;
                    default:
                        System.out.println("Ação invalida!");
                        break;
                }
            }
        }
    }
}
