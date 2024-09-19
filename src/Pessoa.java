import java.time.LocalDate;

public class Pessoa {
    public long pes_id;

    public String pes_nome;

    public LocalDate pes_data_nascimento;

    private String sexo;

    private String pes_mae;

    public String endereco_completo;

    private String email;

    private String telefone;

    public String foto;

    public static long geraProxId = 0;

    public boolean clienteAtivo;

    public Pessoa() {

    }

    public Pessoa(String pes_nome, LocalDate pes_data_nascimento, String sexo, String pes_mae, String endereco_completo, String email, String telefone, String foto) {
        this.pes_id = getGeraProxId();
        this.pes_nome = pes_nome;
        this.pes_data_nascimento = pes_data_nascimento;
        this.sexo = sexo;
        this.pes_mae = pes_mae;
        this.endereco_completo = endereco_completo;
        this.email = email;
        this.telefone = telefone;
        this.foto = foto;
        this.clienteAtivo = true;
    }

    public static long getGeraProxId() {
        return geraProxId++;
    }

    public long getPes_id() {
        return pes_id;
    }

    public String getPes_nome() {
        return pes_nome;
    }

    public LocalDate getPes_data_nascimento() {
        return pes_data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPes_mae() {
        return pes_mae;
    }

    public String getEndereco_completo() {
        return endereco_completo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getFoto() {
        return foto;
    }

    public void setPes_id(long pes_id) {
        this.pes_id = pes_id;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public void setPes_data_nascimento(LocalDate pes_data_nascimento) {
        this.pes_data_nascimento = pes_data_nascimento;
    }

    public void setPes_mae(String pes_mae) {
        this.pes_mae = pes_mae;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco_completo(String endereco_completo) {
        this.endereco_completo = endereco_completo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean inativarCliente() {
        return this.clienteAtivo = false;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pes_id=" + pes_id +
                ", pes_nome='" + pes_nome + '\'' +
                ", pes_data_nascimento=" + pes_data_nascimento +
                ", sexo='" + sexo + '\'' +
                ", pes_mae='" + pes_mae + '\'' +
                ", endereco_completo='" + endereco_completo + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
