package com.example.taller3;


import javax.persistence.*;

@Entity
@Table(name = "persona")

public class persona {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    private String apellidos;
    private int documento;
    private String email;
    private String date;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }
    
}