import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Lesson>lessonList = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int quantidadeAula = sc.nextInt();

        for (int i = 0 ; i < quantidadeAula ; i++){
            System.out.println("Dados da " + (i + 1) + "ª aula");
            sc.nextLine(); // consumo de linha;

            System.out.print("Conteudo ou tarefa ( c/t) ");
            char ch = sc.next().toLowerCase().charAt(0);

            System.out.print("TITULO : ");
            String titulo = sc.nextLine();

            if(ch == 'c'){
                System.out.print("URL do video: ");
                String url = sc.nextLine();

                System.out.println("Duração em segundos: ");
                int segundos = sc.nextInt();

                sc.nextLine();
                lessonList.add(new Video(titulo,url,segundos));
            } else if (ch == 't') {
                System.out.print("Descrição: ");
                String descricao = sc.nextLine();

                System.out.print("Quantidade de questões: ");
                int quantidadeQuestoes = sc.nextInt();

                sc.nextLine();
                lessonList.add(new Task(titulo,descricao,quantidadeQuestoes));
            }else{

            }
        }


        sc.close();
    }
}