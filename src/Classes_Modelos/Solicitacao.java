/*Criação da classe Solicitação, com seus metodos getters e setters somados ao toString. @author Caio*/

package Classes_Modelos;

import java.util.Date;
import java.util.List;
import java.util.Set;


public class Solicitacao {
    private Integer id;
    private Laboratorios laboratorio;
    private Professores professor;
	private Departamentos departamentos;
    private Disciplinas disciplina;
    private List <Alunos> alunos;
    private Date data;
    private Integer tempoDeUtilizacao;

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Laboratorios getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorios laboratorio) {
		this.laboratorio = laboratorio;
	}
	public Professores getProfessor() {
		return professor;
	}
	public void setProfessor(Professores professor) {
		this.professor = professor;
	}
	public Disciplinas getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplinas disciplina) {
		this.disciplina = disciplina;
	}
	public List<Alunos> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Alunos> alunos) {
		this.alunos = alunos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getTempoDeUtilizacao() {
		return tempoDeUtilizacao;
	}
	public void setTempoDeUtilizacao(Integer tempoDeUtilizacao) {
		this.tempoDeUtilizacao = tempoDeUtilizacao;
	}


	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Solicitacao{" +
				"id=" + id +
				",\n laboratorio=" + laboratorio +
				",\n professor=" + professor +
				",\n departamentos=" + departamentos +
				",\n disciplina=" + disciplina +
				",\n alunos=" + alunos +
				",\n data=" + data +
				",\n tempoDeUtilizacao=" + tempoDeUtilizacao +
				'}';
	}
}