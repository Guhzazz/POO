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

public class Registro_An extends Registros {
    private Animal animal;
    HashMap<Integer, Animal> RegistroAn = new HashMap<>();
    
    
    public Registro_An(){
        
    }
    
    @Override
    public void Consulta(){
        /**
         * Busca por um animal em RegistroAn
         */
        Scanner leitura = new Scanner(System.in);
        if (RegistroAn.isEmpty()){
            System.out.println("Nenhum animal cadastrado para consulta.");
        }
        System.out.println("Digite o id do animal para consulta\n");
        int idConsulta = leitura.nextInt();
        if (RegistroAn.containsKey(idConsulta)){
            Animal animal = RegistroAn.get(idConsulta);
            System.out.println("Resultado da Consulta:\n");
            System.out.println("Nome: "+ animal.getNome());
            System.out.println("Peso: "+ animal.getPeso());
            System.out.println("Altura: "+ animal.getAltura());
    }
        else{
            System.out.println("Animal não encontrado");
        }
        
    }
    @Override
    public void Remove(){
        /**
         * Remove um animal de RegistroAn
         */
        Scanner leitura = new Scanner(System.in);
        if (RegistroAn.isEmpty()){
            System.out.println("Nenhum animal para remover.");
        }
        System.out.println("Digite o id do animal para remoção:\n");
        int idRemocao = leitura.nextInt();
        if (RegistroAn.containsKey(idRemocao)){
            RegistroAn.remove(idRemocao);
            System.out.println("Animal removido com sucesso!");
        }
        else{
            System.out.println("Animal não encontrado.");
        }
    }
    
    public void Adiciona(Animal animal){
        /**
         * Adiciona um novo animal à RegistroA
         */

        if (RegistroAn.containsKey(animal.getId())){
            System.out.println("Id de animal já registrado.");
        }
        else{
        RegistroAn.put(animal.getId(), animal);
        System.out.println("Animal adicionado com sucesso!");
        }
    }
        
    
    @Override
     public void Alteracao()
             /**
              * Altera um animal já existente em RegistroAn
              */
     throws InputMismatchException{
        Scanner leitura = new Scanner(System.in);
        if (RegistroAn.isEmpty()) {
            System.out.println("Nenhum animal cadastrado para alteração.");
        }

        System.out.println("Digite o id do animal que deseja alterar:");
        int idOriginal = leitura.nextInt();

        if (RegistroAn.containsKey(idOriginal)) {
            Animal animalParaAlterar = RegistroAn.get(idOriginal);

            System.out.println("Digite o novo nome do animal:");
            String novoNome = leitura.nextLine();

            System.out.println("Digite o novo peso do animal:");
            float novoPeso = leitura.nextFloat();

            System.out.println("Digite a nova altura do animal:");
            float novaAltura = leitura.nextFloat();
            leitura.nextLine();

           
            RegistroAn.remove(idOriginal);

            animalParaAlterar.setNome(novoNome);
            animalParaAlterar.setPeso(novoPeso);
            animalParaAlterar.setAltura(novaAltura);

            RegistroAn.put(animalParaAlterar.getId(), animalParaAlterar);

            System.out.println("Dados do animal alterados com sucesso!");

        } else {
            System.out.println("\nAnimal não encontrado no registro.");
        }
    }


    @Override
    public void MostraRelatorio(){
        /**
         * Exibe todos os animais cadastrados em RegistroAn
         */
        if (RegistroAn.isEmpty()){
            System.out.println("Nenhum animal cadastrado.");
        }
        else{
            System.out.println("\n-----Animais cadastrados-----\n");
            for(Animal animal : RegistroAn.values()){
                System.out.println("Nome: "+ animal.getNome());
                System.out.println("Altura: "+ animal.getAltura());
                System.out.println("Peso: "+ animal.getPeso());
            }
        }
    }
   
}

