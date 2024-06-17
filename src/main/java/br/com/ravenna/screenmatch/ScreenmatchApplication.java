package br.com.ravenna.screenmatch;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		principal principal = new principal();
		principal.exibirMenu();

	// 	List<DadosTemporada> temporadas = new ArrayList<>();

	// 	for(int i = 1 ; i<= dados.totalTemporadas(); i++){
	// 		json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=6608c387");
	// 		DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
	// 		temporadas.add(dadosTemporada);

	// 	}
	// 	temporadas.forEach(System.out::println);
	// }

}
}
