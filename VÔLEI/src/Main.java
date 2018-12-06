import java.util.Date;

public class Main {

	public static void main(String[] args) {

		DAO<Tecnico> dao1 = new DAO<Tecnico>();
		Tecnico T = new Tecnico();
		T.setMatricula(7654321l);
		T.setNome("João");
		T.setSexo("Masculino");
		T.setIdade(30);
		dao1.update(T);
		Tecnico find1 = dao1.find(Tecnico.class,7654321l);
		System.out.println(find1.getNome());

		DAO<Atleta> dao = new DAO<Atleta>();
		Atleta A = new Atleta();
		A.setMatricula(201619600014l);
		A.setNome("Joel");
		A.setSexo("Masculino");
		A.setIdade(17);
		dao.update(A);
		Atleta find = dao.find(Atleta.class, 201619600014l);
		System.out.println(find.getNome());

		DAO<Time> dao2 = new DAO<Time>();
		Time Tii = new Time();
		Tii.setId( 777777777l);
		Tii.setNome("Flamengo");
		dao2.update(Tii);
		Time find2 = dao2.find(Time.class, 777777777l);
		System.out.println(find2.getNome());

		DAO<Partida> dao4 = new DAO<Partida>();
		Partida P = new Partida();
		P.setId(11111l);
		dao4.update(P);
		Partida find4 = dao4.find(Partida.class, 11111l);
		System.out.println(find4.getId());

		DAO<Jogo> dao3 = new DAO<Jogo>();
		Jogo J = new Jogo();
		J.setId(22222l);
		J.setData(new Date());
		J.setPartida(111l);
		dao3.update(J);
		Jogo find3 = dao3.find(Jogo.class, 22222l);
		System.out.println(find3.getId());

	}

}