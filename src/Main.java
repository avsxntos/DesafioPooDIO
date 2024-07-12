public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new BootcampJava("Bootcamp Java", "Bootcamp de Java");
        

        Curso curso1 = new Curso("Java Básico", 40);
        Curso curso2 = new Curso("Java Avançado", 80);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Mentoria de Java");
        
        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev("Maria");

        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarMentoria(mentoria);
        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);

        dev1.adicionarCursoConcluido(curso1);
        dev2.adicionarCursoConcluido(curso2);

        bootcamp.imprimirDetalhes();
    }
}
