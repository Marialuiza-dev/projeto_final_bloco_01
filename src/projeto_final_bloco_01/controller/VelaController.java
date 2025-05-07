package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import projeto_final_bloco_01.model.Vela;

public abstract class VelaController implements projeto_final_bloco_01.model.VelaRepository {

    private ArrayList<Vela> lista = new ArrayList<>();

    
    @Override
    public void listarTodas() {
        for (Vela vela : lista) {
            vela.visualizar();
        }
    }


    public Vela buscarPorId(int id) {
        for (Vela vela : lista) {
            if (vela.getId() == id) {
                return vela;
            }
        }
        return null;
    }

  
    public void cadastrar(Vela vela) {
        lista.add(vela);
        System.out.println("✅ Vela cadastrada com sucesso!");
    }

    public void atualizar(Vela velaAtualizada) {
        for (int i = 0; i < lista.size(); i++) {
            Vela v = lista.get(i);
            if (v.getId() == velaAtualizada.getId()) {
                lista.set(i, velaAtualizada);
                System.out.println("✅ Vela atualizada com sucesso!");
                return;
            }
        }
        System.out.println("❌ Vela não encontrada!");
    }

    public void deletar(int id) {
        Vela vela = buscarPorId(id);
        if (vela != null) {
            lista.remove(vela);
            System.out.println("✅ Vela deletada com sucesso!");
        } else {
            System.out.println("❌ Vela não encontrada!");
        }
    }
}