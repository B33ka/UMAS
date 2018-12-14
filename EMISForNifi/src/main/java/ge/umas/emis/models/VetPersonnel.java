package ge.umas.emis.models;

import ge.umas.etl.Etl;

public class VetPersonnel {

	private String firstName;

	private String lastName;

	private String personalNumber;

	private String dateOfBirth;

	private String gender;

	private String legalAddress;

	private String actualAddress;

	private String collegeName;

	private String position;

	private String citizenship;

	private String isTeacher;

	public void ETL() {
		firstName = Etl.ParseValidNameString(firstName);
		lastName = Etl.ParseValidNameString(lastName);
		personalNumber = Etl.ParseValidTextString(personalNumber);
		dateOfBirth = Etl.ParseDate(dateOfBirth);
		gender = Etl.ParseLong(gender);
		legalAddress = Etl.ParseValidTextString(legalAddress);
		actualAddress = Etl.ParseValidTextString(actualAddress);
		collegeName = Etl.ParseValidTextString(collegeName);
		position = Etl.ParseValidTextString(position);
		citizenship = Etl.ParseValidTextString(citizenship);
		isTeacher = Etl.ParseLong(isTeacher);
		ETL2();
	}

	private void ETL2() {
	}

	public boolean RemoveObject() {
		boolean result = false;
		return result;
	}

	public String getIsTeacher() {
		return isTeacher;
	}

	public void setIsTeacher(String isTeacher) {
		this.isTeacher = isTeacher;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLegalAddress() {
		return legalAddress;
	}

	public void setLegalAddress(String legalAddress) {
		this.legalAddress = legalAddress;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getActualAddress() {
		return actualAddress;
	}

	public void setActualAddress(String actualAddress) {
		this.actualAddress = actualAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

}
