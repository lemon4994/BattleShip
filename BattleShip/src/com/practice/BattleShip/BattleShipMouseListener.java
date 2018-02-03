package com.practice.BattleShip;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class BattleShipMouseListener implements MouseListener {
	
	private BattleShip battleShip;
	private BattleShipHelper battleShipHelper;
	
	public BattleShipMouseListener(BattleShip battleShip, BattleShipHelper helper) {
		this.battleShip = battleShip;
		battleShipHelper = helper;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		for (int i = 0; i < battleShip.rows; i++) {
			for (int j = 0; j < battleShip.columns; j++) {
				//if (clickedButton == battleShip.mineButtons[i][j]) {
				//}
			}
		}
	}
}
