import java.util.List;
import java.util.ArrayList;

public abstract class Bootcamp {
    private String nome;
    private String descricao;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;
    private List<Dev> devs;

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
        this.devs = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        this.mentorias.add(mentoria);
    }

    public void adicionarDev(Dev dev) {
        this.devs.add(dev);
    }

    public abstract void imprimirDetalhes();
}