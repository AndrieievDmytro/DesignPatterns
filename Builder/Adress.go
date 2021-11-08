package main

type Adress struct {
	Street         string `json:"Street name"`
	BuildingNumber string `json:"Building number"`
	City           string `json:"City"`
	Country        string `json:"Country"`
	PostalCode     string `json:"Postal code"`
}
