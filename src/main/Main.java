package src.main;

import src.model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Criação da lista com homens e mulheres
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "F"));
        pessoas.add(new Pessoa("Rodrigo", "M"));
        pessoas.add(new Pessoa("Beatriz", "F"));
        pessoas.add(new Pessoa("Carlos", "M"));
        pessoas.add(new Pessoa("Mariana", "F"));
        pessoas.add(new Pessoa("Paulo", "M"));

        // Impressão da lista original no console
        System.out.println("Lista original:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + "-" + pessoa.getGenero());
        }

        // Criação de outra lista filtrando apenas as mulheres usando lambda
        List<Pessoa> mulheres = pessoas.stream()
            .filter(pessoa -> {
                if ("F".equals(pessoa.getGenero())) {
                    return true;
                } else {
                    return false;
                }
            })
            .collect(Collectors.toList());

        // Impressão da lista de mulheres no console
        System.out.println("\nLista de mulheres:");
        for (Pessoa mulher : mulheres) {
            System.out.println(mulher.getNome());
        }
    }
}
