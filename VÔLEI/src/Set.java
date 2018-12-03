import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Set implements Identificavel {

	@Id
	private int id;

	private int ponto_time1;
	private int ponto_time2;

	public Set() {

	}

	public Set(int id, int ponto_time1, int ponto_time2) {
		super();
		this.id = id;
		this.ponto_time1 = ponto_time1;
		this.ponto_time2 = ponto_time2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPonto_time1() {
		return ponto_time1;
	}

	public void setPonto_time1(int ponto_time1) {
		this.ponto_time1 = ponto_time1;
	}

	public int getPonto_time2() {
		return ponto_time2;
	}

	public void setPonto_time2(int ponto_time2) {
		this.ponto_time2 = ponto_time2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ponto_time1;
		result = prime * result + ponto_time2;
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
		Set other = (Set) obj;
		if (id != other.id)
			return false;
		if (ponto_time1 != other.ponto_time1)
			return false;
		if (ponto_time2 != other.ponto_time2)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Set [id=" + id + ", ponto_time1=" + ponto_time1 + ", ponto_time2=" + ponto_time2 + "]";
	}

}
