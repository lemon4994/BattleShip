package com.practice.BattleShip;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sea {
	
	private Hit[][] sea;
	private Hit.CarrierOne[][] carrierOne;
	private Hit.CarrierTwo[][] carrierTwo;
	private Hit.BattleShipOne[][] battleShipOne;
	private Hit.BattleShipTwo[][] battleShipTwo;
	private Hit.CruiserOne[][] cruiserOne;
	private Hit.CruiserTwo[][] cruiserTwo;
	private Hit.SubmarineOne[][] submarineOne;
	private Hit.SubmarineTwo[][] submarineTwo;
	private Hit.DestroyerOne[][] destroyerOne;
	private Hit.DestroyerTwo[][] destroyerTwo;
	
	int rows;
	int columns;
	String nameOne;
	String nameTwo;
	JFrame windowOne;
	JFrame windowTwo;
	JPanel topOne;
	JPanel topTwo;
	JPanel bottomOne;
	JPanel bottomTwo;
	boolean setupOne = false;
	boolean setupTwo = false;
	
	enum gameTurn {SETUP, ONE, TWO}
	
	//static void FieldData(JFrame windowOne, JFrame windowTwo, JPanel topOne, JPanel bottomOne, JPanel topTwo, JPanel bottomTwo) {
	//this.windowOne = windowOne;
	//this.windowTwo = windowTwo;
	//this.topOne = topOne;
	//this.topTwo = topTwo;
	//this.bottomOne = bottomOne;
	//this.bottomTwo = bottomTwo;
	//}
	
	Sea(int rows, int columns, String nameOne, String nameTwo) {
		this.rows = rows;
		this.columns = columns;
		this.nameOne = nameOne;
		this.nameTwo = nameTwo;
		init();
		playerOneSetup();
	}
	
	private void init() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sea[i][j] = new Hit();
			}
		}
	}
	
	private void playerOneSetup() {
		setupOne = true;
		windowTwo.setVisible(false);
		JOptionPane.showMessageDialog(null, nameOne + ", prepare to position your ships. You will start with an Aircraft Carrier, select 2 coordinates 5 spaces apart.");
		
	}
}