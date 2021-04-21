import javax.swing.JTextArea;


public class MinhaArea extends JTextArea {
	
	private static final long serialVersionUID = 1L;
	
	public MinhaArea(String texto) {
		super(texto);
		init();
	}
	public void init() {
		
		this.setColumns(30);
		this.setRows(10);
		this.setBorder(BorderFactory.criar());
		
	}
	
}
