
import java.time.LocalDate;

import br.com.dio.desafiopoo.Bootcamp;
import br.com.dio.desafiopoo.Curso;
import br.com.dio.desafiopoo.Dev;
import br.com.dio.desafiopoo.Mentoria;

public class Main {
	public static void main(String[] args) {
		System.out.println("Iniciando o sistema!");
		Curso curso1 = new Curso();
		curso1.setTitulo("Programação em Python");
		curso1.setDescricao("Aprenda a programar em Python");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Front-end com React");
		curso2.setDescricao("Desenvolva aplicações com React");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria em Data Science");
		mentoria.setDescricao("Aprenda a trabalhar com dados e Machine Learning");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Full Stack Developer");
		bootcamp.setDescricao("Formação completa para se tornar um desenvolvedor Full Stack");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devAna = new Dev();
		devAna.setNome("Ana");
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
		devAna.progredir();
		devAna.progredir();
		devAna.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Ana:" + devAna.getConteudosConcluidos());
		System.out.println("XP:" + devAna.calcularTotalXp());

		System.out.println("-------");

		Dev devPedro = new Dev();
		devPedro.setNome("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
		devPedro.progredir();
		devPedro.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Pedro:" + devPedro.getConteudosConcluidos());
		System.out.println("XP:" + devPedro.calcularTotalXp());

	}

}
