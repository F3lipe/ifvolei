import entites.Atleta;
import entites.Jogo;
import entites.Partida;
import entites.Set;
import entites.Tecnico;
import entites.Time;
import exceptions.IdInexistente;
import exceptions.NomeInexistente;

public interface Volei {

	public Tecnico CadastrarTecnico(Tecnico tecnico)throws IdInexistente, NomeInexistente;
	
	public Time CriarTime(Time time, java.util.Set<Atleta> atletas, Tecnico tecnico)throws IdInexistente, NomeInexistente;
	
	public Atleta CadastrarAtleta(Atleta atleta) throws IdInexistente, NomeInexistente;

	public Jogo CriarJogo(Jogo jogo,java.util.Set<Time> times, java.util.Set<Atleta> escalarAtletas,
			java.util.Set<Tecnico> tecnico)throws IdInexistente; 
	
	public Tecnico RemoverTecnico(Tecnico tecnico) throws IdInexistente;
	
	public Time RemoverTime(Time time, java.util.Set<Atleta> atletas, Tecnico tecnico)throws IdInexistente;
	
	public Atleta RemoverAtleta(Atleta atleta) throws IdInexistente;
	
	public Jogo Rodada(Jogo jogo, Set set, java.util.Set<Partida> partidas);
	
	public Partida Tabela(Time time_vencedor, Time time_perdedor, Integer pts_tim_venc)throws NomeInexistente; 
	


}
