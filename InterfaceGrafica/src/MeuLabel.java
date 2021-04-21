import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MeuLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;
	
	public MeuLabel(String texto) {
		super(texto);
		init();
	}
	public void init() {
		
		this.setForeground(new Color(28,28,28));
		this.setFont(new Font(null, Font.BOLD, 14));
		this.setHorizontalAlignment(JLabel.CENTER);
		
		
	}
}
