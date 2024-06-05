public class Agencia {

    static private int code;
    private int numero;

    Agencia (){
        code++;
    }

    static int get_code (){
        return code;
    }

    static void set_code (int code){
        Agencia.code=code;
    }

    int get_numero(){
        return numero;
    }
    void set_numero (int numero){
        this.numero=numero;
    }
}
