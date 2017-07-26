package sms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class School extends javax.swing.JFrame {

    Connection connect = null;
    ResultSet rst = null;
    PreparedStatement pst = null;

    public School() {
        initComponents();
        connect = ConnectDB.connDB();
        Dclock();
        showStudentDetails();
        showteacherDetails();
        showStaffDetails();
        showSubjectDetails();
        showresultDetails();

    }

    //Digital Clock
    public void Dclock() {
        int timeRun = 0;
        new Thread() {
            public void run() {
                while (timeRun == 0) {
                    Calendar cal = new GregorianCalendar();
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int AM_PM = cal.get(Calendar.AM_PM);
                    String day_night = "";
                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String time = hour + ":" + min + ":" + sec + " " + day_night;
                    clock.setText(time);
                    stuclock.setText(time);
                    teclock.setText(time);
                    staffclock.setText(time);
                    subclock.setText(time);

                }
            }

        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        menubar = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        student = new javax.swing.JButton();
        teacher = new javax.swing.JButton();
        staff = new javax.swing.JButton();
        subject = new javax.swing.JButton();
        result = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        homefrom = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        clock = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sayed = new javax.swing.JButton();
        resultfrom = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        viewresult = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        resultid = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        resultstudentid = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        resultsubname = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        midtermexam = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        finalexam = new javax.swing.JTextField();
        addresult = new javax.swing.JButton();
        updateresult = new javax.swing.JButton();
        deleteresult = new javax.swing.JButton();
        clearresult = new javax.swing.JButton();
        studentfrom = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        studentid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        studentname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        viewstudent = new javax.swing.JButton();
        studentfather = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        studentmother = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        studentdob = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        stugender = new javax.swing.JRadioButton();
        stugender1 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        studentblood = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        studentaddress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        studentmobile = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        studentemail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        studentclass = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        studentgroup = new javax.swing.JComboBox();
        addstudent = new javax.swing.JButton();
        updatestudent = new javax.swing.JButton();
        deletestudent = new javax.swing.JButton();
        clearstudent = new javax.swing.JButton();
        stuclock = new javax.swing.JLabel();
        teacherfrom = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        viewteacher = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        teacherid = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        teachername = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        teachergender = new javax.swing.JRadioButton();
        teachergender1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        teacherdob = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        teacherblood = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        teacheraddress = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        teachermobile = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        teacheremail = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        teacherjod = new com.toedter.calendar.JDateChooser();
        addteacher = new javax.swing.JButton();
        updateteacher = new javax.swing.JButton();
        deleteteacher = new javax.swing.JButton();
        clearteacher = new javax.swing.JButton();
        teclock = new javax.swing.JLabel();
        stafffrom = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        viewstaff = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        staffid = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        staffname = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        staffgender = new javax.swing.JRadioButton();
        staffgender1 = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        staffdob = new com.toedter.calendar.JDateChooser();
        jLabel47 = new javax.swing.JLabel();
        staffblood = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        staffaddress = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        staffmobile = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        staffemail = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        staffjod = new com.toedter.calendar.JDateChooser();
        addstaff = new javax.swing.JButton();
        updatestaff = new javax.swing.JButton();
        deletestaff = new javax.swing.JButton();
        clearstaff = new javax.swing.JButton();
        staffclock = new javax.swing.JLabel();
        subjectfrom = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        viewsubject = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        subjectid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        subname = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        subclass = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        subdate = new com.toedter.calendar.JDateChooser();
        addsubject = new javax.swing.JButton();
        updatesubject = new javax.swing.JButton();
        deletesubject = new javax.swing.JButton();
        clearsubject = new javax.swing.JButton();
        subclock = new javax.swing.JLabel();
        studenttable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablestudent = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        teachertable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        teachertabaleview = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        stafftable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        stafftableview = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        subjecttable = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        subjecttableview = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        printsubject = new javax.swing.JButton();
        resulttable = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        resulttableview = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menubar.setBackground(new java.awt.Color(217, 186, 215));

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(16, 30, 189));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        teacher.setBackground(new java.awt.Color(180, 90, 178));
        teacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        teacher.setForeground(new java.awt.Color(34, 19, 226));
        teacher.setText("Teacher");
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });

        staff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staff.setForeground(new java.awt.Color(24, 130, 145));
        staff.setText("Staff");
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });

        subject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subject.setForeground(new java.awt.Color(37, 244, 12));
        subject.setText("Subject");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        result.setBackground(new java.awt.Color(245, 12, 62));
        result.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        result.setText("Result");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\mysqul\\hh.jpg")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("G:\\mysqul\\school.jpg")); // NOI18N

        javax.swing.GroupLayout menubarLayout = new javax.swing.GroupLayout(menubar);
        menubar.setLayout(menubarLayout);
        menubarLayout.setHorizontalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(teacher, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
            .addComponent(staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menubarLayout.setVerticalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(home)
                .addGap(18, 18, 18)
                .addComponent(student)
                .addGap(18, 18, 18)
                .addComponent(teacher)
                .addGap(18, 18, 18)
                .addComponent(staff)
                .addGap(18, 18, 18)
                .addComponent(subject)
                .addGap(18, 18, 18)
                .addComponent(result)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(menubar, java.awt.BorderLayout.LINE_START);

        panel.setLayout(new java.awt.CardLayout());

        homefrom.setBackground(new java.awt.Color(0, 153, 204));

        clock.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        clock.setForeground(new java.awt.Color(9, 8, 9));

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 21, 223));
        jLabel5.setText("WELCOME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("SCHOOL MANAGEMENT SYSTEM");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 222, 18));
        jLabel6.setText("Design & Development By ");

        sayed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sayed.setForeground(new java.awt.Color(7, 42, 249));
        sayed.setText("Md.Abu Sayed");
        sayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homefromLayout = new javax.swing.GroupLayout(homefrom);
        homefrom.setLayout(homefromLayout);
        homefromLayout.setHorizontalGroup(
            homefromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
            .addGroup(homefromLayout.createSequentialGroup()
                .addGroup(homefromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homefromLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homefromLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(homefromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(homefromLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sayed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homefromLayout.setVerticalGroup(
            homefromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homefromLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homefromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homefromLayout.createSequentialGroup()
                        .addComponent(logout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(clock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(120, 120, 120)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(homefromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sayed))
                .addGap(23, 23, 23))
        );

        panel.add(homefrom, "card2");

        resultfrom.setBackground(new java.awt.Color(43, 127, 58));

        jLabel36.setIcon(new javax.swing.ImageIcon("G:\\mysqul\\addresult.jpg")); // NOI18N

        viewresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewresult.setForeground(new java.awt.Color(255, 0, 255));
        viewresult.setText("VIEW RESULT");
        viewresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewresultActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Result Id :");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Student Id :");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Subject Name :");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Midterm Exam :");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Final Exam :");

        addresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addresult.setText("ADD");
        addresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresultActionPerformed(evt);
            }
        });

        updateresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateresult.setText("UPDATE");
        updateresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateresultActionPerformed(evt);
            }
        });

        deleteresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteresult.setForeground(new java.awt.Color(255, 0, 0));
        deleteresult.setText("DELETE");
        deleteresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteresultActionPerformed(evt);
            }
        });

        clearresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearresult.setText("CLEAR");
        clearresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearresultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultfromLayout = new javax.swing.GroupLayout(resultfrom);
        resultfrom.setLayout(resultfromLayout);
        resultfromLayout.setHorizontalGroup(
            resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultfromLayout.createSequentialGroup()
                .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultfromLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resultfromLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(viewresult))
                            .addGroup(resultfromLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(26, 26, 26)
                                .addComponent(resultid))))
                    .addGroup(resultfromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, resultfromLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(resultstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, resultfromLayout.createSequentialGroup()
                                .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(addresult, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateresult)
                                    .addComponent(midtermexam))))
                        .addGap(18, 18, 18)
                        .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41)
                            .addComponent(deleteresult))
                        .addGap(18, 18, 18)
                        .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(resultfromLayout.createSequentialGroup()
                                .addComponent(clearresult)
                                .addGap(0, 56, Short.MAX_VALUE))
                            .addComponent(resultsubname)
                            .addComponent(finalexam))))
                .addContainerGap())
        );
        resultfromLayout.setVerticalGroup(
            resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultfromLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewresult)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(resultfromLayout.createSequentialGroup()
                .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(resultid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(resultstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(resultsubname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(midtermexam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(finalexam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(resultfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresult)
                    .addComponent(updateresult)
                    .addComponent(deleteresult)
                    .addComponent(clearresult))
                .addGap(0, 205, Short.MAX_VALUE))
        );

        panel.add(resultfrom, "card7");

        studentfrom.setBackground(new java.awt.Color(136, 187, 121));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Student Id :");

        jLabel8.setIcon(new javax.swing.ImageIcon("G:\\mysqul\\addstudent.jpg")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Student Name :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Father Name :");

        viewstudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewstudent.setForeground(new java.awt.Color(120, 40, 107));
        viewstudent.setText("VIEW STUDENT");
        viewstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstudentActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Mother Name :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Date of Birth :");

        studentdob.setDateFormatString("yyyy-MM-dd");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Gender :");

        buttonGroup1.add(stugender);
        stugender.setText("Male");
        stugender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stugenderActionPerformed(evt);
            }
        });

        buttonGroup1.add(stugender1);
        stugender1.setText("Female");
        stugender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stugender1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Blood Group :");

        studentblood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AB+", "AB-", "O+", "O-", "A+", "B+" }));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Address :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Mobile No :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Email :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Class :");

        studentclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Six", "Seven", "Eight", "Nine", "Ten" }));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Group :");

        studentgroup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Science", "Humanisties", "Business" }));

        addstudent.setBackground(new java.awt.Color(134, 20, 76));
        addstudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addstudent.setText("ADD");
        addstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentActionPerformed(evt);
            }
        });

        updatestudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatestudent.setForeground(new java.awt.Color(22, 29, 167));
        updatestudent.setText("UPDATE");
        updatestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestudentActionPerformed(evt);
            }
        });

        deletestudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletestudent.setForeground(new java.awt.Color(255, 0, 0));
        deletestudent.setText("DELETE");
        deletestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestudentActionPerformed(evt);
            }
        });

        clearstudent.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        clearstudent.setText("CLEAR");
        clearstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearstudentActionPerformed(evt);
            }
        });

        stuclock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stuclock.setForeground(new java.awt.Color(60, 30, 187));

        javax.swing.GroupLayout studentfromLayout = new javax.swing.GroupLayout(studentfrom);
        studentfrom.setLayout(studentfromLayout);
        studentfromLayout.setHorizontalGroup(
            studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentfromLayout.createSequentialGroup()
                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentfromLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentfromLayout.createSequentialGroup()
                                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(studentname, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(studentid)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentfromLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(stuclock, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewstudent))))
                    .addGroup(studentfromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentfromLayout.createSequentialGroup()
                                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentfromLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(studentdob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentfromLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(studentfather, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, studentfromLayout.createSequentialGroup()
                                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel19)
                                            .addComponent(addstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(studentblood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(studentmobile)
                                            .addGroup(studentfromLayout.createSequentialGroup()
                                                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(updatestudent)
                                                    .addComponent(studentclass, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(18, 18, 18)
                                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(studentfromLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(studentmother))
                                    .addGroup(studentfromLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addComponent(stugender, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(stugender1))
                                    .addGroup(studentfromLayout.createSequentialGroup()
                                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(studentaddress)
                                            .addComponent(studentemail)
                                            .addComponent(studentgroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(studentfromLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deletestudent)
                                .addGap(44, 44, 44)
                                .addComponent(clearstudent)
                                .addGap(17, 17, 17)))))
                .addContainerGap())
        );
        studentfromLayout.setVerticalGroup(
            studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentfromLayout.createSequentialGroup()
                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentfromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewstudent)
                            .addComponent(stuclock, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentfather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(studentmother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(studentdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(stugender)
                        .addComponent(stugender1)))
                .addGap(30, 30, 30)
                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(studentblood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(studentaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(studentmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(studentemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(studentclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(studentgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(studentfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addstudent)
                    .addComponent(updatestudent)
                    .addComponent(deletestudent)
                    .addComponent(clearstudent))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panel.add(studentfrom, "card3");

        teacherfrom.setBackground(new java.awt.Color(146, 150, 39));

        jLabel21.setIcon(new javax.swing.ImageIcon("G:\\mysqul\\ADDTEACHER.jpg")); // NOI18N

        viewteacher.setBackground(new java.awt.Color(193, 93, 188));
        viewteacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewteacher.setForeground(new java.awt.Color(25, 23, 204));
        viewteacher.setText("VIEW TEACHER");
        viewteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewteacherActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Teacher Id :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Teacher Name :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Gender :");

        buttonGroup2.add(teachergender);
        teachergender.setText("Male");
        teachergender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachergenderActionPerformed(evt);
            }
        });

        buttonGroup2.add(teachergender1);
        teachergender1.setText("Female");
        teachergender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachergender1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Date of Birth :");

        teacherdob.setDateFormatString("yyyy-MM-dd");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Blood Group :");

        teacherblood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AB+", "AB-", "A+", "A-", "O+", "O-" }));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Address :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Mobile No :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Email :");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Join of Date :");

        teacherjod.setDateFormatString("yyyy-MM-dd");

        addteacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addteacher.setForeground(new java.awt.Color(17, 21, 212));
        addteacher.setText("ADD");
        addteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addteacherActionPerformed(evt);
            }
        });

        updateteacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateteacher.setForeground(new java.awt.Color(219, 25, 198));
        updateteacher.setText("UPDATE");
        updateteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateteacherActionPerformed(evt);
            }
        });

        deleteteacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteteacher.setForeground(new java.awt.Color(245, 10, 46));
        deleteteacher.setText("DELETE");
        deleteteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteteacherActionPerformed(evt);
            }
        });

        clearteacher.setBackground(new java.awt.Color(195, 54, 175));
        clearteacher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearteacher.setText("CLEAR");
        clearteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearteacherActionPerformed(evt);
            }
        });

        teclock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout teacherfromLayout = new javax.swing.GroupLayout(teacherfrom);
        teacherfrom.setLayout(teacherfromLayout);
        teacherfromLayout.setHorizontalGroup(
            teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherfromLayout.createSequentialGroup()
                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherfromLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherfromLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(teclock, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(viewteacher))
                            .addGroup(teacherfromLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(30, 30, 30)
                                .addComponent(teacherid))))
                    .addGroup(teacherfromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherfromLayout.createSequentialGroup()
                                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(teacherfromLayout.createSequentialGroup()
                                        .addComponent(addteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(updateteacher))
                                    .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherfromLayout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(teachermobile, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teacherfromLayout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(30, 30, 30)
                                                .addComponent(teacherblood, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(teacherfromLayout.createSequentialGroup()
                                            .addComponent(jLabel30)
                                            .addGap(18, 18, 18)
                                            .addComponent(teacherjod, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(teacherfromLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(teacherfromLayout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addGap(27, 27, 27)
                                                .addComponent(teacheraddress))
                                            .addGroup(teacherfromLayout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addGap(32, 32, 32)
                                                .addComponent(teacherdob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(teacherfromLayout.createSequentialGroup()
                                                .addComponent(jLabel29)
                                                .addGap(18, 18, 18)
                                                .addComponent(teacheremail))))
                                    .addGroup(teacherfromLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(deleteteacher)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clearteacher)
                                        .addGap(38, 38, 38))))
                            .addGroup(teacherfromLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(teachername, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(teachergender, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(teachergender1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        teacherfromLayout.setVerticalGroup(
            teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherfromLayout.createSequentialGroup()
                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherfromLayout.createSequentialGroup()
                        .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherfromLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherfromLayout.createSequentialGroup()
                                .addComponent(teclock, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(teacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)))
                        .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(teachername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(teachergender)
                            .addComponent(teachergender1)))
                    .addGroup(teacherfromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewteacher)))
                .addGap(32, 32, 32)
                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26)
                        .addComponent(teacherblood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(teacherdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(teacheraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(teachermobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(teacheremail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30))
                    .addComponent(teacherjod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(teacherfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addteacher)
                    .addComponent(updateteacher)
                    .addComponent(deleteteacher)
                    .addComponent(clearteacher))
                .addGap(82, 82, 82))
        );

        panel.add(teacherfrom, "card4");

        stafffrom.setBackground(new java.awt.Color(153, 161, 54));

        jLabel42.setIcon(new javax.swing.ImageIcon("G:\\mysqul\\addstaff.jpg")); // NOI18N

        viewstaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewstaff.setForeground(new java.awt.Color(0, 153, 51));
        viewstaff.setText("VIEW STAFF");
        viewstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewstaffActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Staff Id :");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("Staff Name :");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Gender :");

        buttonGroup3.add(staffgender);
        staffgender.setText("Male");
        staffgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffgenderActionPerformed(evt);
            }
        });

        buttonGroup3.add(staffgender1);
        staffgender1.setText("Female");
        staffgender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffgender1ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Date of Birth :");

        staffdob.setDateFormatString("yyyy-MM-dd");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("Blood Group");

        staffblood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AB+", "AB-", "A+", "A-", "O+", "O-" }));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Address :");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("Mobile No :");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Email :");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Join of Date :");

        staffjod.setDateFormatString("yyyy-MM-dd");

        addstaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addstaff.setText("ADD");
        addstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffActionPerformed(evt);
            }
        });

        updatestaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatestaff.setText("UPDATE");
        updatestaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestaffActionPerformed(evt);
            }
        });

        deletestaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletestaff.setForeground(new java.awt.Color(255, 0, 0));
        deletestaff.setText("DELETE");
        deletestaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestaffActionPerformed(evt);
            }
        });

        clearstaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearstaff.setText("CLEAR");
        clearstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearstaffActionPerformed(evt);
            }
        });

        staffclock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout stafffromLayout = new javax.swing.GroupLayout(stafffrom);
        stafffrom.setLayout(stafffromLayout);
        stafffromLayout.setHorizontalGroup(
            stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stafffromLayout.createSequentialGroup()
                .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stafffromLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stafffromLayout.createSequentialGroup()
                                .addComponent(staffclock, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(viewstaff))
                            .addGroup(stafffromLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(26, 26, 26)
                                .addComponent(staffid))))
                    .addGroup(stafffromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, stafffromLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(staffname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, stafffromLayout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(18, 18, 18)
                                .addComponent(staffdob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, stafffromLayout.createSequentialGroup()
                                .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel50))
                                .addGap(35, 35, 35)
                                .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(staffaddress)
                                    .addComponent(staffemail))))
                        .addGap(18, 18, 18)
                        .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stafffromLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(staffblood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(stafffromLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(28, 28, 28)
                                .addComponent(staffmobile))
                            .addGroup(stafffromLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(staffgender)
                                .addGap(18, 18, 18)
                                .addComponent(staffgender1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(stafffromLayout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addGap(18, 18, 18)
                                .addComponent(staffjod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(stafffromLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addstaff)
                .addGap(40, 40, 40)
                .addComponent(updatestaff)
                .addGap(41, 41, 41)
                .addComponent(deletestaff)
                .addGap(37, 37, 37)
                .addComponent(clearstaff)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stafffromLayout.setVerticalGroup(
            stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stafffromLayout.createSequentialGroup()
                .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stafffromLayout.createSequentialGroup()
                        .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(stafffromLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(staffclock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43)
                                    .addComponent(staffid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel42))
                        .addGap(18, 18, 18)
                        .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(staffname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel45)
                                .addComponent(staffgender)
                                .addComponent(staffgender1)))
                        .addGap(23, 23, 23)
                        .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(staffdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel47)
                                .addComponent(staffblood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(staffaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(staffmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(stafffromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewstaff)))
                .addGap(30, 30, 30)
                .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(staffemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51))
                    .addComponent(staffjod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(stafffromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addstaff)
                    .addComponent(updatestaff)
                    .addComponent(deletestaff)
                    .addComponent(clearstaff))
                .addGap(0, 108, Short.MAX_VALUE))
        );

        panel.add(stafffrom, "card5");

        subjectfrom.setBackground(new java.awt.Color(163, 161, 54));

        jLabel31.setIcon(new javax.swing.ImageIcon("G:\\mysqul\\addsubject.jpg")); // NOI18N

        viewsubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewsubject.setForeground(new java.awt.Color(63, 25, 223));
        viewsubject.setText("VIEW SUBJECT");
        viewsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewsubjectActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Subject Id :");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Subject Name :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Class :");

        subclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Six", "Seven", "Eight", "Nine", "Ten" }));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Date :");

        subdate.setDateFormatString("yyyy-MM-dd");

        addsubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addsubject.setForeground(new java.awt.Color(239, 15, 227));
        addsubject.setText("ADD");
        addsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubjectActionPerformed(evt);
            }
        });

        updatesubject.setBackground(new java.awt.Color(153, 0, 153));
        updatesubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatesubject.setText("UPDATE");
        updatesubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesubjectActionPerformed(evt);
            }
        });

        deletesubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletesubject.setForeground(new java.awt.Color(204, 0, 0));
        deletesubject.setText("DELETE");
        deletesubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesubjectActionPerformed(evt);
            }
        });

        clearsubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearsubject.setForeground(new java.awt.Color(51, 0, 255));
        clearsubject.setText("CLEAR");
        clearsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearsubjectActionPerformed(evt);
            }
        });

        subclock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout subjectfromLayout = new javax.swing.GroupLayout(subjectfrom);
        subjectfrom.setLayout(subjectfromLayout);
        subjectfromLayout.setHorizontalGroup(
            subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectfromLayout.createSequentialGroup()
                .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjectfromLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subjectfromLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(42, 42, 42)
                                .addComponent(subjectid))
                            .addGroup(subjectfromLayout.createSequentialGroup()
                                .addComponent(subclock, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewsubject))))
                    .addGroup(subjectfromLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subjectfromLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(29, 29, 29)
                                .addComponent(subname))
                            .addGroup(subjectfromLayout.createSequentialGroup()
                                .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subjectfromLayout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(29, 29, 29)
                                        .addComponent(subclass, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(subjectfromLayout.createSequentialGroup()
                                        .addComponent(addsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(updatesubject)))
                                .addGap(18, 18, 18)
                                .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subjectfromLayout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addGap(36, 36, 36)
                                        .addComponent(subdate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(subjectfromLayout.createSequentialGroup()
                                        .addGap(0, 33, Short.MAX_VALUE)
                                        .addComponent(deletesubject)
                                        .addGap(55, 55, 55)
                                        .addComponent(clearsubject)))))))
                .addContainerGap())
        );
        subjectfromLayout.setVerticalGroup(
            subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectfromLayout.createSequentialGroup()
                .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subjectfromLayout.createSequentialGroup()
                        .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subjectfromLayout.createSequentialGroup()
                                .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(subjectfromLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(24, 24, 24))
                                    .addGroup(subjectfromLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(subclock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel32)
                                            .addComponent(subjectid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)))
                                .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33)
                                    .addComponent(subname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(subjectfromLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(viewsubject)))
                        .addGap(27, 27, 27)
                        .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(subclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))))
                .addGap(39, 39, 39)
                .addGroup(subjectfromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addsubject)
                    .addComponent(updatesubject)
                    .addComponent(deletesubject)
                    .addComponent(clearsubject))
                .addGap(0, 198, Short.MAX_VALUE))
        );

        panel.add(subjectfrom, "card6");

        tablestudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Father", "Mother"
            }
        ));
        jScrollPane1.setViewportView(tablestudent);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Search :");

        jButton2.setBackground(new java.awt.Color(25, 48, 230));
        jButton2.setText("Print");

        javax.swing.GroupLayout studenttableLayout = new javax.swing.GroupLayout(studenttable);
        studenttable.setLayout(studenttableLayout);
        studenttableLayout.setHorizontalGroup(
            studenttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studenttableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studenttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(studenttableLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        studenttableLayout.setVerticalGroup(
            studenttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studenttableLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(studenttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel.add(studenttable, "card8");

        teachertable.setBackground(new java.awt.Color(180, 106, 106));

        teachertabaleview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(teachertabaleview);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Search :");

        javax.swing.GroupLayout teachertableLayout = new javax.swing.GroupLayout(teachertable);
        teachertable.setLayout(teachertableLayout);
        teachertableLayout.setHorizontalGroup(
            teachertableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachertableLayout.createSequentialGroup()
                .addGroup(teachertableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teachertableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                    .addGroup(teachertableLayout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(34, 34, 34)
                        .addComponent(jTextField2)))
                .addContainerGap())
        );
        teachertableLayout.setVerticalGroup(
            teachertableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teachertableLayout.createSequentialGroup()
                .addGroup(teachertableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel.add(teachertable, "card9");

        stafftable.setBackground(new java.awt.Color(96, 152, 73));

        stafftableview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(stafftableview);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("Search :");

        javax.swing.GroupLayout stafftableLayout = new javax.swing.GroupLayout(stafftable);
        stafftable.setLayout(stafftableLayout);
        stafftableLayout.setHorizontalGroup(
            stafftableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stafftableLayout.createSequentialGroup()
                .addGroup(stafftableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stafftableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                    .addGroup(stafftableLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3)))
                .addContainerGap())
        );
        stafftableLayout.setVerticalGroup(
            stafftableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stafftableLayout.createSequentialGroup()
                .addGroup(stafftableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel.add(stafftable, "card10");

        subjecttable.setBackground(new java.awt.Color(89, 93, 160));

        subjecttableview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(subjecttableview);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("Search :");

        printsubject.setText("Print");
        printsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printsubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subjecttableLayout = new javax.swing.GroupLayout(subjecttable);
        subjecttable.setLayout(subjecttableLayout);
        subjecttableLayout.setHorizontalGroup(
            subjecttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjecttableLayout.createSequentialGroup()
                .addGroup(subjecttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjecttableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                    .addGroup(subjecttableLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printsubject)))
                .addContainerGap())
        );
        subjecttableLayout.setVerticalGroup(
            subjecttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjecttableLayout.createSequentialGroup()
                .addGroup(subjecttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printsubject))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel.add(subjecttable, "card11");

        resulttable.setBackground(new java.awt.Color(143, 78, 139));

        resulttableview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(resulttableview);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("Search :");

        javax.swing.GroupLayout resulttableLayout = new javax.swing.GroupLayout(resulttable);
        resulttable.setLayout(resulttableLayout);
        resulttableLayout.setHorizontalGroup(
            resulttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resulttableLayout.createSequentialGroup()
                .addGroup(resulttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resulttableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                    .addGroup(resulttableLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5)))
                .addContainerGap())
        );
        resulttableLayout.setVerticalGroup(
            resulttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resulttableLayout.createSequentialGroup()
                .addGroup(resulttableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel.add(resulttable, "card12");

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //START MENU BAR//
    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        panel.removeAll();
        panel.add(studentfrom);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_studentActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        panel.removeAll();
        panel.add(teacherfrom);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_teacherActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        panel.removeAll();
        panel.add(stafffrom);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_staffActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        panel.removeAll();
        panel.add(subjectfrom);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_subjectActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        panel.removeAll();
        panel.add(resultfrom);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_resultActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        panel.removeAll();
        panel.add(homefrom);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_homeActionPerformed

    private void viewstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstudentActionPerformed
        panel.removeAll();
        panel.add(studenttable);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_viewstudentActionPerformed

    private void viewteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewteacherActionPerformed
        panel.removeAll();
        panel.add(teachertable);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_viewteacherActionPerformed

    private void viewstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewstaffActionPerformed
        panel.removeAll();
        panel.add(stafftable);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_viewstaffActionPerformed

    private void viewsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewsubjectActionPerformed
        panel.removeAll();
        panel.add(subjecttable);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_viewsubjectActionPerformed

    private void viewresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewresultActionPerformed
        panel.removeAll();
        panel.add(resulttable);
        panel.repaint();
        panel.revalidate();
    }//GEN-LAST:event_viewresultActionPerformed
//Student all part
    private void addstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentActionPerformed
        try {
            String sql = "INSERT INTO student (Sid,fullname,father,mother,dob,gender,bloodgroup,address,mobileno,emailid, stgroup,stclass) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = connect.prepareStatement(sql);
            pst.setString(1, studentid.getText());
            pst.setString(2, studentname.getText());
            pst.setString(3, studentfather.getText());
            pst.setString(4, studentmother.getText());
            pst.setString(5, ((JTextField) studentdob.getDateEditor().getUiComponent()).getText());
            pst.setString(6, gender);
            String blood = studentblood.getSelectedItem().toString();
            pst.setString(7, blood);
            pst.setString(8, studentaddress.getText());
            pst.setString(9, studentmobile.getText());
            pst.setString(10, studentemail.getText());
            String group = studentgroup.getSelectedItem().toString();
            pst.setString(11, group);
            String c = studentclass.getSelectedItem().toString();
            pst.setString(12, c);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert Successfully !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showStudentDetails();
    }//GEN-LAST:event_addstudentActionPerformed

    private void stugenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stugenderActionPerformed
        gender = "Male";
    }//GEN-LAST:event_stugenderActionPerformed

    private void stugender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stugender1ActionPerformed
        gender = "Female";
    }//GEN-LAST:event_stugender1ActionPerformed

    private void updatestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestudentActionPerformed
        try {
            String id = studentid.getText();
            String a = studentname.getText();
            String b = studentfather.getText();
            String c = studentmother.getText();
            String d = ((JTextField) studentdob.getDateEditor().getUiComponent()).getText();
            String e = gender;
            String f = studentblood.getSelectedItem().toString();
            String g = studentaddress.getText();
            String h = studentmobile.getText();
            String i = studentemail.getText();
            String j = studentgroup.getSelectedItem().toString();
            String k = studentclass.getSelectedItem().toString();
            String sql = "update student set fullname='" + a + "',father='" + b + "',mother='" + c + "',dob='" + d + "',gender='" + e + "',bloodgroup='" + f + "',address='" + g + "',mobileno='" + h + "',emailid='" + i + "',stgroup='" + j + "',stclass='" + k + "' where Sid='" + id + "' ";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been Updated !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showStudentDetails();
    }//GEN-LAST:event_updatestudentActionPerformed

    private void deletestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestudentActionPerformed
        try {
            String id = studentid.getText();
            String sql = "delete from student where Sid='" + id + "'";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showConfirmDialog(null, "Are you Sure Delete Data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showStudentDetails();
    }//GEN-LAST:event_deletestudentActionPerformed

    private void clearstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearstudentActionPerformed

    }//GEN-LAST:event_clearstudentActionPerformed

    private void addteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addteacherActionPerformed
        try {
            String sql = "INSERT INTO teacher (Tid,fullname,gender,dob,bloodgroup,address,mobileno,emailid,jod) values(?,?,?,?,?,?,?,?,?)";
            pst = connect.prepareStatement(sql);
            pst.setString(1, teacherid.getText());
            pst.setString(2, teachername.getText());
            pst.setString(3, gender);
            pst.setString(4, ((JTextField) teacherdob.getDateEditor().getUiComponent()).getText());
            String blood = teacherblood.getSelectedItem().toString();
            pst.setString(5, blood);
            pst.setString(6, teacheraddress.getText());
            pst.setString(7, teachermobile.getText());
            pst.setString(8, teacheremail.getText());
            pst.setString(9, ((JTextField) teacherjod.getDateEditor().getUiComponent()).getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert Successfully !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showteacherDetails();
    }//GEN-LAST:event_addteacherActionPerformed

    private void updateteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateteacherActionPerformed
        try {
            String id = teacherid.getText();
            String a = teachername.getText();
            String b = gender;
            String c = ((JTextField) teacherdob.getDateEditor().getUiComponent()).getText();
            String d = teacherblood.getSelectedItem().toString();
            String e = teacheraddress.getText();
            String f = teachermobile.getText();
            String g = teacheremail.getText();
            String h = ((JTextField) teacherjod.getDateEditor().getUiComponent()).getText();
            String sql = "update teacher set fullname='" + a + "',gender='" + b + "',dob='" + c + "',bloodgroup='" + d + "',address='" + e + "',mobileno='" + f + "',emailid='" + g + "',jod='" + h + "' where Tid='" + id + "' ";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been Updated !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showteacherDetails();
    }//GEN-LAST:event_updateteacherActionPerformed

    private void deleteteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteteacherActionPerformed
        try {
            String id = teacherid.getText();
            String sql = "delete from teacher where Tid='" + id + "'";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showConfirmDialog(null, "Are you Sure Delete Data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showteacherDetails();
    }//GEN-LAST:event_deleteteacherActionPerformed

    private void clearteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearteacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearteacherActionPerformed

    private void teachergenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachergenderActionPerformed
        gender = "Male";
    }//GEN-LAST:event_teachergenderActionPerformed

    private void teachergender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachergender1ActionPerformed
        gender = "Female";
    }//GEN-LAST:event_teachergender1ActionPerformed

    private void addstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffActionPerformed
        try {
            String sql = "INSERT INTO staff (staffid,fullname,gender,dob,bloodgroup,address,mobileno,emailid,jod) values(?,?,?,?,?,?,?,?,?)";
            pst = connect.prepareStatement(sql);
            pst.setString(1, staffid.getText());
            pst.setString(2, staffname.getText());
            pst.setString(3, gender);
            pst.setString(4, ((JTextField) staffdob.getDateEditor().getUiComponent()).getText());
            String blood = staffblood.getSelectedItem().toString();
            pst.setString(5, blood);
            pst.setString(6, staffaddress.getText());
            pst.setString(7, staffmobile.getText());
            pst.setString(8, staffemail.getText());
            pst.setString(9, ((JTextField) staffjod.getDateEditor().getUiComponent()).getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert Successfully !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        showStaffDetails();
    }//GEN-LAST:event_addstaffActionPerformed

    private void updatestaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestaffActionPerformed
        try {
            String id = staffid.getText();
            String a = staffname.getText();
            String b = gender;
            String c = ((JTextField) staffdob.getDateEditor().getUiComponent()).getText();
            String d = staffblood.getSelectedItem().toString();
            String e = staffaddress.getText();
            String f = staffmobile.getText();
            String g = staffemail.getText();
            String h = ((JTextField) staffjod.getDateEditor().getUiComponent()).getText();
            String sql = "update staff set fullname='" + a + "',gender='" + b + "',dob='" + c + "',bloodgroup='" + d + "',address='" + e + "',mobileno='" + f + "',emailid='" + g + "',jod='" + h + "' where staffid='" + id + "' ";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data has been Updated !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showStaffDetails();
    }//GEN-LAST:event_updatestaffActionPerformed

    private void deletestaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestaffActionPerformed
        try {
            String id = staffid.getText();
            String sql = "delete from staff where staffid='" + id + "'";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showConfirmDialog(null, "Are you Sure Delete Data !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showStaffDetails();
    }//GEN-LAST:event_deletestaffActionPerformed

    private void clearstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearstaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearstaffActionPerformed

    private void staffgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffgenderActionPerformed
        gender = "Male";
    }//GEN-LAST:event_staffgenderActionPerformed

    private void staffgender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffgender1ActionPerformed
        gender = "Female";
    }//GEN-LAST:event_staffgender1ActionPerformed

    private void addsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsubjectActionPerformed
        try {
            String sql = "INSERT INTO subject (Subject_id, subject_name,class_name,sdate) VALUES (?,?,?,?) ";
            pst = connect.prepareStatement(sql);
            pst.setString(1, subjectid.getText());
            pst.setString(2, subname.getText());
            String sc = subclass.getSelectedItem().toString();
            pst.setString(3, sc);
            pst.setString(4, ((JTextField) subdate.getDateEditor().getUiComponent()).getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert Successfully !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showSubjectDetails();
    }//GEN-LAST:event_addsubjectActionPerformed

    private void updatesubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesubjectActionPerformed
        try {
            String id = subjectid.getText();
            String a = subname.getText();
            String b = subclass.getSelectedItem().toString();
            String c = ((JTextField) subdate.getDateEditor().getUiComponent()).getText();
            String sql = "update subject set subject_name='" + a + "',class_name='" + b + "',sdate='" + c + "' where Subject_id='" + id + "' ";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Data Successfully !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showSubjectDetails();
    }//GEN-LAST:event_updatesubjectActionPerformed

    private void deletesubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesubjectActionPerformed
        try {
            String id = subjectid.getText();
            String sql = "delete from subject where Subject_id='" + id + "'";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showConfirmDialog(null, "Are you Sure Delete Data !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showSubjectDetails();
    }//GEN-LAST:event_deletesubjectActionPerformed

    private void clearsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearsubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearsubjectActionPerformed

    private void addresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresultActionPerformed
        try {
            String sql = "INSERT INTO result (R_id,Sid, subject_name, midterm,final)values(?,?,?,?,?)";
            pst = connect.prepareStatement(sql);
         if(resultid.getText() == null){
            pst.setString(1, resultid.getText());
            JOptionPane.showMessageDialog(null, "Id Empty !");
         }else if(resultstudentid.getText()==null){
            pst.setString(2, resultstudentid.getText());
            JOptionPane.showMessageDialog(null, "Student Id Empty !");
         }else if(resultsubname.getText()==null){
            pst.setString(3, resultsubname.getText());
            JOptionPane.showMessageDialog(null, "Subject Name Empty");
         }else if(midtermexam.getText()==null){
            pst.setString(4, midtermexam.getText());
            JOptionPane.showMessageDialog(null, "Midterm result Empty");
         }else if(finalexam.getText()==null){
            pst.setString(5, finalexam.getText());
           
            JOptionPane.showMessageDialog(null, "Result is  Empty !");
         }
         else{
              pst.execute();
           JOptionPane.showMessageDialog(null, "Insert Successfully !");  
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showresultDetails();
    }//GEN-LAST:event_addresultActionPerformed

    private void updateresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateresultActionPerformed
        try {
            String id = resultid.getText();
            String a = resultstudentid.getText();
            String b = resultsubname.getText();
            String c = midtermexam.getText();
            String d = finalexam.getText();
            String sql = "update result set Sid='" + a + "',subject_name='" + b + "',midterm='" + c + "',final='"+d+"' where R_id='" + id + "' ";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Update Data Successfully !");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showresultDetails();
    }//GEN-LAST:event_updateresultActionPerformed

    private void deleteresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteresultActionPerformed
        try {
            String id = resultid.getText();
            String sql = "DELETE from result where R_id='" + id + "'";
            pst = connect.prepareStatement(sql);
            pst.execute();
            JOptionPane.showConfirmDialog(null, "Are you Sure Delete Data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showresultDetails();
    }//GEN-LAST:event_deleteresultActionPerformed

    private void clearresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearresultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearresultActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        setVisible(false);
        Login lo = new Login();
        lo.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void sayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayedActionPerformed
        setVisible(false);
        Sayed s=new Sayed();
        s.setVisible(true);
    }//GEN-LAST:event_sayedActionPerformed

    private void printsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printsubjectActionPerformed
        try {
            MessageFormat header=new MessageFormat("Report All Subject");
             MessageFormat footer=new MessageFormat("page{1,number,integer}");
             subjecttableview.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_printsubjectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(School.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(School.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(School.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(School.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new School().setVisible(true);
            }
        });
    }

//Show All Table
    public void showStudentDetails() {
        try {
            connect = ConnectDB.connDB();
            String q = "SELECT * FROM student";
            pst = connect.prepareStatement(q);
            rst = pst.executeQuery();
            tablestudent.setModel(DbUtils.resultSetToTableModel(rst));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showteacherDetails() {
        try {
            connect = ConnectDB.connDB();
            String q = "SELECT * FROM teacher";
            pst = connect.prepareStatement(q);
            rst = pst.executeQuery();
            teachertabaleview.setModel(DbUtils.resultSetToTableModel(rst));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showStaffDetails() {
        try {
            connect = ConnectDB.connDB();
            String q = "SELECT * FROM staff";
            pst = connect.prepareStatement(q);
            rst = pst.executeQuery();
            stafftableview.setModel(DbUtils.resultSetToTableModel(rst));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showSubjectDetails() {
        try {
            connect = ConnectDB.connDB();
            String q = "SELECT * FROM subject";
            pst = connect.prepareStatement(q);
            rst = pst.executeQuery();
            subjecttableview.setModel(DbUtils.resultSetToTableModel(rst));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showresultDetails() {
        try {
            connect = ConnectDB.connDB();
            String q = "SELECT * FROM result";
            pst = connect.prepareStatement(q);
            rst = pst.executeQuery();
            resulttableview.setModel(DbUtils.resultSetToTableModel(rst));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addresult;
    private javax.swing.JButton addstaff;
    private javax.swing.JButton addstudent;
    private javax.swing.JButton addsubject;
    private javax.swing.JButton addteacher;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton clearresult;
    private javax.swing.JButton clearstaff;
    private javax.swing.JButton clearstudent;
    private javax.swing.JButton clearsubject;
    private javax.swing.JButton clearteacher;
    private javax.swing.JLabel clock;
    private javax.swing.JButton deleteresult;
    private javax.swing.JButton deletestaff;
    private javax.swing.JButton deletestudent;
    private javax.swing.JButton deletesubject;
    private javax.swing.JButton deleteteacher;
    private javax.swing.JTextField finalexam;
    private javax.swing.JButton home;
    private javax.swing.JPanel homefrom;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton logout;
    private javax.swing.JPanel menubar;
    private javax.swing.JTextField midtermexam;
    private javax.swing.JPanel panel;
    private javax.swing.JButton printsubject;
    private javax.swing.JButton result;
    private javax.swing.JPanel resultfrom;
    private javax.swing.JTextField resultid;
    private javax.swing.JTextField resultstudentid;
    private javax.swing.JTextField resultsubname;
    private javax.swing.JPanel resulttable;
    private javax.swing.JTable resulttableview;
    private javax.swing.JButton sayed;
    private javax.swing.JButton staff;
    private javax.swing.JTextField staffaddress;
    private javax.swing.JComboBox staffblood;
    private javax.swing.JLabel staffclock;
    private com.toedter.calendar.JDateChooser staffdob;
    private javax.swing.JTextField staffemail;
    private javax.swing.JPanel stafffrom;
    private javax.swing.JRadioButton staffgender;
    private javax.swing.JRadioButton staffgender1;
    private javax.swing.JTextField staffid;
    private com.toedter.calendar.JDateChooser staffjod;
    private javax.swing.JTextField staffmobile;
    private javax.swing.JTextField staffname;
    private javax.swing.JPanel stafftable;
    private javax.swing.JTable stafftableview;
    private javax.swing.JLabel stuclock;
    private javax.swing.JButton student;
    private javax.swing.JTextField studentaddress;
    private javax.swing.JComboBox studentblood;
    private javax.swing.JComboBox studentclass;
    private com.toedter.calendar.JDateChooser studentdob;
    private javax.swing.JTextField studentemail;
    private javax.swing.JTextField studentfather;
    private javax.swing.JPanel studentfrom;
    private javax.swing.JComboBox studentgroup;
    private javax.swing.JTextField studentid;
    private javax.swing.JTextField studentmobile;
    private javax.swing.JTextField studentmother;
    private javax.swing.JTextField studentname;
    private javax.swing.JPanel studenttable;
    private javax.swing.JRadioButton stugender;
    private javax.swing.JRadioButton stugender1;
    private javax.swing.JComboBox subclass;
    private javax.swing.JLabel subclock;
    private com.toedter.calendar.JDateChooser subdate;
    private javax.swing.JButton subject;
    private javax.swing.JPanel subjectfrom;
    private javax.swing.JTextField subjectid;
    private javax.swing.JPanel subjecttable;
    private javax.swing.JTable subjecttableview;
    private javax.swing.JTextField subname;
    private javax.swing.JTable tablestudent;
    private javax.swing.JButton teacher;
    private javax.swing.JTextField teacheraddress;
    private javax.swing.JComboBox teacherblood;
    private com.toedter.calendar.JDateChooser teacherdob;
    private javax.swing.JTextField teacheremail;
    private javax.swing.JPanel teacherfrom;
    private javax.swing.JRadioButton teachergender;
    private javax.swing.JRadioButton teachergender1;
    private javax.swing.JTextField teacherid;
    private com.toedter.calendar.JDateChooser teacherjod;
    private javax.swing.JTextField teachermobile;
    private javax.swing.JTextField teachername;
    private javax.swing.JTable teachertabaleview;
    private javax.swing.JPanel teachertable;
    private javax.swing.JLabel teclock;
    private javax.swing.JButton updateresult;
    private javax.swing.JButton updatestaff;
    private javax.swing.JButton updatestudent;
    private javax.swing.JButton updatesubject;
    private javax.swing.JButton updateteacher;
    private javax.swing.JButton viewresult;
    private javax.swing.JButton viewstaff;
    private javax.swing.JButton viewstudent;
    private javax.swing.JButton viewsubject;
    private javax.swing.JButton viewteacher;
    // End of variables declaration//GEN-END:variables
     private String gender;
}
