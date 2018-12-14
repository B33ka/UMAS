package ge.umas.emis.models;

import ge.umas.etl.Etl;

public class VetStudent {

	private String firstName;

	private String lastName;

	private String personalNumber;

	private String dateOfBirth;

	private String gender;

	private String legalAddress;

	private String actualAddress;

	private String education;

	private String collegeName;

	private String programName;

	private String step;

	private String studentStatus;

	private String citizenship;
	
    public void ETL() {
        firstName = Etl.ParseValidNameString(firstName);
        lastName = Etl.ParseValidNameString(lastName);
        personalNumber = Etl.ParseValidTextString(personalNumber);
        dateOfBirth = Etl.ParseDate(dateOfBirth);
        gender = Etl.ParseLong(gender);
        legalAddress = Etl.ParseValidTextString(legalAddress);
        actualAddress = Etl.ParseValidTextString(actualAddress);
        education = Etl.ParseValidTextString(education);
        collegeName = Etl.ParseValidTextString(collegeName);
        programName = Etl.ParseValidTextString(programName);
        step = Etl.ParseLong(step);
        studentStatus = Etl.ParseValidTextString(studentStatus);
        citizenship = Etl.ParseValidTextString(citizenship);
        ETL2();
    }

    private void ETL2() {
    }

    public boolean RemoveObject() {
        boolean result = false;
        return result;
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

	public String getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
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

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
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

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	@Override
	public String toString() {
		return "ClassPojo [legalAddress = " + legalAddress + ", dateOfBirth = " + dateOfBirth + ", lastName = "
				+ lastName + ", studentStatus = " + studentStatus + ", actualAddress = " + actualAddress + ", gender = "
				+ gender + ", citizenship = " + citizenship + ", education = " + education + ", firstName = "
				+ firstName + ", collegeName = " + collegeName + ", step = " + step + ", personalNumber = "
				+ personalNumber + ", programName = " + programName + "]";
	}

}
