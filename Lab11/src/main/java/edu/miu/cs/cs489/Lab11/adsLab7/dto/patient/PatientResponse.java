package edu.miu.cs.cs489.Lab11.adsLab7.dto.patient;

import edu.miu.cs.cs489.Lab11.adsLab7.models.Address;
import edu.miu.cs.cs489.Lab11.adsLab7.models.Appointment;


import java.util.List;

public record PatientResponse(
        Long patNo,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        Address address,
        List<Appointment> appointments
) {
}
