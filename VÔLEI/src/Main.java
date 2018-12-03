import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		DAO<Tecnico> dao1 = new DAO<Tecnico>();
		Tecnico T = new Tecnico();
		T.setMatricula(123456789l);
		T.setNome("Hugo Feitosa");
		T.setSexo("Masculino");
		T.setIdade(22);
		dao1.save(T);
		Tecnico find1 = dao1.find(Tecnico.class, 123456789l);
		System.out.println(find1.getNome());
		
		DAO<Atleta> dao = new DAO<Atleta>();
		Atleta A = new Atleta();
		A.setMatricula(201719600016l);
		A.setNome("Andreza");
		A.setSexo("Feminino");
		A.setIdade(16);
		dao.save(A);
		Atleta find = dao.find(Atleta.class, 201719600016l);
		System.out.println(find.getNome());
		
		DAO<Time> dao2 = new DAO<Time>();
		Time Ti = new Time();
		Ti.setId(11111111l);
		Ti.setNome("São Paulo");
		dao2.save(Ti);
		Time find2 = dao2.find(Time.class, 11111111l );
		System.out.println(find2.getNome());
		
		
	}

}