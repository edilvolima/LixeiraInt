package lixeiraint;


import context.arch.discoverer.Discoverer;
import javax.swing.JFrame;
import context.arch.enactor.Enactor;
import context.arch.enactor.Generator;



    // Metodos do Status Service
/**
 * @author Zeff
 */
public class LixeiraInt extends javax.swing.JFrame{
    
    
    protected LixeiraModel contextModel;
    protected Generator lixeiraGenerator;
    protected Enactor enactorStatus;    
    
    
    public LixeiraInt() {
            super();
            initComponents();
            
            /*
             * Iniciando os Widgets, Enactors, Generators e Services
             */
            contextModel = new LixeiraModel(this);
            lixeiraGenerator = contextModel.generatorLixeira;
            enactorStatus = contextModel.enactorStatus;
    }
    
    public int totalPlastico;
    public int totalOleo;
    public int totalVidro;
    
    @SuppressWarnings("serial")
    public void initComponents() {
 // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
        jPanel2 = new javax.swing.JPanel();
        P2SliderO = new javax.swing.JSlider();
        P2SliderP = new javax.swing.JSlider();
        P2SliderV = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        P3SliderO = new javax.swing.JSlider();
        P3SliderP = new javax.swing.JSlider();
        P3SliderV = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LixoSliderP = new javax.swing.JSlider();
        LixoSliderO = new javax.swing.JSlider();
        LixoSliderV = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LabelLixoP = new javax.swing.JLabel();
        LabelLixoO = new javax.swing.JLabel();
        LabelLixoV = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Ag1Slider = new javax.swing.JSlider();
        Ag2Slider = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        P1SliderP = new javax.swing.JSlider();
        P1SliderV = new javax.swing.JSlider();
        P1SliderO = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software de Reciclagem de Lixo Inteligente");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P2SliderO.setMajorTickSpacing(10);
        P2SliderO.setOrientation(javax.swing.JSlider.VERTICAL);
        P2SliderO.setPaintLabels(true);
        P2SliderO.setPaintTicks(true);
        P2SliderO.setSnapToTicks(true);
        P2SliderO.setValue(0);
        P2SliderO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P2SliderOStateChanged(evt);
            }
        });

        P2SliderP.setMajorTickSpacing(10);
        P2SliderP.setOrientation(javax.swing.JSlider.VERTICAL);
        P2SliderP.setPaintLabels(true);
        P2SliderP.setPaintTicks(true);
        P2SliderP.setSnapToTicks(true);
        P2SliderP.setValue(0);
        P2SliderP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P2SliderPStateChanged(evt);
            }
        });

        P2SliderV.setMajorTickSpacing(10);
        P2SliderV.setOrientation(javax.swing.JSlider.VERTICAL);
        P2SliderV.setPaintLabels(true);
        P2SliderV.setPaintTicks(true);
        P2SliderV.setSnapToTicks(true);
        P2SliderV.setValue(0);
        P2SliderV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P2SliderVStateChanged(evt);
            }
        });

        jLabel2.setText("Produtor de Lixo 2 - KG");

        jLabel6.setText("   P                O                V");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(P2SliderP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2SliderO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2SliderV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P2SliderO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2SliderP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2SliderV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(15, 15, 15))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P3SliderO.setMajorTickSpacing(10);
        P3SliderO.setOrientation(javax.swing.JSlider.VERTICAL);
        P3SliderO.setPaintLabels(true);
        P3SliderO.setPaintTicks(true);
        P3SliderO.setSnapToTicks(true);
        P3SliderO.setValue(0);
        P3SliderO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P3SliderOStateChanged(evt);
            }
        });

        P3SliderP.setMajorTickSpacing(10);
        P3SliderP.setOrientation(javax.swing.JSlider.VERTICAL);
        P3SliderP.setPaintLabels(true);
        P3SliderP.setPaintTicks(true);
        P3SliderP.setSnapToTicks(true);
        P3SliderP.setValue(0);
        P3SliderP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P3SliderPStateChanged(evt);
            }
        });

        P3SliderV.setMajorTickSpacing(10);
        P3SliderV.setOrientation(javax.swing.JSlider.VERTICAL);
        P3SliderV.setPaintLabels(true);
        P3SliderV.setPaintTicks(true);
        P3SliderV.setSnapToTicks(true);
        P3SliderV.setValue(0);
        P3SliderV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P3SliderVStateChanged(evt);
            }
        });

        jLabel3.setText("Produtor de Lixo 3 - KG");

        jLabel7.setText("   P                O                V");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(P3SliderP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P3SliderO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P3SliderV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(P3SliderO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P3SliderV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P3SliderP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LixoSliderP.setMajorTickSpacing(50);
        LixoSliderP.setMaximum(250);
        LixoSliderP.setMinorTickSpacing(10);
        LixoSliderP.setOrientation(javax.swing.JSlider.VERTICAL);
        LixoSliderP.setPaintLabels(true);
        LixoSliderP.setPaintTicks(true);
        LixoSliderP.setSnapToTicks(true);
        LixoSliderP.setValue(0);
        LixoSliderP.setEnabled(false);
        LixoSliderP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LixoSliderPStateChanged(evt);
            }
        });
        LixoSliderP.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LixoSliderPAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        LixoSliderO.setMajorTickSpacing(50);
        LixoSliderO.setMaximum(250);
        LixoSliderO.setMinorTickSpacing(10);
        LixoSliderO.setOrientation(javax.swing.JSlider.VERTICAL);
        LixoSliderO.setPaintLabels(true);
        LixoSliderO.setPaintTicks(true);
        LixoSliderO.setSnapToTicks(true);
        LixoSliderO.setValue(0);
        LixoSliderO.setEnabled(false);
        LixoSliderO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LixoSliderOStateChanged(evt);
            }
        });

        LixoSliderV.setMajorTickSpacing(50);
        LixoSliderV.setMaximum(250);
        LixoSliderV.setMinorTickSpacing(10);
        LixoSliderV.setOrientation(javax.swing.JSlider.VERTICAL);
        LixoSliderV.setPaintLabels(true);
        LixoSliderV.setPaintTicks(true);
        LixoSliderV.setSnapToTicks(true);
        LixoSliderV.setValue(0);
        LixoSliderV.setEnabled(false);
        LixoSliderV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LixoSliderVStateChanged(evt);
            }
        });

        jLabel4.setText("Lixeiras - Quantidade em KG");

        jLabel10.setText("   P               O               V");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(LixoSliderP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(LixoSliderO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LixoSliderV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LabelLixoP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LabelLixoO, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelLixoV, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(LixoSliderO, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(LixoSliderP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(LixoSliderV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLixoP)
                    .addComponent(LabelLixoO)
                    .addComponent(LabelLixoV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LabelLixoO, LabelLixoP, LabelLixoV});

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));

        Ag1Slider.setMajorTickSpacing(1);
        Ag1Slider.setMaximum(20);
        Ag1Slider.setPaintLabels(true);
        Ag1Slider.setPaintTicks(true);
        Ag1Slider.setSnapToTicks(true);
        Ag1Slider.setValue(0);

        Ag2Slider.setMajorTickSpacing(1);
        Ag2Slider.setMaximum(20);
        Ag2Slider.setPaintLabels(true);
        Ag2Slider.setPaintTicks(true);
        Ag2Slider.setSnapToTicks(true);
        Ag2Slider.setValue(0);

        jLabel11.setText("Agentes Coletores de Lixo - KM");

        jLabel12.setText("Agente 1");

        jLabel13.setText("Agente 2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Ag1Slider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
            .addComponent(Ag2Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ag1Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Ag2Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        P1SliderP.setMajorTickSpacing(10);
        P1SliderP.setOrientation(javax.swing.JSlider.VERTICAL);
        P1SliderP.setPaintLabels(true);
        P1SliderP.setPaintTicks(true);
        P1SliderP.setSnapToTicks(true);
        P1SliderP.setValue(0);
        P1SliderP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P1SliderPStateChanged(evt);
            }
        });

        P1SliderV.setMajorTickSpacing(10);
        P1SliderV.setOrientation(javax.swing.JSlider.VERTICAL);
        P1SliderV.setPaintLabels(true);
        P1SliderV.setPaintTicks(true);
        P1SliderV.setSnapToTicks(true);
        P1SliderV.setValue(0);
        P1SliderV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P1SliderVStateChanged(evt);
            }
        });

        P1SliderO.setMajorTickSpacing(10);
        P1SliderO.setOrientation(javax.swing.JSlider.VERTICAL);
        P1SliderO.setPaintLabels(true);
        P1SliderO.setPaintTicks(true);
        P1SliderO.setSnapToTicks(true);
        P1SliderO.setValue(0);
        P1SliderO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                P1SliderOStateChanged(evt);
            }
        });

        jLabel1.setText("Produtor de Lixo 1 - KG");

        jLabel5.setText("   P                    O                 V");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(P1SliderP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P1SliderO, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P1SliderV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(P1SliderO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P1SliderV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P1SliderP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(13, 13, 13))
        );

        jLabel8.setText("Legenda:");

        jLabel9.setText("P = Plástico | O = Óleo | V = Vidro");

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensagens", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AR DECODE", 0, 24))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    
    private void P1SliderPStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderP.setValue(P1SliderP.getValue() + P2SliderP.getValue() + P3SliderP.getValue());
        totalPlastico = P1SliderP.getValue() + P2SliderP.getValue() + P3SliderP.getValue();
        lixeiraGenerator.setAttributeValue("quantPlastico", (short)totalPlastico);
    }                                      

    private void P1SliderOStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderO.setValue(P1SliderO.getValue() + P2SliderO.getValue() + P3SliderO.getValue());
        totalOleo = P1SliderO.getValue() + P2SliderO.getValue() + P3SliderO.getValue();
        lixeiraGenerator.setAttributeValue("quantOleo", (short)totalOleo);
    }                                      

    private void P1SliderVStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderV.setValue(P1SliderV.getValue() + P2SliderV.getValue() + P3SliderV.getValue());
        totalVidro = P1SliderV.getValue() + P2SliderV.getValue() + P3SliderV.getValue();
        lixeiraGenerator.setAttributeValue("quantVidro", (short)totalVidro);
    }                                      

    private void P2SliderPStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderP.setValue(P1SliderP.getValue() + P2SliderP.getValue() + P3SliderP.getValue());
        totalPlastico = P1SliderP.getValue() + P2SliderP.getValue() + P3SliderP.getValue();
        lixeiraGenerator.setAttributeValue("quantPlastico", (short)totalPlastico);
    }                                      

    private void P2SliderOStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderO.setValue(P1SliderO.getValue() + P2SliderO.getValue() + P3SliderO.getValue());
        totalOleo = P1SliderO.getValue() + P2SliderO.getValue() + P3SliderO.getValue();
        lixeiraGenerator.setAttributeValue("quantOleo", (short)totalOleo);
    }                                      

    private void P2SliderVStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderV.setValue(P1SliderV.getValue() + P2SliderV.getValue() + P3SliderV.getValue());
        totalVidro = P1SliderO.getValue() + P2SliderO.getValue() + P3SliderO.getValue();
        lixeiraGenerator.setAttributeValue("quantVidro", (short)totalVidro);
    }                                      

    private void P3SliderPStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderP.setValue(P1SliderP.getValue() + P2SliderP.getValue() + P3SliderP.getValue());
        totalPlastico = P1SliderP.getValue() + P2SliderP.getValue() + P3SliderP.getValue();
        lixeiraGenerator.setAttributeValue("quantPlastico", (short)totalPlastico);
    }                                      

    private void P3SliderOStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderO.setValue(P1SliderO.getValue() + P2SliderO.getValue() + P3SliderO.getValue());
        totalOleo = P1SliderO.getValue() + P2SliderO.getValue() + P3SliderO.getValue();
        lixeiraGenerator.setAttributeValue("quantOleo", (short)totalOleo);
    }                                      

    private void P3SliderVStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        LixoSliderV.setValue(P1SliderV.getValue() + P2SliderV.getValue() + P3SliderV.getValue());
        totalVidro = P1SliderV.getValue() + P2SliderV.getValue() + P3SliderV.getValue();
        lixeiraGenerator.setAttributeValue("quantVidro", (short)totalVidro);
    }                                      

    private void LixoSliderPStateChanged(javax.swing.event.ChangeEvent evt) {                                         
    }                                        

    private void LixoSliderOStateChanged(javax.swing.event.ChangeEvent evt) {                                         
    }                                        

    private void LixoSliderVStateChanged(javax.swing.event.ChangeEvent evt) {                                         
    }                                        

    private void LixoSliderPAncestorAdded(javax.swing.event.AncestorEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    public static void main(String args[]) {
        
                new LixeiraInt().setVisible(true);
    }
  
 
    
    // Variables declaration - do not modify                     
    private javax.swing.JSlider Ag1Slider;
    private javax.swing.JSlider Ag2Slider;
    private javax.swing.JLabel LabelLixoO;
    private javax.swing.JLabel LabelLixoP;
    private javax.swing.JLabel LabelLixoV;
    private javax.swing.JSlider LixoSliderO;
    private javax.swing.JSlider LixoSliderP;
    private javax.swing.JSlider LixoSliderV;
    private javax.swing.JSlider P1SliderO;
    private javax.swing.JSlider P1SliderP;
    private javax.swing.JSlider P1SliderV;
    private javax.swing.JSlider P2SliderO;
    private javax.swing.JSlider P2SliderP;
    private javax.swing.JSlider P2SliderV;
    private javax.swing.JSlider P3SliderO;
    private javax.swing.JSlider P3SliderP;
    private javax.swing.JSlider P3SliderV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration

    // Metodos para mudar a cor e texto do status da lixeira
    public void setStatusPlastico(String status) {
        jTextArea1.setText("");
    }
    
    public void setStatusOleo(String status){
        jTextArea1.setText("");
    }
    
    public void setStatusVidro(String status){
        jTextArea1.setText("");
    }
    
    //Impressão das mensagens do que a aplicação está fazendo
    public void printMensagem(int mensagem){
        jTextArea1.setText("");
    }
    
}
    