import java.util.Date;

import entites.Atleta;
import entites.Jogo;
import entites.Partida;
import entites.Tecnico;
import entites.Time;
import exceptions.EntidadeNaoEncontradaException;
import exceptions.IdInexistenteException;
import exceptions.NomeInexistenteException;

public class Main {

	public static void main(String[] args)
			throws IdInexistenteException, NomeInexistenteException, EntidadeNaoEncontradaException {
		DAO<Tecnico> dao1 = new DAO<Tecnico>();
		Ifvolei Tvolei = new Ifvolei();
		Ifvolei RTvolei = new Ifvolei();
		Tecnico T = new Tecnico();
		T.setMatricula(201801l);
		T.setNome("Josikleio");
		T.setSexo("Masculino");
		T.setIdade(40);
		try {
			Tvolei.CadastrarTecnico(201801l, "Josikleio", "Masculino", 40);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		dao1.save(T);
		Tecnico find1 = dao1.find(Tecnico.class, 201801l);
		System.out.println(find1.getNome());
		try {
			RTvolei.RemoverTecnico(201801l);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		DAO<Tecnico> daoTe = new DAO<Tecnico>();
		Tecnico T2 = new Tecnico();
		Ifvolei T2volei = new Ifvolei();
		Ifvolei RT2volei = new Ifvolei();
		T2.setMatricula(201802l);
		T2.setNome("Hugo Feitosa");
		T2.setSexo("Masculino");
		T2.setIdade(20);
		try {
			T2volei.CadastrarTecnico(201802l, "Hugo Feitosa", "Masculino", 20);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		daoTe.save(T2);
		Tecnico findTe = daoTe.find(Tecnico.class, 201802l);
		System.out.println(findTe.getNome());
		try {
			RT2volei.RemoverTecnico(201802l);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		DAO<Time> dao2 = new DAO<Time>();
		Time Tii = new Time();
		Ifvolei Tiivolei = new Ifvolei();
		Ifvolei RTiivolei = new Ifvolei();
		Tii.setId(10l);
		Tii.setNome("Flamengo");
		Tii.setTecnico(T);
		try {
			Tiivolei.CriarTime(10l, "Flamengo", T);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		dao2.save(Tii);
		Time find2 = dao2.find(Time.class, 10l);
		System.out.println(find2.getNome());
		try {
			RTiivolei.RemoverTime(10l);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		DAO<Time> daoT = new DAO<Time>();
		Time Tii2 = new Time();
		Ifvolei Tii2volei = new Ifvolei();
		Ifvolei RTii2volei = new Ifvolei();
		Tii2.setId(20l);
		Tii2.setNome("Corinthians");
		Tii2.setTecnico(T2);
		try {
			Tii2volei.CriarTime(20l, "Corinthians", T2);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		daoT.save(Tii2);
		Time findT = daoT.find(Time.class, 20l);
		System.out.println(findT.getNome());
		try {
			RTii2volei.RemoverTime(20l);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		DAO<Atleta> dao = new DAO<Atleta>();
		Atleta A = new Atleta();
		Ifvolei Avolei = new Ifvolei();
		Ifvolei RAvolei = new Ifvolei();
		A.setMatricula(201619600004l);
		A.setNome("Felipe");
		A.setSexo("Masculino");
		A.setIdade(18);
		A.setTimes(Tii);
		A.setTecnicos(T);
		try {
			Avolei.CadastrarAtleta(201619600004l, "Felipe", "masculino", 18);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}
		dao.save(A);
		Atleta find = dao.find(Atleta.class, 201619600004l);
		System.out.println(find.getNome());
		try {
			RAvolei.RemoverAtleta(201619600004l);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		DAO<Atleta> daoA = new DAO<Atleta>();
		Atleta A2 = new Atleta();
		Ifvolei A2volei = new Ifvolei();
		Ifvolei RA2volei = new Ifvolei();
		A2.setMatricula(201619600019l);
		A2.setNome("Maria Clara");
		A2.setSexo("Feminino");
		A2.setIdade(15);
		A2.setTimes(Tii2);
		A2.setTecnicos(T2);
		try {
			A2volei.CadastrarAtleta(201719600019l, "Maria Clara", "Feminino", 15);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		daoA.save(A2);
		Atleta findA = daoA.find(Atleta.class, 201719600019l);
		System.out.println(findA.getNome());
		try {
			RA2volei.RemoverAtleta(201619600019l);
		} catch (IdInexistenteException e) {
			e.printStackTrace();
		}

		DAO<Partida> dao4 = new DAO<Partida>();
		Partida P = new Partida();
		P.setId(01l);
		P.setTime_vencedor(Tii);
		P.setTime_perdedor(Tii2);
		dao4.save(P);
		Partida find4 = dao4.find(Partida.class, 01l);
		System.out.println(find4.getId());

		DAO<Jogo> dao3 = new DAO<Jogo>();
		Jogo J = new Jogo();
		J.setId(02l);
		J.setData(new Date());
		J.setPartida(P);
		J.setTime_1(Tii);
		J.setTime_2(Tii2);
		dao3.save(J);
		Jogo find3 = dao3.find(Jogo.class, 02l);
		System.out.println(find3.getId());

	}

}