public class Conta {
    
    private int numero;
    private Double saldo;
    static private int code;

    private Cliente titular;
    private Agencia agencia;

    Conta (){
        code++;
        this.saldo=1000.00;
    }  

    int get_numero (){
        return numero;
    }
    
    void set_numero (int numero){
        this.numero=numero;
    }

    Double get_saldo (){
        return saldo;
    }

    void set_saldo (Double saldo){
        this.saldo=saldo;
    }

    static int get_code (){
        return code;
    }

    static void set_code (int code){
        Conta.code=code;
    }

    Agencia get_agencia (){
        return agencia;
    }

    void set_agencia (Agencia agencia){
        this.agencia=agencia;
    }

    Cliente get_cliente (){
        return titular;
    }

    void set_cliente (Cliente titular){
        this.titular=titular;
    }

    void to_withdraw (Double valor){
        if (saldo >= valor && valor>=0) {
            this.saldo=saldo-valor;
            System.out.println("Saque feito com sucesso");
        }
        else{
            System.out.println("Limite invalido");
        }
    }

    void check_balance (){
        System.out.println("Seu saldo e de: "+get_saldo()+" R$");
    }

    void recharge (Double valor){
        if (saldo >= valor  && valor>=0) {
            this.saldo=saldo-valor;
        }
        else{
            System.out.println("limite invalido");
        }
    }
    
    void recharge (){
        if (saldo >= 20) {
            this.saldo=saldo-20;
        }
        else{
            System.out.println("limite invalido");
        }
    }

    void deposit (Double valor){
        this.saldo=saldo+valor;
    }

    void transfer (Double saldo, Conta origem, Conta destino){
        if (saldo <= origem.saldo  && saldo>=0) {
            origem.saldo=origem.saldo-saldo;
            destino.saldo=destino.saldo+saldo;
            System.out.println("Trasação feita com sucesso");
        }
        else {
            System.out.println("O saldo não é suficiente");
        }
    }

    void type (){
        
    }
}
