
import entites.Atleta;
import entites.Tecnico;
import entites.Time;
import exceptions.EntidadeNaoEncontradaException;
import exceptions.IdInexistenteException;
import exceptions.NomeInexistenteException;

public class Ifvolei {

	// ---------------------------------CADASTRO DE TÃ‰CNICOS, TIMES E
	// ATLETAS--------------------------------------------------//

	public Tecnico CadastrarTecnico(Long matricula, String nome, String sexo, int idade)
			throws IdInexistenteException, NomeInexistenteException {

		DAO<Tecnico> dao1 = new DAO<Tecnico>();
		Tecnico Ctecnico = new Tecnico(matricula, nome, sexo, idade);

		if (matricula == null) {
			throw new IdInexistenteException();
		} else if (nome == null) {
			throw new NomeInexistenteException();
		} else {

			dao1.save(Ctecnico);
		}

		return Ctecnico;

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

		DAO<Atleta> dao2 = new DAO<Atleta>();
		Atleta atleta = new Atleta(matricula, nome, sexo, idade);

		if (matricula == null) {
			throw new IdInexistenteException();
		} else if (nome == null) {
			throw new NomeInexistenteException();
		} else {

			dao2.save(atleta);
		}

		return atleta;

	}

	// -----------------------------------REMOVE TÉCNICOS, TIMES E
	// ATLETAS-----------------------------------------//

	public Tecnico RemoverTecnico(Long matricula) throws IdInexistenteException, EntidadeNaoEncontradaException {
		DAO<Tecnico> daoRtec = new DAO<Tecnico>();
		if (matricula == null) {
			throw new IdInexistenteException();
		} else if (daoRtec.find(Tecnico.class, matricula) == null) {
			throw new EntidadeNaoEncontradaException();
		} else {
			Tecnico tec = daoRtec.find(Tecnico.class, matricula);
			daoRtec.remove(tec);
			return tec;
		}
	}

	public Time RemoverTime(Long id) throws IdInexistenteException, EntidadeNaoEncontradaException {
		DAO<Time> daoRt = new DAO<Time>();
		if (id == null) {
			throw new IdInexistenteException();
		} else if (daoRt.find(Time.class, id) == null) {
			throw new EntidadeNaoEncontradaException();
		} else {
			Time tim = daoRt.find(Time.class, id);
			daoRt.remove(tim);
			return tim;
		}
	}

	public Atleta RemoverAtleta(Long matricula) throws IdInexistenteException, EntidadeNaoEncontradaException {
		DAO<Atleta> daoRa = new DAO<Atleta>();

		if (matricula == null) {
			throw new IdInexistenteException();
		} else if (daoRa.find(Atleta.class, matricula) == null) {
			throw new EntidadeNaoEncontradaException();
		} else {
			Atleta atleta = daoRa.find(Atleta.class, matricula);
			daoRa.remove(atleta);
			return atleta;
		}
	}

	public Ifvolei() {
		super();
	}

}
