import javax.persistence.Entity;

@Entity
public class Atleta extends Pessoa {
	
	public Atleta() {
	}

	public Atleta(int matricula, String nome, String sexo, int idade, Time time) {
		super(matricula, nome, sexo, idade, time);
		// TODO Auto-generated constructor stub
	}

}
