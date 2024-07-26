package com.sage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Job extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 46835149772133975L;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="Eligibility")
    private String eligibility;

    @Column(name="Location")
    private String location;


    @Column(name="Description")
    private String description;

    @Column(name="Designation")
    private String designation;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private Category category;

    @Column(name = "Skills_Required")
    private String skills;

    @Column(name = "Salary_Type")
    private String salaryType;

    @Column(name = "Salary")
    private String salary;

    @Column(name = "Experience_Required")
    private String experience;

    @Column(name = "Sort_Order")
    private int sortOrder;

    @Column(name = "Status")
    private boolean status;

    @JsonIgnore
    @OneToMany(mappedBy = "job", fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<JobApplication> jobApplications=new HashSet<>();


}
