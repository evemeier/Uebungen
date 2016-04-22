/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressbook;

/**
 *
 * @author eve
 */
public class AddressEntry
{
    private String givenName, familyName;
    private String zipCode;
    private String residence;
    private String phoneNumber;
    private String eMailAddress;

    public AddressEntry()
    {

    }

    public AddressEntry(String givenName, String familyName, 
                        String zipCode, String residence, 
                        String phoneNumber, String eMailAddress)
    {

    }

    public void setGivenName(String givenName)
    {

    }

    public void setFamilyName(String familyName)
    {

    }

    public void setZipCode(String zipCode) throws Exception
    {
        if(zipCode == null)  throw new IllegalArgumentException(zipCode + " is null");
        if(zipCode.length() != 4) throw new NumberFormatException(zipCode + " is not vierstellig");
    }

    public void setResidence(String residence)
    {

    }

    public void setPhoneNumber(String phoneNumber)
    {

    }

    public void setEmailAddress(String eMailAdresse) throws InvalidEmailException
    {
        if(!eMailAdresse.contains("@")) throw new InvalidEmailException(eMailAdresse + " contains no @");
    }
}
