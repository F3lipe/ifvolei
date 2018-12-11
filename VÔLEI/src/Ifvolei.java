import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.text.rtf.RTFEditorKit;

import entites.Atleta;
import entites.Tecnico;
import entites.Time;
import exceptions.IdInexistenteException;
import exceptions.NomeInexistenteException;

public class Ifvolei {

	// ---------------------------------CADASTRO DE TÉCNICOS, TIMES E ATLETAS--------------------------------------------------//

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

	// -----------------------------------REMOVE TÉCNICOS, TIMES E ATLETAS-----------------------------------------//

	public Tecnico RemoverTecnico(Long matricula) throws IdInexistenteException {
		DAO<Tecnico> daoRtec = new DAO<Tecnico>();
		Tecnico Rtecnico = new Tecnico();
		if (matricula == null) {
			throw new IdInexistenteException();
		} else {

			daoRtec.remove(Rtecnico);
		}

		return Rtecnico;

	}

	public Time RemoverTime(Long id) throws IdInexistenteException {
		DAO<Time> daoRt = new DAO<Atleta>();
		Time Rtime = new Time();
		if (id == null) {
			throw new IdInexistenteException();
		} else {

			daoRt.remove(Rtime);
		}

		return Rtime;

	}

	public Atleta RemoverAtleta(Long matricula) throws IdInexistenteException {
		DAO<Atleta> daoRa = new DAO<Atleta>();
		Atleta Ratleta = new Atleta();
		if (matricula == null) {
			throw new IdInexistenteException();
		} else {

			daoRa.remove(Ratleta);
		}

		return Ratleta;

	}

	public Ifvolei() {
		super();
	}

}
