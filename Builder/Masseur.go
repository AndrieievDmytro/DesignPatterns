package main

import "time"

type Masseur struct {
	Name            string
	Surname         string
	Specialization  string
	AppointmentTime time.Time
	DiplomaNumber   int
	Hospital        Hospital
}

func (masseur *Masseur) setAppointmentTime() {
	masseur.AppointmentTime = time.Now()
}

func (masseur *Masseur) setName() {
	masseur.Name = "John"
}

func (masseur *Masseur) setSurname() {
	masseur.Surname = "Smith"
}

func (masseur *Masseur) setSpecialization() {
	masseur.Specialization = "Masseur"
}

func (masseur *Masseur) setHospital() {
	masseur.Hospital = Hospital{
		Name: "Massage Master",
		Adr: Adress{
			Street:         "Str Street",
			BuildingNumber: "20",
			City:           "Warsaw",
			Country:        "Poland",
			PostalCode:     "02-298",
		},
	}
}

func (masseur *Masseur) getAppointment() Doctor {
	return Doctor{
		Name:            masseur.Name,
		Surname:         masseur.Surname,
		Specialization:  masseur.Specialization,
		AppointmentTime: masseur.AppointmentTime,
		Hospital:        masseur.Hospital,
	}
}
