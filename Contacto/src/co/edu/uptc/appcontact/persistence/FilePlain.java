package co.edu.uptc.appcontact.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import co.edu.uptc.appcontact.config.Config;
import co.edu.uptc.appcontact.constants.CommonConstants;

public class FilePlain {
	protected Config confValue;
	
	public FilePlain () {
		confValue= Config.getInstance();
	}
	private String readFile(String rutaNombre) {
		StringBuilder contenido = new StringBuilder();
        try {
            FileReader fr = new FileReader(rutaNombre);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append(CommonConstants.NEXT_LINE);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Se presentó un error al leer el archivo específicado");
        }
        return contenido.toString();
	}
        private void writeFile(String rutaNombreArchivo ,String content){
        	 try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaNombreArchivo))){
             	writer.write(content);
         } catch (IOException e) {
		e.printStackTrace();
             System.out.println("Error al escribir en el archivo:" + e.getMessage());
         }
        }
	protected List<String> reader(String rutaNombre¨){
	List<String> output = new Arraylist<>();
	StringTokenizer tokens= new StringTokenizer(this.readFile(rutaNombre), CommonConstants.NEXT.LINE);
	while(tokens.hasMoreElements){
	output.add(token.nextToken());
	}
	return output;
	}
	protected void writer(String rutaNombre, List<String> file){
	StringBuilder strContent = new StringBuilder();
	file.forEach(record -> strContent.append(record).append(CommonConstants.SALTO_LINEA));
	writeFile(rutaNombre, strContent.toString());
	}
}

   		
