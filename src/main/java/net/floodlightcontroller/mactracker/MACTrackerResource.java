package net.floodlightcontroller.mactracker;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import java.util.ArrayList;

public class MACTrackerResource extends ServerResource {
    @Get("json")
    public StringClass retrieve() {
        IMACTrackerService imts = (IMACTrackerService) getContext().getAttributes().get(IMACTrackerService.class.getCanonicalName());
        StringClass l = new StringClass();
        l = imts.getMacAdresses();
        return l;
    }

}
