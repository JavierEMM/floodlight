package net.floodlightcontroller.mactracker;

import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.core.types.SwitchMessagePair;

import java.util.Set;

public interface IMACTrackerService extends IFloodlightService {
    public StringClass getMacAdresses();
}
