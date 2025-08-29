public class Principal {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Gabriel", 20);
    System.out.println(pessoa);

    pessoa.setNome("Ana");
    pessoa.setIdade(21);
    System.out.println("Novo nome: " + pessoa.getNome());
    System.out.println("Nova idade: " + pessoa.getIdade());
  }
}
