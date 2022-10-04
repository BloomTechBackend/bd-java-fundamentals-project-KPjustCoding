package main.com.adventure.settings;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {

        String command = "INVALID";

        if (verbString.equalsIgnoreCase("take")) {
            command = "TAKE";
        }
        if (verbString.equalsIgnoreCase("move")) {
            command = "MOVE";
        }
        if (verbString.equalsIgnoreCase("use")) {
            command = "USE";
        }
        if (verbString.equalsIgnoreCase("dig")) {
            command = "DIG";
        }
        if (verbString.equalsIgnoreCase("examine")) {
            command = "EXAMINE";
        }
        if (verbString.equalsIgnoreCase("look")) {
            command = "LOOK";
        }
        if (verbString.equalsIgnoreCase("help")) {
            command = "HELP";
        }
        if (verbString.equalsIgnoreCase("fight")) {
            command = "FIGHT";
        }
        if (verbString.equalsIgnoreCase("inventory")) {
            command = "INVENTORY";
        }
        if (verbString.equalsIgnoreCase("move")) {
            command = "MOVE";
        }

        return CommandVerb.valueOf(command);
    }

}
