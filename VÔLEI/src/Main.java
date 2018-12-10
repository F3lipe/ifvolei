import java.util.Date;

import entites.Atleta;
import entites.Jogo;
import entites.Partida;
import entites.Tecnico;
import entites.Time;
import exceptions.IdInexistente;
import exceptions.NomeInexistente;

public class Main {

	public static void main(String[] args) throws IdInexistente, NomeInexistente {
		DAO<Tecnico> dao1 = new DAO<Tecnico>();
		Tecnico T = new Tecnico();
		T.setMatricula(201619600000l);
		T.setNome("Eva Adão");
		T.setSexo("Masculino");
		T.setIdade(39);
		
		if (T.getMatricula() == null) {
			throw new IdInexistente();
		} else {
			dao1.save(T);
		}
		
		if (T.getNome() == null) {
			throw new NomeInexistente();
		} else {
			dao1.save(T);
		}

		Tecnico find1 = dao1.find(Tecnico.class, 201619600000l);
		System.out.println(find1.getNome());

		DAO<Tecnico> daoTe = new DAO<Tecnico>();
		Tecnico T2 = new Tecnico();
		T2.setMatricula(201802l);
		T2.setNome("Hugo Feitosa");
		T2.setSexo("Masculino");
		T2.setIdade(20);
		dao1.update(T2);
		Tecnico findTe = daoTe.find(Tecnico.class, 201802l);
		System.out.println(findTe.getNome());

		DAO<Time> dao2 = new DAO<Time>();
		Time Tii = new Time();
		Tii.setId(10l);
		Tii.setNome("Flamengo");
		Tii.setTecnico(T);
		dao2.update(Tii);
		Time find2 = dao2.find(Time.class, 10l);
		System.out.println(find2.getNome());

		DAO<Time> daoT = new DAO<Time>();
		Time Tii2 = new Time();
		Tii2.setId(20l);
		Tii2.setNome("Corinthians");
		Tii2.setTecnico(T2);
		dao2.update(Tii2);
		Time findT = daoT.find(Time.class, 20l);
		System.out.println(findT.getNome());

		DAO<Atleta> dao = new DAO<Atleta>();
		Atleta A = new Atleta();
		A.setMatricula(201719600021l);
		A.setNome("Danilo Rodrigues");
		A.setSexo("Masculino");
		A.setIdade(16);
		A.setTimes(Tii);
		A.setTecnicos(T);
		dao.update(A);
		Atleta find = dao.find(Atleta.class, 201719600021l);
		System.out.println(find.getNome());

		DAO<Atleta> daoA = new DAO<Atleta>();
		Atleta A2 = new Atleta();
		A2.setMatricula(201719600019l);
		A2.setNome("Maria Clara");
		A2.setSexo("Feminino");
		A2.setIdade(15);
		A2.setTimes(Tii2);
		A2.setTecnicos(T2);
		dao.update(A2);
		Atleta findA = daoA.find(Atleta.class, 201719600019l);
		System.out.println(findA.getNome());

		DAO<Partida> dao4 = new DAO<Partida>();
		Partida P = new Partida();
		P.setId(01l);
		P.setTime_vencedor(Tii);
		P.setTime_perdedor(Tii2);
		dao4.update(P);
		Partida find4 = dao4.find(Partida.class, 01l);
		System.out.println(find4.getId());

		DAO<Jogo> dao3 = new DAO<Jogo>();
		Jogo J = new Jogo();
		J.setId(02l);
		J.setData(new Date());
		J.setPartida(P);
		J.setTime_1(Tii);
		J.setTime_2(Tii2);
		dao3.update(J);
		Jogo find3 = dao3.find(Jogo.class, 02l);
		System.out.println(find3.getId());

	}

}