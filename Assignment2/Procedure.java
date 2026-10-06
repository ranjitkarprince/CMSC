/*
 * Class: CMSC203
 * Instructor: Ahmed Tarek
 * Description: This class represents a medical procedure performed
 *              on a patient.
 * Due: 10/XX/2026
 * Platform/compiler: Eclipse / Java
 *
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Print your Name here: Prince Ranjitkar
 */

public class Procedure {

    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    /*
     * No-argument constructor.
     */
    public Procedure() {
        procedureName = "";
        procedureDate = "";
        practitionerName = "";
        charges = 0.0;
    }

    /*
     * Constructor that initializes the procedure name and date.
     */
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;

        practitionerName = "";
        charges = 0.0;
    }

    /*
     * Constructor that initializes all procedure attributes.
     */
    public Procedure(String procedureName, String procedureDate,
                     String practitionerName, double charges) {

        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    /*
     * Returns the procedure name.
     */
    public String getProcedureName() {
        return procedureName;
    }

    /*
     * Changes the procedure name.
     */
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    /*
     * Returns the procedure date.
     */
    public String getProcedureDate() {
        return procedureDate;
    }

    /*
     * Changes the procedure date.
     */
    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    /*
     * Returns the practitioner's name.
     */
    public String getPractitionerName() {
        return practitionerName;
    }

    /*
     * Changes the practitioner's name.
     */
    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    /*
     * Returns the procedure charges.
     */
    public double getCharges() {
        return charges;
    }

    /*
     * Changes the procedure charges.
     */
    public void setCharges(double charges) {
        this.charges = charges;
    }

    /*
     * Returns all information about the procedure.
     */
    @Override
    public String toString() {
        return "Procedure: " + procedureName
                + "\tDate: " + procedureDate
                + "\tPractitioner: " + practitionerName
                + "\tCharges: $" + String.format("%.2f", charges);
    }
}