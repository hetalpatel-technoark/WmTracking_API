/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wmtrucking.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
@AllArgsConstructor
public class InvoiceResponsedto {

    @NotNull(message = "Please provide job id")
    private Long job_id;
   
    @NotNull(message = "Please provide amount")
    @NotBlank(message = "Please provide valid amount")
    private String amount;

    @NotNull(message = "Please provide comments")
    @NotBlank(message = "Please provide valid comments")
    private String comments;

}
