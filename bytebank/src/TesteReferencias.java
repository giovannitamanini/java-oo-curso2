public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        // primeiraConta é uma referência a um objeto do tipo Conta
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; //segundaConta é uma outra referência para o mesmo objeto
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("A primeira e segunda contas são a mesmíssima conta!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
