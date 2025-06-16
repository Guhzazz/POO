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

public class Registro_Fu extends Registros{
    private Funcionario funcionario;
    
    HashMap<Integer, Funcionario> RegistroFu = new HashMap<>();
    public Registro_Fu(){
        
    }
    @Override
    public void Consulta()
            /**
             * Busca por um funcionário em RegistroFu
             */
    throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if(RegistroFu.isEmpty()){
            System.out.println("Nenhum funcionário registrado para consulta.");
        }
        System.out.println("Digite o Número de matrícula do funcionário para consulta");
        int numeroConsulta = leitura.nextInt();
        Funcionario funcionarioEncontrado = RegistroFu.get(numeroConsulta);
        // inicializei o objeto pra consertar o erro null
        if(RegistroFu.containsKey(numeroConsulta)){
            System.out.println("Resultado da consulta:\n");
            System.out.println("Nome: "+funcionarioEncontrado.getNome());
            System.out.println("Número de matrícula: "+funcionarioEncontrado.getNumeroMatricula());
            System.out.println("Descrição da função: "+funcionarioEncontrado.getDescricaoFuncao());
            System.out.println("Carga horária: "+funcionarioEncontrado.getCargaHoraria());
        }
        else{
            System.out.println("Funcionário não encontrado");
        }
        
        
    }
    @Override
    public void Remove()
            /**
             * Remove um funcionário de RegistroFu
             */
    throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroFu.isEmpty()){
            System.out.println("Nenhum funcionário para remover.");
    }
        System.out.println("Digite o número de matrícula do funcionário para remoção:\n");
        String numeroRemocao = leitura.nextLine();
        if (RegistroFu.containsKey(numeroRemocao)){
            RegistroFu.remove(numeroRemocao);
            System.out.println("Cliente removido com sucesso!");
        }
        else{
            System.out.println("Funcionário não encontrado.");
        }
    }

    
    public void Adiciona(Funcionario funcionario)
            /**
             * Adiciona um novo funcionário à RegistroFu
             */
    throws InputMismatchException{
        RegistroFu.put(funcionario.getNumeroMatricula(), funcionario);
        System.out.println("Funcionário registrado com sucesso!");
    }
    
    @Override
    public void Alteracao()
            /**
             * Altera um funcionário já existente em RegistroFu
             */
    throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroFu.isEmpty()){
            System.out.println("Nenhum funcionário cadastrado para alteração");
        }
        System.out.println("Digite o numero de matrícula do cliente que deseja alterar.");
        int nmrOriginal = leitura.nextInt();
        leitura.nextLine();// tive que adicionar para a quebra de linha funcionar direito
        
        if(RegistroFu.containsKey(nmrOriginal)){
            Funcionario funcionarioParaAlterar = RegistroFu.get(nmrOriginal);
            
            System.out.println("Digite o novo nome do funcionário:\n");
            String novoNome = leitura.nextLine();
            
            System.out.println("Digite o novo numero de matrícula do funcionário:\n");
            int novoNumero = leitura.nextInt();
            
            System.out.println("Digite a nova descrição da função do funcionário:\n");
            String novaDescricao = leitura.nextLine();
            
            System.out.println("Digite a nova carga horária do funcionário:\n");
            float novaCarga = leitura.nextFloat();
            
            
            RegistroFu.remove(nmrOriginal);
            funcionarioParaAlterar.setNome(novoNome);
            funcionarioParaAlterar.setNumeroMatricula(novoNumero);
            funcionarioParaAlterar.setDescricaoFuncao(novaDescricao);
            funcionarioParaAlterar.setCargaHoraria(novaCarga);
            
            RegistroFu.put(funcionarioParaAlterar.getNumeroMatricula(), funcionarioParaAlterar);
            System.out.println("Dados do funcionário alterados com sucesso!");
        }
        else{
            System.out.println("\nFuncionário não encontrado para realizar a alteração.");
        }
    }
    
    @Override
    public void MostraRelatorio(){
        /**
         * Exibe um relatório de todos os funcionários cadastrados
         */
        if (RegistroFu.isEmpty()){
            System.out.println("Nenhum funcionário cadastrado.");
        }
        else{
            for (Funcionario funcionario : RegistroFu.values()){
                System.out.println("\n-----Funcionários cadastrados-----\n");
                System.out.println("Nome: "+ funcionario.getNome());
                System.out.println("Número de matrícula: "+ funcionario.getNumeroMatricula());
                System.out.println("Qualificação: "+ funcionario.getQualificacao());
                System.out.println("Descrição da função: "+ funcionario.getDescricaoFuncao());
                System.out.println("Carga horária: "+ funcionario.getCargaHoraria());
                
            }
        }
    }
}
