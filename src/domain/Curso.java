package domain;

public class Curso extends Conteudo {
	private int cargaHoraria;
	

	
	public Curso(String titulo, String descricao) {
		super(titulo, descricao);
	}


	public Curso(String titulo, String descricao,int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + "titulo= "+ getTitulo() + ", descricao=" + getDescricao()+"]";
	}


	public double calcularXp() {
		return XP*this.cargaHoraria;
	}
}
