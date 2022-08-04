public class Acelerar {
    public static void main(String[] args){
        Motor configuracoes_carro = new Motor("boxer", 130, false);
        Carro fusca = new Carro(configuracoes_carro, "Fusca");

        fusca.pisar_acelerador = true;
        fusca.acelerar();

        fusca.pisar_acelerador = false;
        fusca.acelerar();

        fusca.pisar_acelerador = true;
        fusca.acelerar();
    }
}
