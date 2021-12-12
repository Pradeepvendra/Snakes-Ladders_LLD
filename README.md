# Snakes-Ladders_LLD
<h2>Design the game of Snake & Ladder</h2>
<ul>
<li>Create a Snake and Ladder application.<br>
<li>The application should take inputs n and k from the user.<br>
<li>The game should have a board size of n.<br>
<li>There show to be k number of dice while k>=1.<br>
<li>There should be x snakes and y ladders, where x & y are taken as input from user.<br>
<li>Each snake will have its head at some number and its tail at a smaller number which are also taken from user.<br>
<li>Each ladder will have its start position at some number and end position at a larger number which are also taken from user.<br>
<li>There can be multiple players in the game.</ul>
<h2>Rules</h2>
<ul>
<li>The board has numbers from 1 to n.<br>
<li>The players will make there move turn-by-turn.<br>
<li>The game will have a k six sided dice numbered from 1 to 6 and will always give a random number on rolling them.<br>
<li>Each player has a piece which is initially kept outside the board (i.e., at position 0).<br>
<li>Each player rolls the dice when their turn comes.<br>
<li>Based on the dice value, the player moves their piece forward that number of cells. Ex: If the dice value is 4 and the player is at position 7, the player will move to position 11 (7+4).<br>
<li>A player wins if he reached the last cell in the board.<br>
<li>Whenever a player ends up at a cell with the head of the snake, the player should go down to the cell that has the tail of that snake.<br>
<li>Whenever a player ends up at a cell with the start of the ladder, the player should go up to the cell that has the end of that ladder.<br>
<li>The game should continue till anyone reach the final cell.<br>
<li>After the dice roll, if a piece is supposed to move outside position 100, it does not move.<br>
<li>Snakes and Ladders do not create a cycle.
</ul>
