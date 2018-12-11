import entites.Atleta;
import entites.Jogo;
import entites.Partida;
import entites.Set;
import entites.Tecnico;
import entites.Time;
import exceptions.IdInexistenteException;
import exceptions.NomeInexistenteException;

public interface Volei {

	public Tecnico CadastrarTecnico(Tecnico tecnico)throws IdInexistenteException, NomeInexistenteException;
	
	public Time CriarTime(Time time, Tecnico tecnico)throws IdInexistenteException, NomeInexistenteException;
	
	public Atleta CadastrarAtleta(Atleta atleta) throws IdInexistenteException, NomeInexistenteException;

	public Tecnico RemoverTecnico(Tecnico tecnico) throws IdInexistenteException;
	
	public Time RemoverTime(Time time)throws IdInexistenteException;
	
	public Atleta RemoverAtleta(Atleta atleta) throws IdInexistenteException;
	
	public Jogo CriarJogo(Jogo jogo,java.util.Set<Time> times, java.util.Set<Atleta> escalarAtletas,
			java.util.Set<Tecnico> tecnico)throws IdInexistenteException; 
	
	public Jogo Rodada(Jogo jogo, Set set, java.util.Set<Partida> partidas);
	
	public Partida Tabela(Time time_vencedor, Time time_perdedor, Integer pts_tim_venc)throws NomeInexistenteException; 
	


}
