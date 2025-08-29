import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        try {
            Data data = new Data(1, 1, 2000);
            JOptionPane.showMessageDialog(null, "Data inicial: " + data);

            int novoDia = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o novo dia (1-30):")
            );
            int novoMes = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o novo mês (1-12):")
            );
            int novoAno = Integer.parseInt(
                JOptionPane.showInputDialog("Digite o novo ano (>=1900):")
            );

            data.setDia(novoDia);
            data.setMes(novoMes);
            data.setAno(novoAno);

            JOptionPane.showMessageDialog(null, "Nova data: " + data.formatarData());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
