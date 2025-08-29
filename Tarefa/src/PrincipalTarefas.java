import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrincipalTarefas {
    public static void main(String[] args) {
        ArrayList<Tarefa> lista = new ArrayList<>();
        int opcao;

        do {
            String menu = "1 - Adicionar tarefa\n"
                        + "2 - Remover tarefa\n"
                        + "3 - Listar tarefas\n"
                        + "4 - Sair";
            String entrada = JOptionPane.showInputDialog(menu);
            if (entrada == null) return;
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da tarefa:"));
                    String titulo = JOptionPane.showInputDialog("Título da tarefa:");
                    lista.add(new Tarefa(codigo, titulo));
                    JOptionPane.showMessageDialog(null, "Tarefa adicionada!");
                    break;

                case 2:
                    int codRemover = Integer.parseInt(JOptionPane.showInputDialog("Código da tarefa a remover:"));
                    boolean achou = false;
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCodigo() == codRemover) {
                            lista.remove(i);
                            achou = true;
                            break;
                        }
                    }
                    JOptionPane.showMessageDialog(null, achou ? "Removida!" : "Não encontrada.");
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa cadastrada.");
                    } else {
                        StringBuilder sb = new StringBuilder("Tarefas:\n");
                        for (Tarefa t : lista) {
                            sb.append(t).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 4);
    }
}
