public class Tarefa {
    private int codigo;
    private String titulo;

    public Tarefa(int codigo, String titulo) {
        setCodigo(codigo);
        setTitulo(titulo);
    }

    public int getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Código deve ser positivo.");
        }
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título não pode ser vazio.");
        }
        this.titulo = titulo.trim();
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Título: " + titulo;
    }
}
