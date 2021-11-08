package main

import "time"

type Surgeon struct {
	Name            string
	Surname         string
	Specialization  string
	AppointmentTime time.Time
	DiplomaNumber   int
	Hospital        Hospital
}

func (surgeon *Surgeon) setAppointmentTime() {
	surgeon.AppointmentTime = time.Now()
}

func (surgeon *Surgeon) setName() {
	surgeon.Name = "John"
}

func (surgeon *Surgeon) setSurname() {
	surgeon.Surname = "Smith"
}

func (surgeon *Surgeon) setSpecialization() {
	surgeon.Specialization = "Surgeon"
}

func (surgeon *Surgeon) setHospital() {
	surgeon.Hospital = Hospital{
		Name: "Knife Master",
		Adr: Adress{
			Street:         "Str Street",
			BuildingNumber: "20",
			City:           "Warsaw",
			Country:        "Poland",
			PostalCode:     "02-298",
		},
	}
}

func (surgeon *Surgeon) getAppointment() Doctor {
	return Doctor{
		Name:            surgeon.Name,
		Surname:         surgeon.Surname,
		Specialization:  surgeon.Specialization,
		AppointmentTime: surgeon.AppointmentTime,
		Hospital:        surgeon.Hospital,
	}
}
