import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("esportivo");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Pessoa p = new Pessoa();
		p.setMatricula(201619600004l);
		p.setNome("Felipe");
		p.setSexo("Masculino");
		p.setIdade(17);
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
}