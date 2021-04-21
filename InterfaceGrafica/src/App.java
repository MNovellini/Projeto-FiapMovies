import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class App {
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JFrame janela = new JFrame("Fiap Movies");
		
		JPanel cadastro =  new JPanel(new BorderLayout(20, 0));
		JPanel panel = new JPanel(new GridLayout(10, 1));
		JPanel ref = new JPanel(new GridLayout(5, 5));
		ref.setPreferredSize(new Dimension(180, 200));
		JPanel botoes = new JPanel();
		JPanel imagem =  new JPanel(new GridLayout(1, 1));
		
		cadastro.add(imagem, BorderLayout.WEST);
		cadastro.add(panel, BorderLayout.CENTER);
		cadastro.add(ref, BorderLayout.EAST);
		cadastro.add(botoes, BorderLayout.SOUTH);
		
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", cadastro);
		abas.add("Lista", new JPanel());
		janela.add(abas);
		
		
		imagem.add(new imgLab(new ImageIcon("src/imagem/wandavision.png")));
		
		MeuLabel label = new MeuLabel("Título");
		panel.add(label);
		JTextField text = new MeuTextField(null);
		panel.add(text);
		MeuLabel label2 = new MeuLabel("Sinopse");
		panel.add(label2);
		JTextArea descricao = new MinhaArea(null);
		panel.add(descricao);	
		MeuLabel label3 = new MeuLabel("Gênero");
		panel.add(label3);
		String[] genero = {null, "Ação", "Aventura", "Comédia", "Drama"};
		panel.add(new JComboBox<String>(genero)); 

		
		
		
		MeuLabel label4 = new MeuLabel("Onde assistir");
		ref.add(label4);
		RadioGroup radioGroup = new RadioGroup(List.of("Netflix", "Prime Video", "Pirate Bay", "Disney"));
		ref.add(radioGroup);
		
		
		JCheckBox checkBox = new JCheckBox("Assistido");
		ref.add(checkBox);
		
		JLabel avLabel = new JLabel("Avaliação");
		
		ref.add(avLabel);
		ref.add(new StarRater(5));
		
		
		botoes.add(new JButton("Salvar"), BorderLayout.SOUTH);
		botoes.add(new JButton("Cancelar"), BorderLayout.SOUTH);
		
		
		janela.setSize(600, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
}