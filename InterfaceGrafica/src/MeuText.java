import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MeuText extends JTextField{
	private static final long serialVersionUID = 1L;
	
	public MeuText(String text) {
		super(text);
		init();
	}
	public void init() {
		
		this.setPreferredSize(new Dimension(200, 30));
		this.setBorder(new LineBorder(Color.BLACK));
		this.setForeground(new Color(50,50,50));
		this.setBorder(new LineBorder(new Color(26, 108, 163)));
		
	}
}
