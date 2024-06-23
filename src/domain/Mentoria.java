package domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private LocalDate dataMentoria;
	
	public Mentoria(String titulo, String descricao) {
		super(titulo, descricao);
	}
	
	
	public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
		super(titulo, descricao);
		this.dataMentoria = dataMentoria;
	}


	public LocalDate getDataMentoria() {
		return dataMentoria;
	}
	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}
	

	@Override
	public String toString() {
		return "Mentoria [dataMentoria=" + dataMentoria + ", titulo=" + getTitulo() + ", descricao=" + getDescricao() + "]";
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP+20d;
	}

	
	
}
