import javax.persistence.Entity;

@Entity
public class Atleta extends Pessoa {
	
	public Atleta() {}

	public Atleta(int matricula, String nome, String sexo, int idade) {
		super(matricula, nome, sexo, idade);
		// TODO Auto-generated constructor stub
	}

}
