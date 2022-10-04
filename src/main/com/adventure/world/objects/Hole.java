package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class Hole {
    private HoleContent holeContent;
    /**
     * Creates a hole with the given content.
     * @param content - the item that is covered by the hole.
     */
    public Hole(Key content) {
        this.holeContent = new HoleContent(content);

    }

    public boolean isCovered() {
        //TODO This value should come from HoleContent
        return this.holeContent.isCovered();
    }

    /**
     * Uncovers the hole. If applicable, the contents are now revealed.
     */
    public void dig() {
        //TODO this function should update HoleContent's isCovered property.
        this.holeContent.setIsCovered(false);

    }

    /**
     * If the HoleContent is uncovered, return the key. Otherwise, return null.
     * @return the key if the hole is uncovered.
     */
    private Key getKeyIfPossible() {
        if (!this.holeContent.isCovered()) {
            return this.holeContent.getKey();
        } else {
            return null;
        }
    }
    //TODO Get the HoleContent's content only if the hole is uncovered.


    /**
     * If the HoleContent is uncovered, return the content. Otherwise, return null.
     * @return - the content if the hole is uncovered.
     */
    public Tangible getContent() {
        if (!this.holeContent.isCovered()) {
            return getKeyIfPossible();
        } else {
            return null;
        }
    }
}
