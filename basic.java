import javax.swing.*;
class Income_Tax
{
void setFunction()
{
JFrame f=new JFrame("Tax Calculator");
JLabel lb=new JLabel();
lb.setText("Basic Details");
JLabel ly=new JLabel();
ly.setText("Finncial Year");
JRadioButton r=new JRadioButton("2020-21");
lb.setBounds(5,5,100,20);
ly.setBounds(120,25,150,20);
r.setBounds(120,50,150,20);
//Choosing age of User
JLabel l1=new JLabel();
l1.setText("Choose Your Age");
JRadioButton r1=new JRadioButton("A)0-60");
JRadioButton r2=new JRadioButton("B)60-80");
JRadioButton r3=new JRadioButton("C)80 & above");
ButtonGroup bg=new ButtonGroup();    
//Setting size of button and label on frame
l1.setBounds(120,75,150,20);
r1.setBounds(120,100,100,20);
r2.setBounds(230,100,100,20);
r3.setBounds(340,100,150,20);
////////////////////////////////////
//Addition
//addition of radio button inside button group
bg.add(r1);bg.add(r2);bg.add(r3);
//addition of radio button on frame
f.add(lb);f.add(ly);f.add(r);f.add(l1);f.add(r1);f.add(r2);f.add(r3);
//Income details of User
JLabel li=new JLabel("Income Details");
JLabel l2=new JLabel("Income for salary");
JTextField tf1=new JTextField();
JLabel l3=new JLabel("Income for interest");
JTextField tf2=new JTextField();
JLabel l4=new JLabel("Income Paid on Home loans");
JTextField tf3=new JTextField();
JLabel l5=new JLabel("Rental income received ");
JTextField tf4=new JTextField();
JLabel l6=new JLabel("Intrest Paid on Loan");
JTextField tf5=new JTextField();
JLabel l7=new JLabel("Other Income");
JTextField tf6=new JTextField();;
JLabel l8=new JLabel("Exemption and Deduction from salary ");
JTextField tf7=new JTextField();
li.setBounds(5,125,110,20);
l2.setBounds(120,135,250,20);
tf1.setBounds(120,160,250,40);
l3.setBounds(500,135,250,20);
tf2.setBounds(500,160,250,40);

l4.setBounds(120,205,250,20);
tf3.setBounds(120,230,250,40);
l5.setBounds(500,205,250,20);
tf4.setBounds(500,230,250,40);

l6.setBounds(120,275,250,20);
tf5.setBounds(120,300,250,40);
l7.setBounds(500,275,250,20);
tf6.setBounds(500,300,250,40);

l8.setBounds(120,345,300,20);
tf7.setBounds(120,370,250,40);
f.add(li);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);
f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);f.add(tf6);f.add(tf7);
//Deduction of Tax 
JLabel ld=new JLabel();
ld.setText("Deduction");
JLabel ld1=new JLabel("Basic Deduction");
JTextField td1=new JTextField();
JLabel ld2=new JLabel("Medical Insurance");
JTextField td2=new JTextField();
JLabel ld3=new JLabel("Interest On Educational loan");
JTextField td3=new JTextField();
JLabel ld4=new JLabel("Employer contribution to NPS");
JTextField td4=new JTextField();
JLabel ld5=new JLabel("Interest from Depositor");
JTextField td5=new JTextField();
JLabel ld6=new JLabel("Donation to Charity");
JTextField td6=new JTextField();
JLabel ld7=new JLabel("Interest On Housing Loan");
JTextField td7=new JTextField();
ld.setBounds(5,415,110,20);
ld1.setBounds(120,440,250,20);
td1.setBounds(120,465,250,40);
ld2.setBounds(500,440,250,20);
td2.setBounds(500,465,250,40);

ld3.setBounds(120,510,250,20);
td3.setBounds(120,535,250,40);
ld4.setBounds(500,510,250,20);
td4.setBounds(500,535,250,40);

ld5.setBounds(120,580,250,20);
td5.setBounds(120,605,250,40);
ld6.setBounds(500,580,250,20);
td6.setBounds(500,605,250,40);

ld7.setBounds(120,650,250,20);
td7.setBounds(120,675,250,40);
f.add(ld);f.add(ld1);f.add(ld2);f.add(ld3);f.add(ld4);f.add(ld5);f.add(ld6);f.add(ld7);
f.add(td1);f.add(td2);f.add(td3);f.add(td4);f.add(td5);f.add(td6);f.add(td7);
//Total tax of User
JButton bt=new JButton("Calculate");
JLabel tl=new JLabel("Total Tax Of User: ");
JTextField tfl=new JTextField();
bt.setBounds(200,730,100,40);
tl.setBounds(525,740,150,20);
tfl.setBounds(655,730,250,40);
f.add(bt);
f.add(tl);
f.add(tfl);
//setting size and visibility of frame
f.setSize(950,900);
f.setLayout(null);
f.setVisible(true);
}
}
public class basic
{
public static void main(String arg[])
{
Income_Tax i=new Income_Tax();
i.setFunction();
}
}
