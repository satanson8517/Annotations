package com.avg.mne.annotations;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com>
 */
public interface House {
    @Deprecated
    void open();
    void openFrontDoor();
    void openBackDoor();
}
