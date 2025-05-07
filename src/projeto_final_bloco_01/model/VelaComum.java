package projeto_final_bloco_01.model;

public class VelaComum extends Vela {

    public VelaComum(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public void visualizar() {
        System.out.println("Vela Comum [ID: " + id + ", Nome: " + nome + ", Preço: R$" + preco + "]");
    }
}