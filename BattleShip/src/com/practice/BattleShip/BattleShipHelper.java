package com.practice.BattleShip;

public class BattleShipHelper {
	
	private BattleShip battleShip;
	
	public BattleShipHelper(BattleShip battleShip) {
		this.battleShip = battleShip;
	}
	
	void updateLabels() {
		//battleShip.minesFoundLabel.setText("Found: " + mineSweeper.mineField.getMinesFound());
		//mineSweeper.minesRemainingLabel.setText("Remaining: " + mineSweeper.mineField.getMinesRemaining());;
	}
	
	void newGame(int previousRows, int previousColumns) {
		for (int i = 0; i < previousRows; i++) {
			for (int j = 0; j < previousColumns; j++) {
				battleShip.topPanelOne.remove(battleShip.topButtonsOne[i][j]);
				battleShip.topPanelTwo.remove(battleShip.topButtonsTwo[i][j]);
				battleShip.bottomPanelOne.remove(battleShip.bottomButtonsOne[i][j]);
				battleShip.bottomPanelTwo.remove(battleShip.bottomButtonsTwo[i][j]);
			}
		}
		battleShip.init();
		battleShip.topPanelOne.validate();
		battleShip.topPanelTwo.validate();
		battleShip.bottomPanelOne.validate();
		battleShip.bottomPanelTwo.validate();
		battleShip.fieldOne.validate();
		battleShip.fieldTwo.validate();
		battleShip.fieldOne.pack();
		battleShip.fieldTwo.pack();
		updateLabels();
	}
}
