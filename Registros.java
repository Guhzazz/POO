/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valer
 */
public abstract class Registros{
    /**
     * Classe abstrata para facilitar a criação dos registros para
     * as classes "base"(Cliente, animal, funcionário, atendimento).
     */
    
    public Registros(){
        super();
    }
    
    public abstract void Consulta();
    
    public abstract void Remove();
    
    public abstract void Alteracao();
    
    public void Adiciona(){
        
    }
    
    public abstract void MostraRelatorio();
    
}
