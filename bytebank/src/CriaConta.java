public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;
        System.out.println(segundaConta.saldo);

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);

        primeiraConta.agencia = 146;
        System.out.println("A agência da primeira conta é: " + primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);
        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta tem a agência " + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("A primeira e segunda contas são a mesmíssima conta!");
        } else {
            System.out.println("A primeira conta e segunda conta são contas diferentes!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
