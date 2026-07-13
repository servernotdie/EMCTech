package io.github.sefiraat.emctech.runnables;

import io.github.sefiraat.emctech.managers.ConfigManager;

public class SaveConfigRunnable implements Runnable {

    @Override
    public void run() {
        ConfigManager.getInstance().saveAll();
    }
}
