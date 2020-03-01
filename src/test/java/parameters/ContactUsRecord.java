package parameters;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ContactUsRecord extends AbstractRecord {

    private String FirstName ;
    private String LastName;
    private String Email;
    private String Phone;
    private String WebsiteURL;
    private String Company;
    private String ReasonForEnquiry;
    private String Message;
}






