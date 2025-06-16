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

public class Registro_At extends Registros{
    private Atendimento atendimento;
    HashMap<Integer, Atendimento> RegistroAt = new HashMap<>();
    public Registro_At(){
        
    }
    
    @Override
    public void Consulta()
            /**
             * Busca por um atendimento em RegistroAt
             */
    throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroAt.isEmpty()){
            System.out.println("Nenhum atendimento registrado para consulta.");
        }
        System.out.println("Digite o código do atendimento para consulta.");
        int codigoConsulta = leitura.nextInt();
        leitura.nextLine();// tive que adicionar para a quebra de linha funcionar direito
        
        if(RegistroAt.containsKey(codigoConsulta)){
            Atendimento atendimentoEncontrado = RegistroAt.get(codigoConsulta);
            //inicializei o objeto pra consertar o erro null
            System.out.println("Resultado da consulta:\n");
            System.out.println("Código do atendimento: "+ codigoConsulta);
            System.out.println("Data do atendimento: "+ atendimentoEncontrado.getData());
            System.out.println("Cliente: "+atendimentoEncontrado.getCliente().getNome());
            System.out.println("Animal: "+atendimentoEncontrado.getAnimal().getNome());
            System.out.println("Funcionário: "+atendimentoEncontrado.getFuncionario().getNome());
        }
        else{
            System.out.println("Atendimento não encontrado.");
        }
        
    }
    
    @Override
    public void Remove()
            /**
             * Remove um atendimento de RegistroAt
             */
    throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroAt.isEmpty()){
            System.out.println("Nenhum atendimento para remover.");
        }
        System.out.println("Digite o código do atendimento para remoção.");
        int codigoRemocao = leitura.nextInt();
        if (RegistroAt.containsKey(codigoRemocao)){
            RegistroAt.remove(codigoRemocao);
            System.out.println("Atendimento removido com sucesso!");
        }
        else{
            System.out.println("Atendimento não encontrado");
        }
        
    }
    

    public void Adiciona(Atendimento atendimento)
            /**
             * Adiciona um novo atendimento à RegistroAt
             */
    throws InputMismatchException{
        RegistroAt.put(atendimento.getCodigo(), atendimento);
        System.out.println("Atendimento registrado com sucesso!");
    }
    
    @Override
    public void Alteracao()
            /**
             * Altera um objeto já existente em RegistroAt
             */
    throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroAt.isEmpty()){
            System.out.println("Nenhum atendimento cadastrado para alteração");
        }
        System.out.println("Digite o código do atendimento que deseja alterar.");
        int codigoOriginal = leitura.nextInt();
        
        if(RegistroAt.containsKey(codigoOriginal)){
            Atendimento atendimentoParaAlterar = RegistroAt.get(codigoOriginal);
            
            System.out.println("Digite o novo código do atendimento:\n");
            int novoCodigo = leitura.nextInt();
            
            System.out.println("Digite a nova data(modelo DDMMAAAA) do atendimento:\n");
            int novaData = leitura.nextInt();
            
            System.out.println("Digite os CPF do novo cliente no atendimento:\n");
            int cpfNovo = leitura.nextInt();
            Cliente novoCliente = new Cliente();
            novoCliente.setCPF(cpfNovo);
            
            System.out.println("Digite o nome do animal no atendimento:\n");
            String nomeNovo = leitura.nextLine();
            Animal novoAnimal = new Animal();
            novoAnimal.setNome(nomeNovo);
            
            System.out.println("Digite o número de matrícula do funcionário no atendimento:\n");
            int numeroNovo = leitura.nextInt();
            Funcionario novoFuncionario = new Funcionario();
            novoFuncionario.setNumeroMatricula(numeroNovo);
            
            RegistroAt.remove(codigoOriginal);
            atendimentoParaAlterar.setCodigo(novoCodigo);
            atendimentoParaAlterar.setData(novaData);
            atendimentoParaAlterar.setCliente(novoCliente);
            atendimentoParaAlterar.setAnimal(novoAnimal);
            atendimentoParaAlterar.setFuncionario(novoFuncionario);
            
            RegistroAt.put(atendimentoParaAlterar.getCodigo(), atendimentoParaAlterar);
        }
        else{
            System.out.println("\nAtendimento não encontrado para realizar a alteração.");
        }
    }
    
    @Override
    public void MostraRelatorio(){
        /**
         * Exibe um relatório de todos os atendimentos cadastrados
         */
        if (RegistroAt.isEmpty()){
            System.out.println("Nenhum atendimento registrado.");
        }
        else{
            for(Atendimento atendimento : RegistroAt.values()){
                System.out.println("\n-----Atendimentos cadastrados-----\n");
                System.out.println("Código do atendiomento: "+atendimento.getCodigo());
                System.out.println("Data do atendimento: "+atendimento.getData());
                System.out.println("Cliente: "+atendimento.getCliente().getNome());
                System.out.println("Animal: "+atendimento.getAnimal().getNome());
                System.out.println("Funcionário: "+atendimento.getFuncionario().getNome());
            }
        }
    }
}
