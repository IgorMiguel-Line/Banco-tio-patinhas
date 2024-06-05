public class Cliente {

    private String nome;
    static private int code;

    Cliente (){
        code++;
    }

    String get_nome (){
        return nome;
    }

    void set_nome (String nome){
        this.nome=nome;
    }

    static int get_code (){
        return code;
    }

    static void set_code (int code){
        Cliente.code=code;
    }
}
