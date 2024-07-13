package br.com.Lanchonete;

import br.com.Lanchonete.AreaDoCliente.Cliente;
import br.com.Lanchonete.AtendimentoCozinha.Almoxarife;
import br.com.Lanchonete.AtendimentoCozinha.Cozinheiro;
import br.com.Lanchonete.AtendimentoCozinha.Funcinario;

public class Estabelecimento {
    public static <Atendente> void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda a aplicação
        cozinheiro.lavarIngredientes();

        cozinheiro.selecionarIngredientesBebida();
        cozinheiro.prepararLanche();
        cozinheiro.prepararBebida();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarBebidaNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Funcinario funcionario = new Funcinario();
        funcionario.pegarLancheCozinha();
        funcionario.receberPagamento();
        funcionario.servindoMesa();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        funcionario.trocarGas();

        Cliente cliente = new Cliente("Maria");
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento
        //ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //esta ação é muito sigilosa, qua tal ser privada ?
        cliente.consultarSaldoAplicativo();

        //já pensou os clientes ouvindo que o gás acabou ?
       cozinheiro.pedirParaTrocarGas(funcionario);
        cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}









