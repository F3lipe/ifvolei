package entites;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Jogo implements Identificavel {
	@Id
	private long id;
	private Date data;
	
	@ManyToOne
	@JoinColumn (name = "id_Jogo_time_1")
	private Time time_1;
	
	@ManyToOne
	@JoinColumn (name = "id_Jogo_time_2")
	private Time time_2;

	@OneToMany
	
	@JoinColumn(name="id_Jogo_sets")
	private java.util.Set<Set> sets;
	
	@OneToOne
	@JoinColumn(name = "id_Jogo_partida")
	private Partida partida;
	

	public Jogo() {

	}


	public Jogo(long id, Date data, Time time_1, Time time_2, java.util.Set<Set> sets, Partida partida) {
		super();
		this.id = id;
		this.data = data;
		this.time_1 = time_1;
		this.time_2 = time_2;
		this.sets = sets;
		this.partida = partida;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Time getTime_1() {
		return time_1;
	}


	public void setTime_1(Time time_1) {
		this.time_1 = time_1;
	}


	public Time getTime_2() {
		return time_2;
	}


	public void setTime_2(Time time_2) {
		this.time_2 = time_2;
	}


	public java.util.Set<Set> getSets() {
		return sets;
	}


	public void setSets(java.util.Set<Set> sets) {
		this.sets = sets;
	}


	public Partida getPartida() {
		return partida;
	}


	public void setPartida(Partida partida) {
		this.partida = partida;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((partida == null) ? 0 : partida.hashCode());
		result = prime * result + ((sets == null) ? 0 : sets.hashCode());
		result = prime * result + ((time_1 == null) ? 0 : time_1.hashCode());
		result = prime * result + ((time_2 == null) ? 0 : time_2.hashCode());
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
		Jogo other = (Jogo) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id != other.id)
			return false;
		if (partida == null) {
			if (other.partida != null)
				return false;
		} else if (!partida.equals(other.partida))
			return false;
		if (sets == null) {
			if (other.sets != null)
				return false;
		} else if (!sets.equals(other.sets))
			return false;
		if (time_1 == null) {
			if (other.time_1 != null)
				return false;
		} else if (!time_1.equals(other.time_1))
			return false;
		if (time_2 == null) {
			if (other.time_2 != null)
				return false;
		} else if (!time_2.equals(other.time_2))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Jogo [id=" + id + ", data=" + data + ", time_1=" + time_1 + ", time_2=" + time_2 + ", sets=" + sets
				+ ", partida=" + partida + "]";
	}


	public void setPartida(long l) {
		// TODO Auto-generated method stub
		
	}

	
}
