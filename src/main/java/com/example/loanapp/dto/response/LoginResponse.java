package dto.response;

import data.model.LoanManagement;
import data.model.User;
import lombok.Data;

@Data
public class LoginResponse {
    private User foundUser;
    private LoanManagement application;
}
