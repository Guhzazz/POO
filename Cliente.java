/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valer
 */
public class Cliente {
    private String nome;
    private String email;
    private long telefone;
    private long RG;
    private long CPF;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String email, long telefone, long RG, long CPF){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.RG = RG;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }

    public long getRG() {
        return RG;
    }

    public long getCPF() {
        return CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
    
}
