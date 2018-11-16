import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jogo {
	@Id
	private int id;

	private Date data;
	private Time time_1;
	private Time time_2;

	@ManyToOne
	private ArrayList<Set> sets;

	public Jogo() {

	}

	public Jogo(int id, Date data, Time time_1, Time time_2, ArrayList<Set> sets) {
		super();
		this.id = id;
		this.data = data;
		this.time_1 = time_1;
		this.time_2 = time_2;
		this.sets = sets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public ArrayList<Set> getSets() {
		return sets;
	}

	public void setSets(ArrayList<Set> sets) {
		this.sets = sets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + id;
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
				+ "]";
	}

}
