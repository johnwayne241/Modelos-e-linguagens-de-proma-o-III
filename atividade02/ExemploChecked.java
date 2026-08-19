import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploChecked {
    public static void main(String[] args) {
        try (FileReader arquivo = new FileReader("dados.txt")) {       // try/catch
            // use o arquivo aqui (ex.: ler algo)
        } catch (FileNotFoundException e) {       //excecao checked
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro de leitura do arquivo.");
        }
    }
}
