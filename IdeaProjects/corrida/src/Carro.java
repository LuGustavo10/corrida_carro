public class Carro {
    String nome_carro;
    String motor;
    int potencia;
    boolean aceleracao;
    boolean pisar_acelerador;

    Carro(Motor m, String nome_carro){
        this.nome_carro = nome_carro;
        this.motor = m.motor;
        this.potencia = m.potencia;
        this.aceleracao = m.aceleracao;
    }
    void acelerar(){
        if(pisar_acelerador){
            System.out.print("Estamos prontos: \n");
            System.out.printf("Modelo: %s\n", this.nome_carro);
            System.out.printf("Motor: %s\n",motor);
            System.out.printf("Potencia %d\n", potencia);
            System.out.printf("Aceleracao %b\n", aceleracao);
            System.out.print("Vrummmmm\n");
            System.out.println();
        }else{
            System.out.print("Primeiro pise no acelerador\n");
            System.out.println();
        }
    }
}
