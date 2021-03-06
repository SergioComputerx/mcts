
package logging;

/**
 * @author Radek
 *
 */
public class Messages {

	public static final String LINE_WITH_TEXT = "----------------------%s----------------------\n";
	public static final String LINE = "\n------------------------------------------------\n";

	public static final String PLAYER_INSTRUCTION = "Play card: 'play <number of card in hand>' \n"
			+ "Attack: 'attack <number of attacking minion> <number of target (-1 for hero)>' \n"
			+ "End turn: 'end' \n";

	public static final String CHOOSE_TARGET = "Choose number oftarget (-1 for hero): ";
	public static final String WRONG_COMMAND = "Wrong command. Please repeat.";
	public static final String CURRENT_PLAYER = "Current player: %s";
	public static final String PLAYER_STATISTICS = "Mana:%d, HP:%d/%d \n";
	public static final String MINION_STATISTICS = "%s, M:%d, HP:%d/%d, Atk:%d";
	public static final String SPELL_STATISTICS = "%s, M:%d, %s";

	public static final String END_TURN = "Turn has ended!";

	// Errors
	public static final String ERROR_MARKER = "[ERROR] %s";
	public static final String LOG_FILE_CREATE_EXCEPTION = "Exception while creating log file.";
	public static final String TAUNT_ON_THE_BOARD = "You must attack a minion with Taunt";
	public static final String NOT_ENOUGH_MANA = "You don't have enough mana to play card %s";

	// Effects
	public static final String TAUNT_EFFECT = "taunt";
	public static final String MINION_DESTROY_EFFECT = "minion destroy";
	public static final String HEAL_EFFECT = "heal";
	public static final String DAMAGE_EFFECT = "damage";
}
