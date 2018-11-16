import javax.persistence.Entity;

@Entity
public class Tecnico extends Pessoa {
	

	public Tecnico(int matricula, String nome, String sexo, int idade) {
		super(matricula, nome, sexo, idade);
		// TODO Auto-generated constructor stub
	}

}
