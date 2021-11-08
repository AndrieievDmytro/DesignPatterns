package main

type IDoctor interface {
	setName()
	setSurname()
	setSpecialization()
	setHospital()
	setAppointmentTime()
	getAppointment() Doctor
}

func getDoctor(reason string) IDoctor {
	switch reason {
	case "toothache":
		return &Dentist{}
	case "sprain":
		return &Masseur{}
	case "Alzheimer":
		return &Neuropathologist{}
	case "operation":
		return &Surgeon{}
	}
	return nil
}
