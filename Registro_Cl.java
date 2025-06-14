/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valer
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Registro_Cl extends Registros {
    private Cliente cliente;
    HashMap<Long, Cliente> RegistroCl = new HashMap<>();
    
    public Registro_Cl(){
        
    }
    
    @Override
    public void Consulta()
            /**
             * Busca por um dado cliente dentro da estrutura Hash RegistroCl
             */
        throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroCl.isEmpty()){
            System.out.println("Nenhum cliente registrado para consulta.");
        }
        System.out.println("Digite o CPF do cliente para consulta\n");
        long cpfConsulta = leitura.nextLong();
        Cliente clienteEncontrado = RegistroCl.get(cpfConsulta);
        if (RegistroCl.containsKey(cpfConsulta)){
            System.out.println("Resultado da consulta:\n");    
            System.out.println("Nome: "+clienteEncontrado.getNome());
            System.out.println("Email: "+clienteEncontrado.getEmail());
            System.out.println("Telefone: "+clienteEncontrado.getTelefone());
            System.out.println("CPF: "+clienteEncontrado.getCPF());
            System.out.println("RG: "+ clienteEncontrado.getRG());
        }
        else{
            System.out.println("Cliente não encontrado.");
        }
        
    }
    
    @Override
    public void Remove()
            /**
             * Remove um dado cliente da estrutura Hash RegistroCl
             */
    throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroCl.isEmpty()){
            System.out.println("Nenhum cliente para remover.");
        }
        System.out.println("Digite o CPF do cliente para remoção:\n");
        long cpfRemocao = leitura.nextLong();
        if (RegistroCl.containsKey(cpfRemocao)){
            RegistroCl.remove(cpfRemocao);
            System.out.println("Cliente removido com sucesso!");
        }
        else{
            System.out.println("Cliente não encontrado.");
        }
        
    }
    
    
    public void Adiciona(Cliente cliente)
            /**
             * Adiciona um novo cliente à RegistroCl
             */
    throws InputMismatchException{
        RegistroCl.put(cliente.getCPF(), cliente);
        System.out.println("Cliente registrado com sucesso!");
    }
    
    @Override
    public void Alteracao()
            /** 
             * Altera os dados de um cliente já registrado em RegistroCl
             */
    throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroCl.isEmpty()){
            System.out.println("Nenhum cliente cadastrado para alteração");
        }
        System.out.println("Digite o CPF do cliente que deseja alterar.");
        long cpfOriginal = leitura.nextLong();
        
        if(RegistroCl.containsKey(cpfOriginal)){
            Cliente clienteParaAlterar = RegistroCl.get(cpfOriginal);
            
            System.out.println("Digite o novo Nome do cliente:\n");
            String novoNome = leitura.nextLine();
            
            System.out.println("Digite o novo email do cliente:\n");
            String novoEmail = leitura.nextLine();
            
            System.out.println("Digite o novo telefone do cliente:\n");
            long novoTelefone = leitura.nextLong();
            
            System.out.println("Digite o novo CPF do cliente:\n");
            long novoCPF = leitura.nextLong();
            
            System.out.println("Digite o novo RG do cliente:\n");
            long novoRG = leitura.nextLong();
            
            RegistroCl.remove(cpfOriginal);
            clienteParaAlterar.setNome(novoNome);
            clienteParaAlterar.setEmail(novoEmail);
            clienteParaAlterar.setTelefone(novoTelefone);
            clienteParaAlterar.setCPF(novoCPF);
            clienteParaAlterar.setRG(novoRG);
            
            RegistroCl.put(clienteParaAlterar.getCPF(), clienteParaAlterar);
            System.out.println("Dados do cliente alterados com sucesso!");
        }
        else{
            System.out.println("\nCliente não encontrado para realizar a alteração.");
        }
    }
    
    @Override
    public void MostraRelatorio(){
        /**
         * Mostra um relatório de todos os clientes cadasatrados em RegistroCl
         */
        if (RegistroCl.isEmpty()){
            System.out.println("Nenhum cliente cadastrado.");
        }
        else{
            for(Cliente cliente :RegistroCl.values()){
                System.out.println("\n-----Clientes cadastrados-----\n");
                System.out.println("Nome: "+ cliente.getNome());
                System.out.println("Email: "+ cliente.getEmail());
                System.out.println("Telefone: "+ cliente.getTelefone());
                System.out.println("RG: "+ cliente.getRG());
                System.out.println("CPF: "+ cliente.getCPF());
            }
        }
    }
}
