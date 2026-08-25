package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "has joined a meeting that could have been an email",
            "keeps emergency snacks at their desk",
            "has said 'you're on mute' this week",
            "has a favorite meeting-free day",
            "has renamed a file FINAL-final-v3",
            "has a very strong opinion about office coffee",
            "has accidentally replied all",
            "has a lucky pen or notebook",
            "has attended a meeting while wearing slippers",
            "has a desk plant with a name",
            "has used a spreadsheet for something unexpected",
            "has sent a message to the wrong chat",
            "can explain their job using only movie titles",
            "has a go-to focus playlist",
            "has taken a snack break before starting work",
            "has a surprisingly organized desktop",
            "has used a GIF to make a work point",
            "has a favorite office supply",
            "has turned a typo into an inside joke",
            "has a creative video-call background",
            "has solved a problem with a workaround",
            "has a personal system for unread emails",
            "can teach a five-second desk stretch",
            "has a work-from-home story worth sharing"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
