package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import src.resources.LanguageMaps;

public class AlunoScreen implements ActionListener {

	private JFrame alunoFrame;
	private JPanel mainPanel, fotoPanel, nomePanel, emailPanel, nota1, nota2, notaTrab, notaFinal, notaApresentacao,
			curso, disciplina;
	private Menu menu;
	
	private static String language = LanguageMaps.PT_BR;
	private static LanguageMaps lm = new LanguageMaps();

	public AlunoScreen(Map map) {

		alunoFrame = new JFrame(String.format("%s", map.get("AlunoScreenTitle")));
		alunoFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		alunoFrame.setLocation(300,300);
		alunoFrame.setSize(320, 240);

		menu = new Menu(map, alunoFrame);
		
		
		
		alunoFrame.setJMenuBar(menu.getMenu());
		alunoFrame.setVisible(true);
	}
	
	 public static Map getLanguage(){
	        if(language.equals(LanguageMaps.EN_US)){
	            return lm.getEnglishStringMap();
	        }
	        if (language.equals(LanguageMaps.PT_BR)){
	            return lm.getPortugueseStringMap();
	        }
	        return lm.getPortugueseStringMap(); //standard language of the ui
	    } 
	    
	    public static void main(String[] args) {
        new AlunoScreen(getLanguage()); 
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
