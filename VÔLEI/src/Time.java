import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.Set;

@Entity
public class Time {

	@Id
	private int id;
	
	private String nome;
	
	@OneToMany
	@JoinColumn(name="id_time")
	private Set<Atleta> atletas;
	
	@OneToOne
	@JoinColumn(name="id_tecnicos")
	private Tecnico tecnicos;

	public Time() {
	}

	public Time(int id, String nome, Set<Atleta> atletas, Tecnico tecnicos) {
		super();
		this.id = id;
		this.nome = nome;
		this.atletas = atletas;
		this.tecnicos = tecnicos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(Set<Atleta> atletas) {
		this.atletas = atletas;
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
		int result = 1;
		result = prime * result + ((atletas == null) ? 0 : atletas.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tecnicos == null) ? 0 : tecnicos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (atletas == null) {
			if (other.atletas != null)
				return false;
		} else if (!atletas.equals(other.atletas))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tecnicos == null) {
			if (other.tecnicos != null)
				return false;
		} else if (!tecnicos.equals(other.tecnicos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", nome=" + nome + ", atletas=" + atletas + ", tecnicos=" + tecnicos + "]";
	}

}
