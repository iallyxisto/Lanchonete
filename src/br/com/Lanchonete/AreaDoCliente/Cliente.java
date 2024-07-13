package br.com.Lanchonete.AreaDoCliente;

public class Cliente {
    // Metódos que um cliente pode fazer

    String name;
    public Cliente(String name) {
        this.name= name;
    }
    public void escolherLanche(){
        System.out.println("Escolhendo lanche");

    }
    public void pagarConta(){
        System.out.println("Pagando a conta");

    }
    public void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo no app");

    }
    public void pegarPedidoBalcao(){
        System.out.println("Pegando o pedido no Balcão");

    }

    public void fazerPedido() {
        System.out.println("Fazendo pedido");
    }
}

