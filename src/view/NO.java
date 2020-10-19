package view;

public class NO {
	public NO prox;
	public NO ant;
	public Curso curso;
	
	public NO(Curso e) {
		this.curso=e;
		this.prox=null;
		this.ant=null;
	}
}
