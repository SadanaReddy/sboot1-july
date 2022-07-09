package patient.details.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Address {
	private String housNo;
	private String streetName;
	private String zipcode;
	private String country;

}
