package org.example;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity //falando para o jpa que essa classe vai gerar uma tabela pessoa no banco
//@Table(name = "alguem")//pra mudar o nome da tabela

public class Pessoa implements Serializable {
    //private static final long serialVersionUID = 1L;
    @Id //diz que o id é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incrementa
    private Integer id;
    //@Column(name="algo") pra mudar o nome da coluna
    private String nome;
    private String email;

    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome) && Objects.equals(email, pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
