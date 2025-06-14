/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valer
 */
public class Animal {
    private String nome;
    private int id;
    private float peso;
    private float altura;
    
    public Animal(){
        
    }
    
    public Animal(String nome, float peso, float altura, int id){
        this.nome = nome;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
    
    public int getId(){
        return id;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
