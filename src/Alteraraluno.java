import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Alteraraluno extends JFrame implements ActionListener  {

	JButton B1, B2, B3;
	   JTextField Nome, End, RG, CPF, Matr;
	   JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9;
	   DefaultListModel lista;
	   JList Est;
	   JCheckBox Idi1, Idi2, Idi3, Idi4, Idi5;
	   ButtonGroup Bg;
	   JRadioButton Nac1, Nac2;
	   String Matricula = "123.456-7"; 
	   
	   public Alteraraluno() {
		   setTitle("Tela de Altera��o dos Dados do Aluno");
		      setSize(500,500);
		      setLocation(80,50);
		      getContentPane().setBackground(new Color(255, 255, 255 ));
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		      L1 = new JLabel("ALTERA��O DOS DADOS DO ALUNO");
		      L1.setLocation(30,20);
		      L1.setSize(490,20);
		      L1.setFont(new Font("Serif", Font.BOLD, 22));

		      L9 = new JLabel("Matricula:");
		      L9.setLocation(30,70);
		      L9.setSize(70,20);

		      Matr = new JTextField("");
		      Matr.setSize(100,25);
		      Matr.setLocation(110,70);

		      L2 = new JLabel("Nome:");
		      L2.setLocation(30,110);
		      L2.setSize(70,20);

		      Nome = new JTextField("");
		      Nome.setSize(300,25);
		      Nome.setLocation(110,110);

		      L3 = new JLabel("Endere�o:");
		      L3.setLocation(30,145);
		      L3.setSize(70,20);

		      End = new JTextField("");
		      End.setSize(300,25);
		      End.setLocation(110,145);	
			
		      L4 = new JLabel("RG:");
		      L4.setLocation(30,180);
		      L4.setSize(70,20);

		      RG = new JTextField("");
		      javax.swing.text.MaskFormatter format_textField4 = new javax.swing.text.MaskFormatter("##.###.### -##");
	          RG = new javax.swing.JFormattedTextField(format_textField4);
		      RG.setSize(170,25);
		      RG.setLocation(110,180);

		      L5 = new JLabel("CPF:");
		      L5.setLocation(30,215);
		      L5.setSize(70,20);

		      CPF = new JTextField("");
		      javax.swing.text.MaskFormatter format_textField41 = new javax.swing.text.MaskFormatter("###.###.###-##");
	          CPF = new javax.swing.JFormattedTextField(format_textField41);
		      CPF.setSize(170,25);
		      CPF.setLocation(110,215);	
			
		      L6 = new JLabel("Estado");
		      L6.setLocation(350,180);
		      L6.setSize(70,20);

		      lista = new DefaultListModel();
		      lista.addElement("Acre");
		      lista.addElement("Bahia");
		      lista.addElement("Fortaleza");
		      lista.addElement("Rio de Janeiro");
		      lista.addElement("Santa Catarina");
		      lista.addElement("S�o Paulo");
		      lista.addElement("Tocantins");

		      Est = new JList(lista);
		      Est.setSize(110,150);
		      Est.setLocation(330,200);
		      Est.setBackground(new Color(255, 248, 220));
		      //Est.addListSelectionListener(this);

		      L7 = new JLabel("Idiomas");
		      L7.setLocation(30,260);
		      L7.setSize(70,20);

		      Idi1 = new JCheckBox("Ingl�s",false);
		      Idi1.setLocation(25,280);
		      Idi1.setSize(120,20);
		      //Idi1.addItemListener(this);
		      Idi1.setBackground(new Color(255, 248, 220));
				
		      Idi2 = new JCheckBox("Espanhol",false);
		      Idi2.setLocation(25,300);
		      Idi2.setSize(120,20);
		      //Idi2.addItemListener(this);
		      Idi2.setBackground(new Color(255, 248, 220));
				
		      Idi3 = new JCheckBox("Alem�o",false);
		      Idi3.setLocation(25,320);
		      Idi3.setSize(120,20);
		      //Idi3.addItemListener(this);
		      Idi3.setBackground(new Color(255, 248, 220));
				
		      Idi4 = new JCheckBox("Franc�s",false);
		      Idi4.setLocation(25,340);
		      Idi4.setSize(120,20);
		      //Idi4.addItemListener(this);
		      Idi4.setBackground(new Color(255, 248, 220));
				
		      Idi5 = new JCheckBox("Outro",false);
		      Idi5.setLocation(25,360);
		      Idi5.setSize(120,20);
		      //Idi5.addItemListener(this);
		      Idi5.setBackground(new Color(255, 248, 220));
				
		      L8 = new JLabel("Nacionalidade");
		      L8.setLocation(180,260);
		      L8.setSize(100,20);

		      Nac1 = new JRadioButton("Brasileira", true);
		      Nac1.setLocation(180,280);
		      Nac1.setSize(100,20);
		      //Nac1.addItemListener(this);
		      Nac1.setBackground(new Color(255, 248, 220));
				
		      Nac2 = new JRadioButton("Outra", false);
		      Nac2.setLocation(180,310);
		      Nac2.setSize(100,20);
		      //Nac2.addItemListener(this);
		      Nac2.setBackground(new Color(255, 248, 220));
					
		      Bg = new ButtonGroup();
		      Bg.add(Nac1);
		      Bg.add(Nac2);

		      B1 = new JButton("Alterar");
		      B1.setSize(100,40);
		      B1.setLocation(50,400);
		      B1.setBackground(new Color(255, 248, 220));
		      B1.addActionListener(this);
		      B1.setFont(new Font("Serif", Font.BOLD, 18));      
		      B1.setBackground(new Color(255, 248, 220));

		      B2 = new JButton("Confirmar");
		      B2.setSize(140,40);
		      B2.setLocation(180,400);
		      B2.setBackground(new Color(255, 248, 220));
		      B2.addActionListener(this);
		      B2.setFont(new Font("Serif", Font.BOLD, 18));      
		      B2.setBackground(new Color(255, 248, 220));
		      B2.setVisible(false);   

		      B3 = new JButton("Sair");
		      B3.setSize(100,40);
		      B3.setLocation(350,400);
		      B3.setBackground(new Color(255, 248, 220));
		      B3.addActionListener(this);
		      B3.setFont(new Font("Serif", Font.BOLD, 18));      
		      B3.setBackground(new Color(255, 248, 220));

		      getContentPane().setLayout(null);
		      getContentPane().add(L1);
		      getContentPane().add(L2);
		      getContentPane().add(L3);
		      getContentPane().add(L4);
		      getContentPane().add(L5);
		      getContentPane().add(L6);
		      getContentPane().add(L7);
		      getContentPane().add(L8);
		      getContentPane().add(L9);
		      getContentPane().add(Nome);
		      getContentPane().add(End);
		      getContentPane().add(RG);
		      getContentPane().add(CPF);
		      getContentPane().add(Matr);
		      getContentPane().add(Est);
		      getContentPane().add(Idi1);
		      getContentPane().add(Idi2);
		      getContentPane().add(Idi3);
		      getContentPane().add(Idi4);
		      getContentPane().add(Idi5);
		      getContentPane().add(Nac1);
		      getContentPane().add(Nac2);
		      getContentPane().add(B1);
		      getContentPane().add(B2);
		      getContentPane().add(B3);	
		   
	   }
	   
	   public static void main(String[] args) throws ParseException {
		new Alteraraluno().setVisible(true);
	}
	   public void actionPerformed(ActionEvent e) {
		   if (e.getSource() == B3)
		         dispose(); 
		   else
		         if (e.getSource() == B1)
		         {
		            Nome.setText("Epaminindas de Oliveira Souza"); 
		            End.setText("Rua Sobe e Desce, 1234, Vila Encantado"); 
		            RG.setText("123.456.789-10"); 
		            CPF.setText("456.789.912");
		            Est.setSelectedIndex(5);
		            Idi3.setSelected(true);
		            Nac1.setSelected(true);
		            B2.setVisible(true); 
		         }
		         else
		            if (e.getSource() == B2)
		            {
		               JOptionPane.showMessageDialog(null,"ALUNO: " + Matr.getText() + "  " + Nome.getText() +
		                  "\nALTERADO COM SUCESSO",
		                  "ATENCAO",JOptionPane.INFORMATION_MESSAGE);
		               Matr.setText(""); 
		                Nome.setText(""); 
		               End.setText(""); 
		               RG.setText(""); 
		               CPF.setText("");
		               Est.setSelectedIndex(9);
		               Idi3.setSelected(false);
		               Nac1.setSelected(true);
		               B2.setVisible(false); 
	   }
	   }
}
