/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valer
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static Registro_Cl registrocl = new Registro_Cl();
    private static Registro_An registroan = new Registro_An();
    private static Registro_Fu registrofu = new Registro_Fu();
    private static Registro_At registroat = new Registro_At();
    
    public static void main(String[] args){
        Menu_geral();
}
    
public static void Menu_geral(){
    /**
     * Função principal do menu, apresenta a aparencia do sistema e chama as funções
     * responsáveis por cada funcionalidade.
     */
Scanner leitura = new Scanner(System.in);
        int escolha = -1;
        boolean loop = true;
        do{
            try{
                while ( escolha != 0){
                    System.out.println("\nBem-vindo ao Menu Pet-shop!\n"
                    + "Para realizar um cadastro, digite (1)\n"
                    + "Para realizar uma consulta, digite (2)\n"
                    + "Para realizar uma alteração, digite (3)\n"
                    + "Para realizar uma remoção, digite (4)\n"
                    + "Para vizualizar um relatório, digite (5)\n"
                    + "Para sair, digite (0)\n"
                    + "Escolha uma opção:");
                escolha = leitura.nextInt();
            
                switch (escolha){
                    case 1:
                        Menu_cadastro();
                        break;
                    
                    case 2:
                        Menu_consulta();
                        break;
                    
                    case 3:
                        Menu_alteracao();
                        break;
                    
                    case 4:
                        Menu_remocao();
                        break;
                    
                    case 5:
                        Menu_relatorio();
                        break;
                    
                    case 0:
                        System.out.println("Saindo do sistema...Até logo!");
                        break;
                }
                loop = false;
                }
            }
            
            catch(InputMismatchException e){
                System.out.println("Exceção: "+ e);
                leitura.nextLine();
                System.out.println("Por favor, entre com valores numéricos.");
        }
        }while(loop);
}
        

    
    public static void  Menu_cadastro(){
        /**
         * Abriga a aparência do menu de cadastro e chama as funções de cadastro individual de cada classe.
         */
        Scanner leitura = new Scanner(System.in);
        boolean loop = true;
        do{
            try{
                
            System.out.println("O que deseja cadastrar?\n"
                    + "Para Cliente: (1)\n"
                    + "Para Animal: (2)\n"
                    + "Para Funcionário: (3)\n"
                    + "Para Atendimento: (4)\n"
                    + "Para voltar: (0)\n");
            
            int escolha = leitura.nextInt();
            switch (escolha){
                case 1:
                    cadastro_cliente();
                    break;
                    
                case 2:
                    cadastro_animal();
                    break;
                    
                case 3:
                    cadastro_funcionario();
                    break;
                    
                case 4:
                    cadastro_atendimento();
                    break;
                    
                case 0:
                    Menu_geral();
                    break;
            }
            loop = false;
                    }
            catch(InputMismatchException e){
                System.out.println("Exceção: "+ e);
                leitura.nextLine();
                System.out.println("Por favor, entre com valores numéricos.");
        }
        }while(loop);
}
    
    public static Cliente cadastro_cliente(){
        /**
         * Adiciona um novo cliente ao seu registro;
         */
        Scanner leitura = new Scanner(System.in);
                System.out.println("Digite o nome do cliente:\n");
                String nome = leitura.nextLine();
                
                System.out.println("Digite o email do cliente: \n ");
                String email = leitura.nextLine();
                
                System.out.println("Digite o telefone do cliente: \n");
                Long telefone = leitura.nextLong();
                
                System.out.println("Digite o RG do cliente: \n");
                Long RG = leitura.nextLong();
                
                System.out.println("Digite o CPF do cliente: \n");
                Long CPF = leitura.nextLong();
                
                Cliente cliente = new Cliente(nome, email, telefone, RG, CPF);
                registrocl.Adiciona(cliente);
                return cliente;
    }
    
    
            public static Animal cadastro_animal(){
                /**
                 * Adiciona um novo animal ao seu registro.
                 */
                Scanner leitura = new Scanner(System.in);
                System.out.println("Digite o nome do animal:\n");
                String nome = leitura.nextLine();
                
                System.out.println("Digite um ID para o animal: \n");
                int id = leitura.nextInt();
                
                System.out.println("Digite o peso do animal: \n");
                float peso = leitura.nextFloat();
                
                System.out.println("Digite a altura do animal: \n");
                float altura = leitura.nextFloat();
                Animal animal = new Animal(nome,altura, peso, id);
                registroan.Adiciona(animal);
                return animal;
}
                
            
            public static Funcionario cadastro_funcionario(){
                /**
                 * Adiciona um novo funcionário ao seu registro.
                 */
                Scanner leitura = new Scanner(System.in);
                System.out.println("Digite o nome do funcionário: \n");
                String nome= leitura.nextLine();
                
                System.out.println("Digite o número de matrícula do funcionário: \n");
                int numeroMatricula = leitura.nextInt();
                
                System.out.println("Digite a qualificação do funcionário: \n");
                String qualificacao = leitura.nextLine();
                
                System.out.println("Digite a descrição da função executada pelo funcionário: \n");
                String descricaoFuncao = leitura.nextLine();
                
                System.out.println("Digite a carga horária do funcionário: \n");
                float cargaHoraria = leitura.nextFloat();
                
                Funcionario funcionario = new Funcionario(nome, numeroMatricula, qualificacao, descricaoFuncao, cargaHoraria);
                registrofu.Adiciona(funcionario);
                return funcionario;
            }
    
            public static void cadastro_atendimento(){
                /**
                 * Adiciona um novo atendimento ao seu registro.
                 */
                Scanner leitura = new Scanner(System.in);
                System.out.println("Digite o código do atendimento: \n");
                int codigo = leitura.nextInt();
                
                System.out.println("Digite a data do atendimento(formato DDMMAAAA)\n");
                int data = leitura.nextInt();
                
                System.out.println("Digite os dados do cliente: \n");
                Cliente cliente = cadastro_cliente();
                
                System.out.println("Digite os dados do animal: \n");
                Animal animal = cadastro_animal();
                
                System.out.println("Digite os dados do funcionário: \n");
                Funcionario funcionario = cadastro_funcionario();
                
                Atendimento atendimento = new Atendimento(codigo, data, cliente, animal, funcionario);
                registroat.Adiciona(atendimento);
    }
            
    
            public static void Menu_consulta(){
                /**
                 * Abriga a aparência do menu de consultas e faz a consulta do dado solicitado.
                 */
                Scanner leitura = new Scanner(System.in);
                boolean loop = true;
                do{
                    try{
                System.out.println("O que deseja consultar?\n"
                        + "Para Cliente: (1)\n"
                        + "Para Animal: (2)\n"
                        + "Para funcionário: (3)\n"
                        + "Para Atendimento: (4)\n"
                        + "Para voltar: (0)\n");
                int escolha = leitura.nextInt();
                switch (escolha){
                    case 1:
                        registrocl.Consulta();
                        break;
                        
                    case 2:
                        registroan.Consulta();
                        break;
                        
                    case 3:
                        registrofu.Consulta();
                        break;
                        
                    case 4:
                        registroat.Consulta();
                        break;
                        
                    case 0:
                        Menu_geral();
                        break;
                }
                loop = false;
                    }
                catch(InputMismatchException e){
                    System.out.println("Exceção: "+ e);
                    leitura.nextLine();
                    System.out.println("Por favor, entre com valores numéricos.");
        }
        }while(loop);
}
            
            
            public static void Menu_alteracao(){
                /**
                 * Abriga a aparência do menu de alteração e realiza a alteração do dado desejado.
                 */
                Scanner leitura = new Scanner(System.in);
                boolean loop = true;
                do{
                    try{
                System.out.println("Que alteração deseja realizar? \n"
                        + "Para alterar um Cliente: (1)\n"
                        + "Para alterar um Animal: (2)\n"
                        + "Para alterar um Funcionário: (3)\n"
                        + "Para alterar um Atendimento: (4)\n"
                        + "Para voltar: (0)\n");
                int escolha = leitura.nextInt();
                switch (escolha){
                    case 1:
                        registrocl.Alteracao();
                        break;
                       
                    case 2:
                        registroan.Alteracao();
                        break;
                        
                    case 3:
                        registrofu.Alteracao();
                        break;
                        
                    case 4:
                        registroat.Alteracao();
                        break;
                        
                    case 0:
                        Menu_geral();
                        break;
                }
                loop = false;
            }
                    catch(InputMismatchException e){
                        System.out.println("Exceção: "+ e);
                        leitura.nextLine();
                        System.out.println("Por favor, entre com valores numéricos.");
        }
        }while(loop);
}
            public static void Menu_remocao(){
                /**
                 * Abriga a aparencia do menu para remover e faz a remoção do dado desejado.
                 */
                Scanner leitura = new Scanner(System.in);
                boolean loop = true;
                do{
                    try{
                System.out.println("Selecione o que deseja remover: \n"
                        + "Para remover um cliente: (1)\n"
                        + "Para remover um animal: (2)\n"
                        + "Para remover um funcionário: (3)\n"
                        + "Para remover um atendimento: (4)\n"
                        + "Para voltar: (0)\n");
                int escolha = leitura.nextInt();
                switch (escolha){
                    case 1:
                        registrocl.Remove();
                        break;
                        
                    case 2:
                        registroan.Remove();
                        break;
                        
                    case 3:
                        registrofu.Remove();
                        break;
                        
                    case 4:
                        registroat.Remove();
                        break;
                        
                    case 0:
                        Menu_geral();
                        break;
                }
                loop = false;
            }
                    catch(InputMismatchException e){
                        System.out.println("Exceção: "+ e);
                        leitura.nextLine();
                        System.out.println("Por favor, entre com valores numéricos.");
        }
        }while(loop);
}
            
            
            public static void Menu_relatorio(){
                /**
                 * Abriga a aparência do menu de exibição de relatórios e mostra o relatório do dado desejado.
                 */
                Scanner leitura = new Scanner(System.in);
                boolean loop = true;
                do{
                    try{
                System.out.println("Para ver o relatório de clientes: (1)\n"
                        + "Para ver o relatório de animais: (2)\n"
                        + "Para ver o relatório de funcionários: (3)\n"
                        + "Para ver o relatório de atendimentos: (4)\n"
                        + "Para voltar: (0)\n");
                int escolha = leitura.nextInt();
                switch (escolha){
                    case 1:
                        registrocl.MostraRelatorio();
                        break;
                        
                    case 2:
                        registroan.MostraRelatorio();
                        break;
                       
                    case 3:
                        registrofu.MostraRelatorio();
                        break;
                        
                    case 4:
                        registroat.MostraRelatorio();
                        break;
                       
                    case 0:
                        Menu_geral();
                        break;
            }
                loop = false;
            }
                    catch(InputMismatchException e){
                        System.out.println("Exceção: "+ e);
                        leitura.nextLine();
                        System.out.println("Por favor, entre com valores numéricos.");
        }
        }while(loop);
}
}
            


                


