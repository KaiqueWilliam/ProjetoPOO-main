package Requerimentos;

import Execução.Impressao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.exit;

public class SolicitarLaboratorio {
    /**
     * Metodo Usuario que serve para guarda toda a interação do usuario com o
     * sistema dentro de variaveis que ira interagir totalmente com o sistema alem
     * de chamar o metodo imprimir @author Murilo
     */
    static Scanner scan = new Scanner(System.in);
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm");

    public void Usuario() {
        Impressao impressao = new Impressao();
        int i = 0;
        while (i != 1) {
            System.out.println("<<< SOLICITAÇÃO DE RESERVA >>>");
            System.out.println("Digite 1 caso deseja sair do programa.\n ");
            System.out.println("Digite 2 caso deseja reservar laboratorio\n");
            System.out.println("digite 3 caso deseja ver laboratorios reservados");
            i = scan.nextInt();
            switch (i) {
                case 1 :
                    break;
                case 2:
                    userInteraction();
                break;
                case 3:
                    impressao.impressaoReserva();
                break;
                default:
                    System.out.println("numero invalido");
                break;
            }
        }
    }

    private void userInteraction() {
        Impressao impressao = new Impressao();
        ValidarSolicitacao validarSolicitacao=new ValidarSolicitacao();
        try {
            System.out.println("===> Preencha tudo o que se pede a seguir: ");
            System.out.print("Informe qual o laboratorio deseja reservar? ");
            String laboratorioUser = scan.next();
            encerraPrograma(laboratorioUser);
            System.out.print("Informe o nome do professor: ");
            String professorUser = scan.next();
            encerraPrograma(professorUser);
            System.out.print("Informe a sigla da disciplina: ");
            String disciplinaUser = scan.next();
            encerraPrograma(disciplinaUser);
            System.out.print("Informe a data dd/mm/yyyy inicial de uso do laboratorio? ");
            Date dataUser = simpleDateFormat.parse(scan.next());
            encerraPrograma(String.valueOf(dataUser));
            System.out.print("Informe a hora HH:mm inicial de uso do laboratorio? ");
            Date horaUser = simpleDateFormat1.parse(scan.next());
            encerraPrograma(String.valueOf(horaUser));
            System.out.print("Informe os minutos que deseja usar o laboratorio? ");
            String minutoUser = scan.next();
            System.out.println("");
            encerraPrograma(minutoUser);
            validarSolicitacao.validaReserva();
            impressao.Imprimir(laboratorioUser, professorUser, disciplinaUser, dataUser, horaUser, minutoUser);
        } catch (ParseException p) {
            System.out.println("erro parse " + p.getMessage());
        }

    }

    /**
     * Metodo para a verificação do que o usuario digitou, se o usuario digitar 1 a
     * qualquer momento o programa ira encerrar. @author Murilo
     */
    private void encerraPrograma(String respostaUsuario) {
        if ("1".equals(respostaUsuario)) {
            System.out.println("Programa encerrado");
            exit(0);
        }
    }



}