package view;

import Service.NhanVienService;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;

/**
 *
 * @author Hello
 */
public class FrmNhanVien extends javax.swing.JFrame {
    
    DefaultTableModel model = new DefaultTableModel();
    NhanVienService nhanVienService = new NhanVienService();
    List<NhanVien> lstNhanVien = nhanVienService.layDanhSachNV();
    int vitri;
    
    /**
     * Creates new form FrmNhanVien
     */
    public FrmNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        try {
            //B1 mở luồng <=> tạo đối tượng đọc ghi
            ObjectInput ois = new ObjectInputStream(new FileInputStream("nhanVien.txt"));
            //B2 thực hiện đọc ghi
            lstNhanVien = (ArrayList<NhanVien>) ois.readObject();  //Thực hiện đọc dữ liệu từ file ra list
            //B3  đong luồng

            ois.close();
            // xử lý khi đọc
            fillToTable();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Lỗi đọc file");
        }
//        fillToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblThongTinNhanVien = new javax.swing.JLabel();
        plSearch = new javax.swing.JPanel();
        lblIdSearch = new javax.swing.JLabel();
        txtIdSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblStaffName = new javax.swing.JLabel();
        txtStaffName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        cbbRole = new javax.swing.JComboBox<>();
        cbbArea = new javax.swing.JComboBox<>();
        lblExperience = new javax.swing.JLabel();
        txtExperience = new javax.swing.JTextField();
        lblSalary = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongTinNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblThongTinNhanVien.setBackground(new java.awt.Color(0, 10, 255));
        lblThongTinNhanVien.setFont(new java.awt.Font("Consolas", 0, 25)); // NOI18N
        lblThongTinNhanVien.setForeground(new java.awt.Color(0, 10, 255));
        lblThongTinNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinNhanVien.setText("THÔNG TIN NHÂN VIÊN KHÁCH SẠN");
        lblThongTinNhanVien.setPreferredSize(new java.awt.Dimension(415, 40));

        plSearch.setBackground(new java.awt.Color(174, 196, 221));
        plSearch.setPreferredSize(new java.awt.Dimension(410, 60));

        lblIdSearch.setBackground(new java.awt.Color(0, 0, 0));
        lblIdSearch.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblIdSearch.setText("ID");
        lblIdSearch.setPreferredSize(new java.awt.Dimension(36, 18));

        txtIdSearch.setBackground(new java.awt.Color(217, 217, 217));
        txtIdSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtIdSearch.setPreferredSize(new java.awt.Dimension(230, 30));
        txtIdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setPreferredSize(new java.awt.Dimension(96, 30));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plSearchLayout = new javax.swing.GroupLayout(plSearch);
        plSearch.setLayout(plSearchLayout);
        plSearchLayout.setHorizontalGroup(
            plSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSearchLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plSearchLayout.setVerticalGroup(
            plSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSearchLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(plSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(174, 196, 221));
        jPanel2.setPreferredSize(new java.awt.Dimension(575, 315));

        lblId.setBackground(new java.awt.Color(0, 0, 0));
        lblId.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID");
        lblId.setPreferredSize(new java.awt.Dimension(90, 21));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(217, 217, 217));
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setPreferredSize(new java.awt.Dimension(300, 30));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblStaffName.setBackground(new java.awt.Color(0, 0, 0));
        lblStaffName.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblStaffName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaffName.setText("Staff's Name");
        lblStaffName.setPreferredSize(new java.awt.Dimension(90, 21));

        txtStaffName.setEditable(false);
        txtStaffName.setBackground(new java.awt.Color(217, 217, 217));
        txtStaffName.setForeground(new java.awt.Color(0, 0, 0));
        txtStaffName.setPreferredSize(new java.awt.Dimension(300, 30));
        txtStaffName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffNameActionPerformed(evt);
            }
        });

        lblAge.setBackground(new java.awt.Color(0, 0, 0));
        lblAge.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAge.setText("Age");
        lblAge.setPreferredSize(new java.awt.Dimension(90, 21));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(217, 217, 217));
        txtAge.setForeground(new java.awt.Color(0, 0, 0));
        txtAge.setPreferredSize(new java.awt.Dimension(300, 30));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblRole.setBackground(new java.awt.Color(0, 0, 0));
        lblRole.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole.setText("Role");
        lblRole.setPreferredSize(new java.awt.Dimension(90, 21));

        lblArea.setBackground(new java.awt.Color(0, 0, 0));
        lblArea.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setText("Area");
        lblArea.setPreferredSize(new java.awt.Dimension(90, 21));

        cbbRole.setBackground(new java.awt.Color(217, 217, 217));
        cbbRole.setForeground(new java.awt.Color(0, 0, 0));
        cbbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrators", "Moderators", "Operational", "Regular", "Part-time" }));
        cbbRole.setPreferredSize(new java.awt.Dimension(195, 30));

        cbbArea.setBackground(new java.awt.Color(217, 217, 217));
        cbbArea.setForeground(new java.awt.Color(0, 0, 0));
        cbbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vip", "Classic", "Regular" }));
        cbbArea.setPreferredSize(new java.awt.Dimension(195, 30));

        lblExperience.setBackground(new java.awt.Color(0, 0, 0));
        lblExperience.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblExperience.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExperience.setText("Experience");
        lblExperience.setPreferredSize(new java.awt.Dimension(90, 21));

        txtExperience.setEditable(false);
        txtExperience.setBackground(new java.awt.Color(217, 217, 217));
        txtExperience.setForeground(new java.awt.Color(0, 0, 0));
        txtExperience.setPreferredSize(new java.awt.Dimension(300, 30));
        txtExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExperienceActionPerformed(evt);
            }
        });

        lblSalary.setBackground(new java.awt.Color(0, 0, 0));
        lblSalary.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalary.setText("Salary");
        lblSalary.setPreferredSize(new java.awt.Dimension(90, 21));

        txtSalary.setEditable(false);
        txtSalary.setBackground(new java.awt.Color(217, 217, 217));
        txtSalary.setForeground(new java.awt.Color(0, 0, 0));
        txtSalary.setPreferredSize(new java.awt.Dimension(300, 30));
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });

        lblStatus.setBackground(new java.awt.Color(0, 0, 0));
        lblStatus.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Status");
        lblStatus.setPreferredSize(new java.awt.Dimension(90, 21));

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(217, 217, 217));
        txtStatus.setForeground(new java.awt.Color(0, 0, 0));
        txtStatus.setPreferredSize(new java.awt.Dimension(300, 30));
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(9, 30));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblStaffName, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStaffName, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtExperience, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cbbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtExperience, txtId, txtStaffName});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStaffName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStaffName, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbRole, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbbArea, lblArea, txtId, txtStatus});

        tblThongTinNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Staff's Name", "Age", "Experience", "Role", "Area", "Salary", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThongTinNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThongTinNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblThongTinNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblThongTinNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillToTable(){

        if (lstNhanVien == null) {
            JOptionPane.showMessageDialog(this, "Lỗi!");
        } else if (lstNhanVien.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu!");
        } else {
            model = (DefaultTableModel) tblThongTinNhanVien.getModel();
            model.setRowCount(0);
            for (NhanVien nv : lstNhanVien) {
                double luong = nv.getSalary();
                if (nv.getStatus(nv.getExperience() + "").equalsIgnoreCase("Bán chuyên")) {
                    luong = luong + 75;
                } else if (nv.getStatus(nv.getExperience() + "").equalsIgnoreCase("Chuyên nghiệp")) {
                    luong = luong + 100;
                } else {
                    luong = luong + 200;
                }
                model.addRow(new Object[]{
                    nv.getID(),
                    nv.getName(),
                    nv.getAge(),
                    nv.getExperience(),
                    nv.getRole(),
                    nv.getArea(),
                    luong,
                    nv.getStatus(nv.getExperience() + "")
                });
            }
        }
    }
    
    private void showDetail() {
//        NhanVien nv = lstNhanVien.get(vitri);
        
        String id = (String) tblThongTinNhanVien.getValueAt(vitri, 0);
        String name = (String) tblThongTinNhanVien.getValueAt(vitri, 1);
        int age = (int) tblThongTinNhanVien.getValueAt(vitri, 2);
        int experience = (int) tblThongTinNhanVien.getValueAt(vitri, 3);
        String role = (String) tblThongTinNhanVien.getValueAt(vitri, 4);
        String area = (String) tblThongTinNhanVien.getValueAt(vitri, 5);
        double salary = (double) tblThongTinNhanVien.getValueAt(vitri, 6);
        String status = (String) tblThongTinNhanVien.getValueAt(vitri, 7);
        
        txtId.setText(id);
        txtStaffName.setText(name);
        txtAge.setText(age+"");
        txtExperience.setText(experience+"");
        cbbRole.setSelectedItem(role);
        cbbArea.setSelectedItem(area);
        txtSalary.setText(salary+"");
        txtStatus.setText(status);
    }
    
    public void clearForm(){
        txtId.setText("");
        txtStaffName.setText("");
        txtAge.setText("");
        txtExperience.setText("");
        txtSalary.setText("");
        txtStatus.setText("");
        cbbRole.setSelectedIndex(0);
        cbbArea.setSelectedIndex(0);
    }
    
    private void txtIdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSearchActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtStaffNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperienceActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // Tìm nhân viên theo id
        try {
            String idSearch = txtIdSearch.getText();
            if (idSearch.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập vào mã nhân viên cần tìm!");
                txtIdSearch.requestFocus();
                return;
            }
            int count = 0;
            for (NhanVien nv : lstNhanVien) {
                if (nv.getID().equals(idSearch)) {
                    JOptionPane.showMessageDialog(this, "Tìm thấy nhân viên có mã: " + idSearch);
                    vitri = lstNhanVien.indexOf(nv);
                    tblThongTinNhanVien.setRowSelectionInterval(vitri, vitri);
                    showDetail();
                    count++;
                    break;
                }
            }
            if (count == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên có mã: " + idSearch);
                txtIdSearch.requestFocus();
                clearForm();
                tblThongTinNhanVien.clearSelection();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tìm nhân viên!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Thoát
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát không?");
        if (hoi != JOptionPane.YES_OPTION) {
            return;
        }
        new FrmDangNhap(null, false).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblThongTinNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThongTinNhanVienMouseClicked
        // show
        vitri = tblThongTinNhanVien.getSelectedRow();
        showDetail();
    }//GEN-LAST:event_tblThongTinNhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(FrmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbbArea;
    private javax.swing.JComboBox<String> cbbRole;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblExperience;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdSearch;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblStaffName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblThongTinNhanVien;
    private javax.swing.JPanel plSearch;
    private javax.swing.JTable tblThongTinNhanVien;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdSearch;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtStaffName;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
