import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class Interfaz extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField campoTexto;
	private Button boton;
	private TextArea areaTexto;
	
	public Interfaz(){
		super();
		build();
	}
	
	public Interfaz(String titulo){
		super(titulo);
		build();
	}
	
	private void build(){
		setLayout(new BorderLayout());
		
		campoTexto = new TextField();
		boton = new Button("Click para agregar texto");
		areaTexto = new TextArea();
		
		add(campoTexto, BorderLayout.NORTH);
		add(boton, BorderLayout.SOUTH);
		add(areaTexto, BorderLayout.CENTER);
		
		areaTexto.setEditable(false);
		boton.addActionListener(this);
		
		setVisible(true);
		setSize(300,400);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String text = campoTexto.getText();
		if(text.length() > 0){
			campoTexto.setText("");
			areaTexto.append(text + "\n");
		}
	}
	
}
