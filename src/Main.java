import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("decrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("decrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java ");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafaela = new Dev();
        devRafaela.setNome("Rafaela");
        devRafaela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devRafaela.getConteudosInscritos());
        devRafaela.progredir();
        devRafaela.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: " + devRafaela.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devRafaela.getConteudosConcluidos());
        System.out.println("XP: "+devRafaela.calcularTotalXp());


        System.out.println("----------");

        Dev devJosefina =  new Dev();
        devJosefina.setNome("Josefina");
        devJosefina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devJosefina.getConteudosInscritos());
        devJosefina.progredir();
        devJosefina.progredir();
        devJosefina.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: " + devJosefina.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devJosefina.getConteudosConcluidos());
        System.out.println("XP: "+devJosefina.calcularTotalXp());


    }
}
