package main

import "time"

type Dentist struct {
	Name            string
	Surname         string
	Specialization  string
	AppointmentTime time.Time
	DiplomaNumber   int
	Hospital        Hospital
}

func (dentist *Dentist) setAppointmentTime() {
	dentist.AppointmentTime = time.Now()
}

func (dentist *Dentist) setName() {
	dentist.Name = "John"
}

func (dentist *Dentist) setSurname() {
	dentist.Surname = "Smith"
}

func (dentist *Dentist) setSpecialization() {
	dentist.Specialization = "Dentist"
}

func (dentist *Dentist) setHospital() {
	dentist.Hospital = Hospital{
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

func (dental *Dentist) getAppointment() Doctor {
	return Doctor{
		Name:            dental.Name,
		Surname:         dental.Surname,
		Specialization:  dental.Specialization,
		AppointmentTime: dental.AppointmentTime,
		Hospital:        dental.Hospital,
	}
}
