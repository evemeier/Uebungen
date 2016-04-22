package adressbook;
import java.util.ArrayList;

public class AddressBook
{
    ArrayList<AddressEntry> list;
    public AddressBook()
    { 
        list = new ArrayList<AddressEntry>();
    }

    public void tester() throws Exception
    {
        AddressEntry a = new AddressEntry();
        a.setGivenName("Hans");
        
        a.setFamilyName("Muster");
        try {
            a.setZipCode("73698");
                       
        }
        catch (NumberFormatException e) {
          System.out.println(e + " Mumu"); 
        }
        catch (IllegalArgumentException e) {
          System.out.println(e + " Penis");
        }
        
            
        a.setResidence("Horw");
        a.setPhoneNumber("+41413391111");
        try{
            a.setEmailAddress("Hans.Musteratinfo.com");
        } catch (InvalidEmailException e){
            System.out.println(e + " Transe");
        }
        
        

        list.add(a);
    }
}
