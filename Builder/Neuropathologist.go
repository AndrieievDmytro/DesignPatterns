package main

import "time"

type Neuropathologist struct {
	Name            string
	Surname         string
	Specialization  string
	AppointmentTime time.Time
	DiplomaNumber   int
	Hospital        Hospital
}

func (neur *Neuropathologist) setAppointmentTime() {
	neur.AppointmentTime = time.Now()
}

func (neur *Neuropathologist) setName() {
	neur.Name = "John"
}

func (neur *Neuropathologist) setSurname() {
	neur.Surname = "Smith"
}

func (neur *Neuropathologist) setSpecialization() {
	neur.Specialization = "Neuropathologist"
}

func (neur *Neuropathologist) setHospital() {
	neur.Hospital = Hospital{
		Name: "Smile",
		Adr: Adress{
			Street:         "Smile Street",
			BuildingNumber: "20",
			City:           "Warsaw",
			Country:        "Poland",
			PostalCode:     "02-298",
		},
	}
}

func (neur *Neuropathologist) getAppointment() Doctor {
	return Doctor{
		Name:            neur.Name,
		Surname:         neur.Surname,
		Specialization:  neur.Specialization,
		AppointmentTime: neur.AppointmentTime,
		Hospital:        neur.Hospital,
	}
}
