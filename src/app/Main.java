package app;

import java.time.LocalDate;

import domain.Bootcamp;
import domain.Conteudo;
import domain.Curso;
import domain.Dev;
import domain.Mentoria;

public class Main {

	public static void main(String[] args) {
		Conteudo c1 = new Curso("sad","asfdasd",12);
		Conteudo c2 = new Curso("faa","ggsdgf",1);
		Conteudo c3 = new Curso("fda","ffa",3);
		Conteudo m = new Mentoria("asdasd","dasda", LocalDate.of(2024, 12, 12));
		
		Bootcamp bc = new Bootcamp("ASKDJ","OKAJSFOI",LocalDate.of(2024, 12, 1),LocalDate.of(2025, 2, 25));
		bc.addConteudo(c1);
		bc.addConteudo(c2);
		bc.addConteudo(c3);
		bc.addConteudo(m);
		
		Dev dev = new Dev("asdvas");
		dev.inscreverBootcamp(bc);
		
		dev.progredir();
		dev.progredir();
		
		double total = dev.xpTotal();
		
		System.out.println(total);
	}

}
