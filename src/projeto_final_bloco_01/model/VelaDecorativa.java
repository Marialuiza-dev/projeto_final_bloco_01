package projeto_final_bloco_01.model;

public class VelaDecorativa extends Vela {
    private String decoracao;

    public VelaDecorativa(int id, String nome, double preco, String decoracao) {
        super(id, nome, preco);
        this.decoracao = decoracao;
    }

    public String getDecoracao() {
        return decoracao;
    }

    public void setDecoracao(String decoracao) {
        this.decoracao = decoracao;
    }

    @Override
    public void visualizar() {
        System.out.println("Vela Decorativa [ID: " + id + ", Nome: " + nome + ", Preço: R$" + preco + ", Decoração: " + decoracao + "]");
    }
}