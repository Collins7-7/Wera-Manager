package com.wera.wera.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class IssueRequest {
    
     private String title;

    private String description;

    private String status;

    private Long projectID;

    private String priority;

    private LocalDate dueDate;
}
