package io.github.sefiraat.emctech.managers;

import io.github.sefiraat.emctech.EmcTech;
import io.github.sefiraat.emctech.runnables.SaveConfigRunnable;

public class RunnableManager {

    public RunnableManager() {
        final SaveConfigRunnable saveConfigRunnable = new SaveConfigRunnable();

        EmcTech.getFoliaLib().getScheduler().runTimer(saveConfigRunnable, 1, 12000);
    }
}
