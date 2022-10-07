package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {

        // Player Health
        // Monsters Health
        // Players Power
        // Monsters Health

        int playersHealth = this.player.getHealth();
        int monstersHealth = this.monster.getHealth();
        int playersPower = this.player.getPower();
        int monstersPower = this.monster.getPower();

        while (playersHealth >= 0 && monstersHealth >= 0) {
            monstersHealth -= playersPower;
            this.monster.setHealth(monstersHealth);
            if (monstersHealth <= 0) {
                break;
            }
            playersHealth -= monstersPower;
            this.player.setHealth(playersHealth);
            }
    }


    public boolean isPlayerDefeated() {
        boolean isDefeated = false;
        if (this.player.getHealth() <= 0) {
            isDefeated = true;
        }
        return isDefeated;
    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
    this.player.setHealth(10);
    this.monster.setHealth(10);

    }
}
