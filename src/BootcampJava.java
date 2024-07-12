public class BootcampJava extends Bootcamp {
    public BootcampJava(String nome, String descricao) {
        super(nome, descricao);
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Bootcamp: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Cursos:");
        for (Curso curso : getCursos()) {
            System.out.println("  - " + curso.getNome() + " (" + curso.getCargaHoraria() + " horas)");
        }
        System.out.println("Mentorias:");
        for (Mentoria mentoria : getMentorias()) {
            System.out.println("  - " + mentoria.getNome() + ": " + mentoria.getDescricao());
        }
        System.out.println("Desenvolvedores:");
        for (Dev dev : getDevs()) {
            System.out.println("  - " + dev.getNome());
            System.out.println("    Cursos concluídos:");
            for (Curso curso : dev.getCursosConcluidos()) {
                System.out.println("      - " + curso.getNome());
            }
        }
    }
    }
    
// 