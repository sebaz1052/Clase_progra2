package co.edu.uptc.appcontact.interfaces;


import co.edu.uptc.appcontact.enums.ETypeFile;

public class IActionFile {
	public interface IActionsFile {
		public void dumpFile(ETypeFile eTypeFile);
		public void loadStudent(ETypeFile eTypeFile);
	}
}
