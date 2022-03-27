package com.example.poo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.module.Configuration;


public class TelaDeCadastroDePessoa {

    @FXML
    private TextField textFieldNome;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private TextField textFieldEndereco;
    @FXML
    private TextField textFieldIdade;
    @FXML
    private Button buttonVoltar;
    @FXML
    private Button buttonSalvar;

    @FXML
    public void onButtonVoltarAction(){

    }

    @FXML
    public void onButtonSalvarAction(){

        String nome = textFieldNome.getText();
        String email = textFieldEmail.getText();
        String endereco = textFieldEndereco.getText();
        int idade = Integer.parseInt(textFieldIdade.getText());

        System.out.println( nome + " " + email + " " + endereco + " "+ idade);


        Pessoa pessoa = new Pessoa(null,nome, email, endereco, idade);


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager fm = emf.createEntityManager();

        fm.getTransaction().begin();


        fm.persist(pessoa);

        System.out.println(pessoa);

        fm.getTransaction().commit();

        emf.close();
        fm.close();
    }
}
