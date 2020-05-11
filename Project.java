import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Project extends JFrame implements ActionListener {
	JButton definition, add, delete, file, help, clear, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u,
			v, w, x, y, z, n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, sym1, sym2, shift, space, check,cleartxt;
	JTextField input;
	JTextArea txt;
	String kb = "", addDef = null, newFileName = null;
	static String line;
	static String acronym;
	static String defin;
	String output = "";
	boolean shiftPressed = false;
	static ArrayList<String> acArray = new ArrayList<String>();
	static ArrayList<String> defArray = new ArrayList<String>();

	public Project() {
		super("Virtual Acronym Dictionary");
		setSize(1000, 300);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		setLayout(new GridLayout(1, 3));
		JPanel left = new JPanel();
		left.setLayout(new GridLayout(6, 1));
		definition = new JButton("  Definition  ");
		add = new JButton("  Add Word  ");
		delete = new JButton("Delete Word");
		file = new JButton("        File        ");
		help = new JButton("        Help       ");
		clear = new JButton("       Clear       ");
		definition.addActionListener(this);
		add.addActionListener(this);
		delete.addActionListener(this);
		file.addActionListener(this);
		help.addActionListener(this);
		clear.addActionListener(this);
		JPanel btn1 = new JPanel();
		JPanel btn2 = new JPanel();
		JPanel btn3 = new JPanel();
		JPanel btn4 = new JPanel();
		JPanel btn5 = new JPanel();
		JPanel btn6 = new JPanel();
		btn1.add(definition);
		btn2.add(add);
		btn3.add(delete);
		btn4.add(file);
		btn5.add(help);
		btn6.add(clear);
		left.add(btn1);
		left.add(btn2);
		left.add(btn3);
		left.add(btn4);
		left.add(btn5);
		left.add(btn6);
		add(left);
		a = new JButton("A");
		a.addActionListener(this);
		b = new JButton("B");
		b.addActionListener(this);
		c = new JButton("C");
		c.addActionListener(this);
		d = new JButton("D");
		d.addActionListener(this);
		e = new JButton("E");
		e.addActionListener(this);
		f = new JButton("F");
		f.addActionListener(this);
		g = new JButton("G");
		g.addActionListener(this);
		h = new JButton("H");
		h.addActionListener(this);
		i = new JButton("I");
		i.addActionListener(this);
		j = new JButton("J");
		j.addActionListener(this);
		k = new JButton("K");
		k.addActionListener(this);
		l = new JButton("L");
		l.addActionListener(this);
		m = new JButton("M");
		m.addActionListener(this);
		n = new JButton("N");
		n.addActionListener(this);
		o = new JButton("O");
		o.addActionListener(this);
		p = new JButton("P");
		p.addActionListener(this);
		q = new JButton("Q");
		q.addActionListener(this);
		r = new JButton("R");
		r.addActionListener(this);
		s = new JButton("S");
		s.addActionListener(this);
		t = new JButton("T");
		t.addActionListener(this);
		u = new JButton("U");
		u.addActionListener(this);
		v = new JButton("V");
		v.addActionListener(this);
		w = new JButton("W");
		w.addActionListener(this);
		x = new JButton("X");
		x.addActionListener(this);
		y = new JButton("Y");
		y.addActionListener(this);
		z = new JButton("Z");
		z.addActionListener(this);
		n1 = new JButton("1");
		n1.addActionListener(this);
		n2 = new JButton("2");
		n2.addActionListener(this);
		n3 = new JButton("3");
		n3.addActionListener(this);
		n4 = new JButton("4");
		n4.addActionListener(this);
		n5 = new JButton("5");
		n5.addActionListener(this);
		n6 = new JButton("6");
		n6.addActionListener(this);
		n7 = new JButton("7");
		n7.addActionListener(this);
		n8 = new JButton("8");
		n8.addActionListener(this);
		n9 = new JButton("9");
		n9.addActionListener(this);
		n0 = new JButton("0");
		n0.addActionListener(this);
		sym1 = new JButton("– .");
		sym1.addActionListener(this);
		sym2 = new JButton("& /");
		sym2.addActionListener(this);
		shift = new JButton("Shift");
		shift.addActionListener(this);
		space = new JButton("Spc");
		space.addActionListener(this);
		JPanel center = new JPanel();
		center.setLayout(new FlowLayout());
		JPanel keyboard = new JPanel();
		keyboard.setLayout(new GridLayout(8, 5));
		input = new JTextField("                             <Enter Acronym Here>", 27);
		input.setEditable(false);
		input.setBackground(Color.white);
		center.add(input);
		keyboard.add(a);
		keyboard.add(b);
		keyboard.add(c);
		keyboard.add(d);
		keyboard.add(e);
		keyboard.add(f);
		keyboard.add(g);
		keyboard.add(h);
		keyboard.add(i);
		keyboard.add(j);
		keyboard.add(k);
		keyboard.add(l);
		keyboard.add(m);
		keyboard.add(n);
		keyboard.add(o);
		keyboard.add(p);
		keyboard.add(q);
		keyboard.add(r);
		keyboard.add(s);
		keyboard.add(t);
		keyboard.add(u);
		keyboard.add(v);
		keyboard.add(w);
		keyboard.add(x);
		keyboard.add(y);
		keyboard.add(z);
		keyboard.add(sym1);
		keyboard.add(sym2);
		keyboard.add(shift);
		keyboard.add(space);
		keyboard.add(n1);
		keyboard.add(n2);
		keyboard.add(n3);
		keyboard.add(n4);
		keyboard.add(n5);
		keyboard.add(n6);
		keyboard.add(n7);
		keyboard.add(n8);
		keyboard.add(n9);
		keyboard.add(n0);
		center.add(keyboard);
		add(center);
		JPanel right = new JPanel();
		right.setLayout(new FlowLayout());
		txt = new JTextArea("Enter Text Here", 12, 21);
		check = new JButton("Text Check");
		check.addActionListener(this);
		cleartxt = new JButton("Clear Text");
		cleartxt.addActionListener(this);
		right.add(txt);
		right.add(check);
		right.add(cleartxt);
		add(right);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Project();
		try {
			FileInputStream instream = new FileInputStream("acronym.txt");
			Scanner reader = new Scanner(instream);

			while (reader.hasNextLine()) {
				line = reader.nextLine();
				acronym = line.trim().substring(0, line.indexOf("—"));
				defin = line.trim().substring(line.indexOf("—") + 1);
				acArray.add(acronym.trim());
				defArray.add(defin.trim());
			}
			reader.close();
			acArray.trimToSize();
			defArray.trimToSize();
		} catch (FileNotFoundException e1) {
			System.out.println("File Not Found");
		}

	}

	public void actionPerformed(ActionEvent e2) {
		int clearer = 0;
		Color previousColor = a.getBackground();
		JButton[] btns = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, n1, n2, n3, n4,
				n5, n6, n7, n8, n9, n0, sym1, sym2 };

		if (e2.getSource() == shift)
			shiftPressed = !shiftPressed;

		for (int i = 0; i < btns.length; i++) {
			if (shiftPressed == true) {
				shift.setBackground(Color.LIGHT_GRAY);
				btns[i].setText(btns[i].getText().toLowerCase());
				btns[36].setText(". –");
				btns[37].setText("/ &");
			} else if (shiftPressed == false) {
				btns[i].setText(btns[i].getText().toUpperCase());
				btns[36].setText("– .");
				btns[37].setText("& /");
				shift.setBackground(previousColor);
			}
			if (e2.getSource() == btns[i]) {
				if (clearer < 0) {
					input.setText("");
					clearer++;
				}
				kb = kb.concat(btns[i].getText().charAt(0) + "");
				input.setText(kb);
			}

		}
		if (e2.getSource() == space) {
			kb = kb.concat(" ");

		}
		if (e2.getSource() == clear) {
			input.setText("                             <Enter Acronym Here>");
			txt.setText("Enter Text Here");
			kb = "";
		}
		if (e2.getSource() == definition) {
			boolean found = false;
			for (int i = 0; i < acArray.size(); i++) {
				if (acArray.get(i).equals(input.getText())) {
					output = output.concat(defArray.get(i)) + "\n";
					found=true;
				}
			}
			if(found==true) {
			txt.setText(output);
			output = "";
			}
			else
				JOptionPane.showMessageDialog(null, "The word does not exist in the file");
		}
		if (e2.getSource() == check) {
			String container = txt.getText();
			for (int i = acArray.size() - 1; i > 0; i--) {
				if (container.contains(acArray.get(i))) {
					System.out.println(defArray.get(i));

					container = container.replace(acArray.get(i), defArray.get(i));
				}
			}
			JOptionPane.showMessageDialog(null, container);

		}
		if (e2.getSource() == add) {
			String word = JOptionPane.showInputDialog(null, "Please enter a word to be added");
			if (word != null)
				addDef = JOptionPane.showInputDialog(null, "Please enter the definition of the word to be added");
			if (addDef != null) {
				acArray.add(word);
				defArray.add(addDef);
				JOptionPane.showMessageDialog(null, "Word and definition have been successfully added");
				word = null;
				addDef = null;
			}
		}
		if (e2.getSource() == delete) {
			boolean found = false;
			String word = JOptionPane.showInputDialog(null, "Please enter a word to be deleted");
			if (word != null) {
				for (int i = 0; i < acArray.size(); i++) {
					if (acArray.get(i).equals(word)) {
						acArray.remove(word);
						defArray.remove(word);
						i--;
						found = true;
					}
				}
				if (found == true)
					JOptionPane.showMessageDialog(null, "Word and definition have been successfully removed");
				else
					JOptionPane.showMessageDialog(null, "The word does not exist");
				word = null;
			}
		}
		if (e2.getSource() == file) {
			String newFileName = JOptionPane.showInputDialog(null, "Please enter the new acronyms file name");
			if (newFileName != null) {
				try {
					FileInputStream instream = new FileInputStream(newFileName);
					Scanner reader = new Scanner(instream);

					while (reader.hasNextLine()) {
						line = reader.nextLine();
						acronym = line.trim().substring(0, line.indexOf("—"));
						defin = line.trim().substring(line.indexOf("—") + 1);
						acArray.add(acronym.trim());
						defArray.add(defin.trim());
					}
					reader.close();
					acArray.trimToSize();
					defArray.trimToSize();
					newFileName = null;
				} catch (FileNotFoundException e1) {
					JOptionPane.showMessageDialog(null, "File not found, App will continue with the old file");
				}
			}

		}
		if (e2.getSource() == help) {
			JOptionPane.showMessageDialog(null,
					"This application is a virtual acronym dictionary app.\nAn acronym is a word formed from the initial letters of a name."
					+ "\nFor example, the word IBM is formed from the initial letters of the name: International Business Machines."
					+ "\nYou can search for an accronym by entering it and then clicking the 'Definition' button."
					+ "\nYou can enter a text on the field with a number of acronyms, and click 'Text Check', which translates the acronyms in that text into their definitions."
					+ "\nIf you wish to search for a new word, click on the 'Clear' button on the bottom left of the dictionary"
					+ "\nIn addition, you can also add a word to the dictionary, delete a word, and specify your own acronyms file name."
					+ "\nThank you for your support.");
		}
		if(e2.getSource()==cleartxt) {
			txt.setText("");
		}
	}

}
