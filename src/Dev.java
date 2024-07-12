public class Dev {
    private String nome;
    private Curso[] cursosConcluidos;

    public Dev(String nome) {
        this.nome = nome;
        this.cursosConcluidos = new Curso[0];
    }

    public String getNome() {
        return nome;
    }

    public Curso[] getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void adicionarCursoConcluido(Curso curso) {
        Curso[] newCursosConcluidos = new Curso[this.cursosConcluidos.length + 1];
        for (int i = 0; i < this.cursosConcluidos.length; i++) {
            newCursosConcluidos[i] = this.cursosConcluidos[i];
        }
        newCursosConcluidos[this.cursosConcluidos.length] = curso;
        this.cursosConcluidos = newCursosConcluidos;
    }
}