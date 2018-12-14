package ge.umas.emis.models;

import java.util.List;

import ge.umas.etl.Etl;

public class Student {

	private String firstName;

	private String lastName;

	private String personalNumber;

	private String dateOfBirth;

	private String gender;

	private String legalAddress;

	private String schoolName;

	private String classNumber;

	private String status;

	private String citizenship;

	private List<Parent> parents;

	public void ETL() {
		firstName = Etl.ParseValidNameString(firstName);
		lastName = Etl.ParseValidNameString(lastName);
		personalNumber = Etl.ParseValidTextString(personalNumber);
		dateOfBirth = Etl.ParseDate(dateOfBirth);
		gender = Etl.ParseLong(gender);
		legalAddress = Etl.ParseValidTextString(legalAddress);
		schoolName = Etl.ParseValidTextString(schoolName);
		classNumber = Etl.ParseValidTextString(classNumber);
		status = Etl.ParseValidTextString(status);
		citizenship = Etl.ParseValidTextString(citizenship);
		if (parents != null) {
			int count = parents.size();
			for (int i = 0; i < count; i++) {
				Parent par = parents.get(i);
				par.ETL();
				if (parents.get(i).RemoveObject()) {
					parents.remove(i);
				}
			}
		}
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

	public List<Parent> getParents() {
		return parents;
	}

	public void setParents(List<Parent> parents) {
		this.parents = parents;
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

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
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

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	protected class Parent {
		private String firstName;

		private String lastName;

		private String parentType; // Null

		private String personalNumber;

		private String dateOfBirth;

		private String gender;

		private String legalAddress;

		private String actualRegion;// ":"თბილისი";

		private String actualDistrict;// ":"დიდუბე-ჩუღურეთი"

		private String actualAddress;

		private String citizenship;

		public void ETL() {
			firstName = Etl.ParseValidNameString(firstName);
			lastName = Etl.ParseValidNameString(lastName);
			parentType = Etl.ParseValidTextString(parentType);
			personalNumber = Etl.ParseValidTextString(personalNumber);
			dateOfBirth = Etl.ParseDate(dateOfBirth);
			gender = Etl.ParseLong(gender);
			legalAddress = Etl.ParseValidTextString(legalAddress);
			actualRegion = Etl.ParseValidTextString(actualRegion);
			actualDistrict = Etl.ParseValidTextString(actualDistrict);
			actualAddress = Etl.ParseValidTextString(actualAddress);
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

		public String getParentType() {
			return parentType;
		}

		public void setParentType(String parentType) {
			this.parentType = parentType;
		}
	}

}