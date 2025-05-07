package projeto_final_bloco_01.model;

import java.util.List;
public interface VelaRepository {
	    void adicionarVela(Vela vela);                     // Cadastrar
	    List<Vela> listarTodas();                          // Listar todas
	    Vela buscarPorId(int id);                          // Buscar por ID
	    boolean atualizarVela(Vela vela);                  // Atualizar
	    boolean deletarVela(int id);                       // Deletar

	}