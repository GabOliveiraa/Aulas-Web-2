public class Pessoa {
 private String nome;
 private int idade;
 
 public Pessoa(String nome, int idade) {
    setNome(nome);
    setIdade(idade);
 }

 public String getNome() {
    return nome;
 }

 public void setNome(String nome) {
    if( nome == null || nome.isBlank()) {
        throw new IllegalArgumentException("Nome não pode ser vazio.");
    }
    this.nome = nome;
 }
  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    if (idade < 0 || idade > 150) {
        throw new IllegalArgumentException("Idade inválida.");
    }
    this.idade = idade;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + ", idade: " + idade;
  }
}
