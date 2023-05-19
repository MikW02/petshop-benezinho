import Model.Modelo.Animal;
import Model.Modelo.Serviço;
import Model.Pessoas.PessoaFisica;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     //   String escolha = JOptionPane.showInputDialog("é pessoa juridica digite Sim");




        PessoaFisica user = new PessoaFisica();
        int id;
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite seu id: "));
        user.setId(id);

        String nomeuser;
        nomeuser = JOptionPane.showInputDialog("Digite seu nome ");
        user.setNome(nomeuser);

        String cpflocal;
        cpflocal = JOptionPane.showInputDialog("Digite seu cpf ");
        user.setCPF(cpflocal);




        Animal animal = new Animal();
        int idanimal;
        idanimal = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do seu animal: "));
        animal.setId(idanimal);


        String nomeanimal;
        nomeanimal = JOptionPane.showInputDialog("digite o nome do seu animal");
        animal.setRaça(nomeanimal);


        String raça;
        raça = JOptionPane.showInputDialog("digite a raça");
        animal.setRaça(raça);



        String obs;
        obs= JOptionPane.showInputDialog("observação");
        animal.setObservacao(obs);



        String des;
        des= JOptionPane.showInputDialog("descrição");
        animal.setDescricao(des);

        Serviço serv = new Serviço();
        int ids;
        ids = Integer.parseInt(JOptionPane.showInputDialog("Digite id do serviço: "));
        serv.setId(ids);

        String nomes;
        nomes = JOptionPane.showInputDialog("Digite o nome do servico");
        serv.setNome(nomes);

        String valor;
        valor = JOptionPane.showInputDialog("Digite o valor ");
        serv.setValor(Integer.parseInt(valor));





        System.out.println(serv);
        System.out.println(user);
        System.out.println(animal);





    }
}