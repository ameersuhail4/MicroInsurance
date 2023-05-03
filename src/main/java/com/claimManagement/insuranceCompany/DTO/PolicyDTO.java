package com.claimManagement.insuranceCompany.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PolicyDTO {
    @Column(name = "policyNo",
            length = 7
    )
    private String policyNo;

    @NotNull

    @Size(min = 5,message = "must be minimum 5 characters")
    private String insuredFirstName;

    @NotNull
    @Size(min = 5,message = "must be minimum 5 characters")
    private String insuredLastName;

    @NotNull
    @PastOrPresent(message = "must not be earlier than current date")
    private LocalDate dateOfInsurance;

    @NotNull
    private String emailId;

    @NotNull
    private String vehicleNo;

    @NotNull
    private boolean status;

    public PolicyDTO() {

    }
}
