package br.com.Lanchonete.AtendimentoCozinha;

public class Cozinheiro {

        public void adicionarLancheNoBalcao() {
            System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
        }
        //pode ser default
        public void adicionarBebidaNoBalcao() {
            System.out.println("ADICIONANDO SUCO NO BALCÃO");
        }
        //pode ser default
        public void adicionarComboNoBalcao() {
            /* como é um combo, eu vou adicionar os dois metodos aqui que seram adicionados
            no balcão*/
            adicionarLancheNoBalcao();
            adicionarBebidaNoBalcao();
        }
        public void prepararLanche() {
            System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
        }
        public void prepararBebida() {
            System.out.println("PREPARANDO SUCO");
        }
        public void prepararCombo() {
            prepararLanche();
            prepararBebida();
        }
        public void selecionarIngredientesLanche() {
            System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
        }
        public void selecionarIngredientesBebida() {
            System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
        }
        public void lavarIngredientes() {
            System.out.println("LAVANDO INGREDIENTES");
        }
        public void pedirParaTrocarGas(Funcinario meuAmigo) {
            //trocar gás está em Almoxarife
            meuAmigo.trocarGas();
        }
        public void pedirParaTrocarGas(Almoxarife meuAmigo) {
            meuAmigo.trocarGas();
        }
        public void pedirIngredientes(Almoxarife almoxarife) {
            almoxarife.entregarIngredientes();
        }



}
