import java.util.Date;

public class Main {

	public static void main(String[] args) {
		DAO<Tecnico> dao1 = new DAO<Tecnico>();
		Tecnico T = new Tecnico();
		T.setMatricula(2018001l);
		T.setNome("Josikleio");
		T.setSexo("Masculino");
		T.setIdade(35);
		dao1.update(T);
		Tecnico find1 = dao1.find(Tecnico.class, 2018001l);
		System.out.println(find1.getNome());
		
		DAO<Time> dao2 = new DAO<Time>();
		Time Tii = new Time();
		Tii.setId(07l);
		Tii.setNome("Barcelona");
		Tii.setTecnico(T);
		dao2.update(Tii);
		Time find2 = dao2.find(Time.class, 07l);
		System.out.println(find2.getNome());
		
		DAO<Time> daoT = new DAO<Time>();
		Time Tii2 = new Time();
		Tii2.setId(20l);
		Tii2.setNome("Real madrid");
		Tii2.setTecnico(T);
		dao2.update(Tii2);
		Time findT = daoT.find(Time.class, 20l);
		System.out.println(findT.getNome());

		

		DAO<Atleta> dao = new DAO<Atleta>();
		Atleta A = new Atleta();
		A.setMatricula(201719600020l);
		A.setNome("Thiago Santos");
		A.setSexo("Masculino");
		A.setIdade(17);
		A.setTimes(Tii);
		A.setTecnicos(T);
		dao.update(A);
		Atleta find = dao.find(Atleta.class, 201719600020l);
		System.out.println(find.getNome());

		DAO<Partida> dao4 = new DAO<Partida>();
		Partida P = new Partida();
		P.setId(001l);
		P.setTime_vencedor(Tii);
		P.setTime_perdedor(Tii2);
		dao4.update(P);
		Partida find4 = dao4.find(Partida.class, 001l);
		System.out.println(find4.getId());

		DAO<Jogo> dao3 = new DAO<Jogo>();
		Jogo J = new Jogo();
		J.setId(0001l);
		J.setData(new Date());
		J.setPartida(111l);
		J.setPartida(P);;
		J.setTime_1(Tii);
		J.setTime_2(Tii2);
		dao3.update(J);
		Jogo find3 = dao3.find(Jogo.class, 0001l);
		System.out.println(find3.getId());

	}

}