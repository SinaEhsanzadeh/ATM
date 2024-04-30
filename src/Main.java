import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    public static void main(String[] args){

        JFrame frame = new JFrame("ATM");
        Dimension dimension = new Dimension(800, 600);
        frame.setSize(dimension);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("arial", Font.BOLD, 15);

        JPanel lang = new JPanel();
        lang.setLayout(null);
        lang.setBounds(0, 0, 800, 600);
        lang.setBackground(Color.cyan);

        JLabel selectLang = new JLabel("Please select a language        لطفا زبان حود را انتخاب کنید");
        selectLang.setFont(font);
        selectLang.setBounds(200, 50, 800, 100);

        JButton eng = new JButton("English");
        eng.setLayout(null);
        eng.setBounds(50, 225, 150, 100);
        eng.setFont(font);

        JButton per = new JButton("فارسی");
        per.setLayout(null);
        per.setBounds(600, 225, 150, 100);
        per.setFont(font);

        lang.add(eng);
        lang.add(per);
        lang.add(selectLang);

        JPanel password = new JPanel();
        password.setLayout(null);
        password.setBounds(0,0, 800, 600);
        password.setBackground(Color.cyan);

        JLabel entPass = new JLabel("رمز خود را وارد کنید");
        entPass.setBounds(345, 50, 400, 50);
        entPass.setFont(font);

        JTextField pass = new JTextField(4);
        pass.setBounds(300, 250, 200, 50);

        JButton passCheck = new JButton("ثبت");
        passCheck.setBounds(350, 350, 100, 50);
        passCheck.setFont(font);

        password.add(pass);
        password.add(entPass);
        password.add(passCheck);


        JPanel index = new JPanel();
        index.setLayout(null);
        index.setBounds(0 , 0 , 800, 600);
        index.setBackground(Color.cyan);

        JButton withdrawalBt = new JButton("برداشت");
        withdrawalBt.setBounds(50, 150, 200, 50);
        withdrawalBt.setFont(font);

        JButton reportBt = new JButton("استعلام موجودی");
        reportBt.setBounds(50, 300, 200, 50);
        reportBt.setFont(font);

        JButton transferBt = new JButton("کارت به کارت");
        transferBt.setBounds(550, 150, 200, 50);
        transferBt.setFont(font);

        JButton passChangeBt = new JButton("تغییر رمز");
        passChangeBt.setBounds(550, 300, 200, 50);
        passChangeBt.setFont(font);

        index.add(withdrawalBt);
        index.add(reportBt);
        index.add(transferBt);
        index.add(passChangeBt);


        JPanel passChange = new JPanel();
        passChange.setLayout(null);
        passChange.setBounds(0, 0, 800, 600);
        passChange.setBackground(Color.cyan);

        JLabel entNewPass = new JLabel("رمز جدید خود را وارد کنید");
        entNewPass.setFont(font);
        entNewPass.setBounds(330, 50, 400, 50);

        JTextField newPass = new JTextField();
        newPass.setBounds(300, 250, 200, 50);

        JButton changePass = new JButton("تایید");
        changePass.setFont(font);
        changePass.setBounds(350, 350, 100, 50);

        passChange.add(newPass);
        passChange.add(entNewPass);
        passChange.add(changePass);


        JPanel accReport = new JPanel();
        accReport.setLayout(null);
        accReport.setBounds(0,0,800, 600);
        accReport.setBackground(Color.cyan);

        JLabel balance = new JLabel("موجودی شما 1000000 ریال است");
        balance.setFont(font);
        balance.setBounds(300, 250, 300, 50);

        accReport.add(balance);

        JPanel withdrawal = new JPanel();
        withdrawal.setLayout(null);
        withdrawal.setBounds(0,0,800,600);
        withdrawal.setBackground(Color.cyan);

        JLabel chooseAmnt = new JLabel("مقدار برداشت خود را انتخاب کنید");
        chooseAmnt.setFont(font);
        chooseAmnt.setBounds(320, 50, 400, 50);

        JButton[] withdrawalAmnt = new JButton[4];
        String[] amnt = {"100000", "200000", "500000", "1000000"};
        for (int i = 0; i < withdrawalAmnt.length; i++){
            withdrawalAmnt[i] = new JButton(amnt[i]);
        }

        withdrawalAmnt[0].setFont(font);
        withdrawalAmnt[0].setBounds(50, 150, 100, 50);

        withdrawalAmnt[1].setFont(font);
        withdrawalAmnt[1].setBounds(650, 150, 100, 50);

        withdrawalAmnt[2].setFont(font);
        withdrawalAmnt[2].setBounds(50, 300, 100, 50);

        withdrawalAmnt[3].setFont(font);
        withdrawalAmnt[3].setBounds(650, 300, 100, 50);

        withdrawal.add(withdrawalAmnt[0]);
        withdrawal.add(withdrawalAmnt[1]);
        withdrawal.add(withdrawalAmnt[2]);
        withdrawal.add(withdrawalAmnt[3]);
        withdrawal.add(chooseAmnt);


        JPanel transfer = new JPanel();
        transfer.setLayout(null);
        transfer.setBounds(0,0,800,600);
        transfer.setBackground(Color.cyan);

        JLabel enterCardNum = new JLabel("شماره کارت واریزی را وارد کنید");
        enterCardNum.setFont(font);
        enterCardNum.setBounds(330, 50, 400, 50);

        JTextField cardNum = new JTextField(12);
        cardNum.setBounds(200, 100, 400, 50);

        JLabel enterTransAmnt = new JLabel("مقدار واریزی را به ریال وارد کنید");
        enterTransAmnt.setFont(font);
        enterTransAmnt.setBounds(330, 150, 400, 50);

        JTextField transAmnt = new JTextField(9);
        transAmnt.setBounds(200, 200, 400, 50);

        JButton transaction = new JButton("تایید");
        transaction.setFont(font);
        transaction.setBounds(350, 500, 100, 50);

        transfer.add(enterCardNum);
        transfer.add(cardNum);
        transfer.add(enterTransAmnt);
        transfer.add(transAmnt);
        transfer.add(transaction);


        JPanel operationRes = new JPanel();
        operationRes.setLayout(null);
        operationRes.setBounds(0,0,800,600);
        operationRes.setBackground(Color.cyan);

        JLabel result = new JLabel("عملیات با موفقیت انجام شد");
        result.setFont(font);
        result.setBounds(330, 50, 400, 50);

        operationRes.add(result);


        frame.add(lang);

        eng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                entPass.setText("Enter your password");
                entPass.setBounds(330, 50, 400, 50);
                passCheck.setText("Enter");

                withdrawalBt.setText("Withdrawal");
                passChangeBt.setText("Change Password");
                transferBt.setText("Transfer");
                reportBt.setText("Check Balance");

                enterCardNum.setText("Enter recipient's card number");
                enterCardNum.setBounds(290, 50, 400, 50);
                enterTransAmnt.setText("Enter desired transfer amount");
                enterTransAmnt.setBounds(290, 150, 400, 50);
                transaction.setText("Confirm");

                chooseAmnt.setText("Choose your desired amount");
                chooseAmnt.setBounds(290, 50, 400, 50);

                result.setText("Operation concluded successfully");
                result.setBounds(300, 50, 400, 50);

                balance.setText("Your current balance is 1000000 rials");
                balance.setBounds(250, 250, 300, 50);

                entNewPass.setText("Enter your new password");
                entNewPass.setBounds(300, 200, 200, 50);

                changePass.setText("Confirm");

                frame.remove(lang);
                frame.add(password);

                frame.revalidate();
                frame.repaint();

            }
        });

        per.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(lang);
                frame.add(password);

                frame.revalidate();
                frame.repaint();
            }
        });

        passCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(password);
                frame.add(index);

                frame.revalidate();
                frame.repaint();
            }
        });

        withdrawalBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(index);
                frame.add(withdrawal);

                frame.revalidate();
                frame.repaint();
            }
        });

        reportBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(index);
                frame.add(accReport);

                frame.revalidate();
                frame.repaint();
            }
        });

        transferBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(index);
                frame.add(transfer);

                frame.revalidate();
                frame.repaint();
            }
        });

        transaction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(transfer);
                frame.add(operationRes);

                frame.revalidate();
                frame.repaint();
            }
        });

        for(int i = 0; i < withdrawalAmnt.length; i++){
            withdrawalAmnt[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.remove(withdrawal);
                    frame.add(operationRes);

                    frame.revalidate();
                    frame.repaint();
                }
            });
        }

        passChangeBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(index);
                frame.add(passChange);

                frame.revalidate();
                frame.repaint();
            }
        });

        changePass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            frame.remove(passChange);
            frame.add(operationRes);

            frame.revalidate();
            frame.repaint();
            }
        });
    }
}