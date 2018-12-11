package entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tecnico implements Identificavel {

	@Id
	private Long matricula;

	private String nome;
	private String sexo;
	private int idade;

	@OneToOne
	private Time times;

	public Tecnico() {
	}

	public Tecnico(long matricula, String nome, String sexo, int idade, Time times) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.times = times;
	}

	public Tecnico(Long matricula, String nome, String sexo, int idade) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	public Tecnico(Long matricula) {
		super();
		this.matricula = matricula;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Time getTimes() {
		return times;
	}

	public void setTimes(Time times) {
		this.times = times;
	}

	@Override
	public String toString() {
		return "Tecnico [matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", times="
				+ times + "]";
	}

}
