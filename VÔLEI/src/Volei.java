import java.util.ArrayList;

public interface Volei {

	public Atleta CadastrarAtleta(Atleta atleta);

	public Tecnico CadastrarTecnico(Tecnico tecnico);

	public Time CriarTime(Time time, ArrayList<Atleta> atletas, Tecnico tecnico);

	public Jogo CriarJogo(Jogo jogo, ArrayList<Time> times, ArrayList<Atleta> escalarAtletas,
			ArrayList<Tecnico> tecnico);

	public Jogo Rodada(Jogo jogo, Set set);


}
