public interface Volei {

	public Atleta CadastrarAtleta(Atleta atleta);

	public Tecnico CadastrarTecnico(Tecnico tecnico);

	public Time CriarTime(Time time, java.util.Set<Atleta> atletas, Tecnico tecnico);

	public Jogo CriarJogo(Jogo jogo, java.util.Set<Time> times, java.util.Set<Atleta> escalarAtletas,
			java.util.Set<Tecnico> tecnico);

	public Jogo Rodada(Jogo jogo, Set set, java.util.Set<Partida> partidas);
	
	public Partida Placar(Time time_vencedor, Time time_perdedor, Integer pts_tim_venc);
	


}
