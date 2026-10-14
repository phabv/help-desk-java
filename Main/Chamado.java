public class Chamado {
    private long id;
    private String descricao;
    private String prioridade;
    private String status;

    public Chamado(long id, String descricao, String prioridade, String status) {
        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override 
    public String toString() {
        return ("ID: " + id +"\n " + "\n" + "Descrição: " + descricao + "\n" + "Prioridade: " + prioridade + "\n" + "Status: " + status);
    }
}

