import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Partida {

	@Id
	private int id;

	@OneToOne
	@JoinColumn(name = "id_Partida_jogo")
	private Jogo jogo;

	@OneToOne
	@JoinColumn(name = "id_Partida_tvencedor")
	private Time time_vencedor;
	
	@OneToOne
	@JoinColumn(name = "id_Partida_tperdedor")
	private Time time_perdedor;
	
	private Integer pts_tim_venc = 3;

	public Partida() {

	}

	public Partida(int id, Jogo jogo, Time time_vencedor, Time time_perdedor, Integer pts_tim_venc) {
		super();
		this.id = id;
		this.jogo = jogo;
		this.time_vencedor = time_vencedor;
		this.time_perdedor = time_perdedor;
		this.pts_tim_venc = pts_tim_venc;
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

	public Integer getPts_tim_venc() {
		return pts_tim_venc;
	}

	public void setPts_tim_venc(Integer pts_tim_venc) {
		this.pts_tim_venc = pts_tim_venc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((jogo == null) ? 0 : jogo.hashCode());
		result = prime * result + ((pts_tim_venc == null) ? 0 : pts_tim_venc.hashCode());
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
		if (pts_tim_venc == null) {
			if (other.pts_tim_venc != null)
				return false;
		} else if (!pts_tim_venc.equals(other.pts_tim_venc))
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
				+ time_perdedor + ", pts_tim_venc=" + pts_tim_venc + "]";
	}

}
