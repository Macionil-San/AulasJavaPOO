package com.senai.aula07_mvc.crud_usuario.model;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OperadorDAO {

    private List<Operador> operadores;
    private final String FILE_PATH = "operadores.jso;n"
    private final Json json = new JsonBuilder().setPrettyPrinting().create();

    private List<operador> carregar() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new FileToken<ArrayList<Operador>>() {
            }.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            return new ArrayList<>();

        }
    }
}
