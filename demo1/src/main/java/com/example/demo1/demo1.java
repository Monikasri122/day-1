package com.example.demo1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laptop")

public class demo1 {
	@Id
	@Column(name="lname")
	private String lapname;
	@Column(name="stylname")
	private String stylname;
	@Column(name=" RAM")
	private String RAM;
	@Column(name="price")
	private int price;
	@Column(name="colour")
	private String colour;
	@Column(name="inch")
	private int inch;
	@Column(name="modal")
	private String modal;
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public String getStylname() {
		return stylname;
	}
	public void setStylname(String stylname) {
		this.stylname = stylname;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getModal() {
		return modal;
	}
	public void setModal(String modal) {
		this.modal = modal;
	}
	
	
	

}
