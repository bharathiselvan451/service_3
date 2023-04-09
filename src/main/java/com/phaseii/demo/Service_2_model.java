package com.phaseii.demo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Service_2_model {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String mail;
	String name;
	LocalDate date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Service_2_model [id=" + id + ", mail=" + mail + ", name=" + name + ", date=" + date + ", expense="
				+ expense + ", budget=" + budget + "]";
	}
	int expense;
	int budget;
	

}
