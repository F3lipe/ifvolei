package exceptions;

public class NomeInexistenteException extends RuntimeException {
	public NomeInexistenteException() {
		super("O nome n�o existe");
	}

}
