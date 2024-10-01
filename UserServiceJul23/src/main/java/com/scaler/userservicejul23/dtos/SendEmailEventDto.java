package com.scaler.userservicejul23.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailEventDto {
    private String to;   // user
    private String from; // sender
    private String subject; // subject line of email
    private String body; // body of the email
}
