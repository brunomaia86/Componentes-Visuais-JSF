package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Curso;

@ManagedBean
@SessionScoped
public class CursoBean {

	private List<Curso> cursos = new ArrayList<Curso>();
	private Curso curso = new Curso();

	public void adiciona() {
		cursos.add(curso);
		curso = new Curso();
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

}