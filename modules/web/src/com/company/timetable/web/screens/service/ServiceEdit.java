package com.company.timetable.web.screens.service;

import com.haulmont.cuba.gui.screen.*;
import com.company.timetable.entity.Service;

@UiController("timetable_Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
@LoadDataBeforeShow
public class ServiceEdit extends StandardEditor<Service> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Service> event) {
        event.getEntity().setDuration(2);
    }
}