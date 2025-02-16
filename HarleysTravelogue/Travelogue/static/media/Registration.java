import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
  
class Registration extends JFrame implements ActionListener
{    
    private Container c; 
    private JLabel title; 
    private JLabel name; 
    private JTextField tname; 
    private JLabel phno; 
    private JTextField tphno; 
    private JLabel gender; 
    private JRadioButton male; 
    private JRadioButton female; 
    private ButtonGroup gengp; 
    private JLabel add; 
    private JTextArea tadd; 
    private JLabel email; 
    private JTextField temail; 
    private JLabel doe; 
    private JComboBox date; 
    private JComboBox month; 
    private JComboBox year; 
    private JLabel eloc; 
    private JTextField teloc; 
    private JLabel nppl; 
    private JTextField tnppl;
    private JButton next; 
    private String dates[] = { "1", "2", "3", "4", "5","6", "7", "8", "9", "10",  "11", "12", "13", "14", "15","16", "17", "18", "19", "20", 
                               "21", "22", "23", "24", "25","26", "27", "28", "29", "30","31" }; 
    private String months[] = { "Jan", "feb", "Mar", "Apr","May", "Jun", "July", "Aug","Sep", "Oct", "Nov", "Dec" }; 
    private String years[] = {"2020", "2021", "2022", "2023","2024" }; 
    public Registration() 
    { 
        setTitle("Registration Form"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        c.add(title); 
  
        name = new JLabel("Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(100, 100); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(300, 100); 
        c.add(tname); 
  
        phno = new JLabel("Mobile"); 
        phno.setFont(new Font("Arial", Font.PLAIN, 20)); 
        phno.setSize(100, 20); 
        phno.setLocation(100, 150); 
        c.add(phno); 
  
        tphno = new JTextField(); 
        tphno.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tphno.setSize(150, 20); 
        tphno.setLocation(300, 150); 
        c.add(tphno); 
  
        gender = new JLabel("Gender"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(100, 200); 
        c.add(gender); 
  
        male = new JRadioButton("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(200, 200); 
        c.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 20); 
        female.setLocation(275, 200); 
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
        
        add = new JLabel("Address"); 
        add.setFont(new Font("Arial", Font.PLAIN, 20)); 
        add.setSize(100, 20); 
        add.setLocation(100, 250); 
        c.add(add); 
  
        tadd = new JTextArea(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tadd.setSize(100, 75); 
        tadd.setLocation(300, 250); 
        tadd.setLineWrap(true); 
        c.add(tadd); 

	
        email = new JLabel("E-mail"); 
        email.setFont(new Font("Arial", Font.PLAIN, 20)); 
        email.setSize(100, 20); 
        email.setLocation(100, 400); 
        c.add(email); 
  
        temail = new JTextField(); 
        temail.setFont(new Font("Arial", Font.PLAIN, 15)); 
        temail.setSize(190, 20); 
        temail.setLocation(300, 400); 
        c.add(temail); 
  
        doe = new JLabel("Date of Event"); 
        doe.setFont(new Font("Arial", Font.PLAIN, 20)); 
        doe.setSize(100, 50); 
        doe.setLocation(100, 350); 
        c.add(doe); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(200, 350); 
        c.add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(250, 350); 
        c.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(320, 350); 
        c.add(year); 
  
        
        eloc = new JLabel("Event Location"); 
        eloc.setFont(new Font("Arial", Font.PLAIN, 20)); 
        eloc.setSize(100, 50); 
        eloc.setLocation(100, 450); 
        c.add(eloc); 
  
        teloc = new JTextField(); 
        teloc.setFont(new Font("Arial", Font.PLAIN, 15)); 
        teloc.setSize(190, 20); 
        teloc.setLocation(300, 450); 
        c.add(teloc); 

	
        nppl = new JLabel("Number of people"); 
        nppl.setFont(new Font("Arial", Font.PLAIN, 20)); 
        nppl.setSize(100, 50); 
        nppl.setLocation(100, 500); 
        c.add(nppl); 
  
        tnppl = new JTextField(); 
        tnppl.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tnppl.setSize(190, 20); 
        tnppl.setLocation(300, 500); 
        c.add(tnppl); 
  
        next = new JButton("NEXT"); 
        next.setFont(new Font("Arial", Font.PLAIN, 15)); 
        next.setSize(100, 20); 
        next.setLocation(300, 550); 
        next.addActionListener(this); 
        c.add(next); 
  
        setVisible(true); 
    } 
  
     
    public void actionPerformed(ActionEvent e) 
    { 
      Need obj = new Need();
	obj.setVisible(true);  
	
    } 
  
    public static void main(String[] args) throws Exception 
    { 
        Registration f = new Registration(); 
    } 
} 