package dev.thom.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer employeeId;
    private String firstName;
    private String lastName;
    private Long createDate;
    private Long modifyDate;

}
