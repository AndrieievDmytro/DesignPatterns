package main

import "time"

type Doctor struct {
	Name            string    `json:"Doctor name"`
	Surname         string    `json:"Doctor surname"`
	Specialization  string    `json:"Doctor specialization"`
	AppointmentTime time.Time `json:"Appointment time"`
	Hospital        Hospital  `json:"Hospital"`
}
