package br.com.ravenna.screenmatch;

import java.util.Scanner;

public class principal {
    
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6608c387";

    

    public void exibirMenu(){
    
        System.out.println("digite o nome da série para busca: ");
        var nomeSerie = leitura.nextLine();
    	var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }

}
