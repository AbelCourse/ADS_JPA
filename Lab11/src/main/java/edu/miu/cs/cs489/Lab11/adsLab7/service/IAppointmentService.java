package edu.miu.cs.cs489.Lab11.adsLab7.service;

import edu.miu.cs.cs489.Lab11.adsLab7.models.Appointment;

import java.util.List;

public interface IAppointmentService {
    Appointment save(Appointment appointment);

    List<Appointment> findAll();
}