import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Turma[] turmas = new Turma[10];
    static int qntTurma = 0;
    static Matricula[] matriculas = new Matricula[10];
    static int qntMatricula = 0;
    static Campus[] tCampus = new Campus[10];
    static int qntCampus = 0;
    static Curso[] cursos = new Curso[10];
    static int qntCursos = 0;
    static Aluno[] alunos = new Aluno[10];
    static int qntAlunos = 0;
    
    public static void exibirMenu() {
        System.out.println("-----Escolha uma das opções abaixo-----");
        System.out.println("Digite 1 para cadastrar Turma");
        System.out.println("Digite 2 para cadastrar Matricula");
        System.out.println("Digite 3 para cadastrar Campus");
        System.out.println("Digite 4 para cadastrar Curso");
        System.out.println("Digite 5 para cadastrar Aluno");
        System.out.println("Digite 6 para exibir cadastros");
        System.out.println("Digite 0 para sair");
        System.out.println("---------------------------------------");
    }

    private static void roteador(int opcao) {
        switch (opcao) {
            case (0):
                break;
            case (1):
                cadastrarTurma();
                break;
            case (2):
                cadastrarMatricula();
                break;
            case (3):
                cadastrarCampus();
                break;
            case (4):
                cadastrarCurso();
                break;
            case (5):
                cadastrarAluno();
                break;
            case (6):
                gerarRelatorio();
                break;
            default:
                System.out.println("Escolha uma opção Valida");
                break;
        }
    }
    
    private static void cadastrarTurma() {
        scan.nextLine();
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma");
        turma.setNome(scan.nextLine());
        System.out.println("Digite o numero minimo de alunos");
        turma.setNumeroMinimo(scan.nextInt());
        System.out.println("Digite o ano de ingresso");
        turma.setAnoIngresso(scan.nextInt());
        turmas[qntTurma++] = turma;
    }
    
    private static void cadastrarMatricula() {
        scan.nextLine();
        Matricula matricula = new Matricula();
        System.out.println("Digite o RA da matricula");
        matricula.setRa(scan.nextLine());
        System.out.println("Digite a data da matricula");
        matricula.setData(scan.nextLine());
        System.out.println("Digite a situação da matricula");
        matricula.setSituacao(scan.nextBoolean());
        matriculas[qntMatricula++] = matricula;
    }
    
    private static void cadastrarCampus() {
        scan.nextLine();
        Campus campus = new Campus();
        System.out.println("Digite o nome do campus");
        campus.setNome(scan.nextLine());
        System.out.println("Digite a cidade do campus");
        campus.setCidade(scan.nextLine());
        System.out.println("Digite o endereço do campus");
        campus.setEndereco(scan.nextLine());
        tCampus[qntCampus++] = campus;
    }
    
    private static void cadastrarCurso() {
        scan.nextLine();
        Curso curso = new Curso();
        System.out.println("Digite o nome do curso");
        curso.setNome(scan.nextLine());
        System.out.println("Digite a modalidade do curso");
        curso.setModalidade(scan.nextLine());
        System.out.println("Digite a duração do curso");
        curso.setDuracao(scan.nextLine());
        cursos[qntCursos++] = curso;
    }
    
    private static void cadastrarAluno() {
        scan.nextLine();
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno");
        aluno.setNome(scan.nextLine());
        System.out.println("Digite o cpf do aluno");
        aluno.setCpf(scan.nextLine());
        System.out.println("Digite a data de nascimento do aluno");
        aluno.setDataNascimento(scan.nextLine());
        System.out.println("Digite o telefone do aluno");
        aluno.setTelefone(scan.nextLine());
        System.out.println("Digite o endereco do aluno");
        aluno.setEndereco(scan.nextLine());
        alunos[qntAlunos++] = aluno;
    }

    private static void gerarRelatorio(){
        for (int i = 0; i<qntTurma; i++) {
            System.out.print(turmas[i].getNome()+" - ");
            System.out.print(turmas[i].getNumeroMinimo()+" - ");
            System.out.println(turmas[i].getAnoIngresso());
        }
        for (int i = 0; i<qntMatricula; i++) {
            System.out.print(matriculas[i].getData()+" - ");
            System.out.print(matriculas[i].getRa()+" - ");
            System.out.println(matriculas[i].isSituacao());
        }
        for (int i = 0; i<qntCampus; i++) {
            System.out.print(tCampus[i].getNome()+" - ");
            System.out.print(tCampus[i].getCidade()+" - ");
            System.out.println(tCampus[i].getEndereco());
        }
        for (int i = 0; i<qntCursos; i++) {
            System.out.print(cursos[i].getNome()+" - ");
            System.out.print(cursos[i].getModalidade()+" - ");
            System.out.println(cursos[i].getDuracao());
        }
        for (int i = 0; i<qntAlunos; i++) {
            System.out.print(alunos[i].getNome()+" - ");
            System.out.print(alunos[i].getCpf()+" - ");
            System.out.print(alunos[i].getDataNascimento()+" - ");
            System.out.print(alunos[i].getTelefone()+" - ");
            System.out.println(alunos[i].getEndereco());
        }
    }

    public static void main(String[] args) throws Exception {
        int opcao = 0;
        do {
            exibirMenu();
            opcao = scan.nextInt();
            roteador(opcao);
        } while (opcao != 0);
    }

}
