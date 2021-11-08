package main

type Therapist struct {
	doctor IDoctor
}

func newTherapist(d IDoctor) *Therapist {
	return &Therapist{
		doctor: d,
	}
}

func (t *Therapist) makeAppointment() Doctor {
	t.doctor.setName()
	t.doctor.setAppointmentTime()
	t.doctor.setSurname()
	t.doctor.setSpecialization()
	t.doctor.setHospital()
	return t.doctor.getAppointment()
}
