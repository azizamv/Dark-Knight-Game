## Dark Knight
Dark Knight is a game where players battle enemies like Goblins and Thieves. Players can equip items dropped by defeated enemies.

* The game consists of Entity such as Player, Goblin and Thief. Player is limited to possessing only one item.
* The items that is dropped by the enemies consists of: Excalibur (Increase damage by 10%) and Ring of Health (Increase HP by 40)
* While the player is alive, the player and enemy will take turns to attack each other where the damage is randomized between 0 – Base Attack. Every turn, Thief has a 25% chance to remove the player’s item.
* Every time the enemy died, reset the player’s HP and initialize a new enemy between Goblin and Thief. If the player doesn’t have any item, the player has a 25% chance of obtaining a random item between excalibur and ring of health.  Excalibur will increase the player’s damage by 10% and ring of health will increase the player’s HP by 40.
* If the player has no health left, player died.

The objective of this application is to implement OOP in a Java game program.
