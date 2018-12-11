import entites.Atleta;
import entites.Tecnico;
import entites.Time;
import exceptions.IdInexistenteException;
import exceptions.NomeInexistenteException;

public class Ifvolei {

	//---------------------------------CADASTRO DE TÉCNICOS, TIMES E ATLETAS--------------------------------------------------//
	
	public Tecnico CadastrarTecnico(Long matricula, String nome, String sexo, int idade)
			throws IdInexistenteException, NomeInexistenteException {

		DAO<Tecnico> dao1 = new DAO<Tecnico>();
		Tecnico tecnico = new Tecnico(matricula, nome, sexo, idade);

		if (matricula == null) {
			throw new IdInexistenteException();
		} else if (nome == null) {
			throw new NomeInexistenteException();
		} else {

			dao1.save(tecnico);
		}

		return tecnico;

	}

	public Time CriarTime(Long id, String nome, Tecnico tecnico)
			throws IdInexistenteException, NomeInexistenteException {

		DAO<Time> daoT = new DAO<Time>();
		Time time1 = new Time(id, nome, tecnico);

		if (id == null) {
			throw new IdInexistenteException();
		} else if (nome == null) {
			throw new NomeInexistenteException();
		} else {

			daoT.save(time1);
		}

		return time1;

	}

	public Atleta CadastrarAtleta(Long matricula, String nome, String sexo, int idade)
			throws IdInexistenteException, NomeInexistenteException {

		DAO<Atleta> dao1 = new DAO<Atleta>();
		Atleta atleta = new Atleta(matricula, nome, sexo, idade);

		if (matricula == null) {
			throw new IdInexistenteException();
		} else if (nome == null) {
			throw new NomeInexistenteException();
		} else {

			dao1.save(atleta);
		}

		return atleta;

	}
	
	
	//-----------------------------------REMOVE DE TÉCNICOS, TIMES E ATLETAS-----------------------------------------//

	
	
	
	public Ifvolei() {
		super();
	}

}
