import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class imgLab extends JLabel {
	
	public imgLab(ImageIcon imageIcon) {
		super(imageIcon);
		init();
	}
	private void init() {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setPreferredSize(new Dimension(200, 350));
	}
}
