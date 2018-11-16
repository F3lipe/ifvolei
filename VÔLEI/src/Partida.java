import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Partida {

	@Id
	private int id;

	private Jogo jogo;
	private Time time_vencedor;
	private Time time_perdedor;

	public Partida() {

	}

	public Partida(int id, Jogo jogo, Time time_vencedor, Time time_perdedor) {
		super();
		this.id = id;
		this.jogo = jogo;
		this.time_vencedor = time_vencedor;
		this.time_perdedor = time_perdedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public Time getTime_vencedor() {
		return time_vencedor;
	}

	public void setTime_vencedor(Time time_vencedor) {
		this.time_vencedor = time_vencedor;
	}

	public Time getTime_perdedor() {
		return time_perdedor;
	}

	public void setTime_perdedor(Time time_perdedor) {
		this.time_perdedor = time_perdedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((jogo == null) ? 0 : jogo.hashCode());
		result = prime * result + ((time_perdedor == null) ? 0 : time_perdedor.hashCode());
		result = prime * result + ((time_vencedor == null) ? 0 : time_vencedor.hashCode());
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
		Partida other = (Partida) obj;
		if (id != other.id)
			return false;
		if (jogo == null) {
			if (other.jogo != null)
				return false;
		} else if (!jogo.equals(other.jogo))
			return false;
		if (time_perdedor == null) {
			if (other.time_perdedor != null)
				return false;
		} else if (!time_perdedor.equals(other.time_perdedor))
			return false;
		if (time_vencedor == null) {
			if (other.time_vencedor != null)
				return false;
		} else if (!time_vencedor.equals(other.time_vencedor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Partida [id=" + id + ", jogo=" + jogo + ", time_vencedor=" + time_vencedor + ", time_perdedor="
				+ time_perdedor + "]";
	}

}
