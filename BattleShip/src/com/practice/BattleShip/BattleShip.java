package com.practice.BattleShip;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.JOptionPane;

public class BattleShip {
	
	int columns = 10;
	int rows = 10;
	
	JFrame fieldOne = new JFrame("Player One"); //Objects for Player Ones window
	JPanel topPanelOne = new JPanel();
	JPanel bottomPanelOne = new JPanel();
	JLabel shipsRemainingTwoLabel = new JLabel("Enemy Ships Remaining: ");
	JLabel playerOneNameLabel = new JLabel("Player One: ");
	public String playerOneName = JOptionPane.showInputDialog("Who will be Player One?");
	JButton[][] topButtonsOne;
	JButton[][] bottomButtonsOne;
	int shipsRemainingTwo = 5;
	int hitPointsOne = 17;
	
	JFrame fieldTwo = new JFrame("Player Two"); //Objects for Player Twos window
	JPanel topPanelTwo = new JPanel();
	JPanel bottomPanelTwo = new JPanel();
	JLabel shipsRemainingOneLabel = new JLabel("Enemy Ships Remaining: ");
	JLabel playerTwoNameLabel = new JLabel("Player Two: ");
	public String playerTwoName = JOptionPane.showInputDialog("Who will be Player Two?");
	JButton[][] topButtonsTwo;
	JButton[][] bottomButtonsTwo;
	int shipsRemainingOne = 5;
	int hitPointsTwo = 17;
	
	Dimension buttonSize = new Dimension(40, 40);
	
	Sea sea;
	BattleShipMouseListener mouseListener;
	BattleShipActionListener actionListener;
	BattleShipHelper helper;
	
	public BattleShip() {
		helper = new BattleShipHelper(this);
		actionListener = new BattleShipActionListener(this, helper);
		mouseListener = new BattleShipMouseListener(this, helper);
		init();
	}
	
	void init() {
		topButtonsOne = new JButton[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				JButton currentButton = new JButton();
				topButtonsOne[i][j] = currentButton;
				currentButton.setPreferredSize(buttonSize);
				currentButton.setMaximumSize(buttonSize);
				currentButton.setMinimumSize(buttonSize);
				currentButton.addMouseListener(mouseListener);
				currentButton.setEnabled(true);
				currentButton.setText("");
				currentButton.setIcon(null);
			}
		}
		bottomButtonsOne = new JButton[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				JButton currentButton = new JButton();
				bottomButtonsOne[i][j] = currentButton;
				currentButton.setPreferredSize(buttonSize);
				currentButton.setMaximumSize(buttonSize);
				currentButton.setMinimumSize(buttonSize);
				currentButton.addMouseListener(mouseListener);
				currentButton.setEnabled(true);
				currentButton.setText("");
				currentButton.setIcon(null);
			}
		}
		topButtonsTwo = new JButton[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				JButton currentButton = new JButton();
				topButtonsTwo[i][j] = currentButton;
				currentButton.setPreferredSize(buttonSize);
				currentButton.setMaximumSize(buttonSize);
				currentButton.setMinimumSize(buttonSize);
				currentButton.addMouseListener(mouseListener);
				currentButton.setEnabled(true);
				currentButton.setText("");
				currentButton.setIcon(null);
			}
		}
		bottomButtonsTwo = new JButton[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				JButton currentButton = new JButton();
				bottomButtonsTwo[i][j] = currentButton;
				currentButton.setPreferredSize(buttonSize);
				currentButton.setMaximumSize(buttonSize);
				currentButton.setMinimumSize(buttonSize);
				currentButton.addMouseListener(mouseListener);
				currentButton.setEnabled(true);
				currentButton.setText("");
				currentButton.setIcon(null);
			}
		}
		topPanelOne.setLayout(new GridLayout(rows, columns));
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				topPanelOne.add(topButtonsOne[i][j]);
			}
		}
		bottomPanelOne.setLayout(new GridLayout(rows, columns));
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				bottomPanelOne.add(bottomButtonsOne[i][j]);
			}
		}
		topPanelTwo.setLayout(new GridLayout(rows, columns));
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				topPanelTwo.add(topButtonsTwo[i][j]);
			}
		}
		bottomPanelTwo.setLayout(new GridLayout(rows, columns));
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				bottomPanelTwo.add(bottomButtonsTwo[i][j]);
			}
		}
		sea = new Sea(rows, columns, playerOneName, playerTwoName);
	}
	private void addAndArrangePanels(JFrame fieldOne) {
		Border paddingBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		JPanel controlPanelOne = new JPanel();
		shipsRemainingTwoLabel.setBorder(paddingBorder);
		shipsRemainingTwoLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		playerOneNameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		playerOneNameLabel.setBorder(paddingBorder);
		playerOneNameLabel.setText("Player One: " + playerOneName);
		controlPanelOne.add(shipsRemainingTwoLabel);
		controlPanelOne.add(playerOneNameLabel);
		GridLayout gridLayout = new GridLayout(1,2);
		controlPanelOne.setLayout(gridLayout);
		fieldOne.getContentPane().add(controlPanelOne);
		fieldOne.getContentPane().add(topPanelOne);
		fieldOne.getContentPane().add(bottomPanelOne);
	}
	private void addAndArrangePanelsTwo(JFrame fieldTwo) {
		Border paddingBorderTwo = BorderFactory.createEmptyBorder(5,5,5,5);
		JPanel controlPanelTwo = new JPanel();
		shipsRemainingOneLabel.setBorder(paddingBorderTwo);
		shipsRemainingTwoLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		playerTwoNameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		playerTwoNameLabel.setBorder(paddingBorderTwo);
		String playerTwoName = JOptionPane.showInputDialog("Who will be Player Two?");
		playerTwoNameLabel.setText("Player Two: " + playerTwoName);
		controlPanelTwo.add(shipsRemainingOneLabel);
		controlPanelTwo.add(playerTwoNameLabel);
		GridLayout gridLayoutTwo = new GridLayout(1,2);
		controlPanelTwo.setLayout(gridLayoutTwo);
		fieldTwo.getContentPane().add(controlPanelTwo);
		fieldTwo.getContentPane().add(topPanelTwo);
		fieldTwo.getContentPane().add(bottomPanelTwo);
	}
	
	private void addMenu(JFrame fieldOne) {
		JMenu game = new JMenu("Game");
		game.setMnemonic('G');
		JMenuItem newGame = new JMenuItem("New Game");
		newGame.setMnemonic('n');
		newGame.addActionListener(actionListener);
		game.add(newGame);
		JMenuItem exitGame = new JMenuItem("Exit Game");
		exitGame.setMnemonic('x');
		exitGame.addActionListener(actionListener);
		game.add(exitGame);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(game);
		fieldOne.setJMenuBar(menuBar);
	}
	
	private void addMenuTwo(JFrame fieldTwo) {
		JMenu game = new JMenu("Game");
		game.setMnemonic('G');
		JMenuItem newGame = new JMenuItem("New Game");
		newGame.setMnemonic('n');
		newGame.addActionListener(actionListener);
		game.add(newGame);
		JMenuItem exitGame = new JMenuItem("Exit Game");
		exitGame.setMnemonic('x');
		exitGame.addActionListener(actionListener);
		game.add(exitGame);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(game);
		fieldTwo.setJMenuBar(menuBar);
	}
	
	private void createAndShowGUI() {
		fieldOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fieldOne.getContentPane().setLayout(new BoxLayout(fieldOne.getContentPane(), BoxLayout.Y_AXIS));
		fieldTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fieldTwo.getContentPane().setLayout(new BoxLayout(fieldTwo.getContentPane(), BoxLayout.Y_AXIS));
		
		addAndArrangePanels(fieldOne);
		addAndArrangePanelsTwo(fieldTwo);
		addMenu(fieldOne);
		addMenuTwo(fieldTwo);
		
		//Sea.FieldData(fieldOne, fieldTwo, topPanelOne, bottomPanelOne, topPanelTwo, bottomPanelTwo);
		
		fieldOne.pack();
		fieldOne.setVisible(true);
		fieldTwo.pack();
		fieldTwo.setVisible(true);
	}
	public static void main(String[] args) {
		BattleShip battleShip = new BattleShip();
		battleShip.createAndShowGUI();
	}
}