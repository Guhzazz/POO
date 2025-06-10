/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valer
 */
public class Funcionario {
    private String nome;
    private int numeroMatricula;
    private String qualificacao;
    private String descricaoFuncao;
    private float cargaHoraria;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, int numeroMatricula, String qualificacao, String descricaoFuncao, float cargaHoraria){
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.qualificacao = qualificacao;
        this.descricaoFuncao = descricaoFuncao;
        this.cargaHoraria = cargaHoraria;
        
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getQualificacao() {
        return qualificacao;
    }

    public String getDescricaoFuncao() {
        return descricaoFuncao;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }

    public void setDescricaoFuncao(String descricaoFuncao) {
        this.descricaoFuncao = descricaoFuncao;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
