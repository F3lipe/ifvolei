package entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Atleta implements Identificavel {


	@Id
	private Long matricula;

	private String nome;
	private String sexo;
	private int idade;

	@OneToOne
	@JoinColumn(name = "time_do_atleta")
	private Time times;

	@OneToOne
	@JoinColumn(name = "tecnico_do_atleta")
	private Tecnico tecnicos;

	public Atleta() {
	}

	public Atleta(Long matricula, String nome, String sexo, int idade, Time times, Tecnico tecnicos) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.times = times;
		this.tecnicos = tecnicos;
	}

	public Atleta(Long matricula, String nome, String sexo, int idade) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
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

	public Tecnico getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(Tecnico tecnicos) {
		this.tecnicos = tecnicos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + idade;
		result = prime * result + (int) (matricula ^ (matricula >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((tecnicos == null) ? 0 : tecnicos.hashCode());
		result = prime * result + ((times == null) ? 0 : times.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		if (idade != other.idade)
			return false;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (tecnicos == null) {
			if (other.tecnicos != null)
				return false;
		} else if (!tecnicos.equals(other.tecnicos))
			return false;
		if (times == null) {
			if (other.times != null)
				return false;
		} else if (!times.equals(other.times))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Atleta [matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", times="
				+ times + ", tecnicos=" + tecnicos + "]";
	}

}
