public class FileErrorException extends IllegalArgumentException{
    FileErrorException(){
        System.out.println("Arquivo nao encontrado");
    }
}
