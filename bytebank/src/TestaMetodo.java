public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuSacar = contaDoPaulo.saca(20);
        System.out.println(conseguiuSacar);
        System.out.println(contaDoPaulo.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if (contaDaMarcela.transfere(300, contaDoPaulo)) {
            System.out.println("Transferência feita com sucesso!");
        } else {
            System.out.println("Pouco dinheiro para transferir esse valor!");
        }

        System.out.println(contaDoPaulo.saldo);
        System.out.println(contaDaMarcela.saldo);

        contaDoPaulo.titular = "Paulo Silveira";
        System.out.println(contaDoPaulo.titular);
    }
}
