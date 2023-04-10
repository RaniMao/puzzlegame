package com.wangyu.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {

    public GameJFrame(){
        initJFrame();

        initMenu();

        this.setVisible(true);
    }

    public void initImage(){
        ImageIcon imageIcon = new ImageIcon();
        JLabel jLabel = new JLabel(imageIcon);

        jLabel.setBounds(0,0,105,105);
        //this.add(jLabel);

        this.getContentPane().add(jLabel);
    }

    private void initMenu() {
        //菜单
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于");

        JMenuItem replayMenu = new JMenuItem("重新游戏");
        JMenuItem reLoginMenu = new JMenuItem("重新登录");
        JMenuItem closeMenu = new JMenuItem("关闭");

        JMenuItem accountMenu = new JMenuItem("王宇");

        functionJMenu.add(replayMenu);
        functionJMenu.add(reLoginMenu);
        functionJMenu.add(closeMenu);

        aboutJMenu.add(accountMenu);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);

        this.setTitle("评图");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
    }
}
