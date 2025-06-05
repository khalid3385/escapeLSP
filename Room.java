package org.example.hints;

import org.example.Player;

public abstract class Room {
    private String hint;

    public Room(String hint) {
        this.hint = hint;
    }

    public void revealHint() {
        System.out.println("Hint: " + hint);
    }

    public abstract void enter(Player player);
}
