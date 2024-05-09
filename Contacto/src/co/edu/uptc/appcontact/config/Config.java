package co.edu.uptc.appcontact.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
private static Config config; //se cre una instancia de la misma clase
private Properties propiedades;
private String path;
private String nameFileTXT;
private String nameFileXML;

private Config() {
	this.propiedades= new Properties();
	try (FileInputStream entrada = new FileInputStream("resources/conf/appconf.properties")) {
        propiedades.load(entrada);
        this.path = propiedades.getProperty("ruta.archivo.txt");
        this.nameFileTXT = propiedades.getProperty("nombre.archivo.txt");
        this.nameFileXML = propiedades.getProperty("nombre.archivo.xml");;
    } catch (IOException ex) {
        System.err.println("Error al cargar el archivo properties de configuración: " + ex.getMessage());
    }
}
public static Config getInstance() {
	if (config==null) {
		config= new Config();
	}
	return config;
}
public Properties getPropiedades() {
	return propiedades;
}
public void setPropiedades(Properties propiedades) {
	this.propiedades = propiedades;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public String getNameFileTXT() {
	return nameFileTXT;
}
public void setNameFileTXT(String nameFileTXT) {
	this.nameFileTXT = nameFileTXT;
}
public String getNameFileXML() {
	return nameFileXML;
}
public void setNameFileXML(String nameFileXML) {
	this.nameFileXML = nameFileXML;
}


}
