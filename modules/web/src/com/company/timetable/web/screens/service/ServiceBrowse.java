package com.company.timetable.web.screens.service;

import com.haulmont.cuba.gui.components.Calendar;
import com.haulmont.cuba.gui.components.EditorScreenFacet;
import com.haulmont.cuba.gui.screen.*;
import com.company.timetable.entity.Service;

import javax.inject.Inject;
import java.time.LocalDateTime;

@UiController("timetable_Service.browse")
@UiDescriptor("service-browse.xml")
@LookupComponent("servicesTable")
@LoadDataBeforeShow
public class ServiceBrowse extends StandardLookup<Service> {
    @Inject
    private EditorScreenFacet<Service, ServiceEdit> serviceEditDialog;

    @Subscribe("serviceCalendar")
    public void onServiceCalendarCalendarEventClick(Calendar.CalendarEventClickEvent<LocalDateTime> event) {
        serviceEditDialog.setEntityProvider(() -> (Service) event.getEntity());
        serviceEditDialog.show();
    }
}