public class Customer {
    private String myFirstName;
    private String myLastName;
    private String myPhone;
    private String myGender;
    private String myAllergies;
    private String myDOB;
    private String myEmail;
    private String myAddress;
    private String myCautionDetails;

    public Customer( final String firstName,
                     final String lastName,
                     final String phone,
                     final String gender,
                     final String allergies,
                     final Date DOB,
                     final String email,
                     final String address,
                     final String cautionDetails ) {
        myFirstName = firstName;
        myLastName = lastName;
        myPhone = phone;
        myGender = gender;
        myAllergies = allergies;
        myDOB = DOB;
        myEmail = email;
        myAddress = address;
        myCautionDetails = cautionDetails;
    }

    public void setFirstName( final String firstName ) {
        myFirstName = firstName;
    }

    public String getFirstName() {
        return myFirstName;
    }

    public void setLastName( final String lastName ) {
        myLastName = lastName;
    }

    public String getLastName() {
        return myLastName;
    }

    public void setPhone( final String phone ) {
        myPhone = phone;
    }

    public String getPhone() {
        return myPhone;
    }

    public void setGender( final String gender ) {
        myGender = gender;
    }

    public String getGender() {
        return myGender;
    }

    public void setAllergies( final String allergies ) {
        myAllergies = allergies;
    }

    public String getAllergies() {
        return myAllergies;
    }

    public void setDOB( final Date DOB ) {
        myDOB = DOB;
    }

    public Date getDOB() {
        return myDOB;
    }

    public void setEmail( final String email ) {
        myEmail = email;
    }

    public String getEmail() {
        return myEmail;
    }

    public void setAddress( final String address ) {
        myAddress = address;
    }

    public String getAddress() {
        return myAddress;
    }

    public void setCautionDetails( final String cautionDetails ) {
        myCautionDetails = cautionDetails;
    }

    public String getAddress() {
        return myCautionDetails;
    }
}
