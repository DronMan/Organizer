package com.company.timetable.web.screens.bus;

import com.haulmont.cuba.gui.screen.*;
import com.company.timetable.entity.Bus;

@UiController("timetable_Bus.edit")
@UiDescriptor("bus-edit.xml")
@EditedEntityContainer("busDc")
@LoadDataBeforeShow
public class BusEdit extends StandardEditor<Bus> {
}