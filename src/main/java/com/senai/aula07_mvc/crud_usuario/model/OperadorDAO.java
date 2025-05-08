package com.senai.aula07_mvc.crud_usuario.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class OperadorDAO {
    private List<Operador> operadors;
    private final String FILE_PATH = "operadores.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private List<Operador> carregar(){
        try (FileReader reader = new FileReader(FILE_PATH)){
            Type listType = new TypeToken<ArrayList<Operador>>() {}.getType();
            return gson.fromJson(reader, listType);
        }catch (IOException e){
            return new ArrayList<>();
        }
    }

    public OperadorDAO(){
        operadors = carregar();
    }
    public void salvar(Operador operador){
        operadors.add(operador);
    }
    public void salvarJson(){
        try (FileWriter writer = new FileWriter(FILE_PATH)){
            gson.toJson(operadors, writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public List<Operador> listar(){
        return operadors;
    }
    public void atualizar(Operador operador){
        operadors.forEach(o->{
            if (o.getId() == operador.getId()){
                o.setNome(operador.getNome());
                o.setSetor(operador.getSetor());
                salvarJson();
            }
        });
    }
    public boolean deletar(int id){
        Iterator<Operador> iterator = operadors.iterator();
        while (iterator.hasNext()){
            Operador o = iterator.next();
            if (o.getId()==id){
                iterator.remove();
                salvarJson();
                return true;
            }
        }
        return false;
    }
}
