import java.io.*;

public class EscribirArchivo{

	public static void main(String[]args) throws IOException{

		File archivo;
		archivo = new File("ejemplo.txt");
		archivo.createNewFile();

		FileWriter escritor = new FileWriter(archivo);
		escritor.close();

	}
}