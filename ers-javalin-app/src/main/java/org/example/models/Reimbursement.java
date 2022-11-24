package org.example.models;

import java.time.LocalDateTime;

public class Reimbursement {
    String reimbursementId;
    double amount;
    LocalDateTime submitted;
    LocalDateTime resolved;
    String description;
    String paymentId;
    String authorId;
    String resolver;
    String statusId;
    String typeId;
}
