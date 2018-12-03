import java.util.Date;

public class Main {

	public static void main(String[] args) {

		DAO<Tecnico> dao1 = new DAO<Tecnico>();
		Tecnico T = new Tecnico();
		T.setMatricula(123l);
		T.setNome("Artur");
		T.setSexo("Masculino");
		T.setIdade(30);
		dao1.update(T);
		Tecnico find1 = dao1.find(Tecnico.class, 12345l);
		System.out.println(find1.getNome());

		DAO<Atleta> dao = new DAO<Atleta>();
		Atleta A = new Atleta();
		A.setMatricula(20171960003l);
		A.setNome("Vanderson");
		A.setSexo("Masculino");
		A.setIdade(17);
		dao.update(A);
		Atleta find = dao.find(Atleta.class, 20171960003l);
		System.out.println(find.getNome());

		DAO<Time> dao2 = new DAO<Time>();
		Time Ti = new Time();
		Ti.setId(3333333l);
		Ti.setNome("Corinthians");
		dao2.update(Ti);
		Time find2 = dao2.find(Time.class, 3333333l);
		System.out.println(find2.getNome());

		DAO<Partida> dao4 = new DAO<Partida>();
		Partida P = new Partida();
		P.setId(111l);
		dao4.update(P);
		Partida find4 = dao4.find(Partida.class, 111l);
		System.out.println(find4.getId());

		DAO<Jogo> dao3 = new DAO<Jogo>();
		Jogo J = new Jogo();
		J.setId(22l);
		J.setData(new Date());
		J.setPartida(111l);
		dao3.update(J);
		Jogo find3 = dao3.find(Jogo.class, 22l);
		System.out.println(find3.getId());

	}

}