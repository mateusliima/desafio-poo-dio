import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        Curso curso2 = new Curso();

        Mentoria mentoria = new Mentoria();
       // mentoria.setTitulo(" Mentoria Java");
       // mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp 1");
        bootcamp.setDescricao("Descrição bootcamp java");
        bootcamp.getConteudos().add(curso);

        Dev dev = new Dev();
        dev.setNome("Mateus");

        dev.inscreverBootcamp(bootcamp);
        System.out.println(dev.getConteudosInscritos());

        System.out.println(mentoria);

    }
}
