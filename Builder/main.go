package main

import (
	"encoding/json"
	"fmt"
	"os"
)

func errCheck(err error) {
	if err != nil {
		fmt.Println(err)
	}
}

func (d *Doctor) writeToFileJson(filePath string) {
	t, err1 := json.Marshal(d)
	errCheck(err1)
	err2 := os.WriteFile(filePath, t, 0644)
	errCheck(err2)
}

func main() {

	dentist := getDoctor("toothache")
	masseur := getDoctor("sprain")
	neur := getDoctor("Alzheimer")
	surg := getDoctor("operation")

	therapist := newTherapist(dentist)
	dentistAppointment := therapist.makeAppointment()
	dentistAppointment.writeToFileJson("Appointments/dentist.json")

	therapist1 := newTherapist(masseur)
	masseurAppointment := therapist1.makeAppointment()
	masseurAppointment.writeToFileJson("Appointments/masseur.json")

	therapist2 := newTherapist(neur)
	neurAppointment := therapist2.makeAppointment()
	neurAppointment.writeToFileJson("Appointments/neur.json")

	therapist3 := newTherapist(surg)
	surgAppointment := therapist3.makeAppointment()
	surgAppointment.writeToFileJson("Appointments/surg.json")

}
