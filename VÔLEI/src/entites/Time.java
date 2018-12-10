package entites;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.ArrayList;
import java.util.Set;

@Entity
public class Time implements Identificavel {

	@Id
	private long id;

	private String nome;

	@OneToMany()
	private Set<Atleta> atletas;

	@OneToOne(fetch=FetchType.LAZY)
	private Tecnico tecnico;

	public Time() {
	}

	public Time(long id, String nome, Set<Atleta> atletas, Tecnico tecnico) {
		super();
		this.id = id;
		this.nome = nome;
		this.atletas = atletas;
		this.tecnico = tecnico;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atletas == null) ? 0 : atletas.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tecnico == null) ? 0 : tecnico.hashCode());
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
		if (tecnico == null) {
			if (other.tecnico != null)
				return false;
		} else if (!tecnico.equals(other.tecnico))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", nome=" + nome + ", atletas=" + atletas + ", tecnico=" + tecnico + "]";
	}

}
