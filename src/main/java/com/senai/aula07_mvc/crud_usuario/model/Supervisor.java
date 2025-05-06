package com.senai.aula07_mvc.crud_usuario.model;

public class Supervisor extends Usuario{
    private String area;

    public Supervisor(String nome, int id, String area) {
        super(nome, id);
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("id: %d, Nome: %s, Area: %s", super.getId(),super.getNome(), area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
