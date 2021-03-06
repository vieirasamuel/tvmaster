package model;

import controller.CanalDAO;
import java.util.ArrayList;

public class Canal {
    private String nome;
    private float preco;
    private int numero;
    
    public Canal(String nome, float preco, int numero){
        this.nome = nome;
        this.preco = preco;
        this.numero = numero;
    }

    public Canal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public ArrayList<Canal> pesquisarCategoria(String nomeCategoria){
        CanalDAO canalDAO = new CanalDAO();
        return canalDAO.pesquisarCanaisCategoria(nomeCategoria);
    }
    
    public boolean excluirCanais(int idCategoria){
        CanalDAO canalDAO = new CanalDAO();
        return canalDAO.excluirCanaisCategoria(idCategoria);
    }
    
}
