package ge.umas.emis.models;

import ge.umas.etl.Etl;

public class Personnel {
	private String firstName;

	private String lastName;

	private String personalNumber;

	private String dateOfBirth;

	private String gender;

	private String citizenship;

	private String legalAddress;

	private String actualRegion;

	private String actualDistrict;

	private String actualAddress;

	private String position;

	private String schoolName;

	private String status;

	public void ETL() {
		firstName = Etl.ParseValidNameString(firstName);
		lastName = Etl.ParseValidNameString(lastName);
		personalNumber = Etl.ParseValidTextString(personalNumber);
		dateOfBirth = Etl.ParseDate(dateOfBirth);
		gender = Etl.ParseLong(gender);
		legalAddress = Etl.ParseValidTextString(legalAddress);
		actualRegion = Etl.ParseValidTextString(actualRegion);
		actualDistrict = Etl.ParseValidTextString(actualDistrict);
		actualAddress = Etl.ParseValidTextString(actualAddress);
		schoolName = Etl.ParseValidTextString(schoolName);
		position = Etl.ParseValidTextString(position);
		citizenship = Etl.ParseValidTextString(citizenship);
		status = Etl.ParseLong(status);
		ETL2();
	}

	private void ETL2() {
	}

	public boolean RemoveObject() {
		boolean result = false;
		return result;
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

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getActualAddress() {
		return actualAddress;
	}

	public void setActualAddress(String actualAddress) {
		this.actualAddress = actualAddress;
	}

	public String getActualRegion() {
		return actualRegion;
	}

	public void setActualRegion(String actualRegion) {
		this.actualRegion = actualRegion;
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

	public String getActualDistrict() {
		return actualDistrict;
	}

	public void setActualDistrict(String actualDistrict) {
		this.actualDistrict = actualDistrict;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

}
