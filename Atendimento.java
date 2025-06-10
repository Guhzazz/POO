/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valer
 */
public class Atendimento {
    private int codigo;
    private int data;
    private Cliente cliente;
    private Animal animal;
    private Funcionario funcionario;
    
    public Atendimento(int codigo, int data, Cliente cliente, Animal animal, Funcionario funcionario){
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
        this.animal = animal;
        this.funcionario = funcionario;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
