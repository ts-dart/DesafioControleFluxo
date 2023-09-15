public class ParametrosInvalidosException extends Exception {
  public ParametrosInvalidosException() {
    super("primeiro parametro precisa ser menor que o segundo parametro");
  }
}
