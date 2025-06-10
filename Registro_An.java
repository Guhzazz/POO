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

public class Registro_An extends Registros {
    private Animal animal;
    HashMap<String, Animal> RegistroAn = new HashMap<>();
    
    
    public Registro_An(){
        
    }
    
    @Override
    public void Consulta(){
        Scanner leitura = new Scanner(System.in);
        if (RegistroAn.isEmpty()){
            System.out.println("Nenhum animal cadastrado para consulta.");
        }
        System.out.println("Digite o nome do animal para consulta\n");
        String nomeConsulta = leitura.nextLine();
        if (RegistroAn.containsKey(nomeConsulta)){
            Animal animal = RegistroAn.get(nomeConsulta);
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
        Scanner leitura = new Scanner(System.in);
        if (RegistroAn.isEmpty()){
            System.out.println("Nenhum animal para remover.");
        }
        System.out.println("Digite o nome do animal para remoção:\n");
        String nomeRemocao = leitura.nextLine();
        if (RegistroAn.containsKey(nomeRemocao)){
            RegistroAn.remove(nomeRemocao);
            System.out.println("Animal removido com sucesso!");
        }
        else{
            System.out.println("Animal não encontrado.");
        }
    }
    
    public void Adiciona(Animal animal){
        RegistroAn.put(animal.getNome(), animal);
        System.out.println("Animal adicionado com sucesso!");
    }
    
    @Override
     public void Alteracao() {
        Scanner leitura = new Scanner(System.in);
        if (RegistroAn.isEmpty()) {
            System.out.println("Nenhum animal cadastrado para alteração.");
        }

        System.out.println("Digite o nome do animal que deseja alterar:");
        String nomeOriginal = leitura.nextLine();

        if (RegistroAn.containsKey(nomeOriginal)) {
            Animal animalParaAlterar = RegistroAn.get(nomeOriginal);

            System.out.println("Digite o novo nome do animal:");
            String novoNome = leitura.nextLine();

            System.out.println("Digite o novo peso do animal:");
            float novoPeso = leitura.nextFloat();

            System.out.println("Digite a nova altura do animal:");
            float novaAltura = leitura.nextFloat();
            leitura.nextLine();

           
            RegistroAn.remove(nomeOriginal);

            animalParaAlterar.setNome(novoNome);
            animalParaAlterar.setPeso(novoPeso);
            animalParaAlterar.setAltura(novaAltura);

            RegistroAn.put(animalParaAlterar.getNome(), animalParaAlterar);

            System.out.println("Dados do animal alterados com sucesso!");

        } else {
            System.out.println("\nAnimal não encontrado no registro.");
        }
    }


    @Override
    public void MostraRelatorio(){
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

