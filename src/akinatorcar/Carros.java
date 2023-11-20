/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akinatorcar;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Carros {

    private static final Map<String, String> portasERespostas = new HashMap<>();
    private static final Map<String, String> bodyTypeERespostas = new HashMap<>();
    private String nome;
    perguntaAtual = "Pergunta inicial: O carro tem 2 ou 4 portas?";
    
    static {
        portasERespostas.put("2", "O carro é um sedã, SUV, hatchback, ou outro tipo?");
        portasERespostas.put("4", "O carro é um sedã, SUV, hatchback, ou outro tipo?");

        bodyTypeERespostas.put("sedã", "A marca do sedã é Chevrolet, Ford, Toyota, ou outra?");
        bodyTypeERespostas.put("SUV", "A marca do SUV é Chevrolet, Ford, Toyota, ou outra?");
        bodyTypeERespostas.put("SUV", "O tamanho do SUV é pequeno, médio, ou grande?");
        bodyTypeERespostas.put("SUV", "O SUV é de luxo, esportivo, ou popular?");
    }
private String perguntaAtual;

    public Carros(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
public void processarResposta(String resposta) {

        // Declare and initialize the scanner variable
        Scanner scanner = new Scanner(System.in);

        // Verifica se a resposta é válida
        if (!resposta.equals("2") && !resposta.equals("4")) {
            System.out.println("Resposta inválida. Tente novamente.");
            return;
        }

        // Obtém a próxima pergunta
        resposta = portasERespostas.get(resposta);

        // Atualiza a pergunta atual
        perguntaAtual = resposta;

        // Se a resposta não for vazia, mostra a pergunta para o usuário
        if (!resposta.isEmpty()) {
            System.out.println(resposta);
            resposta = scanner.nextLine();
            processarResposta(resposta);
        } else {
            // Se a resposta estiver vazia, significa que o chatbot chegou ao final do processo
            System.out.println("O carro que você está procurando pode ser um Chevrolet Trax 2023.");
        }
    }

    public String getPerguntaAtual() {
        return perguntaAtual;
    }
}