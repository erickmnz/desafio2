package domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> atividadesInscritas = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> atividadesTerminadas= new LinkedHashSet<Conteudo>();
	
	public Dev() {
	}

	public Dev(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getAtividadesInscritas() {
		return atividadesInscritas;
	}

	private void addNovaAtividade(Conteudo atividade) {
		this.atividadesInscritas.add(atividade);
	}
	private void addMultiplasAtividades(Set<Conteudo> conteudos) {
		this.atividadesInscritas.addAll(conteudos);
	}
	public Set<Conteudo> getAtividadesTerminadas() {
		return atividadesTerminadas;
	}

	private void addAtividadesTerminadas(Conteudo atividade) {
		this.atividadesTerminadas.add(atividade);
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		addMultiplasAtividades(bootcamp.getConteudos());
		bootcamp.addDevs(this);
	}
	
	public void progredir() {
		Optional<Conteudo> cont = this.atividadesInscritas.stream().findFirst();
		if(cont.isPresent()) {
			addAtividadesTerminadas(cont.get());
			this.atividadesInscritas.remove(cont.get());
		}else {
			System.err.println("Não está matriculado em nenhum conteudo");
		}
	}
	
	public double xpTotal() {
		return this.atividadesTerminadas.stream()
				.mapToDouble(Conteudo::calcularXp)
				.sum();
	}


	
	
}
