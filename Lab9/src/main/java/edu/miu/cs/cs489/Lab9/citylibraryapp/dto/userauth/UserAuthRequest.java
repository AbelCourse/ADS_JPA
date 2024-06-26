package edu.miu.cs.cs489.Lab9.citylibraryapp.dto.userauth;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthRequest {
    @NotBlank(message = "Username cannot be null, empty or blankspace(s)")
    private String username;
    @NotBlank(message = "Password cannot be null, empty or blankspace(s)")
//    @Min(value = 8, message = "Must be at least 8 characters")
    private String password;
}
