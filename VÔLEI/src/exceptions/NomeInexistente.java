package exceptions;

public class NomeInexistente extends RuntimeException {
	public NomeInexistente() {
		super("O nome n�o existe");
	}

}
