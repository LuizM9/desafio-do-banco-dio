public class Cliente {

    private Banco banco;
    private String nome;

    public Cliente(String nome, Banco banco){
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    public Cliente(Banco banco, String nome) {
        this.banco = banco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }
    @Override
    public String toString() {
        return "Cliente {" +
                "banco=" + banco.getNome() + ", nome='" + this.getNome() +
                '}';
    }
}
