package domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp extends Conteudo{
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	private Set<Dev> devs=new HashSet<Dev>();
	private Set<Conteudo> conteudos=new LinkedHashSet<Conteudo>();

	

	public Bootcamp(String titulo, String descricao) {
		super(titulo, descricao);
	}
	
	
	
	public Bootcamp(String titulo, String descricao, LocalDate dataInicial,
			LocalDate dataFinal) {
		super(titulo, descricao);

		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}


	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	

	public Set<Dev> getDevs() {
		return devs;
	}

	public void addDevs(Dev dev) {
		this.devs.add(dev);
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void addConteudo(Conteudo conteudo) {
		this.conteudos.add(conteudo);
	}

	@Override
	public String toString() {
		return "Bootcamp [dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + "titulo= "+ getTitulo() + ", descricao=" + getDescricao()+"]";
	}

	@Override
	public double calcularXp() {
		Period periodo= Period.between(dataInicial, dataFinal);
		return XP+(this.conteudos.stream()
		.mapToDouble(Conteudo::calcularXp)
		.sum() + Double.valueOf(periodo.getDays()));
	}
	
	
	
}
