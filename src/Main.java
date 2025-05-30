import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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



        System.out.println(mentoria);

    }
}
