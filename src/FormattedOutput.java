import java.util.Locale;

public class FormattedOutput {
    public static void main(String[] args) {
        var nome = "Maria";
        var sobrenome = "Silva";
        var idade = 18; 
        var aplic = 123.453f;

        System.out.printf("Olá, %s\n", nome);
        System.out.printf("Olá, %s %s\n", nome, sobrenome);
        System.out.printf("Olá, %s %s. Você tem %d anos.\n", nome, sobrenome, idade);

        System.out.printf(Locale.FRANCE, "Você tem R$%.2f aplicados.\n", aplic);
    }
}
