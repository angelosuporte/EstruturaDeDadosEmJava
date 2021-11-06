import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Pedro");
        aluno.put("Idade", "23");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "3c");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "22");
        aluno2.put("Média", "8.5");
        aluno2.put("Turma", "2a");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

    }
}
