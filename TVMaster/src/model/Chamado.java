package model;

public class Chamado {
    private String motivo, solucao;
    private int data, cpf, protocolo;
    private Tecnico tecnico;
    private boolean situacao;
    private Cliente solicitante;

    public Chamado(String motivo, String solucao, int data, int cpf, int protocolo, boolean situacao, Cliente solicitante) {
        this.motivo = motivo;
        this.solucao = solucao;
        this.data = data;
        this.cpf = cpf;
        this.protocolo = protocolo;
        this.situacao = situacao;
        this.solicitante = solicitante;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public Cliente getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Cliente solicitante) {
        this.solicitante = solicitante;
    }

    
    public String fecharChamado(){
        if (this.situacao){
            this.situacao = false;
            return "O chamado foi fechado com sucesso!";
        }
        return "O chamado já encontrava-se fechado!";
    }
    
    public void alocarTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }
 
}
