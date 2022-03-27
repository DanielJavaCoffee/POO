package com.example.poo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Pessoa implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String nome;
        private String email;
        private String endereco;
        private int idade;

        public Pessoa(){

        }

        public Pessoa(Integer id, String nome, String email, String endereco, int idade){
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.endereco = endereco;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "id: " + id + ", nome: " + nome + '\'' + ", email: " + email + '\'' + ", idade: " + idade + '\'' + " endereço: " + endereco;
        }

        public Integer getId(){
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail(){
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public int getIdade(){
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

}


