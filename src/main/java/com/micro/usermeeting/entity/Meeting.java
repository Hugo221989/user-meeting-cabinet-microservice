package com.micro.usermeeting.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name="meeting")
public class Meeting implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 20)
	private String title;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	private Date start;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	private Date end;
	
	@Column(name="color_primary")
	private String colorPrimary;
	
	@Column(name="color_secondary")
	private String colorSecondary;
	
	private String description;
	
	private String location;
	
	private boolean mode;
	
	@Column(name="id_student")
	private Long idStudent;
	
	@Column(name="student_name")
	private String studentName;

	public Meeting() {

	}	

	public Meeting(Long id, @Size(max = 20) String title, Date start, Date end, String colorPrimary,
			String colorSecondary, String description, String location, boolean mode, Long idStudent,
			String studentName) {
		super();
		this.id = id;
		this.title = title;
		this.start = start;
		this.end = end;
		this.colorPrimary = colorPrimary;
		this.colorSecondary = colorSecondary;
		this.description = description;
		this.location = location;
		this.mode = mode;
		this.idStudent = idStudent;
		this.studentName = studentName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	public String getColorPrimary() {
		return colorPrimary;
	}

	public void setColorPrimary(String colorPrimary) {
		this.colorPrimary = colorPrimary;
	}

	public String getColorSecondary() {
		return colorSecondary;
	}

	public void setColorSecondary(String colorSecondary) {
		this.colorSecondary = colorSecondary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isMode() {
		return mode;
	}

	public void setMode(boolean mode) {
		this.mode = mode;
	}

	public Long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	

}
