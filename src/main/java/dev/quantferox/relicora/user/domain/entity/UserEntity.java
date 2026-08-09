package dev.quantferox.relicora.user.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity {
  private UUID id;
  private String email;
  private String password;
  private String firstName;
  private String lastName;
  private String phone;
  private Role role;
  private boolean isActive;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
