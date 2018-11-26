import javax.persistence.Entity;

@Entity
public class Tecnico extends Pessoa {
	

	public Tecnico(int matricula, String nome, String sexo, int idade, Time time) {
		super(matricula, nome, sexo, idade, time);
		// TODO Auto-generated constructor stub
	}

}
