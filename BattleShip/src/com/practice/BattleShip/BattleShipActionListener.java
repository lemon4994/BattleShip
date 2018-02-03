package com.practice.BattleShip;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleShipActionListener implements ActionListener {
		
	private BattleShip battleShip;
	private BattleShipHelper battleShipHelper;
	
	public BattleShipActionListener(BattleShip battleShip, BattleShipHelper helper) {
		this.battleShip = battleShip;
		battleShipHelper = helper;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Exit Game")) {
			System.exit(0);
		}
		if (e.getActionCommand().equals("New Game")) {
			battleShipHelper.newGame(battleShip.rows, battleShip.columns);
			return;
		}
	}
}
