package Person;

import Utils.Speciality;

public class Doctor extends Person implements Cloneable {
  public Integer crm;
  public double payment;
  public Speciality doctorSpeciality;

  public Doctor(Person sup, Speciality doctorSpeciality, double pays, Integer crm) {
    super(sup);
    this.doctorSpeciality = doctorSpeciality;
    this.payment = pays;
    this.crm = crm;
  }

  public Doctor(Doctor other) {
    super((Person) other);
    this.crm = other.crm;
    this.payment = other.payment;
    this.doctorSpeciality = other.doctorSpeciality;
  }

  @Override
  public Doctor clone() {
    try {
      return (Doctor) super.clone();

    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  @Override
  public String toString() {
    return this.crm + ", " + this.crm + "," + this.payment;
  }



}
