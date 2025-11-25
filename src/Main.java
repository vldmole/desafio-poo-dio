
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentoring;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");

        Course course = new Course();
        course.setTitle("curso java");
        course.setDescription("descrição curso java");
        course.setWorkload(8);
        bootcamp.addContent(course);

        course = new Course();
        course.setTitle("curso js");
        course.setDescription("descrição curso js");
        course.setWorkload(4);
        bootcamp.addContent(course);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("mentoria de java");
        mentoring.setDescription("descrição mentoria java");
        mentoring.setDate(LocalDate.now());
        bootcamp.addContent(mentoring);

        Developer devCamila = new Developer();
        devCamila.setName("Camila");
        devCamila.doRegistration(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getRegistrations());
        devCamila.makeProgress();
        devCamila.makeProgress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getRegistrations());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConcludedContents());
        System.out.println("XP:" + devCamila.totalXp());

        System.out.println("-------");

        Developer devJoao = new Developer();
        devJoao.setName("Joao");
        devJoao.doRegistration(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getRegistrations());
        devJoao.makeProgress();
        devJoao.makeProgress();
        devJoao.makeProgress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getRegistrations());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConcludedContents());
        System.out.println("XP:" + devJoao.totalXp());

    }

}
