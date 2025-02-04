package com.sage.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
public class JobApplicationDto {

    private JobDto jobDto;

    private String firstName;

    private String lastName;

    private String email;

    private String address;

    private String qualification;

    private String experience;

    private String position;

    private String company;

    private byte[] resume;

    private String fileName;


}
