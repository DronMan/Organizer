package com.company.timetable.web.screens.bus;

import com.haulmont.cuba.gui.screen.*;
import com.company.timetable.entity.Bus;

@UiController("timetable_Bus.browse")
@UiDescriptor("bus-browse.xml")
@LookupComponent("busesTable")
@LoadDataBeforeShow
public class BusBrowse extends StandardLookup<Bus> {
}