import java.awt.Dimension;
import javax.swing.JTextField;

public class MeuTextField extends JTextField {
	
	private static final long serialVersionUID = 1L;
	
	public MeuTextField(String texto) {
		super(texto);
		init();
	}
	public void init() {
		
		this.setPreferredSize(new Dimension(200, 30));
		this.setBorder(BorderFactory.criar());
		
	}
}
