package exceptions;

public class EntidadeNaoEncontradaException extends Exception {
	public EntidadeNaoEncontradaException() {
		super("Entidade inexistente");
	}
}
